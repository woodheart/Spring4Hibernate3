// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RemoteSerializer.java

package com.autohome.hessian.io;

import java.io.IOException;

// Referenced classes of package com.autohome.hessian.io:
//			AbstractSerializer, HessianRemoteObject, HessianRemote, AbstractHessianOutput

public class RemoteSerializer extends AbstractSerializer
{

	public RemoteSerializer()
	{
	}

	public void writeObject(Object obj, AbstractHessianOutput out)
		throws IOException
	{
		HessianRemoteObject remoteObject = (HessianRemoteObject)obj;
		out.writeObject(new HessianRemote(remoteObject.getHessianType(), remoteObject.getHessianURL()));
	}
}
