# Feelog

<h1>함께쓰는 마음일기 - 'Feelog'</h1>

<h2>1. 기획 의도</h2>

<img src="https://github.com/user-attachments/assets/0560e041-2cc7-44d7-ba6d-848b4ea0b412"/>

전 세계적으로 우울증과 자살률은 점차 감소하고 있지만, 우리나라는 여전히 <strong>높은 자살률과 우울증 유병률</strong>을 보이고 있습니다.</br>
기존 일기의 단순 기록 방식에서 벗어나, <strong>감정을 나누고 소통할 수 있는 플랫폼</strong>을 통해 감정의 무게를 덜고자 본 프로젝트를 기획하게 되었습니다.

<h2>2. 기대 효과</h2>

<img src="https://github.com/user-attachments/assets/7216d8d2-99a1-4cbd-a2e8-6c8cbd878cab"/>

<strong>감정 관리 습관을 형성하고 정서적 회복</strong>을 유도합니다.</br>
또한, 커뮤니티 기반의 공감과 응원을 통해 <strong>정서적 안정감</strong>을 제공할 수 있습니다.</br>
일상 속 힐링을 위한 챌린지 참여를 유도하고, 응원 메시지와 이모티콘을 통해 <strong>감정 환기와 긍정적인 경험</strong>을 제공합니다.

<h2>3. 프로젝트 사용 툴</h2>

💻 언어 & 프레임워크
  - Java
  - Javascript
  - Spring Boot
  - MyBatis
  - JSON
  - Thymeleaf

🛠️ 개발 환경 & IDE
  - IntelliJ IDEA
  - Visual Studio Code
  - Sourcetree
  - Git, Github
  - Apache Tomcat
  - JDK 11.0.15

🗄️ 데이터베이스 & DB 툴
  - Oracle Database
  - MySql

🌐 API & 외부 서비스
  - Kakao Deverlopers (로그인 API)
  - CoolSMS API

📦 빌드 & 의존성 관리
  - Gradle

🔔 협업 & 커뮤니케이션
  - Slack

🎨 디자인 & 퍼블리싱
  - HTML / CSS

📷 기타 도구
  - Thumbnailator
  - Lombok

🧪 테스트 & 디버깅
  - Postman

<h2>4. ERD</h2>

<img src="https://github.com/user-attachments/assets/3cc006e4-171b-4004-a4a2-04af2f342e03"/>

<h2>5. 담당 업무</h2>
5-1 publishing

<img src="https://github.com/user-attachments/assets/1ea2bc15-84cf-4cde-8a3b-94e133b4da30"/>

▶ 관리자 페이지
- 관리자 홈, 회원/관리자 목록
- 포스트/감정일기/댓글 신고 목록 및 상세
- 공지사항 목록/등록/수정/상세
- 챌린지 목록/등록/수정/상세
- 자주 묻는 질문 목록/등록/수정

▶ 공지사항
- 공지사항 목록, 상세

▶ 메시지
- 메시지 대화창 UI

▶포스트 게시판/마음기록
- 게시글 및 감정일기 목록, 상세 페이지
- 익명 감정 게시판 및 응원 게시글 구현

5-2 백엔드

<img src="https://github.com/user-attachments/assets/3382db61-4243-4f11-8122-645515cd6963"/>
<img src="https://github.com/user-attachments/assets/033ce043-2eca-4777-b1be-83d9d61484dd"/>

▶ 관리자 페이지(REST)
- 관리자, 회원 정보 DB 저장 및 소프트 딜리트
- 각종 목록 페이징 (4개씩 표시)
- 공지/챌린지/FAQ 등록 시 이미지 첨부 가능

▶ 공지사항
- 목록 및 상세 조회
- 좋아요 수, 이전/다음 글 출력

▶ 메시지(REST)
- 로그인 검사 후 메시지 목록 출력
- 최근 메시지 내용, 상대 회원 프로필 출력
- 메시지 클릭 시 전체 대화 이력 출력

▶ 포스트 게시판/마음기록
- 일기 작성 시 OpenAI 플랫폼을 통해 긍정적인 오늘의 한마디 제공
- 좋아요/스크랩 기능 REST 방식 구현
- 댓글 입력/조회, 추천 게시글 출력 등 기능 포함
- 비공개/전체공개/구독자 전용 일기 분기 처리
- AI 기반 감정 점수 및 응원 코멘트 출력

