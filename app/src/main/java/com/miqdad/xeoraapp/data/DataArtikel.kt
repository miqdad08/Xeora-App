package com.miqdad.xeoraapp.data

import com.miqdad.xeoraapp.R

object DataArtikel {


    private val titleArtikel = arrayOf(
        "IDN Relawan",
        "Membuat IOT",
    )




   private val descArtikel = arrayOf(
       "Salah satu cara kita mengetahui kadar keimanan kita adalah dengan melihat apakah kita suka bersedekah atau tidak. Bersedekah tidak harus banyak dan tidak harus dengan uang, sehingga tidak kaya atau tidak punya uang bukanlah menjadi alasan kita untuk tidak bersedekah. Bersedekah dengan uang Rp 10.000, Rp 20.000, atau Rp 50.000 itu sudah cukup. Atau bersedekah dengan beras yang kita miliki sebanyak satu kilo atau dua kilo, ini pun sudah cukup. Sedekah adalah bukti keimanan. Bukti keimanan kita terhadap hari akhir, bahwasanya kelak di hari kiamat kita akan mendapat balasan pahala dari Allah, meskipun di dunia kita tidak mendapatkan apa-apa. Kita lelah bekerja mencari uang dan harta, lalu uang tersebut kita berikan tanpa kompensasi dan kita hanya berharap balasan di hari kiamat kelak.",
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
    )

    private val imgArtikel = intArrayOf(
        R.drawable.tobat,
        R.drawable.img,
        R.drawable.bgdoa

    )


    val listArtikel: ArrayList<Artikel>
        get() {
            val list = arrayListOf<Artikel>()
            for (data in titleArtikel.indices){
                val dzikir = Artikel(
                    titleArtikel = titleArtikel[data],
                    descArtikel = descArtikel[data],
                    imageArtikel = imgArtikel[data]
                )
                list.add(dzikir)
            }
            return list
        }

