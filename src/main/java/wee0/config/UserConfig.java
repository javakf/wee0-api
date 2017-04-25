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

import java.util.Set;

import wee0.Wee0;

/**
 * 用户自定义配置数据操作门面类
 * @author		baihw
 * @date 		2017年2月14日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class UserConfig{

	/**
	 * 获取用户配置数据管理对象。
	 * 
	 * @return 用户配置数据管理对象
	 */
	public static IConfig impl(){
		return Wee0.impl().getUserConfig();
	}

	/**
	 * 获取元素数量
	 * 
	 * @return 元素数量
	 */
	public static int size(){
		return impl().keys().size();
	}

	/**
	 * 获取键名列表
	 * 
	 * @return 键名列表
	 */
	public static Set<String> keySet(){
		return impl().keys();
	}

	/**
	 * 是否存在指定键名的配置
	 * 
	 * @param key 键名
	 * @return 存在返回true
	 */
	public static boolean hasKey( String key ){
		return impl().hasKey( key ).nativeValue();
	}

	/**
	 * 获取指定键名对应的字符串值。
	 * 
	 * @param key 键名
	 * @param defaultValue 值不存在时返回的默认值
	 * @return 键值字符串
	 */
	public static String getNativeString( String key, String defaultValue ){
		return impl().getNativeString( key, defaultValue );
	}

	/**
	 * 获取指定键名对应的数字值。
	 * 
	 * @param key 键名
	 * @param defaultValue 值不存在时返回的默认值
	 * @return 键值数字
	 */
	public static Number getNativeNumber( String key, Number defaultValue ){
		return impl().getNativeNumber( key, defaultValue );
	}

	/**
	 * 获取指定键名对应的真假值。
	 * 
	 * @param key 键名
	 * @param defaultValue 值不存在时返回的默认值
	 * @return 布尔键值
	 */
	public static boolean getNativeBoolean( String key, boolean defaultValue ){
		return impl().getNativeBoolean( key, defaultValue );
	}

	/**
	 * 获取指定键名对应的子级配置对象
	 * 
	 * @param key 键名
	 * @return 子级配置对象
	 */
	public static IConfig getConfig( String key ){
		return impl().getConfig( key );
	}

	/**
	 * 获取指定键名对应的配置列表。
	 * 
	 * @param key 键名
	 * @return 配置列表
	 */
	public static IConfigList getConfigList( String key ){
		return impl().getConfigList( key );
	}

} // end class
