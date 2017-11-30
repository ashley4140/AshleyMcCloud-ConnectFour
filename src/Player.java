import javax.swing.*;

public class Player {
    private String name;
    private int age;
  Score score= new Score();
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(String name, int age) {

        setName(name);
        setAge(age);
    }
public Player(){
        name = "Unknown";
        age = 0;
        this.score = new Score(0,0);
        }

public static Player Register(){
        String name = JOptionPane.showInputDialog("Please enter you name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        JOptionPane.showMessageDialog(null, name + "You have been added to the system");

        return new Player(name,age);

        }

@Override
public String toString() {
        return name + age + score;
        }
        }

//add options in your main GUI to allow you to register a new player,
//amend the details of a player and remove a player
//and show the 5 players with the highest win percentages

