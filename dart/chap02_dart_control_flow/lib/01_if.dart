void main() {

  // 흐름제어문 : 프로그램의 진행 순서를 제어하는 문법

  // 조건문 : 조건에 따라 실행하고 싶은 코드를 나눌 때 사용한다.

  print('--------------- if -----------------');

  bool boolean = true;

  if(boolean) {
    print("bolean true? ${boolean}");
  } else {
    // print("boolean false?" : ${boolean});
  }

  print("================ else if =================");
  bool boolean1 = false;
  bool boolean2 = true;

  // 조건문은 else if 형태로 계속해서 조건을 추가 할 수 있다.
  // 앞에서부터 하나씩 비교를 하면서, 조건 하나라도 true로 실행되면 뒤에 있는 조건문은 실행되지 않는다.

  if(boolean1) {
    print("boolean1 : ${boolean1}");
  } else if (boolean2) {
    print("boolean2 : ${boolean2}");
  } else {
    print("boolean과 2가 false입니다.");
  }
}