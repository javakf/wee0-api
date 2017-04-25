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
 * 数组处理工具便捷操作类
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class ArrayUtil{

	// 实现类实例
	private static final IArrayUtil _IMPL = Wee0.impl().getUtilManager().getArrayUtil();

	/**
	 * 检查指定数组对象是否为空。
	 * 
	 * @param source 源数组
	 * @return true / false
	 */
	public static boolean isEmpty( Object[] source ){
		return _IMPL.isEmpty( source );
	}

	/**
	 * 移除数组中的null对象,使之成为一个更紧凑的数组。
	 * 
	 * @param <T> 数据类型
	 * @param source 源数组
	 * @return 新数组,元素数量也可能会发生变化。
	 */
	public static <T> T[] compact( T[] source ){
		return _IMPL.compact( source );
	}

	/**
	 * 移除数组中的null元素,使之成为一个更紧凑的数组。
	 * 
	 * @param source 源数组
	 * @param trimValue 是否对值元素进行去空格操作,如果此值为true,则空字符串也将被移除.
	 * @return 新数组,元素数量也可能会发生变化。
	 */
	public static String[] compact( String[] source, boolean trimValue ){
		return _IMPL.compact( source, trimValue );
	}

	/**
	 * 移除数组中小于指定值的元素,使之成为一个更紧凑的数组。
	 * 
	 * @param source 源数组
	 * @param lessValue 允许的元素最小值,小于此值的元素将会被移除.
	 * @return 新数组,元素数量也可能会发生变化。
	 */
	public static int[] compact( int[] source, int lessValue ){
		return _IMPL.compact( source, lessValue );
	}

	/**
	 * 连接两个数组成为一个新的数组。
	 * 
	 * @param <T> 数据类型
	 * @param item1 主数组
	 * @param item2 次数组
	 * @return 新数组
	 */
	public static <T> T[] concat( T[] item1, T[] item2 ){
		return _IMPL.concat( item1, item2 );
	}

	/**
	 * 连接多个数组成为一个新的数组
	 * 
	 * @param <T> 数据类型
	 * @param item1 主数组
	 * @param items 次数组
	 * @return 新数组
	 */
	@SuppressWarnings( "unchecked" )
	public static <T> T[] concatAll( T[] item1, T[]... items ){
		return _IMPL.concatAll( item1, items );
	}

	/**
	 * 向字符串数组中增加一个元素，并返回新的数组。
	 * 
	 * @param source 源数组
	 * @param item 新元素
	 * @return 包含新元素的数组。
	 */
	public static String[] addItem( String[] source, String item ){
		return _IMPL.addItem( source, item );
	}

	/**
	 * 向数组中增加一个元素,并返回新的数组。注意：此方法在用作基础类型时会出错。
	 * 
	 * @param <T> 元素类型
	 * @param source 源数组。
	 * @param t 要增加的元素。
	 * @return 新数组。
	 */
	public static <T> T[] addItem( T[] source, T t ){
		return _IMPL.addItem( source, t );
	}

	/**
	 * 返回两个字节数组的合并数据
	 * 
	 * @param array1 主数组
	 * @param array2 次数组
	 * @return 新数组
	 */
	public static byte[] addAll( byte[] array1, byte[] array2 ){
		return _IMPL.addAll( array1, array2 );
	}

	/**
	 * 从数组中删除指定坐标位置的元素。
	 * 
	 * @param <T> 数组元素类型
	 * @param source 原始数组
	 * @param index 要删除的元素位置
	 * @return 新的数组
	 */
	public static <T> T[] delItem( T[] source, int index ){
		return _IMPL.delItem( source, index );
	}

	/**
	 * 删除数组中的最后一个元素。
	 * 
	 * @param <T> 数据类型
	 * @param source 源数组
	 * @return 删除的最后一个元素
	 */
	public static <T> T[] pop( T[] source ){
		return _IMPL.pop( source );
	}

	/**
	 * 删除数组中的第一个元素。
	 * 
	 * @param <T> 数据类型
	 * @param source 源数组
	 * @return 删除的第一个元素
	 */
	public static <T> T[] shift( T[] source ){
		return _IMPL.shift( source );
	}

	/**
	 * 从指定数组中截取指定范围的数据。
	 * 
	 * @param array 数组
	 * @param startIndexInclusive 开始下标
	 * @param endIndexExclusive 结束下标
	 * @return 新数组
	 */
	public static byte[] subarray( byte[] array, int startIndexInclusive, int endIndexExclusive ){
		return _IMPL.subarray( array, startIndexInclusive, endIndexExclusive );
	}

	/**
	 * 将指定的数字按照指定的大小切分为一组元素，通常用于任务分解。
	 * 
	 * @param source 总数据大小
	 * @param itemSize 单份数据大小
	 * @return 指定大小的块集合，最后一个元素可能会小于单份数据大小。
	 */
	public static int[] split( final int source, final int itemSize ){
		return _IMPL.split( source, itemSize );
	}

	/**
	 * 实现两个数组的A包含B逻辑判断。(全包含）
	 * 
	 * @param a A数组
	 * @param b B数组
	 * @return 如果A里边包含B里边所有的元素，则返回true,否则返回false。
	 */
	public static boolean aContainb( Object[] a, Object[] b ){
		return _IMPL.aContainb( a, b );
	}

	/**
	 * 实现两个数组的A包含B逻辑判断。（任意包含）
	 * 
	 * @param a A数组
	 * @param b B数组
	 * @return 如果A里边包含B里边任意的一个元素，则返回true,否则返回false。
	 */
	public static boolean aContainb1( Object[] a, Object[] b ){
		return _IMPL.aContainb1( a, b );
	}

	/**
	 * 对二维数组按照指定下标列进行排序
	 * 
	 * @param arr 源数组
	 * @param sortColIndex 要排序的列下标集合
	 * @param isDesc 是否使用降序
	 * @param isClone 是否创建副本进行排序
	 * @return 排序后的数组或者数组副本
	 */
	public static String[][] sort2dArray( String[][] arr, int[] sortColIndex, boolean isDesc, boolean isClone ){
		return _IMPL.sort2dArray( arr, sortColIndex, isDesc, isClone );
	}

	/**
	 * 对二维数组按照指定下标列进行排序
	 * 
	 * @param arr 源数组
	 * @param sortColIndex 要排序的列下标集合
	 * @param isDesc 是否使用降序
	 * @return 排序后的数组
	 */
	public static String[][] sort2dArray( String[][] arr, int[] sortColIndex, boolean isDesc ){
		return _IMPL.sort2dArray( arr, sortColIndex, isDesc );
	}

	/**
	 * 对二维数组按照指定下标列进行升序排序
	 * 
	 * @param arr 源数组
	 * @param sortColIndex 要排序的列下标集合
	 * @return 排序后的数组副本
	 */
	public static String[][] sort2dArray( String[][] arr, int[] sortColIndex ){
		return _IMPL.sort2dArray( arr, sortColIndex );
	}

	/**
	 * 克隆一个字节数组副本
	 * 
	 * @param array 数组
	 * @return 副本
	 */
	public static byte[] clone( byte[] array ){
		return _IMPL.clone( array );
	}

	/**
	 * 克隆一个普通类型数组副本
	 * 
	 * @param <T> 数据类型
	 * @param array 数组
	 * @return 副本
	 */
	public static <T> T[] clone( T[] array ){
		return _IMPL.clone( array );
	}

	/**
	 * 将数组中的元素转换成一个字符串的方法。
	 * 
	 * @param source 要处理的数组。
	 * @param separate 分隔符。
	 * @return 用指定分隔符连接的字符串。
	 */
	public static String toString( String[] source, String separate ){
		return _IMPL.toString( source, separate );
	}

	/**
	 * 将数组中的元素转换成一个字符串的方法。
	 * 
	 * @param source 要处理的数组。
	 * @param separate 分隔符。
	 * @return 用指定分隔符连接的字符串。
	 */
	public static String toString( int[] source, String separate ){
		return _IMPL.toString( source, separate );
	}

} // end class
