package mods.alice.rana.utility;

public class TypeTransformer
{
	public static byte truncateIntToUnsignedByte(int value)
	{
		return (byte)value;
	}

	public static int expandUnsignedByteToInt(byte value)
	{
		int t;

		if(value < 0)
		{
			t = 256 + (int)value;
		}
		else
		{
			t = value;
		}

		return t;
	}
}
