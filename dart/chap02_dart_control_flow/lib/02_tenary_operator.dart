void main() {

  // tenary_operator 삼항연산자

  int num1 = 200;
  int num2 = 400;

  print("---------- 삼항 연산자 ----------");

  num1 > num2 ? print("num1이 num2보다 큽니다.") : print("num1이 num2보다 작습니다.");

  print('----------- if문 ----------');
  if(num1 > num2) {
    print("num1이 num2보다 큽니다.");
  } else {
    print("num1이 num2보다 작습니다.");
  }
}