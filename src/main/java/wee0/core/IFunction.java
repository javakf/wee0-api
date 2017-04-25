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

/**
 * 功能函数对象
 * @author		baihw
 * @date 		2017年1月4日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IFunction{

	/**
	 * 节点类型名称。
	 */
	String TYPE = "function";

	/**
	 * 获取函数名称
	 * 
	 * @return 函数名称
	 */
	String id();

	/**
	 * 执行方法体，返回流程控制信号。
	 * 
	 * @param data 执行环境绑定数据对象
	 * @param before 前置处理函数
	 * @param after 后置处理函数
	 */
	void execute( IBindings data, IFunction before, IFunction after );

} // end interface
