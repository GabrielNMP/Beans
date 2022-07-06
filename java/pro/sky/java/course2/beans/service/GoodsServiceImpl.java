package pro.sky.java.course2.beans.service;


import org.springframework.stereotype.Service;
import pro.sky.java.course2.beans.basket.Goods;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final Goods goods;

    public GoodsServiceImpl(Goods goods){
        this.goods = goods;
    }


    @Override
    public List<List<Integer>> addGoods(List<Integer> id) {
        return goods.addGood(id);
    }

    @Override
    public List<Integer> getGoods(){
        return goods.getGoods();
    }



}