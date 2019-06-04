/**
 * 
 */
package com.hfsecurity.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hfsecurity.bean.Users;
import com.hfsecurity.service.UserService;

/**
 * Forum uploading file management
 */
public class FileUpload {
	private Users user;
	private UserService userService;
	private File fileUpload;
	private String fileUploadFileName;
	private String fileUploadContentType;
	private String savePath;
	DateFormat df = new SimpleDateFormat("yyyyMMdd-hh-mm-ss-");
	String questionTime = df.format(new Date());
	HttpServletRequest request = ServletActionContext.getRequest();

	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String userPicUpload() throws Exception {
		Random r = new Random();
		//create file output stream based on 
		//the saving path of the file in server and file name
		FileOutputStream fos = new FileOutputStream(ServletActionContext
				.getRequest().getRealPath(savePath)
				+ "\\"
				+ questionTime
				+ getFileUploadFileName());
		// create a input stream based on the upload file
		FileInputStream fis = new FileInputStream(getFileUpload());
		// save the file into server
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		String p = request.getContextPath() + this.savePath + "/"
				+ questionTime + getFileUploadFileName().toString();
		HttpSession session = ServletActionContext.getRequest().getSession();
		user = (Users) session.getAttribute("tu");
		user.setPicture(p);
		if (this.userService.update(user)) {
			return "fileupload_ok";
		}
		return "fileupload_no";
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
