void main() {

  // 처음 담긴 값으로 타입이 지정되는 자료형 var
  var value1 = 'apple';
  print(value1);

  // 이전에 문자열로 타입이 초기화 되었기 때문에, int인 1로 초기화 하지 못한다.
  // value1 = 1;

  // 이전에 문자열로 타입을 지정했기 떄문에, 문자열로는 변경이 가능하다.
  value1 = 'banana';
  print(value1);

  // 초기화를 하지 않았을 경우, 어떠한 데이터 타입도 저장가능한 Dynamic Type이 된다.
  var value2;

  value2 = 'grape';
  print(value2);

  value2 = 1;
  print(value2);

  // 모든 자료형을 담을 수 있는 자료형 Dynamic
  dynamic name = 'ohgiraffers';
  print(name);
  print(name.runtimeType);

  // 다이나믹 타입은 var와 달리 타입이 지정 되었어도 변경이 가능하다.
  name = 1;
  print(name);
  print(name.runtimeType);
}