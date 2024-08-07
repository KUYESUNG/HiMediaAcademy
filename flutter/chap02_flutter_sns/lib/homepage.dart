import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import 'feedlist.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    final List<String> images = [
      "https://mblogthumb-phinf.pstatic.net/MjAyMzAxMTRfMjAz/MDAxNjczNjc4MDQwOTQx.9rDmBy0Op1KxDzRS3aMLrarvkB3OERcMmnZ0zHH5Oo8g.beI30adbPBQZWQVp3L0aBE38B3yyPJsmUTMc4Stxsx0g.JPEG.yurim5638/IMG_6022.JPG?type=w800",
      "https://mblogthumb-phinf.pstatic.net/MjAyMDA4MDZfMTIg/MDAxNTk2NjkwNjY5OTM0.6ESYhF5_BT3wtos4zBrAbh58xrpbVCoxYm0V_7D-UGIg.nTGkJFqxOCt3BIb-SCscWMWY5IkfUE-Ejwml0xAdZ3Ig.PNG.goms1101/B2C1B4EB.png?type=w800",
      "https://blog.kakaocdn.net/dn/bEBCGu/btq4BxAm6MX/h2kwUkbxW6BDvoJNKHgnr1/img.jpg",
      "https://cdn2.colley.kr/item_383431_1_0_title_0.jpeg",
      "https://p16-capcut-sign-va.ibyteimg.com/tos-alisg-v-643f9f/o8NWEXNpzCUOAArFcGBhIkvhwAfqAyBsgKzIAh~tplv-nhvfeczskr-1:250:0.webp?lk3s=44acef4b&x-expires=1742262164&x-signature=6sYCua2Lk4mZ3MkhumFMuLrKEPo%3D",
      "https://blog.kakaocdn.net/dn/bxFzHN/btrR9XJ4rEO/aMPJFd2iixwxF6dkJHc0f1/img.webp",
      "https://upload2.inven.co.kr/upload/2018/09/17/bbs/i14018918862.png?MW=800",
    ];
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          icon: Icon(CupertinoIcons.camera),
          onPressed: () {},
        ),
        actions: [
          IconButton(
            icon: Icon(CupertinoIcons.paperplane),
            onPressed: () {},
          )
        ],
        title: Image.asset(
          'images/og_logo.png',
          height: 32,
        ),
        centerTitle: true,
        backgroundColor: Colors.white,
      ),
      body: ListView.builder(
        itemCount: images.length,
        itemBuilder: (context, index) {
          String image = images[index];
          return FeedList(
            imageUrl: image,
          );
        },
      ),
    );
  }
}
