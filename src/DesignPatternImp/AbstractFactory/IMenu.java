package DesignPatternImp.AbstractFactory;

import java.awt.Component;

import javax.swing.JComponent;

public interface IMenu extends IView {
	void addItem(JComponent item);
	void addItem(Component item);
//	void addItem(IMenu menuBaseItem, int gridH, int gridW);
	Integer getGridH();
	Integer getGridW();
	void setGridH(Integer gridH);
	void setGridW(Integer gridW);
}
