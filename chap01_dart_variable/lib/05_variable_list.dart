void main() {
  // 배열에 담길 타입을 지정하고, 데이터를 추가, 조회, 수정, 삭제 할 수 있는 자료형 List

  List<String> foods = ['탕수육', '짜장면'];
  print(foods);
  print("food의 개수 + ${foods.length}");

  // 추가
  foods.add('짬뽕');
  print(foods);

  // 에러 발생
  // foods.add(1);

  // 조회
  print(foods[0]);
  print(foods[1]);
  print(foods[2]);

  // 수정
  foods[0] = "크림새우";
  print(foods);

  // 삭제
  foods.remove('짜장면');
  print(foods);

  foods.removeAt(0);
  print(foods);

}