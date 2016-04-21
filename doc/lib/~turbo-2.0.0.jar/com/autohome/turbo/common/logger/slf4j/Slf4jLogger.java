// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Slf4jLogger.java

package com.autohome.turbo.common.logger.slf4j;

import com.autohome.turbo.common.logger.Logger;
import java.io.Serializable;

public class Slf4jLogger
	implements Logger, Serializable
{

	private static final long serialVersionUID = 1L;
	private final org.slf4j.Logger logger;

	public Slf4jLogger(org.slf4j.Logger logger)
	{
		this.logger = logger;
	}

	public void trace(String msg)
	{
		logger.trace(msg);
	}

	public void trace(Throwable e)
	{
		logger.trace(e.getMessage(), e);
	}

	public void trace(String msg, Throwable e)
	{
		logger.trace(msg, e);
	}

	public void debug(String msg)
	{
		logger.debug(msg);
	}

	public void debug(Throwable e)
	{
		logger.debug(e.getMessage(), e);
	}

	public void debug(String msg, Throwable e)
	{
		logger.debug(msg, e);
	}

	public void info(String msg)
	{
		logger.info(msg);
	}

	public void info(Throwable e)
	{
		logger.info(e.getMessage(), e);
	}

	public void info(String msg, Throwable e)
	{
		logger.info(msg, e);
	}

	public void warn(String msg)
	{
		logger.warn(msg);
	}

	public void warn(Throwable e)
	{
		logger.warn(e.getMessage(), e);
	}

	public void warn(String msg, Throwable e)
	{
		logger.warn(msg, e);
	}

	public void error(String msg)
	{
		logger.error(msg);
	}

	public void error(Throwable e)
	{
		logger.error(e.getMessage(), e);
	}

	public void error(String msg, Throwable e)
	{
		logger.error(msg, e);
	}

	public boolean isTraceEnabled()
	{
		return logger.isTraceEnabled();
	}

	public boolean isDebugEnabled()
	{
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled()
	{
		return logger.isInfoEnabled();
	}

	public boolean isWarnEnabled()
	{
		return logger.isWarnEnabled();
	}

	public boolean isErrorEnabled()
	{
		return logger.isErrorEnabled();
	}
}
