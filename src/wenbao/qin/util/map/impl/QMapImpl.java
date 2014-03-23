package wenbao.qin.util.map.impl;

import java.util.Iterator;
import java.util.Map;

import wenbao.qin.util.map.QMap;

public class QMapImpl implements QMap {

	@Override
	public String toString(Map map) {
		String tmp_str = "" ;
		String key = "" ;
		Iterator it = map.keySet().iterator() ;
		while( it.hasNext() )
		{
			key = (String) it.next() ;
			tmp_str += "["+ map.get(key) +"]," ;
		}
		
		tmp_str = tmp_str.endsWith(",")?tmp_str.substring(0, tmp_str.length()):tmp_str ;
		return tmp_str ;
	}

}
