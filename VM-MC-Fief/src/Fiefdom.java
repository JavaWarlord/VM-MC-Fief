import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.valiantmarauders.minecraft.block.CuboidSelectionManager;
import com.valiantmarauders.minecraft.block.PlayerSelectBlockListener;
import com.valiantmarauders.minecraft.block.SelectionManager;

public class Fiefdom extends JavaPlugin {
	PluginManager pm;
	SelectionManager sm;

	public void onEnable() {
		pm = this.getServer().getPluginManager();
		sm = new CuboidSelectionManager(Material.WOOD_SWORD);
		pm.registerEvents(new PlayerSelectBlockListener(this, sm), this);
	}

	public void onDisable() {
	}
}
