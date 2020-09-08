package org.cskj.goodsdome.service;

import java.util.List;

import org.cskj.goodsdome.bean.Goods;

public interface GoodsService {

	List<Goods> queryGoodsAll(); 
	
	int addGoods(Goods goods);
	
	int deleteGoods(int id);

	Goods queryGoodsById(Goods goods);

	int updateGoods(Goods goods);
}
