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

/**
 * 数据检验处理对象
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IValidateUtil{

	/**
	 * 获取指定规则表达式的默认错误提示。
	 * 
	 * @param pattern 匹配式
	 * @return 错误消息
	 */
	public String getDefaultErrorInfo( String pattern );

	/**
	 * 获取指定规则表达式的默认错误提示。
	 * 
	 * @param pattern 匹配式
	 * @param fieldName 字段名
	 * @return 错误消息
	 */
	public String getDefaultErrorInfo( String pattern, String fieldName );

	/**
	 * 使用内置的常用校验规则进行数据合法性校验,所有规则都不允许数据为空. 内置规则表达式列表： *：检测是否有输入，可以输入任何字符，不留空即可通过验证, 常用错误提示: "不能为空！", *6-16：检测是否为6到16位任意字符, 常用错误提示: "请填写6到16位任意字符！", n：数字类型, 常用错误提示: "请填写数字！", n6-16：6到16位数字, 常用错误提示: "请填写6到16位数字！", s：英文字符串类型, 常用错误提示: "只能输入英文字母和数字！", s6-18：6到18位英文字符串, 常用错误提示: "请填写6到18位英文字母和数字！", S：字符串类型, 常用错误提示: "不能输入特殊字符！", S6-18：6到18位字符串, 常用错误提示: "请填写6到18位字符！", p：验证是否为邮政编码, 常用错误提示: "请填写邮政编码！", m：手机号码格式, 常用错误提示: "请填写手机号码！", e：email格式, 常用错误提示: "邮箱地址格式不对！", url：验证字符串是否为网址, 常用错误提示: "请填写网址！" ipv4：验证字符串是否为规范的IPv4地址, 常用错误提示: "请填写IPv4地址！" reg: 验证字符串是否匹配指定的正则表达式，默认错误提示为："参数非法!"
	 * 
	 * @param value 待校验值
	 * @param pattern 内置规则表达式
	 * @param ignoreNull 校验时是否对空值进行特殊处理,为true表示值为空时不进行校验直接通过,不为空时才执行校验规则.为false时值为空直接返回校验失败.
	 * @param byteLenModel 校验时是否按字节处理长度,true表示按字节处理长度,即英文视为1个字节,中文视为2个字节.
	 * @return 通过返回 true, 否则返回 false
	 */
	public boolean validatePattern( String value, String pattern, boolean ignoreNull, boolean byteLenModel );

	/**
	 * ingoreNull,byteLenModel默认使用false，进行数据校验。
	 * 
	 * @param value 待校验值
	 * @param pattern 内置规则表达式
	 * @return 通过返回 true, 否则返回 false
	 */
	public boolean validatePattern( final String value, final String pattern );

	/**
	 * 对指定字符串进行email地址校验。
	 * 
	 * @param value 值
	 * @return true / false
	 */
	public boolean validateEmail( String value );

	/**
	 * 对指定字符串进行正则表达式校验,忽略大小写
	 * 
	 * @param value 要检查的字符串对象
	 * @param regExpression 校验使用的正则表达式
	 * @return true / false
	 */
	public boolean validateRegex( String value, String regExpression );

	/**
	 * 对指定字符串进行正则表达式校验。
	 * 
	 * @param value 要检查的字符串对象
	 * @param regExpression 校验使用的正则表达式
	 * @param isCaseSensitive 大小写是否敏感，false忽略大小写
	 * @return true / false
	 */
	public boolean validateRegex( String value, String regExpression, boolean isCaseSensitive );

	/**
	 * 对指定字符串使用指定的日期格式进行日期类型校验
	 * 
	 * @param value 要检查的字符串
	 * @param min 最小值
	 * @param max 最大值
	 * @param dateFormat 日期格式
	 * @return true / false
	 */
	public boolean validateDate( String value, String min, String max, String dateFormat );

	/**
	 * 对指定字符串进行日期类型校验,默认格式为:yyyy-MM-dd
	 * 
	 * @param value 要检查的字符串
	 * @param min 最小值
	 * @param max 最大值
	 * @return true / false
	 */
	public boolean validateDate( String value, String min, String max );

	/**
	 * 校验两个字符串是否相同
	 * 
	 * @param value1 值 1
	 * @param value2 值 2
	 * @return true / false
	 */
	public boolean validateEqualString( String value1, String value2 );

	/**
	 * 校验两个整数是否相等
	 * 
	 * @param value1 值 1
	 * @param value2 值 2
	 * @return true / false
	 */
	public boolean validateEqualInteger( Integer value1, Integer value2 );

	/**
	 * 对指定字符串进行双精度浮点型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @return true / false
	 */
	public boolean validateDouble( String value );

	/**
	 * 对指定字符串进行双精度浮点型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @param min 最小值
	 * @param max 最大值
	 * @return true / false
	 */
	public boolean validateDouble( String value, double min, double max );

	/**
	 * 对指定字符串进行长整型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @return true / false
	 */
	public boolean validateLong( String value );

	/**
	 * 对指定字符串进行长整型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @param min 最小值
	 * @param max 最大值
	 * @return true / false
	 */
	public boolean validateLong( String value, long min, long max );

	/**
	 * 对指定字符串进行整型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @return true / false
	 */
	public boolean validateInteger( String value );

	/**
	 * 对指定字符串进行整型校验
	 * 
	 * @param value 要检查的字符串对象
	 * @param min 最小值
	 * @param max 最大值
	 * @return true / false
	 */
	public boolean validateInteger( String value, int min, int max );

	/**
	 * 对指定字符串进行非空检验，此版本的为空不包括空格字符，制表键等有长度的空字符串。
	 * 
	 * @param value 值
	 * @return true / false
	 */
	public boolean validateRequired( String value );

	/**
	 * 对指定字符串进行非空检验，此版本的为空包括空格字符，制表键等有长度的空字符串。
	 * 
	 * @param value 值
	 * @return true / false
	 */
	public boolean validateRequiredString( String value );

	/**
	 * 对指定字符串进行字符串长度校验。
	 * 
	 * @param value 要检查的字符串对象
	 * @param minLen 最小长度
	 * @param maxLen 最大长度
	 * @return true / false
	 */
	public boolean validateString( String value, int minLen, int maxLen );

	/**
	 * 对指定字符串进行字符串长度校验。
	 * 
	 * @param value 要检查的字符串对象
	 * @param notBlank 是否允许为空字符串，如果为true,则空格之类的字符串不能通过校验
	 * @param minLen 最小长度
	 * @param maxLen 最大长度
	 * @return true / false
	 */
	public boolean validateString( String value, boolean notBlank, int minLen, int maxLen );

	/**
	 * 对指定字符串进行url地址校验。
	 * 
	 * @param value url地址
	 * @return true / false
	 */
	public boolean validateUrl( String value );

	/**
	 * 对指定字符串进行IPv4地址校验。
	 * 
	 * @param ip ip地址
	 * @return true / false
	 */
	public boolean validateIPv4( String ip );

	/**
	 * 对指定端口号进行校验。
	 * 
	 * @param port 端口号
	 * @return true / false
	 */
	public boolean validatePort( int port );

} // end interface
