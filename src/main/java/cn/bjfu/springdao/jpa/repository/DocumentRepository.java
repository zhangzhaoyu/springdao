/** 
 * Project Name:springdao 
 * File Name:DocumentRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月26日 下午11:55:09 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cn.bjfu.springdao.jpa.domain.Document;

/** 
 * ClassName:DocumentRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月26日 下午11:55:09 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface DocumentRepository extends JpaRepository<Document, Integer>, 
		CrudRepository<Document, Integer>{
	List<Document> findByDocName(String docName);
	
	@Query(value="select d from Document d where d.docType=:docType")
	public Document findByDocType(@Param("docType") Byte docType);
	
	public List<Document> findByUploadAuthorLike(String uploadAuthor);
	
	@Query("select d from Document d where d.author=:author")
	public List<Document> findByAuthorLike(String author);
	
	public List<Document> findByDocTypeBetween(Byte begin, Byte end);
	
}
 