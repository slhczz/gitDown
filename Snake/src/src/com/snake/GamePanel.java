package src.com.snake;

import javax.swing.*;
import java.awt.*;

//面板

public class GamePanel extends JPanel{
    //	初始化参数
    private Snake snake;
    private Food food;
    private Ground ground;
    //显示面板
    public void display(Snake snake,Food food,Ground ground){
//		System.out.println("显示");
        this.snake = snake;
        this.food = food;
        this.ground = ground;
        this.repaint();
    }


    //	显示格子
    protected void paintComponent(Graphics g){
        //重新显示
        g.setColor(new Color(0xcfcfcf));
        g.fill3DRect(0, 0, Global.WIDTH * Global.CELL_SIZE, Global.HEIGHT * Global.CELL_SIZE, true);

        if(ground!= null && ground != null && ground != null){

            this.ground.drawMe(g);
            this.snake.drawMe(g);
            this.food.drawMe(g);
        }
    }
}
