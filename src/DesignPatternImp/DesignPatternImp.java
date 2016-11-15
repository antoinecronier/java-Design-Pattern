package DesignPatternImp;

import javax.swing.JTextField;

import DesignPatternImp.AbstractFactory.AbstractFactory;
import DesignPatternImp.AbstractFactory.FactoryProducer;
import DesignPatternImp.AbstractFactory.IMenu;
import DesignPatternImp.AbstractFactory.IView;
import DesignPatternImp.Builder.MenuBuilder;
import DesignPatternImp.Builder.ViewBuilder;
import DesignPatternImp.Entities.Menu.MenuImage;
import DesignPatternImp.Entities.Menu.MenuText;
import DesignPatternImp.Entities.View.ViewBase;

public class DesignPatternImp {

	public static void main(String[] args) {
		/*AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.SWING);
		IView view = factory.getView();
		view.Print();*/

		MenuBuilder menuBuilder = new MenuBuilder();
		ViewBuilder builder = new ViewBuilder();

		/*builder.addMenu(menuBuilder.build());
		builder.build().Print();*/

		menuBuilder
			.addSubMenu(new MenuText())
			.addSubMenu(new MenuImage());
		builder.addMenu(menuBuilder.build()).build().Print();

	}

}
