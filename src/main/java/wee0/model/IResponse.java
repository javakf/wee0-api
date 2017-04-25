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
package wee0.model;

import wee0.lang.IMap;
import wee0.lang.IObject;

/**
 * 响应数据存储对象
 * @author		baihw
 * @date 		2017年2月8日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface IResponse extends IMap{

	/**
	 * 200响应代码:正常响应
	 */
	public static final int CODE_OK = 200;

	/**
	 * 401响应代码:无效的请求
	 */
	public static final int CODE_INVALID_REQUEST = 400;

	/**
	 * 401响应代码:未授权
	 */
	public static final int CODE_NOT_AUTHORIZED = 401;

	/**
	 * 403响应代码:禁止访问
	 */
	public static final int CODE_FORBIDDEN_ACCESS = 403;

	/**
	 * 404响应代码:资源找不到
	 */
	public static final int CODE_NOT_FOUND = 404;

	/**
	 * 480响应代码：自定义错误
	 */
	public static final int CODE_CUSTOM_ERROR = 480;

	/**
	 * 500响应代码
	 */
	public static final int CODE_INTERNAL_ERROR = 500;

	/**
	 * 数据字段关键字：响应编码
	 */
	String KEY_CODE = "code";

	/**
	 * 数据字段关键字：响应消息
	 */
	String KEY_MSG = "msg";

	/**
	 * 数据字段关键字：响应数据
	 */
	String KEY_DATA = "data";

	/**
	 * 数据字段关键字：响应数据类型
	 */
	String KEY_TYPE = "dataType";

	/**
	 * HTTP协议头中的响应数据类型对应的头信息名称
	 */
	String HEADER_CONTENT_TYPE = "Content-Type";

	/**
	 * 响应数据类型参考设置值：JSON类型数据
	 */
	String CONTENT_TYPE_JSON = "application/json;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：JS类型数据
	 */
	String CONTENT_TYPE_JS = "text/javascript;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：JSOUP类型数据
	 */
	String CONTENT_TYPE_JSOUP = "text/javascript;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：XML类型数据
	 */
	String CONTENT_TYPE_XML = "text/xml;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：HTML类型数据
	 */
	String CONTENT_TYPE_HTML = "text/html;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：简单文本类型数据
	 */
	String CONTENT_TYPE_TEXT = "text/plain;charset=UTF-8";
	/**
	 * 响应数据类型参考设置值：二进制流类型数据
	 */
	String CONTENT_TYPE_STREAM = "application/octet-stream";

	/**
	 * 设置响应数据类型。
	 *
	 * @param contentType 数据类型
	 * @return 当前对象
	 */
	IResponse setContentType( String contentType );

	/**
	 * 获取返回类型的HTTP协议响应头信息字符串。
	 *
	 * @return HTTP协议响应内容类型
	 */
	String getContentType();

	/**
	 * 设置响应状态码
	 *
	 * @param status 状态码
	 * @return 当前对象
	 */
	IResponse setStatus( int status );

	/**
	 * @return 响应状态码
	 */
	int getStatus();

	/**
	 * 设置响应数据,重复设置以最后一次设置的为最终结果，后边的设置会覆盖前边的设置。
	 * 
	 * @param data 响应数据对象
	 * @return 当前对象
	 */
	IResponse setData( IObject data );

	/**
	 * 获取响应数据
	 *
	 * @return 响应数据
	 */
	IObject getData();

	/**
	 * @return 获取文本类型响应数据
	 */
	String getDataString();

	/**
	 * 设置响应错误代码及完整的错误信息数据
	 * 
	 * @param status 响应代码
	 * @param error 错误消息
	 * @param data 错误详情数据
	 * @return 当前对象
	 */
	IResponse setError( int status, String error, IObject data );

	/**
	 * 设置响应错误代码及信息
	 * 
	 * @param status 错误代码
	 * @param error 错误信息
	 * @return 当前对象
	 */
	IResponse setError( int status, String error );

	/**
	 * 设置完整的错误信息数据
	 * 
	 * @param error 错误消息
	 * @param data 错误详情数据
	 * @return 当前对象
	 */
	IResponse setError( String error, IObject data );

	/**
	 * 设置响应错误信息
	 * 
	 * @param error 错误信息
	 * @return 当前对象
	 */
	IResponse setError( String error );

	/**
	 * @return 获取错误信息
	 */
	String getError();

	/**
	 * @return 是否为成功的数据响应。
	 */
	boolean isOk();

} // end interface
