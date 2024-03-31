package com.model2.mvc.common;


public class Search 
{
	///Field
	private int curruntPage;
	private String searchCondition;
	private String searchKeyword;
	private int pageSize;
	//==> ����Ʈȭ�� currentPage�� �ش��ϴ� ȸ�������� ROWNUM ��� SELECT ���� �߰��� Field 
	//==> UserMapper.xml �� 
	//==> <select  id="getUserList"  parameterType="search"	resultMap="userSelectMap">
	//==> ����
	private int endRowNum;
	private int startRowNum;
	
	///Constructor
	public Search() 
	{
		
	}
	
	///Method
	public int getPageSize() 
	{
		return pageSize;
	}
	
	public void setPageSize(int paseSize) 
	{
		this.pageSize = paseSize;
	}
	
	public int getCurrentPage() 
	{
		return curruntPage;
	}
	
	public void setCurrentPage(int curruntPage) 
	{
		this.curruntPage = curruntPage;
	}

	public String getSearchCondition() 
	{
		return searchCondition;
	}
	
	public void setSearchCondition(String searchCondition) 
	{
		this.searchCondition = searchCondition;
	}
	
	public String getSearchKeyword() 
	{
		return searchKeyword;
	}
	
	public void setSearchKeyword(String searchKeyword) 
	{
		this.searchKeyword = searchKeyword;
	}
	
	//==> Select Query �� ROWNUM ������ �� 
	public int getEndRowNum() 
	{
		return getCurrentPage()*getPageSize();
	}
	
	//==> Select Query �� ROWNUM ���� ��
	public int getStartRowNum() 
	{
		return (getCurrentPage()-1)*getPageSize()+1;
	}

	@Override
	public String toString() 
	{
		return "Search [curruntPage=" + curruntPage + ", searchCondition="
				+ searchCondition + ", searchKeyword=" + searchKeyword
				+ ", pageSize=" + pageSize + "]";
	}
}