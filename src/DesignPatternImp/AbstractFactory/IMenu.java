package DesignPatternImp.AbstractFactory;

import java.util.List;

public interface IMenu extends IView {

	List<IMenu> getSubItems();
}
