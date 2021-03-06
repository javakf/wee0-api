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
 * 日志对象
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ILogger{

	/**
	 * 默认的日志对象名称。
	 */
	String DEFAULT_CATEGORY = "DefaultLogger";

	/**
	 * @return 获取日志类别名称
	 */
	String getCategory();

	/**
	 * 输出调试信息
	 * 
	 * @param msg 消息内容
	 */
	public void debug( String msg );

	/**
	 * 输出调试信息
	 * 
	 * @param e 异常信息
	 */
	public void debug( Throwable e );

	/**
	 * 输出调试信息
	 * 
	 * @param msg 消息内容
	 * @param e 异常信息
	 */
	public void debug( String msg, Throwable e );

	/**
	 * 输出用户提示信息
	 * 
	 * @param msg 消息内容
	 */
	public void info( String msg );

	/**
	 * 输出用户提示信息
	 * 
	 * @param e 异常信息
	 */
	public void info( Throwable e );

	/**
	 * 输出用户提示信息
	 * 
	 * @param msg 消息内容
	 * @param e 异常信息
	 */
	public void info( String msg, Throwable e );

	/**
	 * 输出警告信息
	 * 
	 * @param msg 消息内容
	 */
	public void warn( String msg );

	/**
	 * 输出警告信息
	 * 
	 * @param e 异常信息
	 */
	public void warn( Throwable e );

	/**
	 * 输出警告信息
	 * 
	 * @param msg 消息内容
	 * @param e 异常信息
	 */
	public void warn( String msg, Throwable e );

	/**
	 * 输出错误信息
	 * 
	 * @param msg 消息内容
	 */
	public void error( String msg );

	/**
	 * 输出错误信息
	 * 
	 * @param e 异常信息
	 */
	public void error( Throwable e );

	/**
	 * 输出错误信息
	 * 
	 * @param msg 消息内容
	 * @param e 异常信息
	 */
	public void error( String msg, Throwable e );

	/**
	 * 调试信息是否开启
	 * 
	 * @return 是否开启
	 */
	public boolean isDebugEnabled();

	/**
	 * 用户提示信息是否开启
	 * 
	 * @return 是否开启
	 */
	public boolean isInfoEnabled();

	/**
	 * 警告信息是否开启
	 * 
	 * @return 是否开启
	 */
	public boolean isWarnEnabled();

	/**
	 * 错误信息是否开启
	 * 
	 * @return 是否开启
	 */
	public boolean isErrorEnabled();

} // end interface
