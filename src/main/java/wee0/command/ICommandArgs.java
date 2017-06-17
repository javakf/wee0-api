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
package wee0.command;

import wee0.lang.IList;
import wee0.lang.IMap;
import wee0.lang.IObject;

/**
 * 指令参数管理器对象
 * @author		baihw
 * @date 		2017年2月10日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/
public interface ICommandArgs{

	/**
	 * 获取参数对象数量。
	 * 
	 * @return 参数对象数量
	 */
	int count();

	/**
	 * 获取指定索引位置的参数对象
	 * 
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 参数对象
	 */
	IObject getObject( int index, IObject defValue );
	
	/**
	 * 获取指定索引位置的Map类型参数对象，如果不存在时返回指定的默认值，存在但不是IMap类型时将报错。
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 指定索引位置的Map类型参数
	 */
	IMap getMap( int index, IMap defValue ) ;
	
	/**
	 * 获取指定索引位置的List类型参数对象，如果不存在时返回指定的默认值，存在但不是IList类型时将报错。
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 指定索引位置的List类型参数
	 */
	IList getList( int index, IList defValue ) ;

	/**
	 * 获取指定索引位置的字符串参数,不存在时返回指定的默认值。
	 * 
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 指定索引位置的字符串参数
	 */
	String getNativeString( int index, String defValue );

	/**
	 * 获取指定索引位置的前后去空格字符串参数,不存在或者为空字符串时返回指定的默认值。
	 * 
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为空字符串时返回的默认值
	 * @return 前后去空格的字符串参数 / 默认值
	 */
	String getNativeTrimString( int index, String defValue );

	/**
	 * 获取指定索引位置的整数参数,不存在时返回指定的默认值。
	 * 
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 指定索引位置的整数参数
	 */
	int getNativeInt( int index, int defValue );

	/**
	 * 获取指定索引位置的布尔类型参数,不存在时返回指定的默认值。
	 * 
	 * @param index 参数索引位置
	 * @param defValue 索引位置参数不存在或者为null时返回的默认值
	 * @return 指定索引位置的布尔类型参数
	 */
	boolean getNativeBoolean( int index, boolean defValue );

	/**
	 * 获取指定开始索引位置之后的所有元素。
	 * 
	 * @param start 开始索引位置
	 * @return 开始索引位置之后的所有元素。
	 */
	IObject[] slice( int start );

	/**
	 * 获取指定开始索引位置与结束索引位置之间的所有元素集合。
	 * 
	 * @param start 开始索引位置
	 * @param end 结束索引位置
	 * @return 区间元素集合
	 */
	IObject[] slice( int start, int end );

} // end interface
