package com.pauldavdesign.mineauz.minigames.config;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;

import com.pauldavdesign.mineauz.minigames.menu.MenuItem;

public class LongFlag extends Flag<Long>{
	
	public LongFlag(Long value, String name){
		setFlag(value);
		setDefaultFlag(value);
		setName(name);
	}

	@Override
	public void saveValue(String path, FileConfiguration config) {
		config.set(path + "." + getName(), getFlag());
	}

	@Override
	public void loadValue(String path, FileConfiguration config) {
		setFlag((Long) config.get(path + "." + getName()));
	}

	@Override
	public MenuItem getMenuItem(String name, Material displayItem) {
		return null;
	}

	@Override
	public MenuItem getMenuItem(String name, Material displayItem,
			List<String> description) {
		return null;
	}

}