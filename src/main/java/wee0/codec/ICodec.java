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

/**
 * 编解码算法支持规范接口,须同时支持encode,decode方法.
 * @author		baihw
 * @date 		2017年3月31日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ICodec{

	/**
	 * 对指定数据源进行base64编码。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String encodeBase64( byte[] data );

	/**
	 * 对指定数据源进行base64编码。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String encodeBase64( String data );

	/**
	 * 对指定base64编码的数据进行解码。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String decodeBase64( String data );

	/**
	 * 对指定数据源进行URL编码。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String encodeURL( String data );

	/**
	 * 对指定URL编码的数据进行解码。
	 * 
	 * @param data 原始数据
	 * @return 结果数据
	 */
	String decodeURL( String data );

	/**
	 * 对指定字节数组进行十六进制编码。
	 * 
	 * @param bytes 字节数组
	 * @return 十六进制编码字符串
	 */
	String encodeHex( byte[] bytes );

	/**
	 * 对指定字十六进制编码字符串进行解码。
	 * 
	 * @param hexString 十六进制编码字符串
	 * @return 字节数组
	 */
	byte[] decodeHex( String hexString );

	/**
	 * 使用指定的密钥对指定的数据进行URL编码。
	 * 
	 * @param data 原始数据
	 * @param key 密钥
	 * @return 结果数据
	 */
	String encodeDES( String data, String key );

	/**
	 * 使用指定的密钥对指定URL编码的数据进行解码。
	 * 
	 * @param data 原始数据
	 * @param key 密钥
	 * @return 结果数据
	 */
	String decodeDES( String data, String key );

} // end interface
