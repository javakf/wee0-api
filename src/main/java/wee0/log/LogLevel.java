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
 * 日志级别枚举常量
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public enum LogLevel{
	
	/**
	 * ALL
	 */
	ALL,

	/**
	 * DEBUG
	 */
	DEBUG,

	/**
	 * INFO
	 */
	INFO,

	/**
	 * WARN
	 */
	WARN,

	/**
	 * ERROR
	 */
	ERROR,

	/**
	 * OFF
	 */
	OFF;

	public boolean debugThan(){
		return this.ordinal() < 2;
	}

	public boolean infoThan(){
		return this.ordinal() < 3;
	}

	public boolean warnThan(){
		return this.ordinal() < 4;
	}

	public boolean errorThan(){
		return this.ordinal() < 5;
	}

} // end enum
