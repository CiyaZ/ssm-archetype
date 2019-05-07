#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

/**
 * @author CiyaZ
 */
public class HtmlReplaceUtil
{
	public static String doBracketsReplace(String srcStr)
	{
		return srcStr
				.replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
