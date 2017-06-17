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

/**
 * 基础对象类型操作门面类。
 * @author		baihw
 * @date 		2017年1月3日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IObjects{

	/**
	 * 框架空字符串对象
	 * 
	 * @return 框架空字符串对象
	 */
	IString emptyString();

	/**
	 * 创建一个框架字符串对象
	 * 
	 * @param value 原始数据
	 * @return 框架字符串对象
	 */
	IString newString( String value );

	/**
	 * 创建一个框架字符串对象
	 * 
	 * @param value 原始数据对象
	 * @return 框架字符串对象
	 */
	IString newString( Object value );

	/**
	 * 创建一个框架数值对象
	 * 
	 * @param value 原始数据
	 * @return 框架数值对象
	 */
	INumber newNumber( String value );

	/**
	 * 创建一个框架数值对象
	 * 
	 * @param value 原始数据
	 * @return 框架数值对象
	 */
	INumber newNumber( Number value );

	/**
	 * 创建一个框架真假表示对象
	 * 
	 * @param value 原始数据
	 * @return 框架真假表示对象
	 */
	IBoolean newBoolean( String value );

	/**
	 * 创建一个框架真假表示对象
	 * 
	 * @param value 原始数据真假值
	 * @return 框架真假表示对象
	 */
	IBoolean newBoolean( boolean value );

	/**
	 * 创建一个框架键值对对象
	 * 
	 * @return 框架键值对对象
	 */
	IMap newMap();

	/**
	 * 创建一个指定初始大小的框架键值对对象
	 * 
	 * @param initialCapacity 初始大小
	 * @return 框架键值对对象
	 */
	IMap newMap( int initialCapacity );

	/**
	 * 根据指定的map数据字符串创建一个框架键值对对象。
	 * 
	 * @param mapData map数据字符串
	 * @return 框架键值对对象
	 */
	IMap newMap( String mapData );

	/**
	 * 创建一个框架列表对象。
	 * 
	 * @return 框架列表对象
	 */
	IList newList();

	/**
	 * 创建一个指定初始大小的框架列表对象
	 * 
	 * @param initialCapacity 初始大小
	 * @return 框架列表对象
	 */
	IList newList( int initialCapacity );
	
	/**
	 * 根据指定的list数据字符串创建一个框架列表对象。
	 * 
	 * @param listData list数据字符串
	 * @return 框架列表对象
	 */
	IList newList( String listData );

//	/**
//	 * 将指定对象转换为JSON格式数据。
//	 * 
//	 * @param obj 要转换的对象
//	 * @return 对象的JSON格式数据
//	 */
//	String jsonTo( IObject obj );
//
//	/**
//	 * 将指定JSON格式数据转换为对应的数据对象。
//	 * 
//	 * @param json JSON格式数据
//	 * @return 数据对象
//	 */
//	IObject jsonFrom( String json );

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
	<T> T checkNotNull( T reference );

	/**
	 * 检查指定对象是否为空，如果为空，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param <T> 待检查对象类型
	 * @param reference 待检查对象
	 * @param errorMessage 错误信息
	 * @return 检查通过的对象
	 */
	<T> T checkNotNull( T reference, Object errorMessage );

	/**
	 * 检查指定对象是否为空，如果为空，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param <T> 待检查对象类型
	 * @param reference 待检查对象
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 * @return 检查通过的对象
	 */
	<T> T checkNotNull( T reference, String errorMessageTemplate, Object... errorMessageParams );

	/**
	 * 检查指定字符串前后去空格后是否为空，如果为空或者前后去空格后为空字符串，则抛出包含指定错误信息的空指针异常。
	 * 
	 * @param value 待检查字符串
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 * @return 前后去空格的待检查对象
	 */
	String checkNotTrimEmpty( String value, String errorMessageTemplate, Object... errorMessageParams );

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的参数无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessage 错误信息
	 */
	void checkArgument( boolean expression, String errorMessage );

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的参数无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 */
	void checkArgument( boolean expression, String errorMessageTemplate, Object... errorMessageParams );

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的状态无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessage 错误信息
	 */
	void checkState( boolean expression, String errorMessage );

	/**
	 * 如果指定的表达式结果为真，则抛出包含指定错误信息的状态无效异常。
	 * 
	 * @param expression 判断表达式
	 * @param errorMessageTemplate 错误信息模板
	 * @param errorMessageParams 错误信息模板参数
	 */
	void checkState( boolean expression, String errorMessageTemplate, Object... errorMessageParams );

	/**
	 * 检查元素索引，必须处于0到size之间，否则抛出包含指定错误信息的索引越界异常。
	 * 
	 * @param index 索引
	 * @param length 数据长度
	 * @param desc 错误信息主体
	 */
	void checkIndex( int index, int length, String desc );

	/**
	 * 检查元素索引，必须处于0到size之间，否则抛出默认的索引越界异常信息。
	 * 
	 * @param index 索引
	 * @param length 数据长度
	 */
	void checkIndex( int index, int length );

	/**
	 * 检查指定字符串是否为null或者前后去空格后为空字符串，如果是返回指定的默认值，不是返回前后去空格的字符串。
	 * 
	 * @param value 要检查的字符串
	 * @param defaultValue 为空时返回的默认字符串
	 * @return 前后去空格的字符串 / 默认字符串
	 */
	String checkTrimEmpty( String value, String defaultValue );

} // end class
