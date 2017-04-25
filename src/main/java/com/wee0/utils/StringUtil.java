/**
 * Copyright (c) 2016-2022, wee0.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.wee0.utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import wee0.Wee0;

/**
 * 字符串处理工具便捷操作类
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class StringUtil{

	// 实现类实例
	private static final IStringUtil _IMPL = Wee0.impl().getUtilManager().getStringUtil();

	/**
	 * 检查指定字符串是否为空白字符串(空格、制表符、回车符、换行符或换页符)
	 * 
	 * @param value 源数据
	 * @return true / false
	 */
	public static boolean isBlank( String value ){
		return _IMPL.isBlank( value );
	}

	/**
	 * 检查给定元素是否有空值,如果所有元素都不为空返回true,如果有任意一个为空则返回false.
	 * 
	 * @param strings 源数据
	 * @return 数据
	 */
	public static boolean hasBlank( String... strings ){
		return _IMPL.hasBlank( strings );
	}

	/**
	 * 检测指定字符串是否为空白字符串(空格、制表符、回车符、换行符或换页符),是则返回null,否则返回trim后的字符串.
	 * 
	 * @param value 源数据
	 * @return 数据
	 */
	public static String blankToNull( String value ){
		return _IMPL.blankToNull( value );
	}

	/**
	 * <pre>
	 * 
	 * 对指定字符进行JavaScript语法特殊字符转义。防止因为特殊字符导致的错误或被植入恶意代码。
	 * 需要转义的字符如下：
	 * '  
	 * " 
	 * \
	 * \f 
	 * \n 
	 * \t  
	 * \r 
	 * \b
	 * </pre>
	 * 
	 * @param value 要处理的字符串
	 * @return 处理后的字符串
	 */
	public static String escapeJavascript( String value ){
		return _IMPL.escapeJavascript( value );
	}

	/**
	 * 检查指定字符串的第一个字符是否为指定值
	 * 
	 * @param str 源字符串
	 * @param firstChar 匹配第一个字符
	 * @return true / false
	 */
	public static boolean startsWith( String str, char firstChar ){
		return _IMPL.startsWith( str, firstChar );
	}

	/**
	 * 检查指定字符串是否具有指定的前缀。
	 * 
	 * @param str 源字符串
	 * @param prefix 前缀字符串
	 * @return true / false
	 * 
	 *         <pre>
	 * StringUtil.startsWith(null, null)      = true
	 * StringUtil.startsWith(null, &quot;abc&quot;)     = false
	 * StringUtil.startsWith(&quot;abcdef&quot;, null)  = false
	 * StringUtil.startsWith(&quot;abcdef&quot;, &quot;abc&quot;) = true
	 * StringUtil.startsWith(&quot;ABCDEF&quot;, &quot;abc&quot;) = false
	 *         </pre>
	 */
	public static boolean startsWith( String str, String prefix ){
		return _IMPL.startsWith( str, prefix );
	}

	/**
	 * 忽略大小写检查指定字符串是否具有指定的前缀。
	 * 
	 * @param str 源字符串
	 * @param prefix 前缀字符串
	 * @return true / false
	 * 
	 *         <pre>
	 * StringUtil.startsWithIgnoreCase(null, null)      = true
	 * StringUtil.startsWithIgnoreCase(null, &quot;abc&quot;)     = false
	 * StringUtil.startsWithIgnoreCase(&quot;abcdef&quot;, null)  = false
	 * StringUtil.startsWithIgnoreCase(&quot;abcdef&quot;, &quot;abc&quot;) = true
	 * StringUtil.startsWithIgnoreCase(&quot;ABCDEF&quot;, &quot;abc&quot;) = true
	 *         </pre>
	 */
	public static boolean startsWithIgnoreCase( String str, String prefix ){
		return _IMPL.startsWithIgnoreCase( str, prefix );
	}

	/**
	 * 检查指定字符串是否具有指定前缀数组中的任意一个前缀。
	 * 
	 * @param str 源字符串
	 * @param searchStrs 前缀字符串数组
	 * @return true / false
	 * 
	 *         <pre>
	 * StringUtil.startsWithAny(null, null)      = false
	 * StringUtil.startsWithAny(null, new String[] {&quot;abc&quot;})  = false
	 * StringUtil.startsWithAny(&quot;abcxyz&quot;, null)     = false
	 * StringUtil.startsWithAny(&quot;abcxyz&quot;, new String[] {&quot;&quot;}) = false
	 * StringUtil.startsWithAny(&quot;abcxyz&quot;, new String[] {&quot;abc&quot;}) = true
	 * StringUtil.startsWithAny(&quot;abcxyz&quot;, new String[] {null, &quot;xyz&quot;, &quot;abc&quot;}) = true
	 *         </pre>
	 */
	public static boolean startsWithAny( String str, String[] searchStrs ){
		return _IMPL.startsWithAny( str, searchStrs );
	}

	/**
	 * 检查指定字符串的最后一个字符是否为指定值
	 * 
	 * @param str 源字符串
	 * @param firstChar 匹配最后一个字符
	 * @return true / false
	 */
	public static boolean endsWith( String str, char firstChar ){
		return _IMPL.endsWith( str, firstChar );
	}

	/**
	 * 检查指定字符串是否具有指定的后缀。
	 * 
	 * @param str 源字符串
	 * @param suffix 后缀字符串
	 * @return true / false
	 * 
	 *         <pre>
	 * StringUtil.endsWith(null, null)      = true
	 * StringUtil.endsWith(null, &quot;def&quot;)     = false
	 * StringUtil.endsWith(&quot;abcdef&quot;, null)  = false
	 * StringUtil.endsWith(&quot;abcdef&quot;, &quot;def&quot;) = true
	 * StringUtil.endsWith(&quot;ABCDEF&quot;, &quot;def&quot;) = false
	 * StringUtil.endsWith(&quot;ABCDEF&quot;, &quot;cde&quot;) = false
	 *         </pre>
	 */
	public static boolean endsWith( String str, String suffix ){
		return _IMPL.endsWith( str, suffix );
	}

	/**
	 * 忽略大小写检查指定字符串是否具有指定的后缀。
	 * 
	 * @param str 源字符串
	 * @param suffix 后缀字符串
	 * @return true / false
	 * 
	 *         <pre>
	 * StringUtil.endsWithIgnoreCase(null, null)      = true
	 * StringUtil.endsWithIgnoreCase(null, &quot;def&quot;)     = false
	 * StringUtil.endsWithIgnoreCase(&quot;abcdef&quot;, null)  = false
	 * StringUtil.endsWithIgnoreCase(&quot;abcdef&quot;, &quot;def&quot;) = true
	 * StringUtil.endsWithIgnoreCase(&quot;ABCDEF&quot;, &quot;def&quot;) = true
	 * StringUtil.endsWithIgnoreCase(&quot;ABCDEF&quot;, &quot;cde&quot;) = false
	 *         </pre>
	 */
	public static boolean endsWithIgnoreCase( String str, String suffix ){
		return _IMPL.endsWithIgnoreCase( str, suffix );
	}

	/**
	 * 判断指定字符串是否存在于源字符串的指定位置
	 * 
	 * @param str 源字符串
	 * @param substr 判断字符串
	 * @param offset 索引位置
	 * @return true / false
	 */
	public static boolean isSubstringAt( String str, String substr, int offset ){
		return _IMPL.isSubstringAt( str, substr, offset );
	}

	/**
	 * 检查一个字符串是否存在于某个字符串数组中.
	 * 
	 * @param a 源字符
	 * @param arr 检查字符串数组
	 * @param ignoreCase 是否忽略大小写
	 * @return 数据
	 */
	public static boolean aInArr( String a, String[] arr, boolean ignoreCase ){
		return _IMPL.aInArr( a, arr, ignoreCase );
	}

	/**
	 * 检查a数组是否与b数组值相同,只匹配a数组长度部分,如果b数组数量超过a数组,则超过部分忽略.
	 * 
	 * @param a 源数组
	 * @param b 比较数组
	 * @param trimValue 是否去除前后空格
	 * @return true / false
	 */
	public static boolean aInBLeft( String[] a, String[] b, boolean trimValue ){
		return _IMPL.aInBLeft( a, b, trimValue );
	}

	/**
	 * 使用空格从左边填充指定字符串使其达到指定的长度。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @return 数据
	 */
	public static String lpad( String source, int len ){
		return _IMPL.lpad( source, len );
	}

	/**
	 * 使用空格从右边填充指定字符串使其达到指定的长度。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @return 数据
	 */
	public static String rpad( String source, int len ){
		return _IMPL.rpad( source, len );
	}

	/**
	 * 使用空格从左右两边填充指定字符串使其达到指定的长度。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @return 数据
	 */
	public static String lrpad( String source, int len ){
		return _IMPL.lrpad( source, len );
	}

	/**
	 * 使用指定的填充因子从左边填充指定字符串使其达到指定的长度。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @param pad 填充因子
	 * @return 数据
	 */
	public static String lpad( String source, int len, Character pad ){
		return _IMPL.lpad( source, len, pad );
	}

	/**
	 * 使用指定的填充因子从右边填充指定字符串使其达到指定的长度。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @param pad 填充因子
	 * @return 数据
	 */
	public static String rpad( String source, int len, Character pad ){
		return _IMPL.rpad( source, len, pad );
	}

	/**
	 * 使用指定的填充因子从左右两边填充指定字符串使其达到指定的长度，如果填充数量不是双数，则右边比左边多1位。
	 * 
	 * @param source 原始字符串
	 * @param len 需要达到的长度
	 * @param pad 填充因子
	 * @return 数据
	 */
	public static String lrpad( String source, int len, Character pad ){
		return _IMPL.lrpad( source, len, pad );
	}

	/**
	 * 解析查询参数键值对。
	 * 
	 * @param qs 源字符串
	 * @return 数据
	 */
	public static Map<String, String> parseQueryString( String qs ){
		return _IMPL.parseQueryString( qs );
	}

	/**
	 * 检查一个对象是否为null,如果不为null,则调用toString()方法并检查结果是否为空，如果为空，则返回指定的默认值，否则返回原字符串。
	 * 
	 * @param obj 对象
	 * @param defValue 默认值
	 * @return 数据
	 */
	public static String parseStr( Object obj, String defValue ){
		return _IMPL.parseStr( obj, defValue );
	}

	/**
	 * 检查一个字符串是否为空，如果为空，则返回指定的默认值，否则返回原字符串。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 原字符串 / 默认值
	 */
	public static String parseStr( String str, String defaultValue ){
		return _IMPL.parseStr( str, defaultValue );
	}

	/**
	 * 使用默认编码从一个字节数组转换出一个标准的字符串对象。
	 * 
	 * @param bytes 源数据
	 * @return 数据
	 */
	public static String parseStr( byte[] bytes ){
		return _IMPL.parseStr( bytes );
	}

	/**
	 * 使用指定编码从一个字节数组转换出一个标准的字符串对象。
	 * 
	 * @param bytes 源数据
	 * @param charset 字符集
	 * @return 数据
	 */
	public static String parseStr( byte[] bytes, String charset ){
		return _IMPL.parseStr( bytes, charset );
	}

	/**
	 * 将指定的字符串转换为boolean型，当前版本只有1和true(忽略大小写)返回真，否则返回假，null时返回默认值。
	 * 
	 * @param value 待转换的字符串
	 * @param defValue 如果为null时的默认值
	 * @return boolean / 默认值
	 */
	public static boolean parseBoolean( String value, boolean defValue ){
		return _IMPL.parseBoolean( value, defValue );
	}

	/**
	 * 从一个字符串得到一个整形数字，如果字符串为空值或者空字符串，则返回指定的默认值。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static int parseInt( String str, int defaultValue ){
		return _IMPL.parseInt( str, defaultValue );
	}

	/**
	 * 从一个字符串得到一个长整形数字，如果字符串为空值或者空字符串，则返回指定的默认值。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static long parseLong( String str, long defaultValue ){
		return _IMPL.parseLong( str, defaultValue );
	}

	/**
	 * 从一个字符串得到一个单精度浮点型数字，如果字符串为空值或者空字符串，则返回指定的默认值。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static float parseFloat( String str, float defaultValue ){
		return _IMPL.parseFloat( str, defaultValue );
	}

	/**
	 * 从一个字符串得到一个双精度浮点型数字，如果字符串为空值或者空字符串，则返回指定的默认值。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static double parseDouble( String str, double defaultValue ){
		return _IMPL.parseDouble( str, defaultValue );
	}

	/**
	 * 从一个字符串得到一个任意精度的大数字，如果字符串为空值或者空字符串，则返回指定的默认值。
	 * 
	 * @param str 待操作字符串
	 * @param defaultValue 为空或者空字符串时的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static BigDecimal parseDouble( String str, BigDecimal defaultValue ){
		return _IMPL.parseDouble( str, defaultValue );
	}

	/**
	 * 解析数字类型，从小数字类型到大数字类型依次解析。全部解析失败则失败。
	 * 
	 * @param str 要解析的字符串
	 * @param defValue 解析失败返回的默认值
	 * @return 解析出的数字 / 默认值
	 */
	public static Object parseNumber( String str, Object defValue ){
		return _IMPL.parseNumber( str, defValue );
	}

	/**
	 * 从一个字符串解析出一个按指定分隔符进行分隔后的字符串数组，并去除每个元素前后的空格。
	 * 
	 * @param str 原始字符串
	 * @param separator 元素分隔符
	 * @param defResult 当原始字符串为空时返回的默认值
	 * @return 数据
	 */
	public static List<String> parseTrimList( String str, String separator, List<String> defResult ){
		return _IMPL.parseTrimList( str, separator, defResult );
	}

	/**
	 * 获取一个36位的唯一标识。
	 * 
	 * @return 数据
	 */
	public static String getUUID36(){
		return _IMPL.getUUID36();
	}

} // end class
