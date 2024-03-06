console.log('========== 논리 타입으로 변환 ==========');

// 1. Boolean 생성자 함수를 new 연산자 없이 호출하는 방법
console.log(Boolean('JavaScript'));
console.log(Boolean(''));
console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean(NaN));
console.log(Boolean(Infinity)); // 무한대는 참
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean({}));
console.log(Boolean([]));

// 2. ! 부정 논리 연산자를 두 번 사용하는 방법
console.log(!!'JavaScript');
console.log(!!1);
console.log(!!0);
console.log(!!NaN);
console.log(!!Infinity);
console.log(!!null);
console.log(!!undefined);