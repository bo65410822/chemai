package cn.com.car.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * json返回结果
 */
@JsonInclude(Include.NON_NULL)
public class ResultJson {
	private boolean flag;//成功失败标识
	private long code;//失败代码
	private String msg;//结果消息
	private Object data;//数据
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResultJson(boolean flag, long code, String msg, Object data) {
		super();
		this.flag = flag;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public ResultJson() {
		super();
	}
}
