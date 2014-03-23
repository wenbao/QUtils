package wenbao.qin.util.log.impl;

import java.util.logging.Logger;

import wenbao.qin.util.log.QLogger;


public class QLoggerImpl implements QLogger{

	@Override
	public Logger getThisLogger(Object obj) {
		return Logger.getLogger(obj.getClass().getName());
	}
	
}
