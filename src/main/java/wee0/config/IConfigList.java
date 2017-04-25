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
package wee0.config;

import wee0.lang.IList;

/**
 * 配置对象列表
 * @author		baihw
 * @date 		2017年2月12日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IConfigList extends IList{

	/**
	 * 获取指定索引位置对应的子级配置对象
	 * 
	 * @param index 索引位置
	 * @return 子级配置对象
	 */
	IConfig getConfig( int index );

	/**
	 * 获取指定索引位置对应的子级配置对象
	 * 
	 * @param index 索引位置
	 * @param defValue 对象不存在时，返回的默认对象。
	 * @return 子级配置对象
	 */
	IConfig getConfig( int index, IConfig defValue );

	/**
	 * 获取指定索引位置对应的配置列表。
	 * 
	 * @param index 索引位置
	 * @return 配置列表
	 */
	IConfigList getConfigList( int index );

	/**
	 * 获取指定索引位置对应的配置列表。
	 * 
	 * @param index 索引位置
	 * @param defValue 对象不存在时，返回的默认对象。
	 * @return 配置列表
	 */
	IConfigList getConfigList( int index, IConfigList defValue );

} // end interface
