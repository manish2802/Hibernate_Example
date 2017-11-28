import com.asthvinayak.dao.OTMDaoFactory;
import com.asthvinayak.entity.ItemDTO;

public class OTMRemoveChild {
	public static void main(String[] args) {
		OTMDaoFactory.getInstance().removeChild("200", ItemDTO.class);
	}
}
