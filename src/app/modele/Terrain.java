package app.modele;

public class Terrain {


	private int[] tab_1d = {
			210,210,210,210,210,210,210,210,210,210,210,210,
			210,210,210,210,210,210,211,210,210,210,210,210,
			210,210,186,210,210,210,210,210,187,210,210,210,
			210,210,210,210,187,210,210,210,210,210,210,210,
			210,210,211,210,210,210,210,210,210,187,210,210,
			210,210,210,210,210,210,186,210,210,210,210,210,
			210,210,210,210,210,210,210,210,210,210,210,210,
			210,210,210,210,210,210,210,211,210,210,210,210,
			210,210,210,187,210,210,210,210,210,210,210,210,
			210,210,210,210,186,210,210,210,210,186,210,210,
			210,210,186,210,210,210,210,211,210,210,210,210,
			210,210,210,210,210,210,210,210,210,210,210,210};
	
	private int[] tab_1d_obs = {
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,197,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0
	};
	private int[][] tab_2d, tab_2d_obs;
	
	private int tailleTab = 12;	
/*
	private int[] terrainBasique = {
			244,244,244,244,244,244,244,244,244,244,244,220,219,244,244,219,244,244,244,219,219,219,219,219,244,244,244,219,219,219,219,219,
			244,244,244,244,244,244,244,219,219,244,219,244,220,244,244,244,244,244,244,219,244,244,244,244,220,219,244,244,244,244,244,219,
			244,219,244,244,244,219,219,244,244,244,244,244,244,244,244,244,244,244,220,220,244,220,220,219,244,244,244,244,219,219,244,244,
			244,244,244,244,244,219,244,244,244,244,219,244,219,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,
			244,244,244,244,244,244,220,244,220,244,244,244,219,219,219,244,244,244,219,244,244,219,220,220,220,220,219,219,219,219,244,244,
			244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,220,244,220,220,244,244,244,244,220,220,220,244,244,
			244,244,220,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,
			244,244,220,219,244,220,219,244,244,244,219,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,220,
			244,219,220,244,219,220,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,
			244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,219,244,244,244,244,244,244,244,244,219,244,244,244,244,244,
			244,244,220,219,244,244,244,244,244,244,244,244,244,244,244,244,219,219,244,219,219,219,245,219,244,244,244,244,244,244,244,244,
			244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,245,219,244,244,245,244,244,244,245,244,244,
			244,244,244,220,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,221,218,219,219,244,219,244,244,
			244,244,219,244,244,244,244,220,244,219,244,244,244,244,244,244,244,244,244,244,244,244,244,244,221,218,244,244,244,244,244,244,
			244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,221,218,244,244,244,219,244,244,
			244,244,244,221,218,244,244,244,244,244,245,244,244,244,244,244,244,244,244,244,244,220,245,219,221,218,244,244,244,244,220,219,
			244,244,244,221,218,244,244,219,219,244,244,244,244,244,245,245,244,244,244,244,245,244,219,244,221,218,244,244,244,244,220,244,
			244,244,244,221,218,244,244,244,219,244,244,244,244,245,244,244,244,244,244,245,244,244,244,244,221,218,244,244,244,244,244,219,
			244,244,244,221,218,244,244,244,244,244,244,219,244,244,244,244,244,244,219,219,244,244,244,220,221,218,244,244,244,244,244,219,
			244,219,245,221,268,270,270,270,270,270,270,270,270,270,270,270,270,270,270,270,270,270,270,270,271,268,270,270,198,244,244,244,
			244,219,244,222,195,195,195,195,195,195,195,195,196,193,195,195,195,195,195,195,195,195,195,195,195,195,195,195,223,219,220,244,
			244,244,219,244,219,244,244,244,244,244,244,219,221,218,244,244,244,219,219,244,244,244,244,244,244,244,244,244,244,244,244,244,
			244,244,245,244,245,219,244,244,244,220,244,220,221,218,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,220,219,
			244,244,219,244,244,244,244,244,244,244,245,244,221,218,244,244,244,244,244,244,244,244,219,219,219,244,244,244,220,220,220,220,
			244,219,244,244,244,197,270,270,270,270,270,270,271,243,244,244,244,244,244,244,244,244,220,220,244,244,244,244,244,244,245,219,
			244,244,244,244,244,221,193,195,195,195,195,195,195,223,244,244,244,244,245,244,244,244,244,244,244,244,244,244,244,244,244,244,
			244,244,244,244,220,246,243,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,244,219,244,244,244,
			244,220,244,244,220,246,243,244,244,244,244,244,244,244,244,244,244,244,244,244,244,219,219,219,220,219,244,244,244,244,244,244,
			244,244,244,244,244,246,243,244,244,244,244,244,219,244,244,220,220,244,244,244,244,244,244,244,244,244,244,244,219,219,244,220,
			244,220,244,244,244,246,243,244,244,244,245,244,244,244,245,245,245,244,245,245,244,244,244,244,244,244,244,244,219,244,220,244,
			244,220,244,244,244,246,243,219,244,244,244,244,244,244,244,244,244,244,244,244,219,219,244,244,244,244,244,244,244,244,244,244,
			244,244,244,245,219,246,243,244,244,244,219,219,244,244,244,244,244,244,244,244,244,244,244,244,219,219,244,244,244,244,244,244};

	private int[] terrainMaison = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,304,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,304,0,0,
			0,0,0,0,302,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,46,47,48,49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,71,72,73,74,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,96,97,98,99,0,0,0,0,0,0,0,0,0,27,28,29,30,31,32,0,0,0,0,
			0,0,0,0,0,0,0,0,0,121,122,123,124,0,0,0,0,0,0,0,0,0,52,53,54,55,56,57,0,0,0,0,
			0,0,0,0,0,0,0,0,0,146,147,148,149,0,0,0,0,0,0,0,0,0,77,78,79,80,81,82,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,102,103,104,105,106,107,0,0,0,0,
			0,0,59,60,61,62,0,0,0,0,0,0,0,0,305,0,0,0,0,0,0,0,127,128,129,130,131,132,0,0,0,0,
			0,0,84,85,86,87,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,152,153,154,155,302,157,0,0,0,0,
			0,0,109,110,111,112,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,287,0,0,0,303,0,0,0,0,
			0,0,134,135,136,137,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,304,160,161,187,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,212,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			189,190,191,0,0,189,190,191,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,305,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,302,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,303,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,302,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,303,0,0,0,0,0,0,305,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,305,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,304,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,302};
*/


	public Terrain() {

		this.tab_2d = tab1dTo2d(tab_1d);
		this.setTab2dObs(tab1dTo2d(tab_1d_obs));
		this.setTailleTab(12);

	}

	public int[][] getTab2dBase() {
		return this.tab_2d;
	}


	public int[][] tab1dTo2d(int [] tab1d) {
		int [][] tab2d = new int[tailleTab][tailleTab];
		for (int x = 0; x< tab2d.length; x++) {
			for (int y = 0; y< tab2d[x].length; y++) {
				tab2d[y][x] = tab1d[x+tailleTab*y];
			}
		}
		return tab2d;
	}



	public int getTailleTab() {
		return tailleTab;
	}


	public void setTailleTab(int tailleTab) {
		this.tailleTab = tailleTab;
	}


	public int[][] getTab2dObs() {
		return tab_2d_obs;
	}


	public void setTab2dObs(int[][] tab_2d_obs) {
		this.tab_2d_obs = tab_2d_obs;
	}

	
}

