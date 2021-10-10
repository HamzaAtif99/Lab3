package lab3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static List<Shape> shapeList = new ArrayList<Shape>();

	private static List<Shape> generateShapes() {
		ShapeFactory.resetShapeCount();

		shapeList = new ArrayList<Shape>();
		shapeList.add(ShapeFactory.getShape("Rectangle"));
		shapeList.add(ShapeFactory.getShape("Square"));
		shapeList.add(ShapeFactory.getShape("Circle"));
		shapeList.add(ShapeFactory.getShape("Rectangle"));
		shapeList.add(ShapeFactory.getShape("Square"));
		shapeList.add(ShapeFactory.getShape("Circle"));

		return shapeList;
	}

	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		final Graphics2D graphics2d = (Graphics2D) graphics;

		for (final Shape shape : shapeList) {
			graphics2d.setColor(shape.getColor());
			shape.drawShape(graphics2d);
		}
	}

	public static void main(String[] args) {

		final MyPanel panel = new MyPanel();
		final JFrame frame = new JFrame("Display shapes");

		final JButton loadButton = new JButton();
		loadButton.setText("Load shapes");
		panel.add(loadButton);

		loadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shapeList = generateShapes();
				panel.repaint();
			}
		});

		final JButton sortButton = new JButton();
		sortButton.setText("Sort shapes");
		panel.add(sortButton);

		sortButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SortingTechnique.sortShapes(shapeList);
				panel.repaint();
			}
		});

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
