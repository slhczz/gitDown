package src.com.snake;

import java.awt.*;

public class Food extends Point {
    //生成食物
    public void newFood(Point p) {
        this.setLocation(p);
    }

    //蛇吃到食物
    public boolean isSnakeEatFood(Snake snake){
        System.out.println("chidao shi wu");
        return 	this.equals(snake.getHead());

    }
    //显示食物
    public void drawMe(Graphics g){
        System.out.println("xianshi ");

        g.fill3DRect(x * Global.CELL_SIZE, y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);

    }
}
