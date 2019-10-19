package com.user.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 메뉴
 *
 * @author Kim Jae Moon
 * @since 2019. 10. 18.
 */

@Setter
@Getter
public class MenuVO {
	
	private Integer id;
	private Integer p_id;
	private String menuNm;
	private String menuUrl;
	private boolean isUse;

	public boolean existed(){
		return id!=null;
	}
	
}
