import java.util.ArrayList;
import java.util.List;

public class Line {
	
	private List<Point> route = new ArrayList<Point>();
	private List<Hour> time = new ArrayList<Hour>();
	
	
	public List<Point> getRoute() {
		return route;
	}
	public void setRoute(List<Point> route) {
		this.route = route;
	}
	public List<Hour> getTime() {
		return time;
	}
	public void setTime(List<Hour> time) {
		this.time = time;
	}
}
