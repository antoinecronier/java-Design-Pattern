package DesignPatternImp.AbstractFactory;

import DesignPatternImp.Entities.Menu.*;
import DesignPatternImp.Entities.View.ConcretePage;
import DesignPatternImp.Entities.View.EmptyPage;

public class SwingFactory extends AbstractFactory{

	@Override
	public IMenu getMenu() {
		return new MenuEmpty();
	}

	@Override
	public IView getView() {
		return new EmptyPage();
	}
}
