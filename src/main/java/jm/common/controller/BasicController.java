package jm.common.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;



@PropertySource("classpath:props/globals.properties")
public class BasicController {

	@Value("${Globals.attFileBaseUrl}")
	protected String baseFilePath;
	
	@Autowired
	protected ServletContext servletContext; // 임시
	
	
	public Log log = LogFactory.getLog(this.getClass());
	public final static int _pageSize = 10;
	public final static int _pageRange = 10;
	
	public static final String _params = "params";
	/* 조회타입 */
	public static final String _LIST = "LIST";
	public static final String _EXCEL = "EXCEL";
	
	protected final static String _idx = "idx";
	protected final static String _gubun = "gubun";
	
	
	protected final static String _totCnt = "totCnt"; //총 갯수
	protected final static String _rowCnt = "rowCnt"; //
	
	protected Map<Integer,Object> listMap = new HashMap<Integer,Object>();
	
	
}
