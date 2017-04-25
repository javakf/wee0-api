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
package wee0;

import com.wee0.utils.IUtilManager;

import wee0.command.ICommandHelper;
import wee0.config.IConfig;
import wee0.core.IBindings;
import wee0.lang.IObjects;
import wee0.log.ILoggerFactory;

/**
 * Wee0框架核心操作接口。
 * @author		baihw
 * @date 		2016年12月24日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IWee0{

	/**
	 * 获取基础对象类型操作门面类实现实例。
	 * 
	 * @return 基础对象类型操作门面类实现实例
	 */
	IObjects getObjects();

	/**
	 * 获取用户配置数据管理对象
	 * 
	 * @return 用户配置数据管理对象
	 */
	IConfig getUserConfig();

	/**
	 * 获取框架日志对象
	 * 
	 * @return 框架日志对象
	 */
	ILoggerFactory getLoggerFactory();

	/**
	 * 获取指令相关操作辅助对象实例。
	 * 
	 * @return 指令相关操作辅助对象实例
	 */
	ICommandHelper getCommandHelper();

	/**
	 * 获取当前应用唯一标识。
	 * 
	 * @return 当前应用唯一标识
	 */
	String getAppId();

	/**
	 * 获取当前应用使用的编码。
	 * 
	 * @return 当前应用使用的编码
	 */
	String getEncoding();

	/**
	 * 获取临时文件存储目录。
	 * 
	 * @return 临时文件存储目录
	 */
	String getTmpDir();

	/**
	 * 获取工具对象管理器
	 * 
	 * @return 工具对象管理器
	 */
	IUtilManager getUtilManager();

	/**
	 * 创建一个空的执行环境绑定数据对象。
	 * 
	 * @return 执行环境绑定数据对象
	 */
	IBindings createBingdings();

	/**
	 * 执行指定标识的程序对象功能函数。外部调度逻辑。
	 * 
	 * @param programId 程序对象标识
	 * @param functionId 功能函数标识
	 * @param data 执行环境绑定数据对象
	 */
	void runFunction( String programId, String functionId, IBindings data );

	/**
	 * 启动服务
	 */
	void start();

	/**
	 * 停止服务
	 */
	void stop();

} // end interface
