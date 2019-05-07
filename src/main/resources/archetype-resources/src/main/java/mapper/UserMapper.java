#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import ${package}.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author CiyaZ
 */
public interface UserMapper
{
	/**
	 * find user domain object by user id
	 *
	 * @param userId user id
	 * @return user object
	 */
	User findUserByUserId(@Param("userId") Long userId);
}
