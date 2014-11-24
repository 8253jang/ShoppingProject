package exam.shop.security;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.*;

import exam.shop.dao.*;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDAOImpl userDAOImpl;
	
	public MyUserDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String userId)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		String userPwd = userDAOImpl.getPassword(userId);
		
		List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
				
		MyUserDetails user = new MyUserDetails(userId, userPwd);
		
		return user;
	}
}
