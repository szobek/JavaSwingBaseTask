package frame;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class App {

	private JFrame frame;
	List<Tanulo> tanulok = new ArrayList<Tanulo>();
	DefaultListModel<Tanulo> lm = new DefaultListModel<Tanulo>();
	JList<Tanulo> list;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		tanulok.add(new Tanulo("Kis Pista",(byte) 2, (byte) 2));
		tanulok.add(new Tanulo("Nagy Elek",(byte) 5, (byte) 2));
		tanulok.add(new Tanulo("Cserepes Virág",(byte) 5, (byte) 2));
		lm.addAll(tanulok);
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 11, 381, 208);
		frame.getContentPane().add(scrollPane);
		
		list = new JList<Tanulo>(lm);
		scrollPane.setViewportView(list);
		
	}
}
