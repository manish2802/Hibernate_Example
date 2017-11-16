import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateDelete {

	public static void main(String[] args) {

		ProductDAO productDAO = new ProductDAO();

		// DELECTE RECORD
		productDAO.deleteProduct(new Long(1), ProductDTO.class);

	}

}
