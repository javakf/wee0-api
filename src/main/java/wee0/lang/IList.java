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

import java.util.function.Consumer;

/**
 * 列表集合对象
 * @author		baihw
 * @date 		2016年12月29日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IList extends IObject{

	/**
	 * 当前对象数据类型
	 */
	String TYPE = "wee0.lang.List";

	@Override
	default String getType(){
		return TYPE;
	}

	/**
	 * 增加一个对象
	 * 
	 * @param obj 要增加的对象
	 * @return 当前对象，便于后续的链式操作。
	 */
	IList add( IObject obj );

	/**
	 * 将指定集合中的数据追加到当前集合中。
	 * 
	 * @param data 待追加的数据集合
	 * @return 当前对象，便于后续的链式操作。
	 */
	IList addAll( IList data );

	/**
	 * 设置指定索引位置对象
	 * 
	 * @param index 索引位置
	 * @param obj 对象
	 * @return 当前对象，便于后续的链式操作。
	 */
	IList set( int index, IObject obj );

	/**
	 * 移除指定索引位置对象
	 * 
	 * @param index 索引位置
	 * @return 被移除的对象
	 */
	IObject remove( int index );

	/**
	 * 移除指定对象
	 * 
	 * @param obj 要移除的对象
	 * @return 当前对象，便于后续的链式操作。
	 */
	IList remove( IObject obj );

	/**
	 * 清空数据
	 * 
	 * @return 当前对象，便于后续的链式操作。
	 */
	IList clear();

	/**
	 * 获取指定索引位置对象
	 * 
	 * @param index 索引位置
	 * @return 对象
	 */
	IObject get( int index );

	/**
	 * 遍历数据方法
	 * 
	 * @param action 数据接收处理逻辑
	 */
	void forEach( Consumer<? super IObject> action );

} // end interface
