
import java.util.Date;

import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateInsert {

	public static void main(String[] args) {

		// pojo class object
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(205);
		productDTO.setProductName("Manish");
		productDTO.setPrice(100000);
		productDTO.setPurachaseDate(new Date());
		ProductDAO productDAO = new ProductDAO();
		// INSERT RECORD INTO DB
		Long pid = (Long) productDAO.saveProduct(productDTO);
		System.out.println("Object Saved Successfully: " + pid);

		// SELECT RECORD FROM DB
		// ProductDTO productD = (ProductDTO) productDAO.getProductDetail(new
		// Integer(204), ProductDTO.class);
		// System.out.println(productD.getProductId() + "-" +
		// productD.getProductName() + "-" + productD.getPrice());

		// UPDATE RECORD
		// ProductDTO productDTO = new ProductDTO();
		// productDTO.setProductId(204);
		// productDTO.setProductName("Manish");
		// productDTO.setPrice(100007);
		// productDAO.updateProduct(productDTO);

		// DELECTE RECORD
		// productDAO.deleteProduct(new Integer(204), ProductDTO.class);

	}

}
