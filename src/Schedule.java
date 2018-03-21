import java.util.ArrayList;

public class Schedule {

	private String linha;
	private ArrayList<Hour> busHour;

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public ArrayList<Hour> getBusHour() {
		return busHour;
	}

	public void setBusHour(ArrayList<Hour> busHour) {
		this.busHour = busHour;
	}
}
