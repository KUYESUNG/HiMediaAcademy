import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

late SharedPreferences prefs;

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  prefs = await SharedPreferences.getInstance();

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    bool isOnboarded = prefs.getBool('isOnboarded') ?? false;

    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: isOnboarded ? HomePage() : FirstScreen(),
    );
  }
}

class FirstScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('현재의 나'), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Expanded(
              child: Image.asset('image/e2a70a74d6bcc206bf5060cf81930ac2.png'),
            ),
            SizedBox(height: 20),
            Text(
              '현재의 나',
              style: TextStyle(color: Colors.blue, fontSize: 35),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 10),
            Text(
              '운좋게 좋은 팀원 분들을 만나 3관왕을 달성하고 동기부여를 위해 조금 당당해진 모오오스으으읍',
              style: TextStyle(fontSize: 20),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                prefs.setBool('isOnboarded', true);
                Navigator.pushReplacement(
                  context,
                  MaterialPageRoute(builder: (context) => HomePage()),
                );
              },
              child: Text('Skip'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => SecondScreen()),
                );
              },
              child: Text('Next Page'),
            ),
          ],
        ),
      ),
    );
  }
}

class SecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('수료후의 나'), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Expanded(
              child: Image.asset('image/OFALQZP2QMKNZ3WQOLILEJ7QLI.png'),
            ),
            SizedBox(height: 20),
            Text(
              '수료후의 나',
              style: TextStyle(color: Colors.blue, fontSize: 35),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 10),
            Text(
              '수료후 취업 준비를 하며 더 큰 세상을 마주 했을때 쫄지 않겠다는 모오오스으으읍',
              style: TextStyle(fontSize: 20),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => LastScreen()),
                );
              },
              child: Text('NextPage'),
            )
          ],
        ),
      ),
    );
  }
}

class LastScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("10년 후의 나"), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Expanded(
              child: Image.asset('image/87.png'),
            ),
            SizedBox(height: 20),
            Text(
              '10년 후의 나',
              style: TextStyle(color: Colors.blue, fontSize: 35),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 10),
            Text(
              '개발에 대해 깨달음을 얻고 여유로워진 모오오오스으으읍~',
              style: TextStyle(fontSize: 20),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.pushReplacement(
                  context,
                  MaterialPageRoute(builder: (context) => HomePage()),
                );
              },
              child: Text('Go HomePage'),
            ),
          ],
        ),
      ),
    );
  }
}

class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Go Home Page'),
        centerTitle: true,
        actions: [
          IconButton(
            onPressed: () {
              prefs.clear();
            },
            icon: Icon(Icons.delete),
          )
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Expanded(
              child: Image.asset('image/images.png'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.pushAndRemoveUntil(
                  context,
                  MaterialPageRoute(builder: (context) => FirstScreen()),
                  (route) => false,
                );
              },
              child: Text('Go to First Screen'),
            ),
          ],
        ),
      ),
    );
  }
}
