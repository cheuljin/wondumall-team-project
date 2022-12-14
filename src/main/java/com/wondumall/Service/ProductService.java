package com.wondumall.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondumall.DAO.ProductDAO;
import com.wondumall.DTO.CartDTO;
import com.wondumall.DTO.ProductDTO;
import com.wondumall.DTO.ReviewDTO;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	public List<ProductDTO> productList(Map<String, Object> map) {
		return productDAO.productList(map);
	}

	public int productAdd(ProductDTO add) {
		return productDAO.productAdd(add);
	}

	public ProductDTO productDetail(int p_no) {
		return productDAO.productDetail(p_no);
	}

	public void productReview(ReviewDTO dto) {
		productDAO.productReview(dto);
	}

	public int cartAdd(CartDTO dto) {
		return productDAO.cartAdd(dto);
	}

	public List<CartDTO> cart(int u_no) {
		return productDAO.cartAdd(u_no);
	}

	public int cartCount(int u_no) {
		return productDAO.cartCount(u_no);
	}

	public int containProduct(CartDTO dto) {
		return productDAO.containProduct(dto);
	}

	public int cartUpdate(CartDTO dto) {
		return productDAO.cartUpdate(dto);
	}

	public void cartDelete(CartDTO cartDTO) {
		productDAO.cartDelete(cartDTO);
	}

	public int reviewStatus(ReviewDTO dto) {
		return productDAO.reviewStatus(dto);
	}

	public List<ReviewDTO> reviewList(Map<String, Object> map) {
		return productDAO.reviewList(map);
	}

	public int reviewCount(int p_no) {
		return productDAO.reviewCount(p_no);
	}

	public double reviewRating(int p_no) throws Exception{
		return productDAO.reviewRating(p_no);
	}

	public Map<String, Object> cateName(int p_no) {
		return productDAO.cateName(p_no);
	}

	public int sumPrice(int u_no) {
		return productDAO.sumPrice(u_no);
	}

	public void cartAllDel(CartDTO cartDTO) {
		productDAO.cartAllDel(cartDTO);
	}

	public void resetCheck(Map<String, Object> map) {
		productDAO.resetCheck(map);
	}

	public List<Map<String, Object>> search(String search) {
		return productDAO.search(search);
	}

	public void modify(CartDTO cartDTO) {
		productDAO.modify(cartDTO);
	}

	public List<Map<String, Object>> searchDetail(Map<String, Object> map) {
		return productDAO.searchDetail(map);
	}
	public List<Map<String, Object>> ratingCount(int p_no) {
		return productDAO.ratingCount(p_no);
	}

	public int cateCount(int cate_no) {
		return productDAO.cateCount(cate_no);
	}

	public List<ProductDTO> productListByCateNo(int cate_no) {
		return productDAO.productListByCateNo(cate_no);
	}

}
