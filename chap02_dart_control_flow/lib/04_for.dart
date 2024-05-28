void main() {

  // 반복문[for문] : 특정 코드를 반복해서 실행하고 싶을 때 사용한다.

  for(var i = 0; i < 5; i++) {
    print('hello ${i}');
  }

  List<String> foods = ["짜장면", "짬뽕", "탕수육", "양장피", "크림새우"];
  for(var i = 0; i < 5; i++) {
    print("food : ${foods[i]}");
  }

  print("---------- for in 문 ----------");
  for(var food in foods) {
    print('food : ${food}');
  }
}