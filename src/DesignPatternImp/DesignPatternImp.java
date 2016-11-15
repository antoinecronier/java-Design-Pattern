package DesignPatternImp;

import javax.swing.JLabel;
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

//		MenuBuilder menuBuilder1 = new MenuBuilder();
//		MenuBuilder menuBuilder2 = new MenuBuilder();
//		MenuBuilder menuBuilder3 = new MenuBuilder();
//		ViewBuilder builder1 = new ViewBuilder();
//
//		menuBuilder1
//			.addItem(new JLabel("test"))
//			.addItem(new MenuImage());
//		menuBuilder2
//			.addItem(new MenuText())
//			.addItem(new JTextField());
//		menuBuilder3
//			.addItem(new JLabel("label b3"));
//
//		builder1
//			.addMenu(menuBuilder1.build())
//			.addMenu(menuBuilder2.build())
//			.addMenu(menuBuilder3.build())
//			.build()
//			.Print();

		MenuBuilder menuBuilderA1 = new MenuBuilder();
		MenuBuilder menuBuilderA2 = new MenuBuilder();
		MenuBuilder menuBuilderA3 = new MenuBuilder();
		ViewBuilder builderA1 = new ViewBuilder();

		MenuText text = new MenuText();
		menuBuilderA1
			.addItem(text)
			.addItem(new JLabel("coucou"));

		menuBuilderA2.addItem(new MenuText());

		menuBuilderA3.addItem(new JTextField("yolo"));

		builderA1
			.addMenu(menuBuilderA1.build(),2,3)
			.addMenu(menuBuilderA2.build())
			.addMenu(menuBuilderA3.build())
			.build()
			.Print();
	}

}
