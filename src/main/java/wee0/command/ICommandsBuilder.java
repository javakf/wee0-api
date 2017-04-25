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

import wee0.config.IConfig;

/**
 * 指令库构建器
 * @author		baihw
 * @date 		2017年2月11日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ICommandsBuilder{

	/**
	 * 根据配置信息构建当前指令库中所有可用的指令对象
	 * 
	 * @param commandsConfig 指令库配置数据访问对象
	 * @return 当前库构建的所有指令对象实例。
	 */
	ICommand[] buildCommands( IConfig commandsConfig );

	/**
	 * 应用退出时触发资源销毁逻辑的方法。
	 */
	void destroy();

} // end interface
