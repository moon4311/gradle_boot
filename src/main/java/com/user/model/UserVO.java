package com.user.model;

import lombok.Getter;
import lombok.Setter;

/**
 * »ç¿ëÀÚ
 *
 * @author Kim Jae Moon
 * @since 2019. 9. 06.
 */

@Setter
@Getter
public class UserVO {
	private int id;
	private String userId;
	private String pwd;
	private String userName;
	private String tel;
	private String email;
	private boolean useYn;
	private String insertDate;
	private String updateDate;

}
