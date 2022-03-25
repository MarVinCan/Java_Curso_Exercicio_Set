package entities;

import java.util.Objects;

public class Studants {
	
	private Object studant;

	public Studants(Object studant) {
		this.studant = studant;
	}

	public Object getStudant() {
		return studant;
	}

	public void setStudant(Object studant) {
		this.studant = studant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studants other = (Studants) obj;
		return Objects.equals(studant, other.studant);
	}

}
