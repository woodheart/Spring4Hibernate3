// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LogHelper.java

package com.autohome.turbo.common.utils;

import com.autohome.turbo.common.logger.Logger;

public class LogHelper
{

	public static void trace(Logger logger, String msg)
	{
		if (logger == null)
			return;
		if (logger.isTraceEnabled())
			logger.trace(msg);
	}

	public static void trace(Logger logger, Throwable throwable)
	{
		if (logger == null)
			return;
		if (logger.isTraceEnabled())
			logger.trace(throwable);
	}

	public static void trace(Logger logger, String msg, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isTraceEnabled())
			logger.trace(msg, e);
	}

	public static void debug(Logger logger, String msg)
	{
		if (logger == null)
			return;
		if (logger.isDebugEnabled())
			logger.debug(msg);
	}

	public static void debug(Logger logger, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isDebugEnabled())
			logger.debug(e);
	}

	public static void debug(Logger logger, String msg, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isDebugEnabled())
			logger.debug(msg, e);
	}

	public static void info(Logger logger, String msg)
	{
		if (logger == null)
			return;
		if (logger.isInfoEnabled())
			logger.info(msg);
	}

	public static void info(Logger logger, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isInfoEnabled())
			logger.info(e);
	}

	public static void info(Logger logger, String msg, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isInfoEnabled())
			logger.info(msg, e);
	}

	public static void warn(Logger logger, String msg, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isWarnEnabled())
			logger.warn(msg, e);
	}

	public static void warn(Logger logger, String msg)
	{
		if (logger == null)
			return;
		if (logger.isWarnEnabled())
			logger.warn(msg);
	}

	public static void warn(Logger logger, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isWarnEnabled())
			logger.warn(e);
	}

	public static void error(Logger logger, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isErrorEnabled())
			logger.error(e);
	}

	public static void error(Logger logger, String msg)
	{
		if (logger == null)
			return;
		if (logger.isErrorEnabled())
			logger.error(msg);
	}

	public static void error(Logger logger, String msg, Throwable e)
	{
		if (logger == null)
			return;
		if (logger.isErrorEnabled())
			logger.error(msg, e);
	}

	private LogHelper()
	{
	}
}
