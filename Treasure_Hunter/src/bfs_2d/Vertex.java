package bfs_2d;

public class Vertex {
	private Point point;
	private boolean visited;

	public Vertex(Point point) {
		setPoint(point);
		visited = false;
	}


	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	public Point getPoint() {
		return point;
	}


	public void setPoint(Point point) {
		this.point = point;
	}

}
