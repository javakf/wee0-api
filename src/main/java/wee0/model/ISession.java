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

/**
 * 会话数据存储对象
 * @author		baihw
 * @date 		2017年2月8日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public interface ISession extends IMap{

	/**
	 * 默认的会话超时时间(数据在缓存中的最大不活动时间)：60分钟。
	 */
	int DEF_TIMEOUT = 60;

	/**
	 * session唯一标识关键字,如果通过url重写保持session需要使用此参数名提供,cookie中也一样.
	 */
	String KEY_SESSIONID = "WSID";

	/**
	 * 关键字：用户是否登陆标记值存储键名。
	 */
	String KEY_ISLOGIN = "isLogin";

	/**
	 * 获取用户是否登陆标记。
	 * 
	 * @return true / false
	 */
	boolean isLogin();

	/**
	 * 设置用户是否登陆标记。
	 * 
	 * @param value true / false
	 * @return 当前对象
	 */
	ISession isLogin( boolean value );

	/**
	 * 获取会话唯一标识
	 *
	 * @return 会话唯一标识
	 */
	String getId();

	/**
	 * 是否为新创建的会话对象,通常第一次请求或者用户禁用了Cookie时会导致会话每次都是新建状态.
	 *
	 * @return true / false
	 */
	boolean isNew();

	/**
	 * 获取会话最大存活时间,单位：分钟
	 * 
	 * @return 会话最大存活时间,单位：分钟
	 */
	int getMaxInactiveInterval();

	/**
	 * 使会话状态失效,所有会话数据将被清除.
	 */
	void invalidate();

	/**
	 * 强制提交会话变更数据。
	 * 
	 * @return true / false
	 */
	boolean commit();

} // end interface
