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
		return this;
	}

	public IView build() {
		IView view = this.viewFactory.getView();

		for (IMenu item : items) {
			view.addItem(item);
		}

		return view;
	}
}
