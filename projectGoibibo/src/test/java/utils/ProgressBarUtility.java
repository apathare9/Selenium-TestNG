package utils;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * @author Ajinkya Pathare
 * @summary To show the progress of the running test cases
 */
public class ProgressBarUtility {

	public JProgressBar progressBar;

	public ProgressBarUtility() {
		JFrame frame = new JFrame("Running Tests...");

		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		progressBar = new JProgressBar(0, 100);
		progressBar.setStringPainted(true);

		frame.add(progressBar);

		frame.setSize(500, 60);
		frame.setVisible(true);
	}

}
