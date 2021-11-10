package com.pab.newsletter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] mTitle = {"Koin SQUID Sempat Tembus Rp 41 Juta, Kini Tak Sampai 50 Perak", "Harga Batu Bara Ambles, Begini Ramalan Berikutnya", "Jeblok Terus Jelang Tapering, Awas Rupiah ke Rp 15.000/US$?"};
    String[] mTanggal = {"2 November 2021", "3 November 2021", "3 November 2021"};
    String[] mTag = {"CRYPTOCURENCY", "MARKET", "MARKET"};
    String[] mBerita = {"Kripto terinspirasi dari serial Netflix yang sedang viral di jagat dunia maya, yakni squid game (SQUID) dilaporkan ambruk hingga 100% pada Selasa (2/11/2021) hari ini, setelah harganya sempat terbang hingga lebih dari 200.000% pada Senin (1/11/2021) kemarin. Berdasarkan data dari CoinMarketCap pada pukul 13:02 WIB, harga koin digital (token) tersebut terpantau ambruk hingga 99,99% ke level harga US$ 0,002851/koin atau Rp 41/koin (asumsi kurs Rp 14.250/US$). Padahal pada Senin (1/11/2021) petang kemarin, harganya sempat meroket hingga 221.960% ke level US$ 2.856,64/koin (Rp 40.707.120/koin), dari harga awal diciptakan yakni di level US$ 0,01287/koin (Rp 183/koin). CoinMarketCap juga melaporkan saat ini, pihaknya telah menerima laporan dari pembeli token SQUID bahwa website dan media sosial SQUID tidak lagi berfungsi. Bahkan sebelumnya, pengguna token juga tidak dapat menjual tokennya di platform pertukaran Pancakeswap. Beberapa pihak juga mengatakan bahwa sang pengembang game online beserta koin digitalnya yang hingga kini belum diketahui namanya sudah meninggalkan proyek alias kabur setelah mengetahui harga token SQUID terjatuh hingga ke bawah US$ 0. Hal ini ditelusuri dari salah satu pengguna Twitter @__trick yang menandakan bahwa pengembang proyek Squid Game telah menarik karpet pemegang SQUID. Parahnya lagi, berdasarkan data dari BscScan, menunjukkan bahwa sebuah alamat yang dilabeli oleh situs web sebagai \"dilaporkan terlibat dalam penarikan karpet\" token SQUID dan mengkonversikannya ke token binance coin senilai jutaan dolar. Pihak yang mengaku bagian dari pengembang SQUID mengatakan melalui Telegram resminya bahwa pengembang tidak ingin terus menjalankan proyek tersebut karena depresi akibat berurusan dengan para scammers. Seseorang mencoba meretas proyek kami akhir-akhir ini. Tidak hanya akun Twitter @GoGoSquidGame, tetapi juga kontrak pintar kami. Kami mencoba melindunginya tetapi harganya masih tidak normal. Squid Game Dev tidak ingin melanjutkan proyek karena kami tertekan dari scammers. Kami harus menghapus semua batasan dan aturan transaksi Squid Game, tulis pengembang SQUID di Telegram, dikutip dari CoinDesk.",
            "Harga batu bara terus mengalami penurunan tajam dalam dua pekan terakhir. Pada perdagangan di pasar ICE Newcastle (Australia) kemarin (2/11/21), tercatat harga komoditas ini sebesar US$ 140,9/ton. Angka ini jatuh US$ 100/ton atau hampir setengah dari rekor harga puncaknya beberapa waktu lalu yang sempat menyentuh US$ 240/ton. 5-6 bulan lalu nggak ada satupun yang memperkirakan harga batu bara Newcastle bakal naik ke atas US$ 240/ton. Meski turun ke  US$ 150 an tapi masih di atas US$ 100/ton atau lebih tinggi dari rata-rata tahun lalu US$ 60 - US$ 70 per ton kata Head of Research Henan Puithrai Sekuritas Robertus Yanuar Hardy dalam Investime CNBC Indonesia, Selasa (3/11/21). Penurunan komoditas ini akibat Pemerintahan Presiden Xi Jinping yang sedang bernafsu untuk menurunkan harga batu bara. China memang sangat merasakan dampak lonjakan harga batu bara, yang sejak akhir 2020 (year-to-date) masih membukukan kenaikan 89,48%. Sekitar 60% pembangkit listrik di Negeri Tirai Bambu menggunakan batu bara sebagai sumber energi primer. Mahalnya harga dan menipisnya pasokan membuat sejumlah wilayah di China terpaksa melakukan pemadaman listrik bergilir. Ini menyebabkan gangguan produksi yang luar biasa.",
            "Kurang dari 12 jam ke depan bank sentral Amerika Serikat (AS) atau yang dikenal dengan Federal Reserve (The Fed) akan mengumumkan kebijakan moneternya. Rupiah sudah mulai merespon sejak awal pekan ini, dan terus mengalami pelemahan melawan dolar Amerika Serikat (AS). Pada perdagangan Rabu (3/11), rupiah membuka perdagangan dengan melemah 0,07% di Rp 14.270/US$. Sempat berbalik stagnan, rupiah kemudian berbalik melemah lagi hingga 0,42% ke Rp 14.310. Level tersebut merupakan yang terlemah sejak 1 Oktober lalu. Di penutupan perdagangan rupiah berada di Rp 14.205/US$ melemah 0,32% di pasar spot. Artinya, Mata Uang Garuda kini sudah melemah 3 hari beruntun, dengan persentase 0,92%. Tapering yang akan dilakukan The Fed diprediksi membuat rupiah melemah ke Rp 15.000/US$, tetapi sekali lagi tidak akan separah 2013. Hal ini diungkapkan Chatib Basri, Ekonom Senior yang juga merupakan Mantan Menteri Keuangan saat berbincang dengan CNBC Indonesia, Jumat (27/8/2021)."};
    int[] mImg = {R.drawable.berita1, R.drawable.berita2, R.drawable.berita3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, mTitle, mTanggal, mTag, mImg);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                if(position == 0) {
                    Intent i = new Intent(getApplicationContext(), readnews.class);
                    i.putExtra("judul", mTitle[0]);
                    i.putExtra("tanggal",mTanggal[0]);
                    i.putExtra("tag",mTag[0]);
                    i.putExtra("berita",mBerita[0]);
                    i.putExtra("img",mImg[0]);
                    startActivity(i);
                }

                else if(position == 1) {
                    Intent i = new Intent(getApplicationContext(), readnews.class);
                    i.putExtra("judul", mTitle[1]);
                    i.putExtra("tanggal",mTanggal[1]);
                    i.putExtra("tag",mTag[1]);
                    i.putExtra("berita",mBerita[1]);
                    i.putExtra("img",mImg[1]);
                    startActivity(i);
                }

                else if(position == 2) {
                    Intent i = new Intent(getApplicationContext(), readnews.class);
                    i.putExtra("judul", mTitle[2]);
                    i.putExtra("tanggal",mTanggal[2]);
                    i.putExtra("tag",mTag[2]);
                    i.putExtra("berita",mBerita[2]);
                    i.putExtra("img",mImg[2]);
                    startActivity(i);
                }

            }
        });
    }
}

