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
 * 工具对象管理器
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IUtilManager{

	/**
	 * 获取字符串处理工具
	 * 
	 * @return 字符串处理工具
	 */
	IStringUtil getStringUtil();

	/**
	 * 获取数组处理工具
	 * 
	 * @return 数组处理工具
	 */
	IArrayUtil getArrayUtil();

	/**
	 * 获取网络处理工具
	 * 
	 * @return 网络处理工具
	 */
	INetUtil getNetUtil();

	/**
	 * 获取数据校验处理工具
	 * 
	 * @return 数据校验处理工具
	 */
	IValidateUtil getValidateUtil();

	/**
	 * 获取日期处理工具
	 * 
	 * @return 日期处理工具
	 */
	IDateUtil getDateUtil();

	/**
	 * 获取IO处理工具
	 * 
	 * @return IO处理工具
	 */
	IIOUtil getIOUtil();

} // end interface
