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

import java.io.InputStream;

/**
 * 单向不可逆摘要算法支持工具包规范接口
 * @author		baihw
 * @date 		2017年3月31日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IDigest{

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] md5( String data );

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] md5( byte[] data );

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] md5( InputStream data );

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String md5Hex( String data );

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String md5Hex( byte[] data );

	/**
	 * 计算md5。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String md5Hex( InputStream data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] sha1( String data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] sha1( byte[] data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	byte[] sha1( InputStream data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String sha1Hex( String data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String sha1Hex( byte[] data );

	/**
	 * 计算sha1。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String sha1Hex( InputStream data );

	/**
	 * 计算HmacSha1。
	 * 
	 * @param data 原始数据
	 * @param key 密钥数据
	 * @return 结果数据
	 */
	byte[] hmacSha1( String data, String key );

} // end interface
