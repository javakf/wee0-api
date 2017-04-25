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

import wee0.lang.IObject;

/**
 * 指令相关操作辅助对象。
 * @author		baihw
 * @date 		2017年2月15日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ICommandHelper{

	/**
	 * 创建一个指令参数管理对象
	 * 
	 * @param args 参数列表
	 * @return 指令参数管理对象
	 */
	ICommandArgs commandArgsCreate( IObject... args );

	/**
	 * 更新项目使用的指令库。
	 */
	void updateCommands();

} // end class
