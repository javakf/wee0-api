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
package wee0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import wee0.boot.IBoot;

/**
 * Wee0框架核心操作类。
 * @author		baihw
 * @date 		2016年12月24日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class Wee0{

	/**
	 * 配置关键字：wee0实现包引导类名称。
	 */
	public static final String KEY_BOOT_NAME = "wee0.boot";

	/**
	 * 配置关键字：wee0主目录。不配置默认使用执行程序的目录。
	 */
	public static final String KEY_HOME_DIR = "wee0.home";

	/**
	 * 用户未指定实现类名称时使用的默认实现类名称。
	 */
	public static final String DEF_BOOT_NAME = "wee0.boot.impl.DefaultBoot";

	// 使用的实现类名称。
	private static final String _BOOT_NAME;

	// 使用的实现实例引导程序。
	private static final IBoot _BOOT;

	static{
		// 从系统环境变量获取指定的实现类名称
		_BOOT_NAME = System.getProperty( KEY_BOOT_NAME, DEF_BOOT_NAME );
		try{
			Class<?> implCla = Class.forName( _BOOT_NAME );
			Method implMethod = implCla.getDeclaredMethod( "impl" );
			// 通过静态方法"impl"获取boot实现类实例单例对象。
			_BOOT = ( IBoot )implMethod.invoke( null );
		}catch( ClassNotFoundException | SecurityException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e ){
			throw new RuntimeException( e );
		}
	}

	/**
	 * 获取框架实现类实例对象
	 * 
	 * @return 框架实现类实例对象
	 */
	public static IWee0 impl(){
		return _BOOT.wee0Impl();
	}

	/**
	 * 获取当前使用的引导器。
	 * 
	 * @return 当前使用的引导器
	 */
	public static IBoot boot(){
		return _BOOT;
	}

} // end class
