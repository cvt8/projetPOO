/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class Point {

	private int x;
	private int y;

	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param p
	 * @return true si les deux points sont adjacents, false sinon
	 */
	public boolean sontAdjacents(Point p) {
		if (Math.abs(p.x - x) == 1 || Math.abs(p.y - y) == 1) {
			// System.out.println(p.toString());
			return true;
		}
		return false;
	}

	/**
	 * @param p centre de symetrie
	 * @return le symetrique du point courant
	 */
	public Point getSymetrique(Point p) {
		return new Point(2 * p.x - x, 2 * p.y - y);
	}

	/**
	 * @param p
	 * @return la distance (en mètres) entre deux points
	 */
	public double distance(Point p) {
		return (20.0 / 3.0) * Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}

	public void set(String[][] tab) {
		tab[x][y] = "@";
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
