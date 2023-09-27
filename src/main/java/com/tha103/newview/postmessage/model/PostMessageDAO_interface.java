package com.tha103.newview.postmessage.model;

import java.util.List;



public interface PostMessageDAO_interface {
	public void insert(PostMessageVO PostMessageVO);
    public void update(PostMessageVO PostMessageVO);
    public void delete(Integer postMessageID);
    public PostMessageVO findByPrimaryKey(Integer postMessageID);
    public List<PostMessageVO> getAll();
}
