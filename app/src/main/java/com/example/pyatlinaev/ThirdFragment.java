package com.example.pyatlinaev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {
    private static final String TAG = "PyatlinaEV";
    public ThirdFragment() {
        super(R.layout.fragment_third);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        RecyclerView itemsList = view.findViewById(R.id.recycleView);
        MyRecycleAdapter adapter = new MyRecycleAdapter(getContext(), generateItemListRecycle());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        itemsList.setLayoutManager(layoutManager);
        itemsList.setAdapter(adapter);

        adapter.setOnItemClickListener(new MyRecycleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                Toast.makeText(getContext(), "Элемент выбран",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Элемент выбран");
            }
        });

        return view;
    }

    private List<Item> generateItemListRecycle() {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Аза"));
        items.add(new Item("Ева"));
        items.add(new Item("Челси"));
        items.add(new Item("Таша"));
        items.add(new Item("Марта"));
        items.add(new Item("Леон"));
        items.add(new Item("Гром"));
        items.add(new Item("Тима"));
        items.add(new Item("Север"));
        items.add(new Item("Мэйсон"));
        items.add(new Item("Ярик"));
        items.add(new Item("Аля"));
        items.add(new Item("Вишня"));
        items.add(new Item("Сэм"));
        items.add(new Item("Кира"));
        items.add(new Item("Дружок"));
        items.add(new Item("Джеки"));
        items.add(new Item("Бим"));
        items.add(new Item("Ляля"));
        items.add(new Item("Жора"));
        items.add(new Item("Проша"));
        items.add(new Item("Ральф"));
        items.add(new Item("Гера"));
        items.add(new Item("Рекс"));
        items.add(new Item("Бублик"));
        items.add(new Item("Джек"));
        items.add(new Item("Бобби"));
        items.add(new Item("Тайсон"));
        items.add(new Item("Дуся"));
        items.add(new Item("Амур"));
        items.add(new Item("Жасмин"));
        items.add(new Item("Кузя"));
        items.add(new Item("Максик"));
        items.add(new Item("Эля"));
        items.add(new Item("Жуля"));
        items.add(new Item("Бой"));
        items.add(new Item("Тарзан"));
        items.add(new Item("Жуля"));
        items.add(new Item("Пуля"));
        items.add(new Item("Белль"));
        items.add(new Item("Дина"));
        items.add(new Item("Гарри"));
        items.add(new Item("Филипп"));
        items.add(new Item("Герда"));
        items.add(new Item("Лейла"));
        items.add(new Item("Зайка"));
        items.add(new Item("Лева"));
        items.add(new Item("Конор"));
        items.add(new Item("Груша"));
        items.add(new Item("Джой"));
        items.add(new Item("Амир"));
        items.add(new Item("Серый"));
        items.add(new Item("Лапа"));
        items.add(new Item("Кэнди"));
        items.add(new Item("Боня"));
        items.add(new Item("Ника"));

        return items;
    }

}