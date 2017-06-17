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
package wee0.lang;

import wee0.Wee0;

/**
 * 基础对象类型操作门面类入口。
 * @author		baihw
 * @date 		2017年1月3日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class Objects{

	private static IObjects impl(){
		return Wee0.impl().getObjects();
	}

	/**
	 * 获取框架空字符串对象
	 * 
	 * @return 框架空字符串对象
	 */
	public static IString emptyString(){
		return impl().emptyString();
	}

	/**
	 * 创建一个框架字符串对象
	 * 
	 * @param value 原始数据
	 * @return 框架字符串对象
	 */
	public static IString newString( String value ){
		return impl().newString( value );
	}

	/**
	 * 创建一个框架字符串对象
	 * 
	 * @param value 原始数据对象
	 * @return 框架字符串对象
	 */
	public static IString newString( Object value ){
		return impl().newString( value );
	}

	/**
	 * 创建一个框架数值对象
	 * 
	 * @param value 原始数据
	 * @return 框架数值对象
	 */
	public static INumber newNumber( String value ){
		return impl().newNumber( value );
	}

	/**
	 * 创建一个框架数值对象
	 * 
	 * @param value 原始数据
	 * @return 框架数值对象
	 */
	public static INumber newNumber( Number value ){
		return impl().newNumber( value );
	}

	/**
	 * 创建一个框架真假表示对象
	 * 
	 * @param value 原始数据
	 * @return 框架真假表示对象
	 */
	public static IBoolean newBoolean( String value ){
		return impl().newBoolean( value );
	}

	/**
	 * 创建一个框架真假表示对象
	 * 
	 * @param value 原始数据真假值
	 * @return 框架真假表示对象
	 */
	public static IBoolean newBoolean( boolean value ){
		return impl().newBoolean( value );
	}

	/**
	 * 创建一个框架键值对对象
	 * 
	 * @return 框架键值对对象
	 */
	public static IMap newMap(){
		return impl().newMap();
	}

	/**
	 * 创建一个指定初始大小的框架键值对对象
	 * 
	 * @param initialCapacity 初始大小
	 * @return 框架键值对对象
	 */
	public static IMap newMap( int initialCapacity ){
		return impl().newMap( initialCapacity );
	}

	/**
	 * 根据指定的map数据字符串创建一个框架键值对对象。
	 * 
	 * @param mapData map数据字符串
	 * @return 框架键值对对象
	 */
	public static IMap newMap( String mapData ){
		return impl().newMap( mapData );
	}

	/**
	 * 创建一个框架列表对象。
	 * 
	 * @return 框架列表对象
	 */
	public static IList newList(){
		return impl().newList();
	}

	/**
	 * 创建一个指定初始大小的框架列表对象
	 * 
	 * @param initialCapacity 初始大小
	 * @return 框架列表对象
	 */
	public static IList newList( int initialCapacity ){
		return impl().newList( initialCapacity );
	}

	/**
	 * 根据指定的list数据字符串创建一个框架列表对象。
	 * 
	 * @param listData list数据字符串
	 * @return 框架列表对象
	 */
	public static IList newList( String listData ){
		return impl().newList( listData );
	}

	/**********************************************************************************
	 ****** 前置检查操作部分
	 **********************************************************************************/

	/**
	 * 检查指定对象是否为空，如果为空，则抛出一个空指针异常。
	 * 
	 * @param <T> 待检查对象类型
	 * @param reference 待检查对象
	 * @return 检查通过的对象
	 */
	public static <T> T checkNotNull( T reference ){
		return impl().checkNotNull( reference );
	}

	/**
	 * 检查指定对象是否为空，如果为空，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param <T> 待检查对象类型
	 * @param reference 待检查对象
	 * @param errorMessage 错误信息
	 * @return 检查通过的对象
	 */
	public static <T> T checkNotNull( T reference, Object errorMessage ){
		return impl().checkNotNull( reference, errorMessage );
	}

	/**
	 * 检查指定对象是否为空，如果为空，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param <T> 待检查对象类型
	 * @param reference 待检查对象
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 * @return 检查通过的对象
	 */
	public static <T> T checkNotNull( T reference, String errorMessageTemplate, Object... errorMessageParams ){
		return impl().checkNotNull( reference, errorMessageTemplate, errorMessageParams );
	}

	/**
	 * 检查指定字符串前后去空格后是否为空，如果为空或者前后去空格后为空字符串，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param value 待检查字符串
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 * @return 前后去空格的待检查对象
	 */
	public static String checkNotTrimEmpty( String value, String errorMessageTemplate, Object... errorMessageParams ){
		return impl().checkNotTrimEmpty( value, errorMessageTemplate, errorMessageParams );
	}

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的参数无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessage 错误信息
	 */
	public static void checkArgument( boolean expression, String errorMessage ){
		impl().checkArgument( expression, errorMessage );
	}

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的参数无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 */
	public static void checkArgument( boolean expression, String errorMessageTemplate, Object... errorMessageParams ){
		impl().checkArgument( expression, errorMessageTemplate, errorMessageParams );
	}

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的状态无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessage 错误信息
	 */
	public static void checkState( boolean expression, String errorMessage ){
		impl().checkState( expression, errorMessage );
	}

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的状态无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 */
	public static void checkState( boolean expression, String errorMessageTemplate, Object... errorMessageParams ){
		impl().checkState( expression, errorMessageTemplate, errorMessageParams );
	}

	/**
	 * 检查元素索引，必须处于0到size之间，否则抛出包含指定错误信息的索引越界异常。
	 * 
	 * @param index 索引
	 * @param length 数据长度
	 * @param desc 错误信息主体
	 */
	public static void checkIndex( int index, int length, String desc ){
		impl().checkIndex( index, length, desc );
	}

	/**
	 * 检查元素索引，必须处于0到size之间，否则抛出默认的索引越界异常信息。
	 * 
	 * @param index 索引
	 * @param length 数据长度
	 */
	public static void checkIndex( int index, int length ){
		impl().checkIndex( index, length );
	}

	/**
	 * 检查指定字符串是否为null或者前后去空格后为空字符串，如果是返回指定的默认值，不是返回前后去空格的字符串。
	 * 
	 * @param value 要检查的字符串
	 * @param defaultValue 为空时返回的默认字符串
	 * @return 前后去空格的字符串 / 默认字符串
	 */
	public static String checkTrimEmpty( String value, String defaultValue ){
		return impl().checkTrimEmpty( value, defaultValue );
	}

} // end class