<h2>6. 트러블슈팅</h2>

<h3>1. 문제</h3> 
💡 service.js에 너무 많은 fetch 요청이 몰려있어 가독성과 유지보수가 어려웠다.

<img src="https://github.com/user-attachments/assets/955aad5d-289a-4a4b-bc78-0b05e7910f7f"/>

<h3>2. 해결</h3>
✏️ HTML 기준이 아닌 기능 기준으로 모듈화를 진행했다. 각 기능별로 JS 파일을 나누어 중복 방지 및 유지보수 용이성을 확보했다.


<h3>1. 문제</h3>
💡 비공개, 전체공개, 구독자 전용 글을 구분해 보여줘야 했다. 로그인 여부에 따라 보여줘야 할 데이터가 달라 복잡한 로직이 필요해 보였다.

<h3>2. 해결</h3> 
✏️ 아래 쿼리문을 사용하여 로그인한 회원은 전체공개 + 구독자 전용 글을, 비로그인 상태에서는 전체공개 글만 조회하도록 구현하였다

```
 SELECT *
        FROM (SELECT d.id           AS id,
                     m.id           AS member_id,
                     m.member_nickname,
                     m.member_file_path,
                     m.member_file_name,
                     m.member_status,
                     d.diary_title,
                     d.diary_content,
                     d.diary_open,
                     d.diary_name_open,
                     d.diary_file_path,
                     d.diary_file_name,
                     d.diary_status,
                     d.updated_date AS updated_date,
                     d.diary_read_count,
                     c.id           AS channel_id,
                     c.channel_title,
                     c.channel_url,
                     c.channel_file_path,
                     c.channel_file_name,
                     c.channel_status,
                     dm.score_message,
                     d.diary_score
              FROM tbl_member m
                       JOIN tbl_diary d ON m.id = d.member_id
                       JOIN tbl_channel c ON m.id = c.member_id
                       join tbl_diary_score dm on d.diary_score = dm.id
              WHERE d.diary_open IN ('전체 공개', '구독자에게만 공개')) d
        WHERE EXISTS (SELECT 1
                      FROM tbl_subscribe s
                      WHERE s.member_id = #{memberId}
                        AND s.channel_id = d.channel_id)
           OR d.diary_open = '전체 공개'

        UNION

        SELECT *
        FROM (SELECT d.id           AS id,
                     m.id           AS member_id,
                     m.member_nickname,
                     m.member_file_path,
                     m.member_file_name,
                     m.member_status,
                     d.diary_title,
                     d.diary_content,
                     d.diary_open,
                     d.diary_name_open,
                     d.diary_file_path,
                     d.diary_file_name,
                     d.diary_status,
                     d.updated_date AS updated_date,
                     d.diary_read_count,
                     c.id           AS channel_id,
                     c.channel_title,
                     c.channel_url,
                     c.channel_file_path,
                     c.channel_file_name,
                     c.channel_status,
                     dm.score_message,
                     d.diary_score
              FROM tbl_member m
                       JOIN tbl_diary d ON m.id = d.member_id
                       JOIN tbl_channel c ON m.id = c.member_id
                       join tbl_diary_score dm on d.diary_score = dm.id

              WHERE d.diary_open = '전체 공개') d
        WHERE NOT EXISTS (SELECT 1
                          FROM tbl_subscribe
                          WHERE member_id = #{memberId})
        order by id desc
        limit #{postPagination.offset}, #{postPagination.rowCount}
  ```

<h3>1. 문제</h3> 
💡 header.html에서 modal.js의 함수가 정의되지 않았다는 오류 발생했다.

<h3>2. 해결</h3> 
<img src="https://github.com/user-attachments/assets/579eac49-cb76-4b24-84e2-3fd47039c4b7"/>

✏️ modal.js가 먼저 로드되며 의존 모듈보다 먼저 실행되는 문제였다.</br>
스크립트를 하단으로 내려도 해결되지 않아, 모듈화 대신 해당 함수들을 modal.js 내부에 직접 작성하여 처리하였다.


<h2>7. 느낀점</h2>


✨ 모르는건 창피한게 아니다!

