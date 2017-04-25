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

import java.net.InetSocketAddress;

/**
 * 网络处理工具
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface INetUtil{

	/**
	 * 本地IP
	 */
	public static final String LOCALIP = "127.0.0.1";

	/**
	 * 任意IP
	 */
	public static final String ANYIP = "0.0.0.0";

	/**
	 * 解析指定地址字符串.
	 * 
	 * 127.0.0.1:9999 to 127.0.0.1:9999
	 * 
	 * 127.0.0.1 to 127.0.0.1:9999
	 * 
	 * :9999 to localIP:9999
	 * 
	 * 9999 to localIP:9999
	 * 
	 * 0.0.0.0:9999 to localIP:9999
	 * 
	 * @param address 地址字符串，如果只有端口，则地址使用本机ip，如果只有ip，则端口使用指定的默认端口号。
	 * @param defaultPort 默认端口号
	 * @return 解析后的地址对象
	 */
	InetSocketAddress parseAddress( String address, int defaultPort );

	/**
	 * 转换网络地址对象为主机+端口字符串
	 * 
	 * @param address 主机地址
	 * @return 主机地址+端口
	 */
	String toAddressString( InetSocketAddress address );

	/**
	 * 是否为本地地址
	 * 
	 * @param host 主机
	 * @return true / false
	 */
	public boolean isLocalHost( String host );

	/**
	 * 是否为任意主机
	 * 
	 * @param host 主机
	 * @return true / false
	 */
	public boolean isAnyHost( String host );

	/**
	 * 根据主机名获取IP地址
	 * 
	 * @param hostName 主机名
	 * @return IP
	 */
	public String getIpByHost( String hostName );

	/**
	 * 检测本地指定端口是否被使用
	 * 
	 * @param port 端口
	 * @return true / false
	 */
	public boolean checkLocalPortIsUsed( int port );

	/**
	 * 获取一个本机可用端口。
	 * 
	 * @return -1表示无可用端口,其它值为当前可用端口
	 */
	public int getAvailablePort();

} // end interface
