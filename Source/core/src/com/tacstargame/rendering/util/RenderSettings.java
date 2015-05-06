package com.tacstargame.rendering.util;

import com.tacstargame.ui.util.Measure;

public class RenderSettings {
	
	private Measure resolution;
	
	public RenderSettings() {}
	
	public void setResolution(Measure resolution) {
		this.resolution = resolution;
	}
	
	public Measure getResolution() {
		return resolution;
	}
}
