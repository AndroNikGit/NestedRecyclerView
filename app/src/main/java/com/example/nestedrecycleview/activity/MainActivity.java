package com.example.nestedrecycleview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.adapter.CategoryAdapter;
import com.example.nestedrecycleview.model.CategoryModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_nestedview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> categoryItemList1 = new ArrayList<>();
        categoryItemList1.add("https://gootechy.com/wp-content/uploads/2021/01/undekhi-best-hindi-web-series-of-india.jpg");
        categoryItemList1.add("https://viralkekda.com/wp-content/uploads/2021/07/City-of-Dreams-Season-2-Web-Series-Poster-Cast-Episodes-Download.jpg");
        categoryItemList1.add("https://m.media-amazon.com/images/M/MV5BNTkwZDY5NjItNmI1Yy00MmU1LWE4MmQtMDFlMTA1M2JmZDY5XkEyXkFqcGdeQXVyMTI1NDAzMzM0._V1_.jpg");
        categoryItemList1.add("https://laffaz.com/wp-content/uploads/2021/12/Out-Of-Love-best-hindi-web-series-disney-hotstar.jpg");
        categoryItemList1.add("https://filmfare.wwmindia.com/content/2021/jun/web-series-scam-1992-91624453361.jpg");
        categoryItemList1.add("https://dotcomstories.com/wp-content/uploads/2021/06/sacred-games.jpg");

        ArrayList<String> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add("https://www.scrolldroll.com/wp-content/uploads/2021/11/yodha-bollywood-movies-releasing-in-2022.jpg");
        categoryItemList2.add("https://static-koimoi.akamaized.net/wp-content/new-galleries/2021/02/k-g-f-chapter-2001-1.jpg");
        categoryItemList2.add("https://cdn.wallpapersafari.com/40/52/8kfdmY.jpg");
        categoryItemList2.add("https://www.indiablooms.com/showbiz_pic/2017/TOMBRAIDER-1505820047.jpg");
        categoryItemList2.add("https://assetscdn1.paytm.com/images/cinema/Hindi-gallery-c793b370-7f36-11ec-bcab-0fea380dc71b.jpg");
        categoryItemList2.add("https://i.pinimg.com/originals/05/13/e9/0513e9f305494c0e7d89d2f0cf989ea5.jpg");

        ArrayList<String> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add("https://5.imimg.com/data5/CO/IP/MQ/SELLER-30220222/bollywood-wall-poster-500x500.jpg");
        categoryItemList3.add("https://i0.wp.com/a4ajos.in/wp-content/uploads/2021/12/RRR_Poster.jpg?fit=283%2C354&ssl=1");
        categoryItemList3.add("https://cdn.bollywoodmdb.com/cover/250x267/16623_attack_cover.jpg");
        categoryItemList3.add("https://image.scoopwhoop.com/q30/s4.scoopwhoop.com/anj2/61b9b941c582e0000106e342/9b006176-6dd4-4024-a768-145a87795e5c.jpg");
        categoryItemList3.add("https://i.pinimg.com/736x/55/67/e1/5567e10317ca1852e2ff6bb4e5a53633.jpg");
        categoryItemList3.add("https://i0.wp.com/neplych.com/wp-content/uploads/2022/02/Bachchhan-Paandey-Movie.jpg?fit=1440%2C1440&ssl=1");

        ArrayList<String> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add("https://jbt-en-images.s3.ap-south-1.amazonaws.com/wp-content/uploads/2021/09/24173401/ghani-movie.jpg");
        categoryItemList4.add("https://img.theculturetrip.com/450x/smart/wp-content/uploads/2017/11/villain11.jpg");
        categoryItemList4.add("https://i.pinimg.com/236x/b0/81/3c/b0813c1834d0649323cbeaabd552a68e.jpg");
        categoryItemList4.add("https://assets.gqindia.com/photos/5ff48d5a5a0f252d355ec8c7/master/w_1600%2Cc_limit/Master.jpg");
        categoryItemList4.add("https://m.media-amazon.com/images/M/MV5BNDA3ZGM2ODktMGFhZi00NjY4LTg3MDAtNGQzMzg3ZmIxNWJkXkEyXkFqcGdeQXVyMzc4ODk0NTc@._V1_FMjpg_UX1000_.jpg");
        categoryItemList4.add("https://qqcdnpictest.mxplay.com/pic/f352d6df67f3d2fa47bf50849d5b5956/en/2x3/320x480/test_pic1575644572850.webp");

        ArrayList<String> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add("https://m.media-amazon.com/images/M/MV5BMTViN2VlN2QtYjc3Zi00M2EzLWIyNWItZDI5MTUwNmYyMWVkXkEyXkFqcGdeQXVyNjQzNTMxNDQ@._V1_.jpg");
        categoryItemList5.add("https://www.mixindia.com/wp-content/uploads/2022/02/Prem-Prakaran-Gujarati-Movie-Poster-1.jpg");
        categoryItemList5.add("http://timesofindia.indiatimes.com/photo/89504631.cms");
        categoryItemList5.add("https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:oi-discovery-catalog@@icons@@like_202006280402.png,ox-24,oy-617,ow-29:q-80/et00093811-frwrenaqvm-portrait.jpg");
        categoryItemList5.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRk5gsu9ZDAdxDzZHF5hyFPecN3YkeqX--VMg&usqp=CAU");
        categoryItemList5.add("https://pbs.twimg.com/media/DhBIpx2W0AAv0Db.jpg");

        ArrayList<CategoryModel> allCategoryList = new ArrayList<>();
        allCategoryList.add(new CategoryModel("Web Series", categoryItemList1));
        allCategoryList.add(new CategoryModel("Hollywood", categoryItemList2));
        allCategoryList.add(new CategoryModel("Bollywood", categoryItemList3));
        allCategoryList.add(new CategoryModel("South", categoryItemList4));
        allCategoryList.add(new CategoryModel("Gujarati", categoryItemList5));

        intview(allCategoryList);
    }

    private void intview(ArrayList<CategoryModel> allCategoryList) {
        rv_nestedview = (RecyclerView) findViewById(R.id.rv_nestedview);

        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        CategoryAdapter nestedAdapter = new CategoryAdapter(this, allCategoryList);
        rv_nestedview.setLayoutManager(manager);
        rv_nestedview.setAdapter(nestedAdapter);
    }
}