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
package wee0.core;

import java.util.Map;

/**
 * 程序对象
 * @author		baihw
 * @date 		2017年1月4日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IProgram{

	/**
	 * 节点类型名称。
	 */
	String TYPE = "program";

	/**
	 * 当前程序对象唯一标识。
	 * 
	 * @return 唯一标识
	 */
	String id();

	/**
	 * 获取功能函数集合。
	 * 
	 * @return 功能函数集合。
	 */
	Map<String, IFunction> functions();

	/**
	 * 获取功能函数数量。
	 * 
	 * @return 功能函数数量
	 */
	int functionCount();

	/**
	 * 检查是否存在指定标识的功能函数。
	 * 
	 * @param id 函数标识
	 * @return true / false
	 */
	boolean functionHas( String id );

	/**
	 * 增加一个功能函数
	 * 
	 * @param fun 函数对象
	 * @return 当前对象
	 */
	IProgram functionAdd( IFunction fun );

	/**
	 * 获取一个指定标识的功能函数
	 * 
	 * @param id 函数标识
	 * @return 函数对象
	 */
	IFunction functionGet( String id );

	/**
	 * 执行指定标识的功能函数，调用此方法会触发函数前置后置处理逻辑，如果存在的话。
	 * 
	 * @param id 函数标识
	 * @param data 执行环境绑定数据
	 */
	void functionDo( String id, IBindings data );

	/**
	 * 获取源程序类型
	 * 
	 * @return 源程序类型
	 */
	String sourceType();

} // end interface