첫 프로젝트이기도 하고 처음 개발을 접하다 보니 그 전에 강의해주신 내용들을 바로 쓰기에는 너무 어려웠다. 그러다보니 모르는게 너무 많지만 물어보기가 조금 창피했다. 
그렇게 시간이 지나면서 내가 모르는걸 계속해서 찾다보니 결국에는 찾아서 해결되지 않을 문제들도 존재했다. 강사님께 물어보고나니 금방 해결이 되는 문제들이었다. 
그렇게 금방 해결되는걸 경험해보니 창피한 것보다 모르는건 물어보고 빨리 해결해서 작업물에 결과가 나오는게 더 기분이 좋았다. 그 이후로는 많이 물어보게 됐다.

✨ 기획의 중요성

PickCourse 프로젝트를 끝내가면서 드는 생각이 있었다. 시작할 때 기획을 좀 더 꼼꼼하게 했다면 뒤로 가면서 덜 힘들었을 거라고 생각한다.
처음 기획하고 클론코딩을 할 때에는 큰 문제가 없었다. 그렇지만 테이블을짜면서부터 빠진 것들이 보이기 시작하더니 시간이 갈수록 더 큰 문제들이 보이기 시작했다.
기획이 잘못돼니 중요테이블이 빠지는 일도 종종 나왔고, 서버와 연동하면서 빠져있는 자질구레한 것들도 조금씩 있었다.
결국은 팀원들과 소통하여 기획을 수정하는 일이 많이 발생했다. 그러면서는 다음 기획에서는 서버까지 생각해서 짜야겠다는 걸 깨달았다.

✨ 완성하는 즐거움

내가 부족했기 때문에 어렵다고 느끼는 것들이 한두가지가 아니었기 때문에 결과물을 내기 위해서 진행하는 과정들이 쉽지 않았다.
그렇지만 포기하지 않고 계속해서 공부하고, 모르는 것들은 물어봐가면서 내가 원하는대로 동작할때, 그리고 결과물을 완성하고나서 확인할 때 제대로 동작할 때는 성취감이 너무 크고 재밋게 느껴졌다.

✨ 경험을 많이하자!

프로젝트를 진행하면서 생소한 코드들을 보면 어떻게 해야할지 난감한적이 많았다. 그렇지만 시간이 지나면서 코드가 눈에 익고나니 다시보니 그만큼 반가운 코드가 없었다.
처음 gitgub를 사용할 때에는 사용법을 몰라서 한명씩 push하고 pr하고 pull하고, 이런 바보같은 짓을 반복했었다. 내가 마지막으로 받게 됐는데 그러다보니 충돌이 많이나서 나는 그걸 해결하는데 시간을 많이썻다.
처음 빨간글씨로 뜬 에러들을보면 머리가 지끈거렸다. 어떤게 문제인지 보고 해석하는데도 이해가 잘 되지 않았다.
그렇지만 이런 에러들도 여러번 고쳐보다보니 나중에는 에러가 뜨게 되더라도 금방 해결하게 됐다. 그 이후로는 팀원들에게 불려가서 에러를 자주 고쳐주곤 했다.
코드와 에러들은 많이 봐두는 것이 좋다고 이번 프로젝트에서 깨달았다

✨ 개인보단 팀

이번 프로젝트에서 가장 크게 느낀 점은 팀원들이 있었기에 내가 여기까지 올 수 있었다고 생각한다.
서버쪽 작업을 마무리 할때에 나는 작업 진행률이 좀 더뎠었다. 한 페이지에 필요한 데이터들이 생각보다 너무 많았기에 한 페이지 완성하는데 오랜 시간이 걸렸다.
그러다보니 마감기한이 되었는데 아직 작업해야 할 작업물이 두개정도 남았었는데, 이걸 다른 팀원들이 필요한 DTO나 Service까지 필요한 쿼리문이나 이런 것들을 준비해주어서 기한내에 완성 할 수 있었다.
그 외에도 내가 코드를 짜면서 잘 못하고 있는 것 같으면 옆에서 많이 도와주기도 했다. 내가 도와준부분도 있지만 그래도 받은게 더 많다고 생각이 든다.
이런 일들을 겪으면서 난 확실히 개인보다 팀이 있는 것이 작업하는데에 있어서 더 좋다고 느꼇다.
