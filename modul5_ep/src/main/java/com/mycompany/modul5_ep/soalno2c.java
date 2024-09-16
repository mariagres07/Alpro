package com.mycompany.modul5_ep;

import java.util.Scanner;

public class soalno2c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nama;
        String alamat;
        int tanggal;
        int bulan;
        
        System.out.print("Nama Anda = ");
        nama = in.next();
        System.out.print("Alamat Anda = ");
        alamat = in.next();
        System.out.print("Tanggal lahir Anda = ");
        tanggal = in.nextInt();
        System.out.print("Bulan lahir Anda = ");
        bulan = in.nextInt();
        
        if (bulan == 1) {
            if (tanggal >= 1 && tanggal <= 19) {
                System.out.println("Zodiak Anda = Capricorn ");
                System.out.println("Sifat Anda = Capricorn memiliki sifat rajin, bertanggung jawab, "
                        + "pekerja keras, sabar, tekun, disiplin diri dan dedikasi yang kuat. "
                        + "Capricorn memiliki kendali diri yang bagus sehingga dianggap dewasa dan teladan yang baik.");
            } else if (tanggal >= 20 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Aquarius");
                System.out.println("Sifat Anda = Aquarius memiliki sifat eksentrik, soliter, cerdas, "
                        + "inovatif, kreatif, dan progresif. Ia zodiak pemberontak yang tak suka diatur "
                        + "dan cenderung mengikuti kata hati. Ia juga zodiak paling manusiawi dan berpikiran cerdas.");
            }
        }if (bulan == 2) {
            if (tanggal >= 1 && tanggal <= 18) {
                System.out.println("Zodiak Anda = Aquarius");
                System.out.println("Sifat Anda = Aquarius memiliki sifat eksentrik, soliter, cerdas, "
                        + "inovatif, kreatif, dan progresif. Ia zodiak pemberontak yang tak suka diatur "
                        + "dan cenderung mengikuti kata hati. Ia juga zodiak paling manusiawi dan berpikiran cerdas.");
            } else if (tanggal >= 19 && tanggal <= 29) {
                System.out.println("Zodiak Anda = Pisces");
                System.out.println("Sifat Anda = Pisces adalah zodiak yang bersifat paling intuitif, sensitif, "
                        + "dan berempati tinggi terhadap banyak orang. Pisces bukan tipe orang yang suka menonjol "
                        + "atau mendominasi, ia hidup mengikuti arus dan penyabar.");
            }
        }if (bulan == 3) {
            if (tanggal >= 1 && tanggal <=20 ) {
                System.out.println("Zodiak Anda = Pisces");
                System.out.println("Sifat Anda = Pisces adalah zodiak yang bersifat paling intuitif, sensitif, "
                        + "dan berempati tinggi terhadap banyak orang. Pisces bukan tipe orang yang suka menonjol "
                        + "atau mendominasi, ia hidup mengikuti arus dan penyabar.");
            } else if (tanggal >= 21 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Aries");
                System.out.println("Sifat Anda = Aries suka menjadi nomor satu, ia punya sifat kompetitif yang kuat, "
                        + "ambisius, aktif, energik dan tidak sabaran. Aries berani dan menyukai tantangan, "
                        + "bahkan tidak mudah menyerah meski menghadapi kegagalan. Mentalnya kuat.");
            }   
        }if(bulan == 4) {
            if (tanggal >= 1 && tanggal <= 19) {
                System.out.println("Zodiak Anda = Aries");
                System.out.println("Sifat Anda = Aries suka menjadi nomor satu, ia punya sifat kompetitif yang kuat, "
                        + "ambisius, aktif, energik dan tidak sabaran. Aries berani dan menyukai tantangan, "
                        + "bahkan tidak mudah menyerah meski menghadapi kegagalan. Mentalnya kuat.");
            } else if (tanggal >= 20 && tanggal <= 30) {
                System.out.println("Zodiak Anda = Taurus");
                System.out.println("Sifat Anda = Taurus bersifat tenang, serius, bertanggung jawab, "
                        + "dan berpendirian kuat. Ia memang keras kepala, tapi memiliki nilai-nilai hidup yang lurus, "
                        + "mengikuti aturan dan menyukai kehidupan mewah, berkelimpahan dan sejahtera.");
            }
        } if(bulan == 5) {
            if (tanggal >= 1 && tanggal <= 20) {
                System.out.println("Zodiak Anda = Taurus");
                System.out.println("Sifat Anda = Taurus bersifat tenang, serius, bertanggung jawab, "
                        + "dan berpendirian kuat. Ia memang keras kepala, tapi memiliki nilai-nilai hidup yang lurus, "
                        + "mengikuti aturan dan menyukai kehidupan mewah, berkelimpahan dan sejahtera.");
            } else if (tanggal >= 21 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Gemini");
                System.out.println("Sifat Anda = Gemini punya sifat suka berpesta, spontanitas tinggi, "
                        + "rasa ingin tahu yang besar, menikmati interaksi sosial yang luas, komunikatif, "
                        + "aktif, humoris, ceria dan bersemangat. Ia salah satu zodiak yang ekstrovert.");
            }
        }if(bulan == 6) {
            if (tanggal >= 1 && tanggal <= 20) {
                System.out.println("Zodiak Anda = Gemini");
                System.out.println("Sifat Anda = Gemini punya sifat suka berpesta, spontanitas tinggi, "
                        + "rasa ingin tahu yang besar, menikmati interaksi sosial yang luas, komunikatif, "
                        + "aktif, humoris, ceria dan bersemangat. Ia salah satu zodiak yang ekstrovert.");
            } else if (tanggal >= 21 && tanggal <= 30) {
                System.out.println("Zodiak Anda = Cancer");
                System.out.println("Sifat Anda = Cancer tipe zodiak yang intuitif dan memiliki kemampuan "
                        + "psikis yang kuat. Ia memercayai firasatnya ketimbang kata-kata orang lain. "
                        + "Ia lembut, sensitif, ramah, baik hati dan peduli terhadap orang lain.");
            }
        }if(bulan == 7) {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda = Cancer");
                System.out.println("Sifat Anda = Cancer tipe zodiak yang intuitif dan memiliki kemampuan "
                        + "psikis yang kuat. Ia memercayai firasatnya ketimbang kata-kata orang lain. "
                        + "Ia lembut, sensitif, ramah, baik hati dan peduli terhadap orang lain.");
            } else if (tanggal >= 23 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Leo");
                System.out.println("Sifat Anda = Leo sosok yang menyenangkan, spontanitas tinggi, "
                        + "ceria, penuh semangat, romantis dan sangat dramatis. Ia memiliki energi "
                        + "berapi-api dan cukup dominan dalam berbagai kepentingan. Ia orang yang menyukai perhatian.");
            }
        }if(bulan == 8) {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda = Leo");
                System.out.println("Sifat Anda = Leo sosok yang menyenangkan, spontanitas tinggi, "
                        + "ceria, penuh semangat, romantis dan sangat dramatis. Ia memiliki energi "
                        + "berapi-api dan cukup dominan dalam berbagai kepentingan. Ia orang yang menyukai perhatian.");
            } else if (tanggal >= 23 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Virgo");
                System.out.println("Sifat Anda = Virgo orang yang penuh dedikasi, pekerja keras dan perfeksionis. "
                        + "Ia tampak serius dan kaku dari luar tapi sebenarnya sangat penyayang dan suka "
                        + "membantu meringankan beban orang lain yang ia kenal.");
            }
        }if(bulan == 9) {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda = Virgo");
                System.out.println("Sifat Anda = Virgo orang yang penuh dedikasi, pekerja keras dan perfeksionis. "
                        + "Ia tampak serius dan kaku dari luar tapi sebenarnya sangat penyayang dan suka "
                        + "membantu meringankan beban orang lain yang ia kenal.");
            } else if (tanggal >= 23 && tanggal <= 30) {
                System.out.println("Zodiak Anda = Libra");
                System.out.println("Sifat Anda = Libra memiliki sifat damai, netral, harmonis dan selalu "
                        + "mencari keseimbangan dalam segala aspek kehidupan. Ia tidak terlalu suka jadi "
                        + "pusat perhatian tapi juga benci diabaikan. Ia sederhana dan sosok yang cukup penyabar.");
            }
        }if(bulan == 10) {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda = Libra");
                System.out.println("Sifat Anda = Libra memiliki sifat damai, netral, harmonis dan selalu "
                        + "mencari keseimbangan dalam segala aspek kehidupan. Ia tidak terlalu suka jadi "
                        + "pusat perhatian tapi juga benci diabaikan. Ia sederhana dan sosok yang cukup penyabar.");
            } else if (tanggal >= 23 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Scorpio");
                System.out.println("Sifat Anda = Scorpio sulit dipahami dan misterius. "
                        + "Ia analitis, cerdas dan pengamat yang baik meski tertutup. "
                        + "Ia cenderung memendam sendiri perasaannya tapi cukup mudah beradaptasi "
                        + "dengan lingkungan sekitarnya.");
            }
        }if(bulan == 11) {
            if (tanggal >= 1 && tanggal <= 21) {
                System.out.println("Zodiak Anda = Scorpio");
                System.out.println("Sifat Anda = Scorpio sulit dipahami dan misterius. "
                        + "Ia analitis, cerdas dan pengamat yang baik meski tertutup. "
                        + "Ia cenderung memendam sendiri perasaannya tapi cukup mudah beradaptasi "
                        + "dengan lingkungan sekitarnya.");
            } else if (tanggal >= 22 && tanggal <= 30) {
                System.out.println("Zodiak Anda = Sagitarius");
                System.out.println("Sifat Anda = Sagitarius tipe orang yang menyukai petualangan, "
                        + "tantangan dan berani mengambil risiko. Ia hidup demi mencari kebahagiaan. "
                        + "Ia jujur, santai dan intelektual. Ia humoris, optimis dan santai menjalani hidup.");
            }
        }if(bulan == 12) {
            if (tanggal >= 1 && tanggal <= 21) {
                System.out.println("Zodiak Anda = Sagitarius");
                System.out.println("Sifat Anda = Sagitarius tipe orang yang menyukai petualangan, "
                        + "tantangan dan berani mengambil risiko. Ia hidup demi mencari kebahagiaan. "
                        + "Ia jujur, santai dan intelektual. Ia humoris, optimis dan santai menjalani hidup.");
            } else if (tanggal >= 22 && tanggal <= 31) {
                System.out.println("Zodiak Anda = Capricorn");
                System.out.println("Sifat Anda = Capricorn memiliki sifat rajin, bertanggung jawab, "
                        + "pekerja keras, sabar, tekun, disiplin diri dan dedikasi yang kuat. "
                        + "Capricorn memiliki kendali diri yang bagus sehingga dianggap dewasa dan teladan yang baik.");
            }
        }
    }
}
