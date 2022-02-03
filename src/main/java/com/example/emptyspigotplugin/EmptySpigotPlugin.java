package com.example.emptyspigotplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class EmptySpigotPlugin extends JavaPlugin {

  public void onEnable() {
    System.out.println("Enabled Cool Plugin Go BRRRR");
  }

  @Override
  public void onDisable() {
    System.out.println("Disabled cool plugin ):");
  }

}
