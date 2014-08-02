package cn.bjfu.springdao.jpa.frame;  

import java.util.Map;

/** 
 * ClassName:IOrder <br/> 
 * Function: 排序的接口类. <br/> 
 * Reason:   排序的接口类. <br/> 
 * Date:     2014年7月8日 下午11:58:43 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IOrder {
	public abstract void addOrderBy(String key, String direction);
	public abstract String convertToSQL();
	public abstract Map<String, Object> getOrderByMap();
}
 