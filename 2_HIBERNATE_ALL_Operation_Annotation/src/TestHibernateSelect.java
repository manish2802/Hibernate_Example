import com.asthvinayak.dao.ProductDAO;
import com.asthvinayak.dto.ProductDTO;

public class TestHibernateSelect {

	public static void main(String[] args) {

		ProductDAO productDAO = new ProductDAO();

		// SELECT RECORD FROM DB
		ProductDTO productD = (ProductDTO) productDAO.getProductDetail(new Long(-34), ProductDTO.class);
		System.out.println(productD.getProductId() + "||" + productD.getProductName() + "||" + productD.getPrice() + "||"
				+ productD.getHikePrice()+"||"+productD.getMinPrice());

	}

}
