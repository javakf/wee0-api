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
package wee0.log;

import java.util.Objects;

/**
 * 日志对象抽象基类，提供一些通用的方法实现，用户可以继承此类实现日志对象，也可以完全自己重新实现。
 * @author		baihw
 * @date 		2016年12月28日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public abstract class AbstractLogger implements ILogger{

	// 日志级别
	protected final LogLevel	_LEVEL;
	// 日志类别名称。
	protected final String		_CATEGORY;
	// 日志类别名称最大长度。
	protected final int			_CATEGORY_MAX_LEN;

	/**
	 * 默认的日志类别名称最大长度。
	 */
	protected static final int	_DEF_CATEGORY_MAX_LEN	= 26;

	/**
	 * 构造函数
	 * 
	 * @param level 日志级别
	 * @param category 日志类别名称
	 * @param categoryMaxLen 日志类别名称最大长度
	 */
	public AbstractLogger( LogLevel level, String category, int categoryMaxLen ){
		Objects.requireNonNull( category, "category can not be null!" );
		Objects.requireNonNull( level, "level can not be null!" );
		if( 0 == categoryMaxLen ){
			categoryMaxLen = _DEF_CATEGORY_MAX_LEN;
		}
		if( category.length() > categoryMaxLen ){
			// 日志类别名称如果超过了支持的最大长度，则从后边截取最大长度允许出现的字符数量。
			category = category.substring( category.length() - categoryMaxLen );
		}
		this._CATEGORY_MAX_LEN = categoryMaxLen;
		this._CATEGORY = category;
		this._LEVEL = level;
	}

	/**
	 * 构造函数
	 * 
	 * @param level 日志级别
	 * @param category 日志类别名称
	 */
	public AbstractLogger( LogLevel level, String category ){
		this( level, category, _DEF_CATEGORY_MAX_LEN );
	}

	@Override
	public String getCategory(){
		return this._CATEGORY;
	}

	@Override
	public void debug( String msg ){
		debug( msg, null );
	}

	@Override
	public void debug( Throwable e ){
		debug( null, e );
	}

	@Override
	public void debug( String msg, Throwable e ){
		if( isDebugEnabled() ){
			doDebug( msg, e );
		}
	}

	@Override
	public void info( String msg ){
		info( msg, null );
	}

	@Override
	public void info( Throwable e ){
		info( null, e );
	}

	@Override
	public void info( String msg, Throwable e ){
		if( isInfoEnabled() ){
			doInfo( msg, e );
		}
	}

	@Override
	public void warn( String msg ){
		warn( msg, null );
	}

	@Override
	public void warn( Throwable e ){
		warn( null, e );
	}

	@Override
	public void warn( String msg, Throwable e ){
		if( isWarnEnabled() ){
			doWarn( msg, e );
		}
	}

	@Override
	public void error( String msg ){
		error( msg, null );
	}

	@Override
	public void error( Throwable e ){
		error( null, e );
	}

	@Override
	public void error( String msg, Throwable e ){
		if( isErrorEnabled() ){
			doError( msg, e );
		}

	}

	@Override
	public boolean isDebugEnabled(){
		return _LEVEL.debugThan();
	}

	@Override
	public boolean isInfoEnabled(){
		return _LEVEL.infoThan();
	}

	@Override
	public boolean isWarnEnabled(){
		return _LEVEL.warnThan();
	}

	@Override
	public boolean isErrorEnabled(){
		return _LEVEL.errorThan();
	}

	/**
	 * 需要子类自行实现的debug消息处理方法。
	 * 
	 * @param msg 消息内容
	 * @param e 异常内容
	 */
	protected abstract void doDebug( String msg, Throwable e );

	/**
	 * 需要子类自行实现的info消息处理方法。
	 * 
	 * @param msg 消息内容
	 * @param e 异常内容
	 */
	protected abstract void doInfo( String msg, Throwable e );

	/**
	 * 需要子类自行实现的warn消息处理方法。
	 * 
	 * @param msg 消息内容
	 * @param e 异常内容
	 */
	protected abstract void doWarn( String msg, Throwable e );

	/**
	 * 需要子类自行实现的error消息处理方法。
	 * 
	 * @param msg 消息内容
	 * @param e 异常内容
	 */
	protected abstract void doError( String msg, Throwable e );

} // end class
