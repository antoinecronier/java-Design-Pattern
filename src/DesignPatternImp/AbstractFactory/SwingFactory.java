package DesignPatternImp.AbstractFactory;

import DesignPatternImp.Entities.Menu.*;
import DesignPatternImp.Entities.View.ConcretePage;

public class SwingFactory extends AbstractFactory{

	@Override
	public IMenu getMenu() {
		return new MenuText();
	}

	@Override
	public IView getView() {
		return new ConcretePage();
	}
}
