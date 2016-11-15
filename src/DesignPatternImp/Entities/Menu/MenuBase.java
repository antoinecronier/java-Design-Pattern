package DesignPatternImp.Entities.Menu;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JComponent;

import DesignPatternImp.AbstractFactory.IMenu;

public abstract class MenuBase extends JComponent implements IMenu {
	private Integer gridH;
	private Integer gridW;
	private ArrayList<MenuBase> items = new ArrayList<MenuBase>();

	public Integer getGridH() {
		return gridH;
	}

	public void setGridH(Integer gridH) {
		if (gridH > 0) {
			this.gridH = gridH;
		}else {
			this.gridH = 0;
		}
	}

	public Integer getGridW() {
		return gridW;
	}

	public void setGridW(Integer gridW) {
		if (gridW > 0) {
			this.gridW = gridW;
		}else {
			this.gridW = 0;
		}
	}

	public void addItem(IMenu menuBaseItem){
		if (menuBaseItem instanceof MenuBase) {
			this.items.add((MenuBase) menuBaseItem);
		}
	}

//	public void addItem(IMenu menuBaseItem, int gridH, int gridW){
//		if (menuBaseItem instanceof MenuBase) {
//			((MenuBase) menuBaseItem).setGridH(gridH);
//			((MenuBase) menuBaseItem).setGridW(gridW);
//			this.items.add((MenuBase) menuBaseItem);
//		}
//	}

    public void Remove(MenuBase menuBaseItem){
    	this.items.remove(menuBaseItem);
    }

    public void addItem(JComponent item){
		this.add(item);
	}

    public void addItem(Component item){
		this.add(item);
	}

    public void Print() {

	}
}
