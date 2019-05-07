#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.bean;

import lombok.Builder;
import lombok.Data;

/**
 * This is a test bean for mybatis orm
 *
 * @author CiyaZ
 */
@Data
@Builder
public class User
{
	private Long userId;
	private String username;
	private String password;
}
