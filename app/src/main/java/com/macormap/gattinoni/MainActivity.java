package com.macormap.gattinoni;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private List<Prodotto> ListaProdotti = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProdottoAdapter mAdapter;
    private TextView     mTitoloRecicler;
    private LinearLayout mHome;
    private LinearLayout mProdShow;
    private LinearLayout mPagZoom;
    private ImageView    mImgZoom;
    private TextView     mTxtZoom;

// gestione slider con fragments
    private static final int NUM_PAGES = 4;
    private ViewPager    mPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new ProdottoAdapter(ListaProdotti);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position,int subpos) {
                final Prodotto prodotto = ListaProdotti.get(position);
                if (subpos==0) {
//                Toast.makeText(getApplicationContext(), prodotto.getDecr_1(), Toast.LENGTH_SHORT).show();
                    mPagZoom.setVisibility(View.VISIBLE);
                    mProdShow.setVisibility(View.GONE);
                    mTxtZoom.setText(prodotto.getDecr_1());
                    mImgZoom.setImageResource(prodotto.gettoIdImg_1());
                }
                else {
//                    Toast.makeText(getApplicationContext(), prodotto.getDecr_2(), Toast.LENGTH_SHORT).show();
                    mPagZoom.setVisibility(View.VISIBLE);
                    mProdShow.setVisibility(View.GONE);
                    mTxtZoom.setText(prodotto.getDecr_2());
                    mImgZoom.setImageResource(prodotto.gettoIdImg_2());
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));




        mTitoloRecicler = (TextView)     findViewById(R.id.textTitoloRecicler);
        mHome           = (LinearLayout) findViewById(R.id.homepage);
        mProdShow       = (LinearLayout) findViewById(R.id.prodshow);
        mPagZoom        = (LinearLayout) findViewById(R.id.pagzomm);
        mImgZoom        = (ImageView)    findViewById(R.id.imgZoom);
        mTxtZoom        = (TextView)     findViewById(R.id.textTitoloZoom);


        mPagZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPagZoom.setVisibility(View.GONE);
                mProdShow.setVisibility(View.VISIBLE);
            }
        });






        mPager = (ViewPager) findViewById(R.id.idpager) ;
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }



    private void VediHome() {
        mProdShow.setVisibility(View.GONE);
        mHome.setVisibility(View.VISIBLE);
        mPagZoom.setVisibility(View.GONE);
        ListaProdotti.clear();
    }

    private void MakeCollezione1() {
        mTitoloRecicler.setText("Collezione AI 2017");
        mProdShow.setVisibility(View.VISIBLE);
        mHome.setVisibility(View.GONE);
        mPagZoom.setVisibility(View.GONE);

        ListaProdotti.clear();
        Prodotto prodotto;

        prodotto = new Prodotto(1,1,1,1,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,1,3,1,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,1,5,2,1);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,2,2,3,1);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,3,2,3,3);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,4,1,4,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,4,3,4,4);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(1,5,1,5,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,5,3,5,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,5,5,5,6);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,5,7,5,8);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,5,9,5,10);     ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,5,11,5,12);    ListaProdotti.add(prodotto);

        prodotto = new Prodotto(1,6,1,6,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,6,3,6,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,6,5,6,6);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,6,7,7,1);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(1,7,2,7,3);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,7,4,7,5);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(1,7,6,7,0);      ListaProdotti.add(prodotto);

        mAdapter.notifyDataSetChanged();
    }

    private void MakeCollezione2() {
        mTitoloRecicler.setText("Collezione AI 2017");
        mProdShow.setVisibility(View.VISIBLE);
        mHome.setVisibility(View.GONE);
        mPagZoom.setVisibility(View.GONE);

        ListaProdotti.clear();
        Prodotto prodotto;

        prodotto = new Prodotto(2,1,1,1,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,1,3,1,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,1,5,1,6);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(2,2,1,2,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,2,3,3,1);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,3,2,3,3);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(2,4,1,4,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,4,3,5,1);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,5,2,5,3);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,5,4,5,5);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,5,6,5,7);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,5,8,5,9);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(2,6,1,6,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,6,3,6,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,6,5,6,6);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,6,7,7,1);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(2,7,2,7,0);      ListaProdotti.add(prodotto);


        mAdapter.notifyDataSetChanged();
    }

    private void MakeGioielliData() {
        mTitoloRecicler.setText("Gioielli");
        mProdShow.setVisibility(View.VISIBLE);
        mHome.setVisibility(View.GONE);
        mPagZoom.setVisibility(View.GONE);

        Prodotto prodotto;
        ListaProdotti.clear();
        prodotto = new Prodotto(5,1,1,1,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,1,3,1,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,1,5,1,6);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(5,2,1,2,2);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,3,2,4);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,5,2,6);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,7,2,8);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,9,2,10);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,11,2,12);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,13,2,14);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,15,2,16);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,17,2,18);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,19,2,20);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,2,21,3,1);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(5,3,2,3,3);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,3,4,3,5);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,3,6,3,7);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,3,8,3,9);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,3,10,4,1);      ListaProdotti.add(prodotto);

        prodotto = new Prodotto(5,4,2,4,3);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,4,4,4,5);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,4,6,4,7);      ListaProdotti.add(prodotto);
        prodotto = new Prodotto(5,4,8,4,9);      ListaProdotti.add(prodotto);

        mAdapter.notifyDataSetChanged();
    }

    private void MakeScarpeData() {
        mTitoloRecicler.setText("Calzature");
        mProdShow.setVisibility(View.VISIBLE);
        mHome.setVisibility(View.GONE);
        mPagZoom.setVisibility(View.GONE);

        Prodotto prodotto;
        ListaProdotti.clear();
        prodotto = new Prodotto(4,3,1,3,2);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,1,1,2,1);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,2,2,2,3);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,2,4,2,5);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,2,6,2,7);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,2,8,2,9);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(4,2,10,2,0);  ListaProdotti.add(prodotto);
        mAdapter.notifyDataSetChanged();
    }

    private void MakePelletteriaData() {
        mTitoloRecicler.setText("Pelletteria");
        mProdShow.setVisibility(View.VISIBLE);
        mHome.setVisibility(View.GONE);
        mPagZoom.setVisibility(View.GONE);

        Prodotto prodotto;
        ListaProdotti.clear();
        prodotto = new Prodotto(3,1,1,1,2);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,1,3,1,4);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,1,5,2,1);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,2,2,2,3);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,2,4,2,5);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,2,6,2,7);  ListaProdotti.add(prodotto);

        prodotto = new Prodotto(3,3,1,3,2);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,3,3,4);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,5,3,6);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,7,3,8);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,9,3,10);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,11,3,12);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,13,3,14);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,15,3,16);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,17,3,18);  ListaProdotti.add(prodotto);
        prodotto = new Prodotto(3,3,19,3,20);  ListaProdotti.add(prodotto);


        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) { drawer.closeDrawer(GravityCompat.START);  }
        else {
         if (mPagZoom.getVisibility()==View.VISIBLE) {
             mPagZoom.setVisibility(View.GONE);
             mProdShow.setVisibility(View.VISIBLE);
          }
         else {
           if (mProdShow.getVisibility()==View.VISIBLE) {
               VediHome();
           }
           else
             super.onBackPressed();
         }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


             if (id == R.id.nav_home) {VediHome(); }
        else if (id == R.id.nav_collezione1)  {MakeCollezione1(); }
        else if (id == R.id.nav_collezione2)  {MakeCollezione2(); }
        else if (id == R.id.nav_calzature)    {MakeScarpeData(); }
        else if (id == R.id.nav_gioielli)     {MakeGioielliData();}
        else if (id == R.id.nav_pelletteria)  {MakePelletteriaData();}




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



  // Nuova Classe per il fragment dello slide show
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            HomePageFragment homePageFragment;
            homePageFragment = new HomePageFragment();
            Bundle args = new Bundle();
            switch (position) {
                case 0 :   args.putInt("image_cod", R.drawable.home1); break;
                case 1 :   args.putInt("image_cod", R.drawable.home2); break;
                case 2 :   args.putInt("image_cod", R.drawable.home3); break;
                case 3 :   args.putInt("image_cod", R.drawable.home4); break;
                default:   args.putInt("image_cod", R.drawable.home1); break;
            }
            homePageFragment.setArguments(args);
            return homePageFragment;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }



}
