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
package com.wee0.utils;

/**
 * 日期处理工具
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IDateUtil{

	/**
	 * @return 当前年
	 */
	public int getCurrentYear();

	/**
	 * 获取当前月
	 * 
	 * @return 数据
	 */
	public int getCurrentMonth();

	/**
	 * 获取当前日
	 * 
	 * @return 数据
	 */
	public int getCurrentDay();

	/**
	 * @return 当前日期，以默认格式"yyyy-MM-dd"显示。
	 */
	public String getCurrentDate();

	/**
	 * @return 当前日期时间，以默认格式"yyyy:MM:dd HH:mm:ss"显示。
	 */
	public String getCurrentDateTime();

	/**
	 * @return 14位年月日时分秒，中间无空格的当前日期时间。
	 */
	public String getCurrentDateTime14();

	/**
	 * @return 8位年月日格式的当前日期
	 */
	public String getCurrentDate8();

	/**
	 * @return 6位年月格式的当前日期
	 */
	public String getCurrentDate6();

} // end interface