    val titleDetailArtikel = arrayOf(
        "Tobat Lah Sebelum Terlambat",
        "Tata Cara Shalat Jenazah (Menyalatkan Mayit)",
        "Proses Masuk dan Berkembangnya Agama Islam di Indonesia",
        "Panduan Praktis Tata Cara Wudhu"
    )
    val descDetailArtikel = arrayOf(
        "Allah subhanahu wa ta’ala berfirman:\nيَا أَيُّهَا الَّذِينَ آمَنُوا تُوبُوا إِلَى اللَّهِ تَوْبَةً نَّصُوحاً عَسَى رَبُّكُمْ أَن يُكَفِّرَ عَنكُمْ سَيِّئَاتِكُمْ وَيُدْخِلَكُمْ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ يَوْمَ لَا يُخْزِي اللَّهُ النَّبِيَّ وَالَّذِينَ آمَنُوا مَعَهُ نُورُهُمْ يَسْعَى بَيْنَ أَيْدِيهِمْ وَبِأَيْمَانِهِمْ يَقُولُونَ رَبَّنَا أَتْمِمْ لَنَا نُورَنَا وَاغْفِرْ لَنَا إِنَّكَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ\n“Hai orang-orang yang beriman, bertaubatlah kepada Allah dengan taubatan nasuhaa (taubat yang semurni-murninya). Mudah-mudahan Robb-mu akan menutupi kesalahan-kesalahanmu dan memasukkanmu ke dalam jannah (surga) yang mengalir di bawahnya sungai-sungai, pada hari ketika Allah tidak menghinakan nabi dan orang-orang mukmin yang bersama dia; sedang cahaya mereka memancar di hadapan dan di sebelah kanan mereka, sambil mereka mengatakan: ‘Ya Robb kami, sempurnakanlah bagi kami cahaya kami dan ampunilah Kami; Sesungguhnya Engkau Maha Kuasa atas segala sesuatu.'” (Qs. At Tahriim: 8)",
        "Urutan tata cara menyalatkan mayit : \n1.Melakukan takbiratul ihram (takbir pertama).\n2.Tanpa perlu membaca istiftah langsung berta’aawudz (أَعُوّْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ) dan membaca basmalah.\n3.Diikuti dengan bacaan Al-Fatihah\n4.Melakukan takbir kedua dan diikuti dengan ucapan shalawat kepada Nabi shallallaahu ‘alaihi wa sallam semisal shalawat yang dibaca pada tasyahud akhir dalam shalat fardhu\n5.Melakukan takbir ketiga dan mendoakan si mayit dengan doa-doa yang terdapat dalam hadits-hadits yang shahih\n6.Selepas berdoa kemudian.melakukan takbir terakhir (takbir keempat), berhenti sejenak, lalu salam ke arah kanan dengan satu kali salam",
        "Agama Islam pertama kali lahir di Mekkah, Arab Saudi. Para pemeluknya menyebarkan agama Islam lewat berbagai jalur. Salah satu teori menyebutkan bahwa agama Islam di Indonesia masuk lewat jalur perdagangan. Ketika Islam menyebarkan agama dan kebudayaannya ke Indonesia, prosesnya cenderung berjalan dengan damai. Karena itu, raja hingga rakyat biasa menerimanya dengan hangat.\nSelain perdagangan, ada saluran lain yang menyebabkan agama Islam dapat masuk dan berkembang di Indonesia. Saluran tersebut di antaranya adalah saluran perkawinan, pendidikan, dan seni budaya.\nAda teori-teori yang menyebutkan tentang asal penyebar Islam di Indonesia, yaitu teori Gujarat, teori Arab, dan teori Persia.\nTeori Gujarat ini diajukan oleh kalangan sejarawan Belanda, seperti Jan Pijnappel, Snouck Hurgronje, dan Jean Piere. Menurut teori ini, penyebar Islam di Indonesia berasal dari Gujarat (India) antara abad ke-7 hingga abad ke-13 M. Kalangan yang berperan khususnya adalah para pedagang. Sejak abad ke-7, mereka telah memeluk Islam dan di tengah kegiatannya berdagang, mereka turut mengenalkan agama Islam, termasuk di Indonesia.\nSementara itu, teori Arab diajukan oleh Jacob Cornelis van Leur dan Buya Hamka. Teori ini menyebutkan bahwa pengaruh Islam dibawa langsung oleh pedagang Arab sekitar abad ke-7. Teori Arab didukung dengan adanya pemukiman Islam di Barus, pesisir barat Sumatera, di abad ke-7. Ada pula nisan pada makam wanita di Gresik, Jawa Timur, yang ditulis dengan huruf Arab bergaya Kufi.",
        "Dari hadits yang mulia ini dan beberapa hadits yang lain dapat kita simpulkan tata cara wudhu Nabi shallallahu ‘alaihi was4 sallam secara ringkas sebagai berikut\n1.Berniat wudhu (dalam hati) untuk menghilangkan hadats\n2.Mengucapkan basmalah (bacaan bismillah).\n3. Membasuh dua telapak tangan sebanyak 3 kali.\n4.Mengambil air dengan tangan kanan kemudian memasukkannya ke dalam mulut dan hidung untuk berkumur-kumur dan istinsyaq (memasukkan air dalam hidung). Kemudian beristintsar (mengeluarkan air dari hidung) dengan tangan kiri sebanyak 3 kali\n5.Membasuh seluruh wajah dan menyela-nyelai jenggot sebanyak 3 kali.\n6.Membasuh tangan kanan hingga siku bersamaan dengan menyela-nyelai jemari sebanyak 3 kali kemudian dilanjutkan dengan yang kiri.\n7.Menyapu seluruh kepala dengan cara mengusap dari depan ditarik ke belakang, lalu ditarik lagi ke depan, dilakukan sebanyak 1 kali, dilanjutkan menyapu bagian luar dan dalam telinga sebanyak 1 kali.\n8. Membasuh kaki kanan hingga mata kaki bersamaan dengan menyela-nyelai jemari sebanyak 3 kali kemudian dilanjutkan dengan kaki kiri",
    )
    val imageDetailArtikel = intArrayOf(
        R.drawable.tobat,
        R.drawable.img,
        R.drawable.news2,
        R.drawable.img_2
    )

}