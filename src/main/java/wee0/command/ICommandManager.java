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
 * 指令对象管理器
 * @author		baihw
 * @date 		2017年1月30日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ICommandManager{

	/**
	 * 初始化指令对象
	 */
	void init();

	/**
	 * 注册一个指令对象
	 * 
	 * @param command 指令对象实例
	 */
	void commandReg( ICommand command );

	/**
	 * 调用指定唯一标识的指令。
	 * 
	 * @param data 执行环境绑定数据
	 * @param commandId 指令标识
	 * @param args 参数列表
	 * @return 指令执行结果
	 */
	IObject commandDo( IBindings data, String commandId, IObject... args );

} // end interface
