package com.pilzbros.Alcatraz.Runnable;

import java.util.Iterator;
import java.util.Map;

import org.bukkit.scheduler.BukkitRunnable;

import com.pilzbros.Alcatraz.Alcatraz;
import com.pilzbros.Alcatraz.Objects.Prison;

public class ChestGenerator extends BukkitRunnable
{
	@Override
	public void run() 
	{
		if (System.currentTimeMillis() - Alcatraz.lastRandomChest >= 1800000)
		{
			Alcatraz.lastRandomChest = System.currentTimeMillis();
		
			for (Prison prison: Alcatraz.prisonController.getPrisons())
			{
				prison.getChestManager().regenerateRandomChests();
			}
		}
		else
		{
			return;
		}
	}
}