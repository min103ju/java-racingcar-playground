## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
---
## 문자열 계산기
### 기능 요구사항
1. 쉽표, 콜론을 구분자로 가지는 문자열을 인자로 한다.
2. 각 분리한 숫자의 합을 반환
3. 커스텀한 구분자를 얻을 수 있다.
    1. "//"와 "\n" 사이에 있는 문자가 구분자이다.
4. 숫자 이외 또는 음수가 전달되는 경우 RuntimeException을 발생.

### 초기 조건
1. 빈 문자열(혹은 null) 0을 반환
2. 숫자 하나만 입력할 경우 해당 숫자를 반환

### 프로그래밍 요구사항
1. indent <= 1
2. method는 10line 이내
3. Don't use else

1. 커스텀 구분자를 판별하기
2. 기본 구분자에 커스텀 구분자 합치기 
3. 구분자로 split 하는 것
4. 판별된 구분자로 split 하는 것 
5. split된 숫자를 합하기
6. split된 문자 중에 음수나 숫자가 아니면 throw Exception

## 자동차 경주 게임 
### 기능 요구사항
1. 각 자동차에 이름을 부여할 수 있고, 자동차 이름은 5자를 초과할 수 없다.
2. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
3. 자동차 이름은 쉽표(,)를 기준으로 구분한다.
4. 전진하는 조건은 0에서 9 사이의 random 값을 구한 후 random 값이 4 이상이면 전진하고, 3 이하면 멈춘다.
5. 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

### TDD 기준 기능 요구사항 분리
1. 자동차 이름 5자 초과 검증
- 자동차에 random 값 부여 (Test 제외)
2. 자동차 이름 쉼표(,) 구분자로 분리
3. 전진하는 자동차 확인
4. 자동차 완료 이동 횟수 검증(우승자 체크) 


