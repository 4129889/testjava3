package com.tha103.newview.postpic.model;

import java.util.List;

public interface PostPicDAO_interface {
	public void insert(PostPicVO PostPicVO);
    public void update(PostPicVO PostPicVO);
    public void delete(Integer postPicID);
    public PostPicVO findByPrimaryKey(Integer postPicID);
    public List<PostPicVO> getAll();
}
