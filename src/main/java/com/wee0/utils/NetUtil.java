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

import wee0.Wee0;

/**
 * 网络处理工具便捷操作类
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class NetUtil{

	// 实现类实例
	private static final INetUtil _IMPL = Wee0.impl().getUtilManager().getNetUtil();

	/**
	 * 获取实现类实例。
	 * 
	 * @return 实现类实例
	 */
	public static INetUtil impl(){
		return _IMPL;
	}

} // end class
