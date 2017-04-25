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

import java.time.LocalDateTime;

/**
 * 日志记录实体对象
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ILogRecord{

	/**
	 * 获取日志时间
	 * 
	 * @return 日志时间
	 */
	LocalDateTime getDateTime();

	/**
	 * 获取日志级别
	 * 
	 * @return 日志级别
	 */
	LogLevel getLevel();

	/**
	 * 获取日志记录者名称
	 * 
	 * @return 日志记录者名称
	 */
	String getName();

	/**
	 * 获取日志记录者方法名称
	 * 
	 * @return 日志记录者方法名称
	 */
	String getMethod();

	/**
	 * 获取日志记录者行号
	 * 
	 * @return 日志记录者行号
	 */
	int getLine();

	/**
	 * 获取日志记录者线程唯一标识
	 * 
	 * @return 日志记录者线程唯一标识
	 */
	long getThreadId();

	/**
	 * 获取日志记录者线程名称
	 * 
	 * @return 日志记录者线程名称
	 */
	String getThreadName();

	/**
	 * 获取日志请求唯一标识
	 * 
	 * @return 请求唯一标识
	 */
	String getRequestId();

	/**
	 * 获取日志消息内容
	 * 
	 * @return 日志消息内容
	 */
	String getMessage();

	/**
	 * 获取日志中存储的异常信息数据。
	 * 
	 * @return 异常信息数据
	 */
	String getErrorData();

} // end interface
