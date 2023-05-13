import java.util.Scanner;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main {

	public static void main(String[] args) {
		
		 Byte byteValue;
	        Short svalue;
	        int ivalue;
	        long lvalue;
	        float fvalue;
	        double dvalue;
	        char charValue;
	        boolean booleanvalue;

	        JTextField answer1 = new JTextField();
	        JTextField answer2 = new JTextField();
	        JTextField answer3 = new JTextField();
	        JTextField answer4 = new JTextField();
	        JTextField answer5 = new JTextField();
	        JTextField answer6 = new JTextField();
	        JTextField answer7 = new JTextField();
	        JTextField answer8 = new JTextField();

	        JLabel jLabel1 = new JLabel("Enter a byte value (-128 through 127)");
	        JLabel jLabel2 = new JLabel("Enter a short value (-32,768 through 32,767)");
	        JLabel jLabel3 = new JLabel("Enter a int value (-2,147,483,648 through 2,147,483,647)");
	        JLabel jLabel4 = new JLabel("Enter a long value (-9,223,372,036,854,775,808     through 9,223,372,036,854,775,807)");
	        JLabel jLabel5 = new JLabel("Enter a float value (number with decimals)");
	        JLabel jLabel6 = new JLabel("Enter a double value (number with decimals)");
	        JLabel jLabel7 = new JLabel("Enter a char value (a through z)");
	        JLabel jLabel8 = new JLabel("Enter a boolean value (true or false)");

	        JPanel jPanel = new JPanel();
	        jPanel.setLayout(new GridLayout(8, 2));

	        Scanner keyboard= new Scanner(System.in);
	        System.out.println("Enter a byte value (-128 through 127)");
	        byteValue = keyboard.nextByte();


	        System.out.println("Enter a short value (-32,768 through 32,767)");
	        svalue = keyboard.nextShort();


	        System.out.println("Enter a int value (-2,147,483,648 through 2,147,483,647)");
	        ivalue = keyboard.nextInt();


	        System.out.println("Enter a long value (-9,223,372,036,854,775,808 through 9,223,372,036,854,775,807)");
	        lvalue = keyboard.nextLong();


	        System.out.println("Enter a float value (number with decimals)");
	        fvalue = keyboard.nextFloat();


	        System.out.println("Enter a double value (number with decimals)");
	        dvalue = keyboard.nextDouble();


	        System.out.println("Enter a char value (a through z)");
	        charValue = keyboard.next().charAt(0);


	        System.out.println("Enter a boolean value (true or false)");
	        booleanvalue = keyboard.nextBoolean();

	        jPanel.add(jLabel1);
	        answer1.setText(byteValue.toString());
	        jPanel.add(answer1);

	        jPanel.add(jLabel2);
	        answer2.setText(svalue.toString());
	        jPanel.add(answer2);

	        jPanel.add(jLabel3);
	        answer3.setText(String.valueOf(ivalue));
	        jPanel.add(answer3);

	        jPanel.add(jLabel4);
	        answer4.setText(String.valueOf(lvalue));
	        jPanel.add(answer4);

	        jPanel.add(jLabel5);
	        answer5.setText(String.valueOf(fvalue));
	        jPanel.add(answer5);

	        jPanel.add(jLabel6);
	        answer6.setText(String.valueOf(dvalue));
	        jPanel.add(answer6);

	        jPanel.add(jLabel7);
	        answer7.setText(charValue + "");
	        jPanel.add(answer7);

	        jPanel.add(jLabel8);
	        answer8.setText(booleanvalue + "");
	        jPanel.add(answer8);

	        jPanel.setVisible(true);

	        JOptionPane.showMessageDialog(null,jPanel,"Information",JOptionPane.INFORMATION_MESSAGE);

	        keyboard.close();
		/*int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);	
		}
*/
	}

}
