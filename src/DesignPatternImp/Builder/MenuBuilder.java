package DesignPatternImp.Builder;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import DesignPatternImp.AbstractFactory.AbstractFactory;
import DesignPatternImp.AbstractFactory.FactoryProducer;
import DesignPatternImp.AbstractFactory.IMenu;
import DesignPatternImp.Entities.Menu.MenuBase;

public class MenuBuilder {
	private AbstractFactory menuFactory;
	private List<JComponent> items;
	private List<IMenu> menus;

	public MenuBuilder() {
		this.menuFactory = FactoryProducer.getFactory(FactoryProducer.SWING);
		items = new ArrayList<>();
		menus = new ArrayList<>();
	}

	public MenuBuilder addItem(JComponent item) {
		this.items.add(item);
		return this;
	}

	public MenuBuilder addItem(MenuBase item) {
		this.menus.add(item);
		return this;
	}

	public IMenu build() {
		IMenu menu = this.menuFactory.getMenu();
		for (JComponent jComponent : items) {
			menu.addItem(jComponent);
		}
		for (IMenu subMenu : menus) {
			menu.addItem(subMenu);
			if (subMenu instanceof MenuBase) {
				for (Component component : ((MenuBase) subMenu).getComponents()) {
					menu.addItem(component);
				}
			}
		}
		return menu;
	}
}
