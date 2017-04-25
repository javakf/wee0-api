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

import wee0.core.IBindings;
import wee0.lang.IObject;

/**
 * 指令对象
 * @author		baihw
 * @date 		2017年2月10日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ICommand{

	/**
	 * 指令唯一标识
	 * 
	 * @return 指令唯一标识
	 */
	String id();

	/**
	 * 执行指令，获取执行结果。
	 * 
	 * @param data 执行环境绑定数据
	 * @param args 指令参数管理器对象
	 * @return 执行结果
	 */
	IObject execute( IBindings data, ICommandArgs args );

} // end interface
