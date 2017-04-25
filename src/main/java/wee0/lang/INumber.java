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
package wee0.lang;

import java.math.BigDecimal;

/**
 * 数字类型对象
 * @author		baihw
 * @date 		2016年12月29日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface INumber extends IObject{

	/**
	 * 当前对象数据类型
	 */
	String TYPE = "wee0.lang.Number";

	@Override
	default String getType(){
		return "wee0.lang.Number";
	}

	/**
	 * 获取当前对象值
	 * 
	 * @return 当前对象值
	 */
	BigDecimal nativeValue();

	/**
	 * 获取整数值。
	 * 
	 * @return 整数值
	 */
	int nativeInt();

	/**
	 * 获取长整形值。
	 * 
	 * @return 长整形值
	 */
	long nativeLong();

	/**
	 * 获取浮点值。
	 * 
	 * @return 浮点值
	 */
	float nativeFloat();

	/**
	 * 获取平台原生数字类型值。
	 * 
	 * @return 平台原生数字类型值
	 */
	Number nativeNumber();

	/**
	 * 返回当前数值的负数。
	 * 
	 * @return 当前数值的负数
	 */
	INumber negate();

} // end interface
