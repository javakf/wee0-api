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

/**
 * 配置对象解析器。
 * @author		baihw
 * @date 		2017年2月13日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IConfigParser{

	/**
	 * 解析配置对象
	 * 
	 * @return 配置对象
	 */
	IConfig parse();

} // end class
