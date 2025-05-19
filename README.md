# Feelog

<h1>함께쓰는 마음일기 - 'Feelog'</h1>

<h2>1. 기획 의도</h2>

<img src="https://github.com/user-attachments/assets/0560e041-2cc7-44d7-ba6d-848b4ea0b412"/>

전 세계 우울증, 자살률은 대체적으로 낮아졌지만 우리나라는 <strong>여전히 높은 자살률과 우울증 유병률</strong>을 기록하고 있습니다. </br>
단순 기록에 그치는 <strong>기존 일기의 한계</strong>를 해결하고 혼자 감당해야 하는 감정의 무게를 사용자들과 <strong>감정을 공유하고 소통</strong>하면 위와 같은 문제들을 해결 하는데 도움이 되고자 이 프로젝트를 설계했습니다.

<h2>2. 기대 효과</h2>

<img src="https://github.com/user-attachments/assets/7216d8d2-99a1-4cbd-a2e8-6c8cbd878cab"/>

<strong>감정 관리 습관 형성 및 정서적 회복</strong>을 유도하고 커뮤니티 기반의 공감과 응원을 통한 <strong>정서적 안정감을 제공</strong> 할 수 있습니다.</br>
일상 속 힐링을 돕는 챌린지 참여를 권장하고, 응원 메시지와 이모티콘을 통한 <strong>감정 환기와 긍정적인 경험</strong>을 제공합니다.

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

<img src="https://github.com/user-attachments/assets/da176157-3262-465e-9d03-14b5277279e4"/>

▶ 관리자 페이지
- 관리자 페이지 홈
- 회원 목록
- 관리자 목록
- 포스트, 감정일기, 댓글 신고 목록, 상세
- 공지 목록, 상세, 등록, 수정
- 챌린지 목록, 등록, 수정, 상세
- 자주묻는 질문 목록, 등록, 수정

▶ 공지사항
- 공지사항 목록, 상세

▶ 메시지
- 메시지 대화창

▶포스트 게시판/마음기록
- 일반 게시글 목록, 상세
- 응원 게시글 목록, 상세
- 개인 감정일기 목록, 상세
- 익명 감정게시판 목록, 상세

5-2 백엔드

<img src="https://github.com/user-attachments/assets/dea3e737-d30c-4916-abc5-9a98a12317dc"/>
<img src="https://github.com/user-attachments/assets/dea3e737-d30c-4916-abc5-9a98a12317dc"/>

▶ 관리자 페이지(REST)
- 관리자 정보 DB 저장
- 관리자 목록 출력
- 관리자 추방 시 소프트 딜리트
- 회원 목록 출력
- 회원 탈퇴, 정지, 정지취소 등 소프트 딜리트
- 챌린지 목록 출력
- 챌린지 등록 시 이미지파일첨부 기능 사용
- 각종 신고 목록 출력
- 신고 처리시 소프트 딜리트 사용
- 공지사항 DB 저장, 이미지파일 첨부 기능 사용
- 공지사항 목록 출력
- 공지사항 삭제 시 소프트 딜리트
- 자주묻는 질문 목록 출력
- 자주묻는 질문 DB 저장, 이미지파일 첨부기능 사용
- 자주묻는 질문 삭제 시 소프트 딜리트
- 관리자 페이지의 각 목록들은 페이징 처리하여 4개씩 보이도록 설정

▶ 공지사항
- DB에 저장된 공지사항 목록 클라이언트 화면에 출력
- DB에 저장된 공지사항 상세 내용 출력
- 공식채널과 이전, 다음 공지사항 정보 출력
- 해당 공지사항의 좋아요 수 출력

▶ 메시지(REST)
- 로그인 회원 검사 후 회원의 메시지 목록 출력
- 메시지를 주고 받은 회원과의 메시지 중 최근 데이터의 내용 과 주고받은 회원의 이름, 프로필 출력
- 메시지 클릭 시 해당 회원과의 그동안의 주고받은 메시지 내용, 날짜, 이름, 프로필 출력
- 프로필에 회원의 채널 url 삽입
- 메시지  기능 구현

▶ 포스트 게시판/마음기록
- 일기 작성 시 openAI 플랫폼을 활용하여 긍정적인 오늘의 한마디 출력
- 게시글/마음기록 스크랩(저장)과 좋아요 기능 REST방식으로 구현
- 게시글/마음기록 목록 조회 시 조회수, 댓글, 좋아요 수 출력
- 게시글/마음기록의 목록들은 페이징 처리하여 2개씩 보이도록 설정, 더 보기 버튼 클릭 시 추가 조회 기능 구현현
- 게시글/마음기록의 상세페이지 조회 시 추천 게시글로 랜덤한 게시글 4개 출력, 추천 게시글 목록 갱신 기능 구현
- 게시글/마음기록의 댓글 작성 기능 구현, 로그인 검사 후 로그인이 되어있지 않다면 댓글입력창 비활성화, 로그인 시 댓글 창 활성화, REST방식으로 입력 시 댓글 목록 최신화
- 게시글/마음기록의 댓글 목록 기능 구현, 댓글 좋아요 클릭 시 DB 저장 밑 이미지 변경, REST방식으로 구현
- 게시글/마음기록, 댓글 신고 기능 구현
- 게시글/마음기록 수정 시 작성페이지에 기존 정보를 출력 후 수정 기능 구현
- 일반 게시글 목록 조회 시 최근 응원글 화면에 출력, 버튼 클릭시 삭제
- 게시글 목록 출력 시 일반 게시글, 응원게시글 분리하여 출력
- 게시글 상세 조회 시 게시글 작성자의 채널과 작성자의 이전, 다음 게시글 타이틀 출력 후 페이지 이동 기능 구현
- 마음기록 목록 출력 시 비공개 또는 전체공개, 구독자에게만 공개로 구분하여 나의마음일기/모두의 마음일기로 출력
- 비공개 게시글은 로그인 검사 후 로그인을 하지 않았다면 로그인 페이지로 이동
- 모두의 마음일기 목록 출력 시 로그인 검사 후 로그인을 하지 않았다면 전체공개 목록 만 출력, 로그인되어있다면 해당 회원의 구독 채널 검사 후 전체공개 목록과 구독한채널의 게시글 목록 출력
- 마음일기 상세페이지 조회 시 AI가 일기 내용을 바탕으로 분석한 감정점수와 응원 코멘트 출력

<h2>6. 트러블슈팅</h2>

문제 : service 부분 모듈화 진행중 한 service.js에 너무 많은 fetch가 있었다.

<img src="https://github.com/user-attachments/assets/14b87b2f-38b9-4d48-93c9-a918f4e4efa9"/>

해결 : html을 기준으로 모듈화를 하는게 아닌 서비스 기능을 기준으로 모듈화를 한다는 것을 이해하고 기능별로 모듈화를 시켜서 js를 만들었다.
이렇게 모듈화를 시켜놓으니 중복되는 서비스를 다시 활용하기에도 용이하고, 내가 원하는 서비스를 찾기에도 편리했다.


문제 : 비공개와 전체공개, 구독자에게만 공개를 나눠서 보여줘야 하는데 로그인이 되어있지 않다면 전체공개인 글만 가져와야 하기 때문에 여기서 여러가지를 시도해보았다.

해결 : 
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

쿼리문을 위와같이 작성하여 하나의 select쿼리에는 로그인 하였을 때 구독자에게만 공개와 전체공개인 데이터를, 아래의 select 쿼리에는 로그인하지 않았을 때나 로그인한 회원이 구독한 채널이 없을 때 전체공개인 데이터를 가져와 union으로 결과를 합쳐서 조회했다.


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
