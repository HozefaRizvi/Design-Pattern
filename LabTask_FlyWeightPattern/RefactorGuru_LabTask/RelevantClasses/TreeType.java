/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyWieght;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        int treeSize = 10;  // Default size
        if (y < 200) {
            treeSize = 15;  // Large in the South
        } else if (y < 400) {
            treeSize = 10;  // Medium in the Middle
        } else {
            treeSize = 5;   // Small in the North
        }

        g.setColor(color);
        g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);

        if (isFruitTree) {
            g.setColor(Color.RED);
            for (int i = 0; i < countOfFruits; i++) {
                g.fillOval(x - treeSize / 2 + i * 5, y - treeSize - 10, 5, 5);
            }
        }
    }
}
