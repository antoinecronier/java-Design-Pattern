package DesignPatternImp.Builder;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import DesignPatternImp.AbstractFactory.AbstractFactory;
import DesignPatternImp.AbstractFactory.FactoryProducer;
import DesignPatternImp.AbstractFactory.IMenu;
import DesignPatternImp.AbstractFactory.IView;
import DesignPatternImp.AbstractFactory.SwingFactory;
import DesignPatternImp.Entities.Menu.*;

public class MenuBuilder {
	private AbstractFactory menuFactory;
	private List<IMenu> items;

	public MenuBuilder() {
		this.menuFactory = FactoryProducer.getFactory(FactoryProducer.SWING);
		this.items = new ArrayList<>();
	}

	public MenuBuilder addSubMenu(IMenu item) {
		this.items.add(item);
		return this;
	}

	public IMenu build() {
		IMenu view = this.menuFactory.getMenu();

		return view;
	}

	/*public MenuBase MenuNavigation1() {
		AbstractFactory factoryMenu = FactoryProducer.getFactory(FactoryProducer.MENU);
		MenuBase menu = (MenuBase) factoryMenu.getMenu();

		try {
			AbstractFactory factoryItem = FactoryProducer.getFactory(FactoryProducer.ITEM);
			MenuBaseItem item = (MenuBaseItem) factoryItem.getMenu();
			menu.addItem(item);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		//menu.addItem(new JTextField());

		return menu;
	}

	public MenuBase MenuNavigation2(){
		MenuBase menu = new NavigationBar();
		menu.Position(50, 50);
		return menu;
	}*/
}
