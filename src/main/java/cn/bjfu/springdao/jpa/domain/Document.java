/** 
 * Project Name:springh 
 * File Name:Document.java 
 * Package Name:cn.bjfu.springh.hibernate.po 
 * Date:2014年6月22日 下午4:07:36 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain;  

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * ClassName:Document <br/> 
 * Function: Document. <br/> 
 * Reason:   Document. <br/> 
 * Date:     2014年6月22日 下午4:07:36 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name="document")
public class Document implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "doc_id", nullable = false)
	private Integer docId;
	@Column(name = "doc_name", nullable = true)
	private String docName;
	@Column(name = "doc_type", nullable = true)
	private Byte docType;
	@Column(name = "add_datetime", nullable = true)
	private Date addDatetime;
	@Column(name = "modify_datetime", nullable = true)
	private Date modifyDatetime;
	@Column(name = "doc_location", nullable = true)
	private String docLocation;
	@Column(name = "upload_author", nullable = true)
	private String uploadAuthor;
	@Column(name = "author", nullable = true)
	private String author;
	
	public Document() {}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public Byte getDocType() {
		return docType;
	}

	public void setDocType(Byte docType) {
		this.docType = docType;
	}

	public Date getAddDatetime() {
		return addDatetime;
	}

	public void setAddDatetime(Date addDatetime) {
		this.addDatetime = addDatetime;
	}

	public Date getModifyDatetime() {
		return modifyDatetime;
	}

	public void setModifyDatetime(Date modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}

	public String getDocLocation() {
		return docLocation;
	}

	public void setDocLocation(String docLocation) {
		this.docLocation = docLocation;
	}

	public String getUploadAuthor() {
		return uploadAuthor;
	}

	public void setUploadAuthor(String uploadAuthor) {
		this.uploadAuthor = uploadAuthor;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Document [docId=" + docId + ", docName=" + docName
				+ ", docType=" + docType + ", addDatetime=" + addDatetime
				+ ", modifyDatetime=" + modifyDatetime + ", docLocation="
				+ docLocation + ", uploadAuthor=" + uploadAuthor + ", anthor="
				+ author + "]";
	}
}
 