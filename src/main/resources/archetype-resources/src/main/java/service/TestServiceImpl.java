#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.bean.User;
import ${package}.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CiyaZ
 */
@Service("testService")
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService
{
	private final UserMapper userMapper;

	@Autowired
	public TestServiceImpl(UserMapper userMapper)
	{
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(Long userId)
	{
		return userMapper.findUserByUserId(userId);
	}
}
