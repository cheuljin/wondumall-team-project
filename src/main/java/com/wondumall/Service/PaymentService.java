package com.wondumall.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondumall.DAO.PaymentDAO;
import com.wondumall.DTO.CouponDTO;
import com.wondumall.DTO.CartDTO;
import com.wondumall.DTO.OrderDTO;
import com.wondumall.DTO.ProductDTO;
import com.wondumall.DTO.UserDTO;

@Service
public class PaymentService {
	
	@Autowired PaymentDAO paymentDAO;

	public void checkout(Map<String, Object> map) {
		
		paymentDAO.checkout(map);
	}

	public void user(UserDTO user) {
		
		paymentDAO.user(user);
	}

	public ProductDTO product(ProductDTO dto) {
		
		return paymentDAO.product(dto);
	}

	public List<CouponDTO> couponList() {
		
		return paymentDAO.couponList();
	}
	public List<CartDTO> cartPay(int u_no) {
		return paymentDAO.cartPay(u_no);
	}

	public List<OrderDTO> orderList(int u_no) {
		
		return paymentDAO.orderList(u_no);
	}

	public void setStatus(Map<String, Object> map) {
		paymentDAO.setStatus(map);
	}

	public CouponDTO findByCouponNo(int coupon_no) {
		return paymentDAO.findByCouponNo(coupon_no);
	}

	public void cartRemove(int u_no) {
		paymentDAO.cartRemove(u_no);
	}

	public List<OrderDTO> orderDetail(String merchant_uid) {
		
		return paymentDAO.orderDetail(merchant_uid);
	}

}
