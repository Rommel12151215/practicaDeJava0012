import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class ClipboardExample {
   public static void main(String args[]) {
       String myString = "This text will be copied into clipboard";
       StringSelection stringSelection = new StringSelection(myString);
       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
       clipboard.setContents(stringSelection, null);
   }
}
