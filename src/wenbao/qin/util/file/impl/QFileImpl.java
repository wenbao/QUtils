package wenbao.qin.util.file.impl;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import wenbao.qin.util.file.QFile;


public class QFileImpl implements QFile{
	
	Logger logger = Logger.getLogger(QFileImpl.class.getName()) ;
	
	private String filePath ;
	
	public QFileImpl(String filePathFrom ) {
		this.filePath = filePathFrom ;
	}
	
	/**
	 *  check file path
	 */
	@Override
	public void checkFilePath() {
		File file = new File(filePath) ;
		if( file != null && file.exists() )
		{
			//logger.log(Level.INFO, "file is a ok:[ "+filePath+" ]" ) ;
		} 
		else if( file != null && file.isDirectory() )
		{
			logger.log(Level.WARNING, "file is a directory:[ "+filePath+" ]" ) ;
		}
		else 
		{
			logger.log(Level.WARNING, "file path null:[ "+filePath+" ]" ) ;
		}
	}

	/**
	 * check file type
	 */
	public void checkFileType( String filePath)
	{
		if( null == filePath )
		{
			logger.log(Level.WARNING , filePath +" is null ") ;
		}
		else if( filePath != null && (!filePath.endsWith(".xls") || !filePath.endsWith(".xlsx")) )
		{
			logger.log(Level.WARNING, "file is not a right excel(xls or xlsx): ["+filePath+"]" ) ;
		}
		
	}
	
	public static void main(String[] args) {
		String s = "C:/Users/qinwenbao/Desktop/五大功能区加载数据.xls" ;
		QFile f = new QFileImpl(s) ;
		f.checkFileType(s) ;
		f.checkFilePath() ;
	}
}
