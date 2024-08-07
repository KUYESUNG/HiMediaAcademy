void main() {

  // 클래스는 변수와 함수를 모아놓은, 객체를 만들기 위한 설계도이다.

  // 클래스의 구성요소
  // 속성(Property) : 클래스 내에서 선언한 변수는 지역변수 혹은 프로퍼티라고 한다.
  // 메소드(Method) : 클래스 내의 함수
  // 생성자(Constructor) : 클래스 명과 동일한 함수
  Human human = new Human("비비", 25);

  print('이름 : ${human.name}');

  print(human.doHello());

}

class Human {
  // 인스턴스 변수
  String name;
  int age;

  // 생성자
  Human(this.name, this.age);

  getName() {
    return name;
  }

  String doHello() {
    return "안녕하세요 ${name}입니다.";
  }
}