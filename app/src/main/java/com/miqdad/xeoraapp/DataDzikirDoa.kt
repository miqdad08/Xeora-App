package com.miqdad.xeoraapp

import com.miqdad.xeoraapp.data.Artikel
import com.miqdad.xeoraapp.data.DzikirDoa

object DataDzikirDoa {

    private val descDzikirPagi = arrayOf(
        "Ayat Kursi Dibaca 1 kali",
        "Al-Ikhlas Dibaca 3 kali",
        "Al-Falaq Dibaca 3 kali",
        "An-Naas Dibaca 3 kali",
        "Dzikir Pagi 1 Dibaca 1x",
        "Dzikir Pagi 2 Dibaca 1x",
        "Dzikir Pagi 3 Dibaca 1x",
        "Dzikir Pagi 4 Dibaca 3x",
        "Dzikir Pagi 5 Dibaca 1x",
        "Dzikir Pagi 6 Dibaca 1x",
        "Dzikir Pagi 8 Dibaca 3x",
        "Dzikir Pagi 7 Dibaca 3x",
        "Dzikir Pagi 9 Dibaca 1x",
        "Dzikir Pagi 10 Dibaca 1x",
        "Dzikir Pagi 11 Dibaca 1x atau 10x sekali duduk atau 100x kali dalam sehari",
        "Dzikir Pagi 12 Dibaca 3x",
        "Dzikir Pagi 13 Dibaca 1x",
        "Dzikir Pagi 14 Dibaca 100x",
        "Dzikir Pagi 15 Dibaca 100x"
    )

    private val lafazDzikirPagi = arrayOf(
        "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِاللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ هُوَ اللَّهُ أَحَدٌ ﴿١﴾ اللَّهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ ﴿٤﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ الْفَلَقِۙ ﴿١﴾ مِنْ شَرِّ مَا خَلَقَۙ ﴿٢﴾ وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ ﴿٣﴾ وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ ﴿٤﴾ وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ ﴿٥﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ ﴿١﴾ مَلِكِ النَّاسِۙ ﴿٢﴾ اِلٰهِ النَّاسِۙ ﴿٣﴾ مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ ﴿٤﴾ الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾",
        "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَذَا الْيَوْمِ وَخَيْرَ مَا بَعْدَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَذَا الْيَوْمِ وَشَرِّ مَا بَعْدَهُ، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
        "اَللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ وَإِلَيْكَ النُّشُوْرُ",
        "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",
        "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
        "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
        "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
        "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، أَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْ",
        "أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْ",
        "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ: عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
        "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ"
    )

    private val terjemahDzikirPagi = arrayOf(
        "\"Aku berlindung kepada Allah dari godaan syaitan yang terkutuk. Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha Besar.\"",
        "\"Katakanlah: Dialah Allah Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan. Dan tidak ada seorang pun yang setara dengan Dia.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh. Dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Dan dari kejahatan orang yang dengki apabila ia dengki.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia. Dari kejahatan (bisikan) syaitan yang biasa bersembunyi. Yang membisikkan (kejahatan) ke dalam dada manusia. Dari jin dan manusia.\"",
        "\"Kami telah memasuki waktu pagi dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabbku, aku mohon kepada-Mu kebaikan di hari ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan hari ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di alam kubur.\".",
        "\"Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu petang. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).\"",
        "\"Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.\"",
        "\"Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.\"",
        "\"Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).\"",
        "\"Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.\"",
        "\"Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.\"",
        "\"Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.\"",
        "\"Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).\"",
        "\"Di waktu pagi kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.\"",
        "\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. Bagi-Nya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.\"",
        "\"Maha Suci Allah, aku memujiNya sebanyak makhluk-Nya, sejauh kerelaan-Nya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimat-Nya.\"",
        "\"Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).\"",
        "\"Maha suci Allah, aku memuji-Nya.\"",
        "\"Aku memohon ampun kepada Allah dan bertobat kepada-Nya.\""
    )

