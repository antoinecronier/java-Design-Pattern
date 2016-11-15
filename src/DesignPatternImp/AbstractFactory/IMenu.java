package DesignPatternImp.AbstractFactory;

import java.awt.Component;
import javax.swing.JComponent;

public interface IMenu extends IView {
	public void addItem(JComponent item);
	public void addItem(Component item);
}
