#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.bean.User;

/**
 * @author CiyaZ
 */
public interface TestService
{
	/**
	 * Get user domain object by user id
	 *
	 * @param userId user id
	 * @return user object
	 */
	User getUserById(Long userId);
}
