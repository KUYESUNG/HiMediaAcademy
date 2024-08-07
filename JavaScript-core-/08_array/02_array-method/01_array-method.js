const arr = [];
// 배열의 생성자 함수는 Array
console.log(arr.constructor === Array);
// 배열의 프로토타입의 객체는 Array.prototype
// Array.prototype은 배열을 위한 빌트인 매서드를 제공한다.
console.log(Object.getPrototypeOf(arr) === Array.prototype);

// Array.prototype.indexof
// indexof : 배열에서 요소가 위치한 인덱스를 리턴(앞에서부터)
// lastIndexOf  : 배열에서 요소가 위치한 마지막 인덱스를 리턴(뒤에서부터)
// includes : 배열에 해당 요소 포함 여부 리턴
const foodList = ['물회', '삼계탕', '냉면', '수박', '물회'];
console.log(foodList.indexOf('물회'));
console.log(foodList.indexOf('물회', 1));
console.log(foodList.indexOf('삼겹살'));

console.log(foodList.lastIndexOf('물회'));
console.log(foodList.lastIndexOf('물회', 1));
console.log(foodList.lastIndexOf('삼겹살'));

console.log(foodList.includes('물회'));
console.log(foodList.includes('삼겹살'));

// Array.prototype.push : 배열의 맨 뒤에 요소 추가
// Array.prototype.pop : 배열의 맨 뒤에 요소 제거
const chinesfood = ['짜장면', '짬봉', '우동'];
console.log(chinesfood);
chinesfood.push('탕수육');
chinesfood.push('양장피');
console.log(chinesfood);
chinesfood.pop();
chinesfood.pop();
chinesfood.pop();
console.log(chinesfood);

// Array.prototype.unshift : 배열의 맨 앞에 요소 추가
// Array.prototype.shift : 배열의 맨 앞 요소 제거 후 반환
const chickenList = ['양념치킨', '후라이드', '파닭'];
console.log(chickenList);
chickenList.unshift('간장치킨');
chickenList.unshift('마늘치킨');
console.log(chickenList);
chickenList.shift();
chickenList.shift();
chickenList.shift();
console.log(chickenList);

// Array.prototype.concat : 두 개 이상의 배열을 결합
const idol1 = ['아이브', '오마이걸'];
const idol2 = ['트와이스', '에스파'];
const idol3 = ['블랙핑크', '레드벨벳'];

const mix = idol1.concat(idol2);
const mix2 = idol3.concat(idol1, idol2);

console.log(mix);
console.log(mix2);

// Array.prototype.slice : 배열의 요소 선택 잘라내기
// Array.prototype.splice : 배열의 index 위치의 요소 제거 및 추가
const front = ['HTML', 'CSS', 'JavaScript', 'jQuery'];
console.log(front.slice(1, 3));
console.log(front);

// splice(index, 제거수, 추가값)
console.log(front.splice(3, 1, "React"));
console.log(front);

// Array.prototype.join : 배열을 구분자로 결합하여 문자열로 반환
const snackList = ['사탕', '초콜릿', '껌', '과자'];
console.log(snackList.join());
console.log(snackList.join('/'));

// Array.prototype.reverse : 배열의 순서를 뒤집음
console.log([1, 2, 3, 4, 5].reverse());
