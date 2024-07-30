/** 다트의 변수명 규칙
 *  {영문, _, $, 숫자}만 사용가능하다.
 *  camelCase를 사용해야 한다.
 * */

void main() {

  /**
   * 변수를 선언하고 초기화 하는 기본 형태는 다음과 같다.
   * [타입] [변수명] = 초기값;
   * */

  String name = 'koala.ohgiraffers';
  print(name);

  /**
   * 문자열을 묶을 때는 작은따옴표, 큰따옴표 둘 다 가능하다.
   * */
  String name1 = 'ohgiraffers1';
  String name2 = "ohgiraffers2";

  /**
   * 문자열 안에 ${변수}를 통해 변수를 문자열안에 바로 넣을 수 있다.
   * */
  print('안녕하세요' + name1);
  print('안녕하세요 + ${name1}');
  print('안녕하세요 + ${name1 + name2}');

  /**
   * 각 타입에 있는 내장 함수를 사용 할 수 있다.
   * */

  print(name.split('.'));
  print(name.toUpperCase());
}