    val listDzikirPagi: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikirPagi.indices){
                val dzikir = DzikirDoa(
                    descDzikirPagi[data],
                    lafazDzikirPagi[data],
                    terjemahDzikirPagi[data]
                )
                list.add(dzikir)
            }
            return list
        }

    private val descDzikirPetang = arrayOf(
        "Ayat Kursi Dibaca 1 kali",
        "Al-Ikhlas Dibaca 3 kali",
        "Al-Falaq Dibaca 3 kali",
        "An-Naas Dibaca 3 kali",
        "Dzikir Petang 1 dibaca 1x",
        "Dzikir Petang 2 dibaca 1x",
        "Dzikir Petang 3 dibaca 1x",
        "Dzikir Petang 4 dibaca 3x",
        "Dzikir Petang 5 dibaca 1x",
        "Dzikir Petang 6 dibaca 1x",
        "Dzikir Petang 7 dibaca 3x",
        "Dzikir Petang 8 dibaca 3x",
        "Dzikir Petang 9 dibaca 1x",
        "Dzikir Petang 10 dibaca 1x",
        "Dzikir Petang 11 dibaca 1x atau 10x sekali duduk atau 100x dalam sehari",
        "Dzikir Petang 12 dibaca 3x",
        "Dzikir Petang 13 dibaca 100x",
        "Dzikir Petang 14 dibaca 100x",
    )

    private val lafazDzikirPetang = arrayOf(
        "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِاللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ هُوَ اللَّهُ أَحَدٌ ﴿١﴾ اللَّهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ ﴿٤﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ الْفَلَقِۙ ﴿١﴾ مِنْ شَرِّ مَا خَلَقَۙ ﴿٢﴾ وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ ﴿٣﴾ وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ ﴿٤﴾ وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ ﴿٥﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ ﴿١﴾ مَلِكِ النَّاسِۙ ﴿٢﴾ اِلٰهِ النَّاسِۙ ﴿٣﴾ مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ ﴿٤﴾ الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾",
        "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
        "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ",
        "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِ",
        "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
        "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
        "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
        "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا",
        "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ",
        "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
        "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ"
    )

    private val terjemahDzikirPetang = arrayOf(
        "\"Aku berlindung kepada Allah dari godaan syaitan yang terkutuk. Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha Besar.\"",
        "\"Katakanlah: Dialah Allah Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan. Dan tidak ada seorang pun yang setara dengan Dia.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh. Dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Dan dari kejahatan orang yang dengki apabila ia dengki.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia. Dari kejahatan (bisikan) syaitan yang biasa bersembunyi. Yang membisikkan (kejahatan) ke dalam dada manusia. Dari jin dan manusia.\"",
        "\"Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.\"",
        "\"Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk).\"",
        "\"Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.\"",
        "\"Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.\"",
        "\"Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).\"",
        "\"Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.\"",
        "\"Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.\"",
        "\"Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.\"",
        "\"Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).\"",
        "\"Di waktu sore kami berada diatas fitrah agama Islam, kalimat ikhlas, agama Nabi kita Muhammad صلي الله عليه وسلم dan agama ayah kami, Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang yang musyrik.\"",
        "\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. Bagi-Nya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.\"",
        "\"Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.\"",
        "\"Maha suci Allah, aku memuji-Nya.\"",
        "\"Aku memohon ampun kepada Allah dan bertobat kepada-Nya.\""
    )

    val listDzikirPetang: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikirPetang.indices){
                val dzikir = DzikirDoa(
                    descDzikirPetang[data],
                    lafazDzikirPetang[data],
                    terjemahDzikirPetang[data]
                )
                list.add(dzikir)
            }
            return list
        }


    private val descDzikir = arrayOf(
        "Tahlil",
        "Takbir",
        "Tahmid",
        "Tasbih",
        "Hauqolah",
        "Istighfar",
        "Shalawat"
    )

    private val lafazDzikir = arrayOf(
        "Pertama:\n لا إله إلا الله\nKedua:\nلَا إِلَـهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُلَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "Umum:\nالله ُأَكبَرُ\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\nالله أكبر، الله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nAbdullah bin Mas'ud:\nالله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nIbnu Abbas:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ ، و للهِ الحَمدُ ، الله ُأَكبَرُ و أَجَلُّ ، الله ُأَكبَرُ عَلَى مَا هَدَانَا\nSalman:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ  كَبِيراً",
        "Pertama:\nالحمد لله\nKedua:\nالحمد لله رب العالمين\nKetiga:\nالحمد لله حمدا كثيرا طيبا مباركا فيه\nKeempat:\nربنا لك الحد\nKelima:\nاللهم ربنا لك الحمد",
        "Pertama:\nسُبْحَانَ اللهِ\nKedua:\nسُبْحَانَ رَبِّىَ الْعَظِيمِ\nKetiga:\nسُبُّوحٌ قُدُّوسٌ رَبُّ الْمَلاَئِكَةِ وَالرُّوحِ\nKeempat:\nسُبْحَانَ ذِي الجَبَرُوْتِ وَالملَكُوْتِ وَالكِبْرِيَاء ِوَالعَظَمَةِ\nKelima:\nسُبْحَانَ رَبِّىَ الأَعْلَ",
        "لاحول ولا قوة الا بالله",
        "Pertama:\nأَسْتَغْفِرُ اللهَ\nKedua:\nأَسْتَغْفِرُ اللهَ وَأَتُوبُ إِلَيْهِ\nKetiga:\nأَسْتَغْفِرُ اللَّهَ الْعَظِيمَ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْحَيَّ الْقَيُّومَ وَأَتُوبُ إِلَيْه\nKeempat:\nرَبِّ اغْفِرْ لِى وَتُبْ عَلَىَّ إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ",
        "اللَّهُّم صلِّ على محمدٍ وعلى آل محمد كما صلَّيْتَ على إبراهيم وعلى آل إبراهيم إنك حميد مجيد، اللَّهُّم بارِكْ على محمدٍ وعلى آل محمد كما باركتَ على إبراهيم وعلى آل إبراهيم إنك حميدٌ مجيد"
    )

    private val terjemahDzikir = arrayOf(
        "Pertama:\n\"Tidak ada ilah yang berhak disembah selain Allah semata.\"\n\nKedua:\n\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah segala kerajaan dan pujian. Dia lah yang berkuasa atas segala sesuatu.\"",
        "Umum: \n\"Allah Maha Besar\"\n\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nAbdullah bin Mas'ud:\n\"Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nIbnu Abbas:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, dan Allah lah segala pujian, Allah Maha Besar dan Maha Mulia, Allah Maha Besar atas petunjuk yang diberikannya pada kita.\"\n\nSalman:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar\"",
        "Pertama:\n\"Segala puji bagi Allah\"\n\nKedua:\n\"Segala puji bagi Allah, Tuhan seluruh alam.\"\n\nKetiga:\n\"Segala puji bagi Allah, pujian yang berlimpah, baik dan berkah.\"\n\nKeempat:\n\"Wahai Rabb kami, segala puji bagi-Mu.\"\n\nKelima:\n\"Ya Allah, Rabb kami, segala puji bagi-Mu.\"",
        "Pertama:\n\"Maha Suci Allah\"\n\nKedua:\n\"Maha Suci Allah Yang Maha Agung\"\n\nKetiga:\n\"Maha Suci Allah Rabb para Malaikat dan Ar Ruuh (Jibril)\"\n\nKeempat:\n\"Maha Suci Allah Yang mempunyai keperkasaan dan kerajaan (penuh) serta kesombongan dan keagungan\"\n\nKelima:\n\"Maha Suci Rabbku Yang Maha Tinggi\"",
        "\"Tidak ada daya dan upaya kecuali dengan pertolongan Allah\"",
        "Pertama:\n\"Aku memohon ampun kepada Allah\"\n\nKedua:\n\"Aku memohon maghiroh Allah dan aku bertaubat kepada-Nya\"\n\nKetiga:\n\"Aku memohon ampunan kepada Allah yang tidak ada sesembahan yang berhak disembah kecuali Dia, Yang Maha Hidup dan Maha Tegak dan aku bertaubat kepada-Nya\"\n\nKeempat:\n\"Ya Rabbku ampunilah aku dan bimbinglah aku untuk bertaubat (atau terimalah tabatku) sesungguhnya Engkau adalah Maha Penerima Taubat dan Maha Rahmat\"",
        "\"Ya Allah, semoga shalawat tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. Ya Allah, semoga berkah tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia.\""
    )

    val listDzikir: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikir.indices){
                val dzikir = DzikirDoa(
                    descDzikir[data],
                    lafazDzikir[data],
                    terjemahDzikir[data]
                )
                list.add(dzikir)
            }
            return list
        }


    private val hadistTitle = arrayOf(
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",
        "Hadist Imaniat",

        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",
        "Hadist Ibaadaat",

        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",
        "Hadist Muamalaat",

        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",
        "Hadist Muasyaraat",

        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
        "Hadits Akhlaqiyaat",
    )

    private val hadistArab = arrayOf(
        //Hadits Imaniat
        "الَدِّيْنُ يُسرٌ",
        "إِنمَا الأعْمَالُ باِلنِّيَةِ",
        "لاَ تَقُومُ السَّاعَةُ عَلَى أَحَدٍ يَقُولُ : اَللهُ اَللهُ",
        "الَدُّعَاءُ مُخُّ اْلِعبَادَةِ",
        "اِتَّقِ اللَّهَ حَيْثُ مَا كُنْتَ",
        "لدَّالُّ عَلَى الْخَيْرِ كَفَاعِلِهِا",
        "مَنْ تَشَبَّهَ بِقَوْمٍ فَهُوَ مِنْهُمْ",
        "مَنْ بَنىَ لِلّهِ مَسْجِدًا بَنىَ اللهُ لَهُ بَيْةً فِي الجَنَّةِ",

        //Hadist ibaadaat
        "مِفْتَاحُ الْجَنَّةِ الصَّلاَةُ",
        "الطُّهُورُ شَطْرُ الإِيمَانِ\n" + "\n",
        "اَلدُّعَاءُ سِلاَحُ الْمُؤْمِنِ",
        "الْكَلِمَةُ الطَّيِّبَةُ صَدَقَةٌ",
        "خَيْرُكُمْ مَنْ تَعَلَّمَ اْلقُرْآنَ وَعَلَّمَهُ",
        "أَنْفِقْ يَا ابْنَ آدَمَ يُنْفَقْ عَلَيْكَ",
        "مَنْ حَمَلَ عَلَيْنَا السِّلاَحَ فَلَيْسَ مِنَّا\n" + "\n",
        "مَنْ عَزَّى مُصَابًا فَلَهُ مِثْلُ أَجْرِهِ",

        //Hadits Muamalaat
        "مَنْ غَشَّنا فَلَيْسَ مِنَّا",
        "مَنِ انْتَهَبَ نُهْبَةً فَلَيْسَ مِنَّا",
        "لَعَنَ رَسُولُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ الرَّاشِيَ وَالْمُرْتَشِيَ",
        "الْمَرْءُ مَعَ مَنْ أَحَبَّ",
        "سِبَابُ الْمُسْلِمِ فُسُوقٌ ، وَقِتَالُهُ كُفْرٌ",
        "أحَبُّ الْبِلاَدِ إِلَى اللهِ مَسَاجِدُهَا",
        "بَلِّـغُوْا عَنِّي وَلَوْ آيَةً",
        "اَلأَنَاةُ مِنَ اللَّهِ وَالْعَجَلَةُ مِنَ الشَّيْطَانِ",

        //Hadits Muasyaraat
        "الَسَّلامُ قَبْلَ الكَلاَمِ",
        "الْجَنَّةُ تَحْتَ أقْدامِ الأُمَّهَاتِ",
        "رِضَى الرَّبِّ في رِضَى الْوَالِدِ",
        "لايَدْخُلُ الْجَنَّةَ قَاطِعٌ",
        "مَنْ سَتَرَ مُسْلِمًا سَتَرَهُ اللَّهُ يوم القيامة",
        "اَلْيَدُ اْلعُلْياَ خَيْرٌ مِنَ اْليَدِ السُّفْلَى",
        "لاَ يَدْخُلُ الجنَّةَ مَنْ لاَ يَأمَنُ جَارُهُ بَوَائِقَهُ",
        "لايُلْدَغُ الْمُؤْمِنُ مِنْ جُحْرٍ مَرَّتَيْنِ",

        //Hadits Akhlaqiyaat
        "علَيْكُمْ باِلصِّدْقِ",
        "اِجْتَنِبُواالْغَضَبَ",
        "لاَ يَدْخُلُ الجَنّةَ خَبٌّ وَلاَ بَخِيْلٌ وَلاَ مَنَّانٌ\n" + "\n",
        "لاَ يَدْخُلُ الْجَنَّةَ نَمَّامٌ",
        "لاَ يَرْحَمُ الله ُمَنْ لاَ يَرْحَمُ النَّاسَ",
        "الدُّنْيَا سِجْنُ الْمُؤْمِنِ وَجَنَّةُ الْكَافِرِ",
        "اَلْمُسْلِمُ مَنْ سَلِمَ الْمُسْلَمُوْنَ مِنْ لِسَانِهِ وَيَدِهِ",
        "الصُّبْحَةُ تَمْنَعُ الرِّزْقَ",
    )


    private val hadistArti = arrayOf(
        //Hadits Imaniat
        "Artinya: \"Agama itu mudah.\"",
        "Artinya: \"Setiap amal sesuai dengan niatnya.\"",
        "Artinya: \"Tidak akan datang kiamat selama masih ada yang mengucap Allah… Allah…\"",
        "Artinya: \"Doa adalah inti ibadah.\"",
        "Artinya: \"Takutlah kepada Allah dimana saja kamu berada.\"",
        "Artinya: \"Orang yang mengajak kebaikan mendapat pahala yang sama dengan orang yang diajaknya.\"",
        "Artinya: \"Barangsiapa menyerupai suatu kaum, maka ia akan digolongkan sebagai kaum tersebut.\"",
        "Artinya: \"Barangsiapa membangun masjid karena Allah, maka Allah akan bangunkan rumah baginya di dalam surga.\"",

        //Hadist ibaadaat
        "Artinya: \"Kunci surga adalah shalat.\"",
        "Artinya: \"Kebersihan adalah sebagian iman.\"",
        "Artinya: \"Doa adalah senjata orang beriman.\"",
        "Artinya: \"Berkata yang baik adalah sedekah.\"",
        "Artinya: \"Sebaik-baik orang di antara kamu adalah orang yang belajar Al Qur’an dan mengajarkannya.\"",
        "Artinya: \"Berinfaqlah wahai anak Adam maka engkau akan dibalas.\"",
        "Artinya: \"Barangsiapa menakut-nakuti dengan senjata kepada kami maka bukan golongan kami.\"",
        "Artinya: \"Barangsiapa menghibur orang yang tertimpa musibah, maka baginya pahala seperti orang yang tertimpa musibah.\"",

        //Hadits Muamalaat
        "Artinya: \"Siapa yang curang bukan golongan kami.\"",
        "Artinya: \"Siapa merampas milik orang bukan golongan kami.\"",
        "Artinya: \"Laknat Rasulullah (SAW) kepada orang yang menyogok dan yang disogok.\"",
        "Artinya: \"Seseorang akan bersama siapa yang dicintainya.\"",
        "Artinya: \"Mencaci seorang muslim adalah dosa dan memeranginya adalah kufur.\"",
        "Artinya: \"Tempat yang paling dicintai Allah di muka bumi adalah masjid-masjidnya.\"",
        "Artinya: \"Sampaikan dariku walau satu ayat.\"",
        "Artinya: \"Kehati-hatian datangnya dari Allah dan ketergesa-gesaan datangnya dari setan.\"",

        //Hadits Muasyaraat
        "Artinya: \"Ucap salam sebelum bicara.\"",
        "Artinya: \"Surga itu berada di bawah telapak kaki ibu.\"",
        "Artinya: \"Ridha Allah terletak di dalam ridha orangtua.\"",
        "Artinya: \"Tidak akan masuk surga pemutus tali persaudaraan.\"",
        "Artinya: \"Siapa menutupi aib seorang muslim, maka Allah akan menutupi aibnya pada hari kiamat.\"",
        "Artinya: \"Tangan di atas lebih baik daripada tangan di bawah.\"",
        "Artinya: \"Tidak masuk surga orang yang tetangganya tidak merasa aman dari gangguannya.\"",
        "Artinya: \"Orang beriman tidak akan tersengat dua kali di lubang yang sama.\"",

        //Hadits Akhlaqiyaat
        "Artinya: \"Hendaknya kalian berlaku jujur.\"",
        "Artinya: \"Jauhilah sifat pemarah.\"",
        "Artinya: \"Tidak akan masuk surga orang yang suka menipu, pelit dan mengungkit pemberian.\"",
        "Artinya: \"Tidak akan masuk surga penghasut.\"",
        "Artinya: \"Tidak disayang Allah orang yang tidak sayang kepada manusia.\"",
        "Artinya: \"Dunia adalah penjara bagi orang beriman dan surga bagi orang kafir.\"",
        "Artinya: \"Muslim sejati adalah orang yang selamatkan muslim lainnya dari keburukan lisannya dan kejahatan tangannya.\"",
        "Artinya: \"Tidur di waktu pagi menjadi penghalang rezeki.\"",
    )

    val listHadist: ArrayList<DzikirDoa>
    get() {
        val list = arrayListOf<DzikirDoa>()
        for (data in hadistArab.indices) {
            val hadist = DzikirDoa(
                hadistTitle[data],
                hadistArab[data],
                hadistArti[data]
            )
            list.add(hadist)
        }
        return list

    }

    private val doaTitle = arrayOf(
        "1. Doa Sebelum Tidur",
        "2. Doa Bangun Tidur",
        "3. Doa Masuk Kamar Mandi",
        "4. Doa Keluar Kamar Mandi\n",
        "5. Doa Ketika Bercermin",
        "6. Doa Keluar Rumah",
        "7. Doa Masuk Rumah",
        "8. Doa Memohon Ilmu Yang Bermanfaat\n",
        "9. Doa Sebelum Belajar\n",
        "10. Doa Sesudah Belajar\n"
    )

    private val doaArab = arrayOf(
        "بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتُ",
        "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ",
        "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ",
        "غُفْرَانَكَْ",
        "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ فَحَسِّـنْ خُلُقِىْ\n",
        "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله",
        "اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبّنَا تَوَكَّلْنَا\n",
        "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاً\n",
        "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا\n",
        "اَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ\n"
    )

    private val artiDoa = arrayOf(
        "Artinya: Dengan menyebut nama Allah, aku hidup dan aku mati",
        "Artinya: Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan",
        "Artinya: \"Ya Allah, aku berlindung pada-Mu dari godaan setan laki-laki dan setan perempuan",
        "Artinya: \"Dengan mengharap ampunanMu,",
        "Artinya: \"Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku\"\n",
        "Artinya: \"Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan pertolongan Allah.\"\n",
        "Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk, dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakkal\"\n",
        "Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu ilmu yang berguna, rezki yang baik dan amal yang baik Diterima. (H.R. Ibnu Majah)\"\n",
        "Artinya: \"Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman\"\n",
        "Artinya: \"Ya Allah, sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam.\"\n"
    )

    val listDoa: ArrayList<DzikirDoa>
    get() {
        val list = arrayListOf<DzikirDoa>()
        for (data in doaTitle.indices){
            val doa = DzikirDoa(
            doaTitle[data],
            doaArab[data],
            artiDoa[data]
            )
            list.add(doa)
        }
        return list
    }

    private val titleArtikel = arrayOf(
        "IDN Relawan",
        "Membuat IOT",
        "IDN Mengajar"
    )




    private val descArtikel = arrayOf(
        "Salah satu cara kita mengetahui kadar keimanan kita adalah dengan melihat apakah kita suka bersedekah atau tidak. Bersedekah tidak harus banyak dan tidak harus dengan uang, sehingga tidak kaya atau tidak punya uang bukanlah menjadi alasan kita untuk tidak bersedekah. Bersedekah dengan uang Rp 10.000, Rp 20.000, atau Rp 50.000 itu sudah cukup. Atau bersedekah dengan beras yang kita miliki sebanyak satu kilo atau dua kilo, ini pun sudah cukup. Sedekah adalah bukti keimanan. Bukti keimanan kita terhadap hari akhir, bahwasanya kelak di hari kiamat kita akan mendapat balasan pahala dari Allah, meskipun di dunia kita tidak mendapatkan apa-apa. Kita lelah bekerja mencari uang dan harta, lalu uang tersebut kita berikan tanpa kompensasi dan kita hanya berharap balasan di hari kiamat kelak.",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."

    )

    private val imgArtikel = intArrayOf(
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


}