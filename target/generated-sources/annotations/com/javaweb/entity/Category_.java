package com.javaweb.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static final String IMAGE = "image";
	public static final String QUERY_CATEGORY_FIND_ALL = "Category.findAll";
	public static final String VIDEOS = "videos";
	public static final String CATEGORY_NAME = "categoryName";
	public static final String CATEGORY_ID = "categoryId";
	public static final String STATUS = "status";

	
	/**
	 * @see com.javaweb.entity.Category#image
	 **/
	public static volatile SingularAttribute<Category, String> image;
	
	/**
	 * @see com.javaweb.entity.Category#videos
	 **/
	public static volatile ListAttribute<Category, Video> videos;
	
	/**
	 * @see com.javaweb.entity.Category
	 **/
	public static volatile EntityType<Category> class_;
	
	/**
	 * @see com.javaweb.entity.Category#categoryName
	 **/
	public static volatile SingularAttribute<Category, String> categoryName;
	
	/**
	 * @see com.javaweb.entity.Category#categoryId
	 **/
	public static volatile SingularAttribute<Category, Integer> categoryId;
	
	/**
	 * @see com.javaweb.entity.Category#status
	 **/
	public static volatile SingularAttribute<Category, Integer> status;

}

