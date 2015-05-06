package com.tacstargame.ui.desktop.screens;

import com.tacstargame.TacStar;
import com.tacstargame.ui.TacStarScreen;
import com.tacstargame.ui.screens.AbstractTacStarScreenFactory;

public class DesktopTacStarScreenFactory extends AbstractTacStarScreenFactory {

	@Override
	public TacStarScreen getMainMenue(TacStar tacStar) {
		return new MainMenue(tacStar);
	}

	@Override
	public TacStarScreen getIntroScreen(TacStar tacStar) {
		return new IntroLogoScreen(tacStar);
	}
	
	@Override
	public TacStarScreen getCombatScreen(TacStar tacStar) {
		return null;
	}

}
