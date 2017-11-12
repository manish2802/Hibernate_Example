import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateInsert {

	public static void main(String[] args) {

		// pojo class object
		 ProductDTO productDTO = new ProductDTO();
		 //productDTO.setProductId(204);
		 productDTO.setProductName("Manish");
		 productDTO.setPrice(100009);
		 productDTO.setTax(new BigDecimal(1.5));
		 productDTO.setPurchaseDate(new Date());
		ProductDAO productDAO = new ProductDAO();

		 // INSERT RECORD INTO DB
		 Serializable se = productDAO.saveProduct(productDTO);
		System.out.println("Oject Saved successfully: " + (Integer) se);

		// SELECT RECORD FROM DB

		// ProductDTO productD = (ProductDTO) productDAO.getProductDetail(new
		// Integer(1), ProductDTO.class);
		// System.out.println(productD.getProductId() + "-" +
		// productD.getProductName() + "-" + productD.getPrice());

		// UPDATE RECORD
		// ProductDTO productDTO = new ProductDTO();
		// productDTO.setProductId(1);
		// productDTO.setProductName("Manish");
		// productDTO.setPrice(4555);
		// productDAO.updateProduct(productDTO);

		// DELECTE RECORD
		//productDAO.deleteProduct(new Integer(1), ProductDTO.class);

	}

}
