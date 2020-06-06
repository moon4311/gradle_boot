package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.MbrMapper;
import com.cms.model.Mbr;
import com.cms.model.MbrExample;
import com.cms.model.MbrExample.Criteria;

@Service
public class MbrService {

	@Autowired
	private MbrMapper mbrMapper;
	
	/**
	 * 사용자 조회
	 * @param userVO
	 * @return
	 */
	public Mbr getUser(String mbrId) {
		return mbrMapper.selectByPrimaryKey(mbrId);
	}
	
	/**
	 * 사용자 조회
	 */
	public List<Mbr> getUserList(Mbr mbr) {
		
		MbrExample example = new MbrExample();
		Criteria where = example.createCriteria();
		where.andMbrIdIsNotNull();
		where.andMbrIdEqualTo(mbr.getMbrId());
		
		String loginId = mbr.getMbrLogin(); 
		
		if(loginId != null && !loginId.equals("") ) {
			where.andMbrLoginLike(loginId);
		}
		
		return mbrMapper.selectByExample(example);
	}
	
	/**
	 * 사용자 정보 변경
	 * @param userVO
	 */
	public int upsertUser(Mbr mbr) {
		if(mbr==null || mbr.getMbrId() == null || mbr.getMbrId().equals(""))
			return mbrMapper.insert(mbr);
		else
			return mbrMapper.updateByPrimaryKey(mbr);
	}
}
