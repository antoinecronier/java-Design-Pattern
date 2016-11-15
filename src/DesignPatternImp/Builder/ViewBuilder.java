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

public class ViewBuilder {
	private AbstractFactory viewFactory;

	private List<IMenu> items;

	public ViewBuilder() {
		this.viewFactory = FactoryProducer.getFactory(FactoryProducer.SWING);
		this.items = new ArrayList<>();
	}

	public ViewBuilder addMenu(IMenu item) {
		this.items.add(item);
		for (IMenu subItem : item.getSubItems()) {
			this.items.add(subItem);
		}
		return this;
	}

	public IView build() {
		IView view = this.viewFactory.getView();

		for (IMenu item : items) {
			view.addItem(item);
		}

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
