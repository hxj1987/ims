package com.consumer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {
	Logger LOGGER = Logger.getLogger(BaseController.class);

	@Autowired
	protected HttpServletRequest request;
	/*@Autowired
	protected HttpServletResponse response;*/
	@Autowired
	protected HttpSession session;

	/**
	 * 
	 * @param code
	 *            成功1，失败0
	 * @param msg
	 *            提示信息
	 * @param data
	 *            具体数据
	 * @return
	 */
	protected void getReturnMapStr(String code, String msg, Object data,HttpServletResponse response) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("code", code);
		returnMap.put("msg", msg);
		if (null != data) {
			returnMap.put("data", data);
		}
		//return JSONObject.toJSONString(returnMap);
		renderJsonN(JSONObject.toJSONString(returnMap),response);
	}

	/**
	 * 
	 * @param status
	 *            成功1，失败0
	 * @param msg
	 *            提示信息
	 * @param data
	 *            具体数据
	 * @return
	 */
	public void getReturnMap(String status, String msg,
			Object data) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("status", status);
		returnMap.put("msg", msg);
		if (null != data) {
			returnMap.put("data", data);
		}
		//return returnMap;
		//renderJsonN(returnMap,response);
	}

	public void renderJsonN(Object obj, HttpServletResponse response) {
		PrintWriter writer = null;
		try {
			response.setHeader("content-Type", "text/json;charset=utf-8");
			writer = response.getWriter();
			writer.print(JSONObject.toJSON(obj));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer) {
				writer.close();
			}
		}
	}
	/*protected Map<String, Object> getParamJson() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			String param = StringHelper.notEmpty(request.getAttribute("appParam"));
			if (null != param && !"".equals(param)) {
				map = JsonLib.parserToMap(param);
			}

		} catch (Exception e) {
			LOGGER.error("解析参数失败:", e);
			return map;
		}
		return map;
	}*/




}
