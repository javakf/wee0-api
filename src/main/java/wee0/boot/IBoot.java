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
package wee0.boot;

import wee0.IWee0;
import wee0.command.ICommandsBuilder;

/**
 * wee0实现包引导器
 * @author		baihw
 * @date 		2017年3月2日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IBoot{

	/**
	 * 获取wee0实现实例。
	 * 
	 * @return wee0实现实例
	 */
	IWee0 wee0Impl();

	/**
	 * 获取指定的指令库构建器
	 * 
	 * @param libId 指令库标识
	 * @param version 指令库版本
	 * @return 指令库构建器
	 */
	ICommandsBuilder getCommandsBuilder( String libId, String version );

	/**
	 * 更新指定标识的指令库
	 * 
	 * @param libId 指令库标识
	 * @param version 指令库版本
	 */
	void updateCommandsLib( String libId, String version );

	/**
	 * 安装项目依赖环境
	 */
	void install();

} // end interface
