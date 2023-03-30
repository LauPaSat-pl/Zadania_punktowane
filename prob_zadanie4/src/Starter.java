import Entity.Entity;
import Entity.Figure.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Starter {

	private JTextField myTextField;
	private MyWorkPanel workPanel;
	private JFrame jFrame;

	public Starter() {
	}

	public static void main(String[] args) {

		Starter starter = new Starter();
		starter.go();

	}

	private void go() {
		jFrame = new JFrame();
		jFrame.setVisible(true);

		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Ramka jak ramka!");
		jFrame.setSize(new Dimension(800, 800));

		jFrame.add(getMainPanel());
		jFrame.setJMenuBar(getMainJMenuBar());

		workPanel.setFocusable(true);
		workPanel.grabFocus();

		jFrame.pack();
	}

	private JPanel getMainPanel() {
		JPanel result = new JPanel();
		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

		this.workPanel = getWorkPanel();
		result.add(workPanel);
		result.add(getOperationalPanel());

		return result;
	}

	private JMenuBar getMainJMenuBar() {
		JMenuBar result = new JMenuBar();

		JMenu optionsMenu = new JMenu("My options");

		JMenuItem firstOptionMenuItem = new JMenuItem("Greeting");
		firstOptionMenuItem.addActionListener(e -> System.out.println("Guten Tag"));
		optionsMenu.add(firstOptionMenuItem);

		result.add(optionsMenu);

		return result;
	}

	private MyWorkPanel getWorkPanel() {
		MyWorkPanel result = new MyWorkPanel();
		result.setBackground(new Color(250, 250, 250));

		result.setPreferredSize(new Dimension(700, 700));

		result.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (MouseEvent.BUTTON1 == e.getButton()) {
					leftMouseButtonAction(e.getX(), e.getY());

				} else if (MouseEvent.BUTTON3 == e.getButton()) { // This is right button
					rightMouseButtonAction(e.getX(), e.getY());
				}
				workPanel.repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
//				workPanel.addDot(e.getX(), e.getY());
				workPanel.repaint();
			}
		});
		return result;
	}

	private void leftMouseButtonAction(int x, int y) {
		Random random = new Random();
		int type = random.nextInt(2);
		if (type==0){
			workPanel.addSquare(x,y);
		} else {
			workPanel.addCircle(x,y);
		}
	}

	private void rightMouseButtonAction(int x, int y) {
		workPanel.addSpray(x,y);
	}

	private double calculateArea() {
		double res = 0;
		for (Entity entity : workPanel.getEntityList()) {
			if (entity instanceof Figure) {
				res += entity.getArea();
			}
		}
		return res;
	}

	private JPanel getOperationalPanel() {
		JPanel result = new JPanel();

		result.setLayout(new BoxLayout(result, BoxLayout.X_AXIS));
		result.setBackground(new Color(150, 150, 150));

		result.add(getTextPanel());

		result.setPreferredSize(new Dimension(600, (int) result.getMinimumSize().getHeight()));

		return result;
	}

	private JPanel getTextPanel() {
		JPanel result = new JPanel();

		result.setBackground(new Color(150, 150, 150));

		JButton button = new JButton("Calculate area: ");

		button.addActionListener(actionEvent -> {
			double res = calculateArea();
			myTextField.setText(String.valueOf(res));
		});


		result.add(button);

		result.add(getMoreImportantTextFieldPanel());

		result.setPreferredSize(new Dimension(300, (int) result.getMinimumSize().getHeight()));

		return result;
	}

	private JPanel getMoreImportantTextFieldPanel() {
		JPanel result = new JPanel();

		JLabel myLabel = new JLabel("");
		myTextField = new JTextField("AAAA");
		myTextField.setText("");
		myTextField.setPreferredSize(new Dimension(200, (int) myTextField.getMinimumSize().getHeight()));
		result.add(myLabel);
		result.add(myTextField);
		result.setBorder(BorderFactory.createTitledBorder(""));

		return result;
	}
}
