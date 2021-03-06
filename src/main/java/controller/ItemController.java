package controller;

import model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import response.CustomListResponse;
import response.CustomResponse;
import utils.ResponseUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit on 2/25/16.
 */
@RequestMapping("/")
@RestController
public class ItemController {


    ArrayList<Item> items = new ArrayList<>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CustomResponse<List<Item> >searchByName(){
     //   return new CustomResponse<String>("hi","Success",0,true);
        items.add(new Item());

        CustomResponse<List<Item> > response = new CustomResponse<List<Item>>(items,"Success",0,true);
        return response;
    }


    @RequestMapping(value = "music/v2/featured", method = RequestMethod.GET)
    public String getItems(){
        //   return new CustomResponse<String>("hi","Success",0,true);
//
//        ArrayList<Item> list = new ArrayList<Item>();
//        list.add(new Item());
//        items.add(new Item());
//        CustomListResponse<Item> response = new CustomListResponse<Item>(list);
//        return response;
        return ResponseUtil.getResponse();
    }



    @RequestMapping(value = "featured", method = RequestMethod.GET)
    public CustomListResponse getItemsv2(){
        //   return new CustomResponse<String>("hi","Success",0,true);

        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item());
        items.add(new Item());
        CustomListResponse<Item> response = new CustomListResponse<Item>(list);
        return response;
    }





}
