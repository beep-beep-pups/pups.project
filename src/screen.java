import javax.swing.*;
import java.awt.*;

//Создание окна
public class screen{
    public static void main(String[] args){
        JFrame frame = new JFrame("HOLD MY BEER, SONNY");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 830);

        Font font = new Font("SAIBA-45",Font.PLAIN, 25);
        Font labelfont = new Font("Kablammo-Regular", Font.BOLD, 40);

        frame.setLayout(null);

        JButton buttonA = new JButton("TEAM A" + ":" + "TEAM B");
        buttonA.setBounds(50,71,450,65);
        buttonA.setFont(font);

        JButton buttonB = new JButton("TEAM A" + ":" + "TEAM B");
        buttonB.setBounds(50,141,450,65);
        buttonB.setFont(font);

        JButton buttonC = new JButton("TEAM A" + ":" + "TEAM B");
        buttonC.setBounds(50,211,450,65);
        buttonC.setFont(font);

        JButton buttonD = new JButton("TEAM A" + ":" + "TEAM B");
        buttonD.setBounds(50,281,450,65);
        buttonD.setFont(font);
        buttonD.setBackground(Color.black);
        buttonD.setForeground(Color.cyan);

        JButton buttonE = new JButton("W TEAM : T-BANK TEAM");
        buttonE.setBounds(50,351,450,65);
        buttonE.setFont(font);

        JButton buttonF = new JButton("TEAM A" + ":" + "TEAM B");
        buttonF.setBounds(50,421,450,65);
        buttonF.setFont(font);

        JButton buttonG = new JButton("TEAM A" + ":" + "TEAM B");
        buttonG.setBounds(50,491,450,65);
        buttonG.setFont(font);

        JButton buttonH = new JButton("TEAM A" + ":" + "TEAM B");
        buttonH.setBounds(50,561,450,65);
        buttonH.setFont(font);

        JLabel label = new JLabel("ESL PRO LEAGUE SEASON 22");
        label.setBounds(1,1,800,60);
        label.setFont(labelfont);
        label.setForeground(Color.green);

        JLabel labelS = new JLabel("YOUR BALANCE:" + "showBalance");
        labelS.setBounds(150,610,500,200);
        labelS.setFont(labelfont);

        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(buttonE);
        frame.add(buttonF);
        frame.add(buttonG);
        frame.add(buttonH);

        frame.add(label);
        frame.add(labelS);

        frame.setVisible(true);
    }
}