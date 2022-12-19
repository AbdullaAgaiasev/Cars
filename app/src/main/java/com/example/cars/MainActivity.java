package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView carsRecyclerView;
    private ArrayList<String> carsList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carsRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        CarsAdapter adapter = new CarsAdapter(carsList);
        carsRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carsList.add("Mercedes");
        carsList.add("BMW");
        carsList.add("Audi");
        carsList.add("Lexus");
        carsList.add("Toyota");
        carsList.add("Porsche");
        carsList.add("Ferrari");
        carsList.add("Lamborghini");
        carsList.add("Honda");
        carsList.add("Mazda");
        carsList.add("Ford");
        carsList.add("Jeep");
        carsList.add("RR");
        carsList.add("Dodge");
        carsList.add("Ржавое карыто");
        carsList.add("Mitsubishi");
        carsList.add("Mclaren");
        carsList.add("Chevrolet");
        carsList.add("Hyundai");
        carsList.add("Лансер");
        carsList.add("Range Rover");
        carsList.add("Tesla");
        carsList.add("Lada");
        carsList.add("Bentley");
        carsList.add("Nissan");
        carsList.add("Infiniti");
        carsList.add("Corvette");
        carsList.add("Bugatti");
        carsList.add("Flanker");
        carsList.add("Alfa Romeo");
        carsList.add("Logan");
        carsList.add("Pagani");
        carsList.add("Vulcan");
        carsList.add("Viper");
        carsList.add("Aston Marin");
        carsList.add("Subaru");
        carsList.add("Regera");
        carsList.add("Agera");
        carsList.add("Jaguar");
        carsList.add("Fiat");
        carsList.add("Chrysler");
        carsList.add("Citroen");
        carsList.add("KIA");
        carsList.add("Suzuki");
        carsList.add("Peugeot");
        carsList.add("Skoda");
        carsList.add("Wolksvagen");
        carsList.add("Daewoo");
        carsList.add("Maserati");
        carsList.add("Lotus");
        carsList.add("Marussia");
        carsList.add("Impala");
        carsList.add("Opel");
        carsList.add("Hammer");
        carsList.add("Dugatti");
        carsList.add("Volvo");
        carsList.add("DAF");
        carsList.add("Камаз");
        carsList.add("ЗиЛ");
    }
}