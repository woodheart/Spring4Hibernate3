// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RouterFactory.java

package com.autohome.turbo.rpc.cluster;

import com.autohome.turbo.common.URL;

// Referenced classes of package com.autohome.turbo.rpc.cluster:
//			Router

public interface RouterFactory
{

	public abstract Router getRouter(URL url);
}
