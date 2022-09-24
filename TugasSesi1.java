
package tugas;
import javax.swing.JOptionPane;
/**
 *
 * @author Feby Alfaraby_TI21E_20210040133
 */
public class TugasSesi1 {
    public static void main(String[] args) {
        //1
        JOptionPane.showMessageDialog(null, "Belajar Java");
        JOptionPane.showMessageDialog(null, "Sangat Mmudah sekali");
        JOptionPane.showMessageDialog(null, "dan sangat menyenangkan");
        
        //2
        String input = JOptionPane.showInputDialog("Matkul apa yang anda pelajari?");
        JOptionPane.showMessageDialog(null, "Belajar" +input+ "sangat mudah");
    }
}
