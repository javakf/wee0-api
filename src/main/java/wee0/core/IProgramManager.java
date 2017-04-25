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

import java.util.Set;

import wee0.lang.IObject;

/**
 * 程序对象管理器
 * @author		baihw
 * @date 		2017年1月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IProgramManager{

	/**
	 * 获取运行环境中加载的所有程序名称集合。
	 * 
	 * @return 程序名称集合
	 */
	Set<String> programNames();

	/**
	 * 判断是否存在指定标识的程序对象。
	 * 
	 * @param id 程序对象唯一标识
	 * @return true / false
	 */
	boolean programHas( String id );

	/**
	 * 获取指定标识的程序对象
	 * 
	 * @param id 程序对象唯一标识
	 * @return 程序对象
	 */
	IProgram programGet( String id );

	/**
	 * 判断是否存在指定标识的功能函数。
	 * 
	 * @param programId 程序对象标识
	 * @param functionId 功能函数标识
	 * @return true / false
	 */
	boolean functionHas( String programId, String functionId );

	/**
	 * 获取指定标识的功能函数
	 * 
	 * @param programId 程序对象标识
	 * @param functionId 功能函数标识
	 * @return 功能函数对象
	 */
	IFunction functionGet( String programId, String functionId );

	/**
	 * 执行指定标识的程序对象功能函数。外部调度逻辑。
	 * 
	 * @param programId 程序对象标识
	 * @param functionId 功能函数标识
	 * @param data 执行环境绑定数据对象
	 */
	void functionDo( String programId, String functionId, IBindings data );

	/**
	 * 从绑定数据中的IArgs对象中获取要执行的程序对象标识及功能函数标识，然后执行。外部调度逻辑。
	 * 
	 * @param data 执行环境绑定数据对象
	 */
	void functionDo( IBindings data );

	/**
	 * 执行指定的表达式代码
	 * 
	 * @param expression 表达式代码
	 * @param data 执行环境绑定数据对象
	 * @return 表达式执行结果
	 */
	IObject eval( String expression, IBindings data );

	/**
	 * 创建一个空的执行环境数据绑定对象。
	 * 
	 * @return 空的执行环境数据绑定对象
	 */
	IBindingsBuilder createBindingsBuilder();

} // end interface
