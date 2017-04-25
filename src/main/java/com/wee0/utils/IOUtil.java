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

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;

import wee0.Wee0;

/**
 * IO处理工具便捷操作类
 * @author		baihw
 * @date 		2017年2月20日
 **/

/**
 * <pre>
 *  examples:
 * </pre>
 **/

public final class IOUtil{

	// 实现类实例
	private static final IIOUtil _IMPL = Wee0.impl().getUtilManager().getIOUtil();

	/**
	 * 打开一个文件输入流．
	 * 
	 * @param file 文件
	 * @return 输入流
	 */
	public static InputStream openInputStream( File file ){
		return _IMPL.openInputStream( file );
	}

	/**
	 * 打开一个文件输出流．
	 * 
	 * @param file 文件
	 * @param append 是否追加
	 * @return 文件输出流
	 */
	public static FileOutputStream openOutputStream( File file, boolean append ){
		return _IMPL.openOutputStream( file, append );
	}

	/**
	 * 将指定的文件数据读取到字节数组中。(比较占用内存)
	 * 
	 * @param file 文件描述对象
	 * @return 字节数组。
	 */
	public static byte[] read( File file ){
		return _IMPL.read( file );
	}

	/**
	 * 将指定的输入流数据读取到字节数组中。(比较占用内存)
	 * 
	 * @param inStream 输入流。
	 * @return 字节数组。
	 */
	public static byte[] read( InputStream inStream ){
		return _IMPL.read( inStream );
	}

	/**
	 * 将指定的输入流数据读取到字节数组中。(比较占用内存)
	 * 
	 * @param inStream 输入流
	 * @param afterClose 读取完成后时否关闭流对象
	 * @return 字节数组。
	 */
	public static byte[] read( InputStream inStream, boolean afterClose ){
		return _IMPL.read( inStream, afterClose );
	}

	/**
	 * 将指定的输入流写入到指定的输出流中。并关闭相应的输入输出流。
	 * 
	 * @param inStream 输入流
	 * @param outStream 输出流, 如果使用 BufferedOutputStream会相对快一些。
	 */
	public static void write( InputStream inStream, OutputStream outStream ){
		_IMPL.write( inStream, outStream );
	}

	/**
	 * 将指定的输入流写入到指定的输出流中。并关闭相应的输入流,输出流的关闭为可选。
	 * 
	 * @param inStream 输入流
	 * @param outStream 输出流, 如果使用 BufferedOutputStream会相对快一些。
	 * @param closeOutStream 是否在关闭输入流的同时关闭输出流。
	 */
	public static void write( InputStream inStream, OutputStream outStream, boolean closeOutStream ){
		_IMPL.write( inStream, outStream, closeOutStream );
	}

	/**
	 * 将指定的输入流写入到文件中，如果文件上级目录不存在，则自动创建。
	 * 
	 * @param inStream 输入流
	 * @param file 目标文件
	 */
	public static void write( InputStream inStream, File file ){
		_IMPL.write( inStream, file );
	}

	/**
	 * 将指定的字节数据写入指定的输出流中。
	 * 
	 * @param datas 要输出的数据
	 * @param outStream 接受输出的数据流
	 */
	public static void write( byte[] datas, OutputStream outStream ){
		_IMPL.write( datas, outStream );
	}

	/**
	 * 平稳关闭文件通道。
	 * 
	 * @param inChannel 输入通道
	 * @param outChannel 输出通道
	 */
	public static void closeQuietly( FileChannel inChannel, FileChannel outChannel ){
		_IMPL.closeQuietly( inChannel, outChannel );
	}

	/**
	 * 平稳关闭客户端套接字连接。
	 * 
	 * @param client 套接字
	 */
	public static void closeQuietly( Socket client ){
		_IMPL.closeQuietly( client );
	}

	/**
	 * 平稳关闭服务器套接字连接。
	 * 
	 * @param socket 要关闭的服务器套接字连接
	 */
	public static void closeQuietly( ServerSocket socket ){
		_IMPL.closeQuietly( socket );
	}

	/**
	 * 平稳关闭阅读流。
	 * 
	 * @param reader 读取器
	 */
	public static void closeQuietly( Reader reader ){
		_IMPL.closeQuietly( reader );
	}

	/**
	 * 平稳关闭输出流。
	 * 
	 * @param writer 写入器
	 */
	public static void closeQuietly( Writer writer ){
		_IMPL.closeQuietly( writer );
	}

	/**
	 * 平稳关闭多个流
	 * 
	 * @param outStreams 流集合
	 */
	public static void closeQuietly( OutputStream... outStreams ){
		_IMPL.closeQuietly( outStreams );
	}

	/**
	 * 平稳关闭多个流
	 * 
	 * @param inStreams 输入流集合
	 */
	public static void closeQuietly( InputStream... inStreams ){
		_IMPL.closeQuietly( inStreams );
	}

	/**
	 * 平稳关闭输入输出流。
	 * 
	 * @param inputStream 输入流
	 * @param outputStream 输出流
	 */
	public static void closeQuietly( InputStream inputStream, OutputStream outputStream ){
		_IMPL.closeQuietly( inputStream, outputStream );
	}

	/**
	 * 平稳关闭输出流。
	 * 
	 * @param outputStream 输入流
	 */
	public static void closeQuietly( OutputStream outputStream ){
		_IMPL.closeQuietly( outputStream );
	}

	/**
	 * 平稳关闭输入流。
	 * 
	 * @param inputStream 输入流
	 */
	public static void closeQuietly( InputStream inputStream ){
		_IMPL.closeQuietly( inputStream );
	}

} // end class
