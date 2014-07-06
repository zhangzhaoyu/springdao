/** 
 * Project Name:springdao 
 * File Name:IDocumentService.java 
 * Package Name:cn.bjfu.springdao.jpa.service 
 * Date:2014年6月27日 上午9:12:56 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service;  

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.domain.Document;
import cn.bjfu.springdao.utils.Pagination;

/** 
 * ClassName:IDocumentService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月27日 上午9:12:56 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public interface IDocumentService {
	Document findById(Integer docId);
	List<Document> findAll();
	List<Document> findByDocName(String docName);
	
	public abstract Page<Document> findListWithPage(Pagination<Document> page);
	
	public abstract void saveDocument(Document document);
	public abstract void deleteDocument(Document document);
}
 