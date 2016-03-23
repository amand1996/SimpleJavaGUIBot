import javax.swing.JOptionPane;
public class Bot{
  public static void main(String args[]){
    String name = JOptionPane.showInputDialog("Hi! I'm Jarvis. I'm Aman's linux powered super intelligent computer system.\n What's your name buddy?");
    String ans = JOptionPane.showInputDialog("OK. So how are you " + name+"?");
    ans = JOptionPane.showInputDialog("By the way how old are you "+name+"?");
    int age = Integer.parseInt(ans);
    if(age<18){
      JOptionPane.showMessageDialog(null, "aww...!!\nYou are pretty young", "Jarvis", JOptionPane.PLAIN_MESSAGE);
    }
    if(age>=18){
      JOptionPane.showMessageDialog(null, "You are quite old "+name, "Jarvis", JOptionPane.PLAIN_MESSAGE);
    }
    JOptionPane.showMessageDialog(null, "OK. Nice talking to you "+name+"\n Bye.", "Jarvis", JOptionPane.PLAIN_MESSAGE);
  }
}
