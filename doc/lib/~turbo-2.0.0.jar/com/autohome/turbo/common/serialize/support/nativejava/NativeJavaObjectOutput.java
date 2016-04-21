// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NativeJavaObjectOutput.java

package com.autohome.turbo.common.serialize.support.nativejava;

import com.autohome.turbo.common.serialize.ObjectOutput;
import com.autohome.turbo.common.utils.Assert;
import java.io.*;

public class NativeJavaObjectOutput
	implements ObjectOutput
{

	private final ObjectOutputStream outputStream;

	public NativeJavaObjectOutput(OutputStream os)
		throws IOException
	{
		this(new ObjectOutputStream(os));
	}

	protected NativeJavaObjectOutput(ObjectOutputStream out)
	{
		Assert.notNull(out, "output == null");
		outputStream = out;
	}

	protected ObjectOutputStream getObjectOutputStream()
	{
		return outputStream;
	}

	public void writeObject(Object obj)
		throws IOException
	{
		outputStream.writeObject(obj);
	}

	public void writeBool(boolean v)
		throws IOException
	{
		outputStream.writeBoolean(v);
	}

	public void writeByte(byte v)
		throws IOException
	{
		outputStream.writeByte(v);
	}

	public void writeShort(short v)
		throws IOException
	{
		outputStream.writeShort(v);
	}

	public void writeInt(int v)
		throws IOException
	{
		outputStream.writeInt(v);
	}

	public void writeLong(long v)
		throws IOException
	{
		outputStream.writeLong(v);
	}

	public void writeFloat(float v)
		throws IOException
	{
		outputStream.writeFloat(v);
	}

	public void writeDouble(double v)
		throws IOException
	{
		outputStream.writeDouble(v);
	}

	public void writeUTF(String v)
		throws IOException
	{
		outputStream.writeUTF(v);
	}

	public void writeBytes(byte v[])
		throws IOException
	{
		if (v == null)
			outputStream.writeInt(-1);
		else
			writeBytes(v, 0, v.length);
	}

	public void writeBytes(byte v[], int off, int len)
		throws IOException
	{
		if (v == null)
		{
			outputStream.writeInt(-1);
		} else
		{
			outputStream.writeInt(len);
			outputStream.write(v, off, len);
		}
	}

	public void flushBuffer()
		throws IOException
	{
		outputStream.flush();
	}
}
