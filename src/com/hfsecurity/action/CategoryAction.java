/**
 * 
 */
package com.hfsecurity.action;

import java.util.List;

import com.hfsecurity.bean.Categorys;
import com.hfsecurity.bean.Pages;
import com.hfsecurity.bean.Topics;
import com.hfsecurity.bean.Types;
import com.hfsecurity.service.CategoryService;

/**
 * Forum Category module
 * 
 */
public class CategoryAction {

	private Categorys category;
	private CategoryService cateService;
	private List<Categorys> listCate;
	private List<Types> listType;
	private List<Topics> listTopic;
	private Pages pageBean;
	private int nowPage = 1;

	public String ManageAdd() throws Exception{
		this.cateService.add(category);
		return "cate_manageAdd_ok";
	}
	
	public String ManageUpdate() throws Exception{
		this.cateService.update(category);
		return "cate_manageUpdate_ok";
	}
	
	/**
	 * Get the title of the article when creating 
	 * @return "Okay message"
	 * @throws Exception
	 */
	public String new_getAll() throws Exception {
		this.listCate = this.cateService.getAll();
		return "cate_new_getAll_ok";
	}

	/**
	 * Get the sub-title of the article when creating
	 * 
	 * @return "Okay message"
	 * @throws Exception
	 */
	public String new_getType() throws Exception {
		this.listType = this.cateService.new_getType(category.getId());
		return "cate_new_getType_ok_json";
	}

	/**
	 * Get all the type of categories
	 * @return
	 * @throws Exception
	 */
	public String getAll() throws Exception {
		this.listCate = this.cateService.getAll();
		return "cate_getAll_ok";
	}

	public String getType() throws Exception {
		this.listType = this.cateService.getType(category.getId());
		return "cate_getType_ok";
	}

	public String goCate() throws Exception {
		this.listType = this.cateService.getType(category.getId());
		if(listType.size()==0){
			return "error";
		}
		category.setName(listType.get(0).getTypesCategory().getName());
		this.pageBean = this.cateService.getAllForPages(10, nowPage, listType);
		this.listTopic = this.pageBean.getListTopics();
		return "cate_go_ok";
	}
	
	/**
	 * Manage all the categories in back-end
	 * @return
	 * @throws Exception
	 */
	public String ManageAll() throws Exception {
		this.listCate = this.cateService.getAll();
		return "cate_manageAll_ok";
	}
	/**
	 * Manage all the types in categories in back-end
	 * @return
	 * @throws Exception
	 */
	public String ManageAllType() throws Exception {
		this.category = this.cateService.find(category.getId());
		this.listType = this.cateService.manageType(category.getId());
		return "cate_manageAllType_ok_json";
	}
	
	

	public Categorys getCategory() {
		return category;
	}

	public void setCategory(Categorys category) {
		this.category = category;
	}

	public CategoryService getCateService() {
		return cateService;
	}

	public void setCateService(CategoryService cateService) {
		this.cateService = cateService;
	}

	public List<Categorys> getListCate() {
		return listCate;
	}

	public void setListCate(List<Categorys> listCate) {
		this.listCate = listCate;
	}

	public List<Types> getListType() {
		return listType;
	}

	public void setListType(List<Types> listType) {
		this.listType = listType;
	}

	public List<Topics> getListTopic() {
		return listTopic;
	}

	public void setListTopic(List<Topics> listTopic) {
		this.listTopic = listTopic;
	}

	public Pages getPageBean() {
		return pageBean;
	}

	public void setPageBean(Pages pageBean) {
		this.pageBean = pageBean;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

}
