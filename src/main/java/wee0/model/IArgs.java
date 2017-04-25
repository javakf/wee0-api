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
package wee0.model;

import wee0.lang.IMap;

/**
 * 参数数据管理对象
 * @author		baihw
 * @date 		2017年2月6日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/
public interface IArgs extends IMap{

	/**
	 * 获取请求的程序对象标识。
	 * 
	 * @return 请求的程序对象标识
	 */
	String getProgramId();

	/**
	 * 获取请求的程序对象方法标识。
	 * 
	 * @return 请求的程序对象方法标识
	 */
	String getFunctionId();

} // end interface
