/** 
 * Project Name:springdao 
 * File Name:DocumentService.java 
 * Package Name:cn.bjfu.springdao.jpa.service.impl 
 * Date:2014年6月27日 上午9:14:09 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.domain.Document;
import cn.bjfu.springdao.jpa.repository.DocumentRepository;
import cn.bjfu.springdao.jpa.service.IDocumentService;
import cn.bjfu.springdao.utils.Pagination;

/** 
 * ClassName:DocumentService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月27日 上午9:14:09 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class DocumentService implements IDocumentService {

	@Autowired
	DocumentRepository documentRepository;
	
	@Override
	public Document findById(Integer docId) {
		return this.documentRepository.findOne(docId);
	}
	
	@Override
	public List<Document> findAll() {
		return documentRepository.findAll();
	}
	
	@Override
	public List<Document> findByDocName(String docName) {
		return this.documentRepository.findByDocName(docName);
	}

	@Override
	public Page<Document> findListWithPage(Pagination<Document> page) {
		Pageable pageable = new PageRequest(page.getCurrentPage(), page.getPageSize());
		Page<Document> returnPage = this.documentRepository.findAll(pageable);
		return returnPage;
	}

	@Transactional(readOnly = false)
	@Override
	public void saveDocument(Document document) {
		this.documentRepository.saveAndFlush(document);
	}
	
	@Transactional(readOnly = false)
	@Override
	public void deleteDocument(Document document) {
		this.documentRepository.delete(document);
	}

}
 