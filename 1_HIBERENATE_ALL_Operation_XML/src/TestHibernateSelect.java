
import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateSelect {

	public static void main(String[] args) {

		ProductDAO productDAO = new ProductDAO();

		// SELECT RECORD FROM DB
		ProductDTO productD = (ProductDTO) productDAO.getProductDetail(new Integer(1), ProductDTO.class);

		System.out.println(productD.getProductId() + "-" + productD.getProductName() + "-" + productD.getPrice());

		// System.out.println(productD.hashCode());
	}

}
