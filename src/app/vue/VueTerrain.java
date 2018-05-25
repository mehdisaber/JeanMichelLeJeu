package app.vue;


import app.modele.Terrain;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class VueTerrain {

	private Terrain terrain;
	
	private TilePane tilemap;

	private int tailleMap;

	
	public VueTerrain(Terrain t) {
		this.terrain = t;
		this.tailleMap = this.terrain.getTailleTab();
		this.tilemap = new TilePane();
		this.tilemap.setPrefColumns(tailleMap);
		this.tilemap.setPrefRows(tailleMap);

		int [][] t2 = this.terrain.getTab2d();

		for (int x = 0; x< t2.length; x++) {
			for (int y =0; y< t2[x].length; y++) {

				Image img = new Image("file:" + imageDe(t2[x][y]));

				ImageView imgVw = new ImageView();
				imgVw.setImage(img);
				this.tilemap.getChildren().add(imgVw);
			}
		}
	}

	public TilePane getTileMap() {
		return this.tilemap;
	}

	public String imageDe(int i) {
		switch(i) {
		case 186: return "./src/app/img/tile_186.png";
		case 187: return "./src/app/img/tile_187.png";
		case 210: return "./src/app/img/tile_herbe.jpg";
		case 211: return "./src/app/img/tile_211.png";
		case 197: return "./src/app/img/tile_rocher.png";
		default: return "./src/app/img/tile_herbe.jpg"; // pour l'instant, on ajoute une tile verte dans le cas où il n'y a pas d'autres valeurs
		}	
	}



	/*public String imageDe(int i) {
		switch(i) {
		case 219: return "./src/app/img/tile_219.png";
		case 220: return "./src/app/img/tile_220.png";
		case 245: return "./src/app/img/tile_245.png";
		case 246: return "./src/app/img/tile_246.png";
		case 243: return "./src/app/img/tile_243.png";
		case 270: return "./src/app/img/tile_270.png";
		case 195: return "./src/app/img/tile_195.png";
		case 221: return "./src/app/img/tile_246.png";
		case 218: return "./src/app/img/tile_243.png";
		case 222: return "./src/app/img/tile_222.png";
		case 197: return "./src/app/img/tile_197.png";
		case 223: return "./src/app/img/tile_223.png";
		case 271: return "./src/app/img/tile_271.png";
		case 193: return "./src/app/img/tile_193.png";
		case 198: return "./src/app/img/tile_198.png";
		case 268: return "./src/app/img/tile_268.png";
		default: return "./src/app/img/tile_244.png"; // pour l'instant, on ajoute une tile verte dans le cas où il n'y a pas d'autres valeurs
		}	
	}*/

}
