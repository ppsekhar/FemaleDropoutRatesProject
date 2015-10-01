package priycf;

import javax.validation.constraints.Size;

/**
 * @author Priyanka Sekhar
 *
 */

public class Country {

	@Size(min = 2, max = 30)
	private String ctryname;

	private String dropoutrate = "   6.30";

	public String getDropoutrate() {
		return dropoutrate;
	}

	public void setDropoutrate(String dropoutrate) {
		this.dropoutrate = dropoutrate;
	}

	public String getCtryname() {
		return ctryname;
	}

	public void setCtryname(String ctryname) {
		this.ctryname = ctryname;
	}

}
