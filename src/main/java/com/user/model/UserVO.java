package com.user.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 사용자
 *
 * @author Kim Jae Moon
 * @since 2019. 9. 06.
 */

@Setter
@Getter
public class UserVO {
	private int id = 0;
	private String userId;
	private String pwd;
	private String userName;
	private String tel;
	private String email;
	private boolean useYn;
	private String insertDate;
	private String updateDate;

	/**
	 * 사용자 체크
	 * @return
	 */
	public boolean existedUser() {
		return id > 0;
	}
}
