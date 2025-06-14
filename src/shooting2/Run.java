package shooting2;

class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	
	Run(MyFrame myFrame, Render render, GameObjectManager manager){
		this.myFrame = myFrame;
		this.render = render;
		this.manager = manager;
	}

	final void runGame() {
		myFrame.createFrame();
		myFrame.setPanel(render.getPanel());
		Stage stage = new Stage();
		manager.addGameObject(new BackFactory().createGameObject());
		manager.addGameObject(new PlayerFactory().createGameObject());
		manager.addGameObject(new EnemyFactory().createGameObject());
		manager.showAllGameObjects();
		render.setRenderGameObject(manager.getGameObjects());
		render.sortGameObject();
		stage.gameSet(manager.getGameObjects());
		while(true) {
			stage.gameFlow(manager.getGameObjects());
			render.rendering();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
