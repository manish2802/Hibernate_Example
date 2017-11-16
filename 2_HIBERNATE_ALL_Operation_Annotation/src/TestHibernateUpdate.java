import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateUpdate {

	public static void main(String[] args) {


		ProductDAO productDAO = new ProductDAO();
	

		// UPDATE RECORD
		 ProductDTO productDTO = new ProductDTO();
		 productDTO.setProductId(1);
		 productDTO.setProductName("Manish");
		 productDTO.setPrice(100007);
		 productDAO.updateProduct(productDTO);

	}

}
