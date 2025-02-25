package algorithm;
import game.FlappyBird;

public class AIBird {
    private FlappyBird game;

    public AIBird(FlappyBird game) {
        this.game = game;
    }
    public void AIjump (int birdY) {
        if(birdY > 500) {
            game.jump();
        }
    }
}
