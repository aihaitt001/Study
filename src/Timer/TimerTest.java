package Timer;

import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class TimerTest {
	public static void main(String[] args) {
		ActionListener listener = new TimerPrinter();
		Timer t = new Timer();

		t.schedule(new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Continue?");
				System.exit(0);
			}
		}, 1000, 3600000);
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("NOW:" + new Date());
			}
		}, 1000, 1000);

		// JOptionPane.showMessageDialog(null, "Continue?");
		// System.exit(0);

	}

}
