/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class Passage {
	private Cavalier cav;
	private Manege man;
	private Parcours par;
	private boolean abandon;
	private boolean started;
	private boolean finished;
	private int points;
	private double time;
	private double score;
	private static int cpt = 0;
	private int id;

	/**
	 * 
	 */
	/**
	 * @param cav
	 * @param man
	 * @param par
	 */
	public Passage(Cavalier cav, Manege man, Parcours par) {
		super();
		this.cav = cav;
		this.man = man;
		this.par = par;
		abandon = false;
		started = false;
		finished = false;
		points = 0;
		time = 0;
		score = 0;
		cpt++;
		id = cpt;
	}

}
