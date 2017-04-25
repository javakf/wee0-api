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

import wee0.lang.IObject;
import wee0.model.IArgs;
import wee0.model.IGlobal;
import wee0.model.IRequest;
import wee0.model.IResponse;
import wee0.model.ISession;
import wee0.model.IVars;

/**
 * 执行环境数据绑定对象。
 * @author		baihw
 * @date 		2016年12月29日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IBindings{

	/**
	 * 获取程序变量管理对象。临时数据，不可跨程序操作，仅存在于程序对象的执行过程中。
	 * 
	 * @return 程序变量管理对象
	 */
	IVars vars();

	/**
	 * 获取参数数据管理对象。只读，数据可跨程序逻辑访问，仅存在于一次请求的处理过程中。
	 * 
	 * @return 参数数据管理对象
	 */
	IArgs args();

	/**
	 * 请求数据存储对象。数据可跨程序逻辑操作，仅存在于一次请求的处理过程中。
	 * 
	 * @return 请求数据存储对象
	 */
	IRequest request();

	/**
	 * 会话数据存储对象。数据可跨程序逻辑操作，存在于一个有效用户的会话周期内。
	 * 
	 * @return 会话数据存储对象
	 */
	ISession session();

	/**
	 * 全局共享数据存储对象。数据共享于整个应用的生命周期。
	 * 
	 * @return 全局共享数据存储对象
	 */
	IGlobal global();

	/**
	 * 响应数据存储对象。数据可跨程序逻辑操作，仅存在于一次请求的处理过程中。
	 * 
	 * @return 响应数据存储对象
	 */
	IResponse response();

	/**
	 * 使用指定的变量标识匹配模式字符串，获取指定的变量值。
	 * 
	 * @param pattern 变量标识匹配模式字符串
	 * @param defValue 如果变量不存在时返回的默认值
	 * @return 变量值
	 */
	IObject get( String pattern, IObject defValue );

	/**
	 * 获取当前执行的程序对象标识
	 * 
	 * @return 当前执行的程序对象标识
	 */
	String currentProgramId();

	/**
	 * 获取当前执行的功能函数标识
	 * 
	 * @return 当前执行的功能函数标识
	 */
	String currentFunctionId();

} // end class
