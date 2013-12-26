import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.valiantmarauders.minecraft.block.PlayerSelectBlockListener;
import com.valiantmarauders.minecraft.selection.CuboidSelectionManager;
import com.valiantmarauders.minecraft.selection.SelectionManager;

public class Fiefdom extends JavaPlugin {
	PluginManager pm;
	SelectionManager sm;

	public void onEnable() {
		pm = this.getServer().getPluginManager();
		sm = new CuboidSelectionManager(this, Material.WOOD_SPADE);
		pm.registerEvents(new PlayerSelectBlockListener(this, sm), this);
	}

	public void onDisable() {
		// write everything to db
	}
}
