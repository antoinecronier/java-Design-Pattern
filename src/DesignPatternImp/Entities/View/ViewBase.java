package DesignPatternImp.Entities.View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import DesignPatternImp.AbstractFactory.IMenu;
import DesignPatternImp.AbstractFactory.IView;
import DesignPatternImp.Builder.IMenuBuilder;
import DesignPatternImp.Entities.Menu.MenuBase;

public abstract class ViewBase extends JFrame implements IMenuBuilder, IView {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private ArrayList<MenuBase> components = new ArrayList<>();

	public void addItem(IMenu item){
		if (item instanceof MenuBase) {
			components.add((MenuBase) item);
		}
	}

	private void SetMenu(){
		for (MenuBase menuBaseItem : components) {
			if (menuBaseItem != null) {
				for (Component subItem : menuBaseItem.getComponents()) {
					this.scrollPane.add(subItem);

				}
			}
		}
	}

	private void UnsetMenu(){
		for (MenuBase menuBaseItem : components) {
			this.scrollPane.remove(menuBaseItem);
		}
	}

	/**
	 * Print the menu.
	 */
	public void Print(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBase.this.SetMenu();
					setContentPane(contentPane);
					ViewBase.this.setVisible(true);
					contentPane.revalidate();
					contentPane.repaint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Print the menu.
	 */
	public void Remove(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBase.this.setVisible(false);
					ViewBase.this.UnsetMenu();
					setContentPane(contentPane);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewBase() {
		setDefaultCloseOperation(ViewBase.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.NORTH);
	}

	@Override
	public void Size(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Position(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Visibility(Boolean isVisible) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Border(javax.swing.border.Border border) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Layout(LayoutManager layout) {
		// TODO Auto-generated method stub

	}

}
