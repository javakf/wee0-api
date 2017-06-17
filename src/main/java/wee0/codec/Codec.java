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
 * 编解码算法操作门面类
 * @author		baihw
 * @date 		2017年3月31日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class Codec{

	// 实现类实例
	static final ICodec _IMPL = Wee0.impl().getCodec();

	/**
	 * 获取编解码算法操作实现者实例。
	 * 
	 * @return 实现者实例
	 */
	public static ICodec impl(){
		return _IMPL;
	}

} // end class
