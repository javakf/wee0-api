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
package wee0.launcher;

import wee0.Wee0;
import wee0.core.IBindings;

/**
 * 使用命令行执行wee0程序的入口类。
 * @author		baihw
 * @date 		2017年3月4日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class Wee0Main{

	/**
	 * 入口函数，当前版本支持的启动参数选项有：start,install,执行/index程序的指定名称功能函数。
	 * 
	 * @param args 启动参数
	 */
	public static void main( String[] args ){

		// 获取命令行的第1个参数值，默认为"main"。
		String p1 = 0 < args.length ? args[0] : "main";

		switch( p1 ){
			case "install":
				Wee0.boot().install();
				break;
			case "start":
				Wee0.impl().start();
				break;
			default:
				// 创建一个执行环境绑定数据对象。
				IBindings bindings = Wee0.impl().createBingdings();
				// 其它情况为执行'/index'下的指定节点名称。
				Wee0.impl().runFunction( "/index", p1, bindings );
				// 在控制台打印执行结果。
				System.out.println( bindings.response() );
				break;
		}

	}

} // end class
