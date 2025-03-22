import javax.swing.*;

public  class 输入j_ava {

    public static void main(String[] args) {
        double a, b;
        String str1 = JOptionPane.showInputDialog("输入a的值", "0");
        //由于这个方法输入的格式为字符型，所以我们要转换成整型
        a = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog("输入运算符号", "+");
        String str3 = JOptionPane.showInputDialog("输入b的值", "0");
        b = Integer.parseInt(str3);
        double c = 0;
        if (str2.equals("+")) {
            c = a + b;
        }
        if (str2.equals("-")) {
            //或者是str.contains("-")
            c = a - b;
        }
        if (str2.equals("*")) {
            c = a * b;
        }
        if (str2.equals("/")) {
            c = a / b;
        }
        JOptionPane.showMessageDialog(null, c);
    }
}