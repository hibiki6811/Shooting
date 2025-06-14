package shooting;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

class ImageReader {
	
	
	private Map<String, Image> images;
	
	ImageReader() {
		images = new HashMap<>();
		try {
			images.put("back",ImageIO.read(getClass().getResource("/illust/back.jpg")));
			images.put("player",ImageIO.read(getClass().getResource("/illust/player.png")));
			images.put("enemy",ImageIO.read(getClass().getResource("/illust/enemy.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	final Image getImage(String key) {
		if(images.get(key) != null) {
			return images.get(key);
		}else {
			System.out.println("画像がありません");
			return null;
		}
	}

}
