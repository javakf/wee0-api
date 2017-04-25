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
package wee0.core;

/**
 * 执行环境数据绑定对象构建器
 * @author		baihw
 * @date 		2017年2月8日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IBindingsBuilder{

	/**
	 * 构建数据绑定对象。
	 * 
	 * @return 数据绑定对象
	 */
	IBindings build();

} // end interface
