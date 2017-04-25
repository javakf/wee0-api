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
package wee0.log;

/**
 * 日志对象工厂
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ILoggerFactory{

	/**
	 * 获取日志对象
	 * 
	 * @param category 日志分类
	 * @return 日志对象
	 */
	ILogger getLogger( Class<?> category );

	/**
	 * 获取日志对象
	 * 
	 * @param category 日志分类
	 * @return 日志对象
	 */
	ILogger getLogger( String category );

	/**
	 * 获取当前日志输出等级
	 * 
	 * @return 当前日志输出等级
	 */
	LogLevel getLevel();

	/**
	 * 增强方法，用来设置当前请求的唯一标识，在日志系统中用来追踪一次请求的连续日志。
	 * 
	 * @param requestId 请求唯一标识
	 */
	void requestIdSet( String requestId );

	/**
	 * 增强方法，用来重置当前请求的唯一标识。
	 */
	void requestIdReset();

	/**
	 * 增强方法，用来获取当前请求的唯一标识，在日志系统中用来追踪一次请求的连续日志。
	 * 
	 * @return 当前请求的唯一标识
	 */
	String requestIdGet();

} // end interface
