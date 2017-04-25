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

import java.util.Set;
import java.util.function.BiConsumer;

/**
 * 键值集合对象
 * @author		baihw
 * @date 		2016年12月29日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IMap extends IObject{

	/**
	 * 当前对象数据类型
	 */
	String TYPE = "wee0.lang.Map";

	@Override
	default String getType(){
		return TYPE;
	}

	/**
	 * 设置键值对数据
	 * 
	 * @param key 键名
	 * @param value 值数据
	 * @return 当前对象，便于后续进行链式操作。
	 */
	IMap set( String key, IObject value );

	/**
	 * 将指定集合中的数据全部合并到当前数据集中，使用冲突替换机制。
	 * 
	 * @param data 要合并的数据集
	 * @return 当前对象，便于后续进行链式操作。
	 */
	IMap setAll( IMap data );

	/**
	 * 删除指定键名的数据
	 * 
	 * @param key 键名
	 * @return 被删除的数据
	 */
	IObject remove( String key );

	/**
	 * 清空数据
	 */
	void clear();

	/**
	 * 获取所有鍵名集合。
	 * 
	 * @return 所有鍵名集合
	 */
	Set<String> keys();

	/**
	 * 是否包含指定键名
	 * 
	 * @param key 键名
	 * @return true / false
	 */
	IBoolean hasKey( String key );

	/**
	 * 获取指定键名数据
	 * 
	 * @param key 键名
	 * @return 值数据
	 */
	IObject get( String key );

	/**
	 * 获取指定键名数据
	 * 
	 * @param key 键名
	 * @param defValue 数据不存在时返回的默认数据
	 * @return 值数据 / 默认数据
	 */
	IObject get( String key, IObject defValue );

	/**
	 * 获取指定键名对应的字符串类型数据
	 * 
	 * @param key 键名
	 * @return 值数据 / 默认空字符串数据
	 */
	IString getString( String key );

	/**
	 * 获取指定键名对应的字符串类型数据
	 * 
	 * @param key 键名
	 * @param defValue 数据不存在时返回的默认数据
	 * @return 值数据 / 默认数据
	 */
	IString getString( String key, IString defValue );

	/**
	 * 获取指定键名对应的数值类型数据
	 * 
	 * @param key 键名
	 * @param defValue 数据不存在时返回的默认数据
	 * @return 值数据 / 默认数据
	 */
	INumber getNumber( String key, INumber defValue );

	/**
	 * 遍历键名数据方法
	 * 
	 * @param action 数据接收处理逻辑
	 */
	void forEach( BiConsumer<String, ? super IObject> action );

	/**********************************************************
	 * 原生数据类型操作支持部分。
	 **********************************************************/

	/**
	 * 获取指定键名对应的原生类型字符串数据
	 * 
	 * @param key 键名
	 * @param defValue 数据不存在时返回的默认数据
	 * @return 值数据 / 默认数据
	 */
	String getNativeString( String key, String defValue );

	/**
	 * 获取指定键名对应的前后去空格字符串参数,不存在或者为空字符串时返回指定的默认值。
	 * 
	 * @param key 键名
	 * @param defValue 参数不存在或者为空字符串时返回的默认值
	 * @return 前后去空格的字符串参数 / 默认值
	 */
	String getNativeTrimString( String key, String defValue );

	/**
	 * 获取指定键名对应的数字值。
	 * 
	 * @param key 键名
	 * @param defValue 值不存在时返回的默认值
	 * @return 键值数字
	 */
	Number getNativeNumber( String key, Number defValue );

	/**
	 * 获取指定键名对应的真假值。
	 * 
	 * @param key 键名
	 * @param defValue 值不存在时返回的默认值
	 * @return 布尔键值
	 */
	boolean getNativeBoolean( String key, boolean defValue );

} // end interface
