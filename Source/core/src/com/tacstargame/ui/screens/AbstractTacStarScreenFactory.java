package com.tacstargame.ui.screens;

import com.tacstargame.TacStar;
import com.tacstargame.ui.Plattform;
import com.tacstargame.ui.TacStarScreen;
import com.tacstargame.ui.desktop.screens.DesktopTacStarScreenFactory;

public abstract class AbstractTacStarScreenFactory {
	
	private static AbstractTacStarScreenFactory desktop = new DesktopTacStarScreenFactory();
	
	public static AbstractTacStarScreenFactory getTacStarScreenFactory(Plattform plattform) {
		switch (plattform) {
		case DESKTOP:
			return desktop;
		case ANDROID:
			return desktop;
		default:
			return desktop;		
		}
	}
	
	public abstract TacStarScreen getMainMenue(TacStar tacStar);
	public abstract TacStarScreen getIntroScreen(TacStar tacStar);
	public abstract TacStarScreen getCombatScreen(TacStar tacStar);
}
