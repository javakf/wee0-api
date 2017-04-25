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

import wee0.Wee0;

/**
 * 日志对象工厂操作门面类。
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class LoggerFactory{

	/**
	 * 获取日志对象
	 * 
	 * @param category 日志分类
	 * @return 日志对象
	 */
	public static ILogger getLogger( Class<?> category ){
		return Wee0.impl().getLoggerFactory().getLogger( category );
	}

	/**
	 * 获取日志对象
	 * 
	 * @param category 日志分类
	 * @return 日志对象
	 */
	public static ILogger getLogger( String category ){
		return Wee0.impl().getLoggerFactory().getLogger( category );
	}

	/**
	 * 通常由框架在对应的时间点自动进行设置，建议个人开发者不要随意改动。
	 * 
	 * @param requestId 当前请求唯一标识
	 */
	public static void requestIdSet( String requestId ){
		Wee0.impl().getLoggerFactory().requestIdSet( requestId );
	}

	/**
	 * 通常由框架在对应的时间点自动进行重置，建议个人开发者不要随意改动。
	 */
	public static void requestIdReset(){
		Wee0.impl().getLoggerFactory().requestIdReset();
	}

	/**
	 * @return 当前请求唯一标识
	 */
	public static String requestIdGet(){
		return Wee0.impl().getLoggerFactory().requestIdGet();
	}

} // end class
