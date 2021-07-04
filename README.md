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
## 자동차 경주 게임

---
### 기능 요구사항 분리
1. 각 자동차에 이름을 부여할 수 있고, 이름은 5자를 초과할 수 없다.
2. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
3. 자동차 이름은 쉼표(,)를 기준으로 구분한다.
4. 전진하는 조건은 0~9에서 random한 값을 구한다.
5. random 값이 4이상이면 전진한다.
6. 자동차 경주 게임에서 누가 우승했는지 알려준다.
7. 우승자는 한 명 이상일 수 있다.
---
### 요구사항 분리
1. 자동차 이름 입력 기능 (exclude Test)
2. 자동차 이름 공백(or null), 5자 검증
3. 자동차 이름 쉼표 분리
4. Random 숫자 추출 기능 (exclude Test)
5. 자동차 전진 기능
6. 우승자 구하기 기능
7. 우승자 출력 기능 (exclude Test)
---
### 프로그래밍 요구사항
1. 모든 원시 값과 문자열을 포장한다.
2. 일급 Collection을 쓴다. (Collection을 Wrapper class로 감싼다.)
3. Strategy Pattern을 사용해본다.
