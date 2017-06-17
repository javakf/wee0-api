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
package wee0.codec;

import wee0.Wee0;

/**
 * 单向不可逆摘要算法支持工具包门面类
 * @author		baihw
 * @date 		2017年4月6日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class Digest{

	// 实现类实例
	static final IDigest _IMPL = Wee0.impl().getDigest();

	/**
	 * 获取摘要算法支持实现者实例。
	 * 
	 * @return 实现者实例
	 */
	public static IDigest impl(){
		return _IMPL;
	}

} // end class
