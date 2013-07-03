package mods.alice.rana.utility;

import java.lang.reflect.Field;

import mods.alice.rana.Rana;

public class Reflecter
{
	public static Field getField(Class<?> clazz, String... names)
	{
		Field f = null;

		if(clazz == null)
		{
			Rana.log.warning("Class is not specificed.");
			return null;
		}

		for(String name : names)
		{
			if((name == null) || (name.length() == 0))
			{
				break;
			}

			try
			{
				f = clazz.getDeclaredField(name);
				f.setAccessible(true);
			}
			catch(SecurityException e)
			{
				Rana.log.severe(String.format("SecurityException is occurred when obtaining field %s from class %s.", name, clazz.getName()));
			}
			catch(NoSuchFieldException e)
			{
				f = null;
			}

			if(f != null)
			{
				break;
			}
		}

		return f;
	}
}
