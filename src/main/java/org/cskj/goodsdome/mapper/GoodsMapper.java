package org.cskj.goodsdome.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.goodsdome.bean.Goods;

@Mapper
public interface GoodsMapper {

	List<Goods> queryGoodsAll();

	int addGoods(Goods goods);

	int deleteGoods(int id);

	Goods queryGoodsById(Goods goods);

	int updateGoods(Goods goods);
}
