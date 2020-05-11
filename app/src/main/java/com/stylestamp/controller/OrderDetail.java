package com.stylestamp.controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stylestamp.R;
import com.stylestamp.adapter.OrderDetailListAdapter;
import com.stylestamp.model.Category;
import com.stylestamp.model.Order;
import com.stylestamp.model.Product;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class OrderDetail extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    Order order;
    OrderDetailListAdapter orderDetailListAdapter;
    List<Product> products = new ArrayList<>();
    List<Category> categories = new ArrayList<>();



    public OrderDetail(Order _order) {
        this.order = _order;
    }

    public OrderDetail() {

    }

    public static OrderDetail newInstance(String param1, String param2) {
        OrderDetail fragment = new OrderDetail();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

/*        categories.add(new Category(0,"Woman","sdasd",TRUE));
        categories.add(new Category(1,"Man","sdasd",TRUE));
        categories.add(new Category(2,"Kids","sdasd",TRUE));
        categories.add(new Category(3,"Home","sdasd",TRUE));*/
  /*      products.add(new Product(0, 1, 0, 0, 0, "xyz", "oh what a great clothing piece this is......sdsasdasdasda....asdasd", "fsdf132", "dasads", 49.99, 1,  categories.get(0)));
        products.add(new Product(1, 1, 0, 0, 0, "abc", "oh what a great clothing piece this is......sdsasdasdasda....asdasd", "fsdf132", "dasads", 49.99, 1,  categories.get(0)));
        products.add(new Product(2, 1, 0, 0, 0, "asdas", "oh what a great clothing piece this is......sdsasdasdasda....asdasd", "fsdf132", "dasads", 49.99, 1,  categories.get(0)));
        products.add(new Product(3, 1, 0, 0, 0, "xaxa", "oh what a great clothing piece this is......sdsasdasdasda....asdasd", "fsdf132", "dasads", 49.99, 1,  categories.get(0)));
        products.add(new Product(0, 1, 0, 0, 0, "xyz", "oh what a great clothing piece this is......sdsasdasdasda....asdasd", "fsdf132", "dasads", 49.99, 1,  categories.get(0)));
*/


        View v = inflater.inflate(R.layout.fragment_order_detail, container, false);
        orderDetailListAdapter = new OrderDetailListAdapter(getActivity(), products);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView_orderDetails);
        recyclerView.setAdapter(orderDetailListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        /*recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));*/
        return v;
    }
}


