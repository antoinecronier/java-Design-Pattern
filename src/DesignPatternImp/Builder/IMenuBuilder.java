package DesignPatternImp.Builder;

import java.awt.LayoutManager;

import javax.swing.border.Border;

public interface IMenuBuilder {
	void Size(int width, int height);
	void Position(int x, int y);
	void Visibility(Boolean isVisible);
	void Border(Border border);
	void Layout(LayoutManager layout);
}
