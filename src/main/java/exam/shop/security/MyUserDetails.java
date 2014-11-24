package exam.shop.security;

import java.util.*;

import org.slf4j.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.*;

import exam.shop.controller.*;

public class MyUserDetails implements UserDetails {
	
	private String userId;
	private String userPwd;
	
	private static final Logger logger 
	= LoggerFactory.getLogger(UserController.class);

	public MyUserDetails(String userId, String userPwd) {
		// TODO Auto-generated constructor stub
		
		this.userId = userId;
		this.userPwd = userPwd;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
				
		
		logger.info("getAuthorities" + authorities);
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.userPwd;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
