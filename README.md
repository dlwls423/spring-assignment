# spring-assignment
내배캠 스프링입문 개인과제

### 필수 구현 기능
* 게시글 작성 기능
  * 제목, 작성자명, 비밀번호, 작성 내용, 작성일을 저장할 수 있습니다.
  * 저장된 게시글의 정보를 반환 받아 확인할 수 있습니다. (비밀번호 제외)
* 선택한 게시글 조회 기능
  * 선택한 게시글의 정보를 조회할 수 있습니다. (비밀번호 제외)
* 게시글 목록 조회 기능
  * 등록된 게시글 전체를 조회할 수 있습니다. (비밀번호 제외)
  * 조회된 게시글 목록은 작성일 기준 내림차순으로 정렬 되어있습니다.
* 선택한 게시글 수정 기능
  * 선택한 게시글의 제목, 작성자명, 작성 내용을 수정할 수 있습니다.
     * 서버에 게시글 수정을 요청할 때 비밀번호를 함께 전달합니다.
     * 선택한 게시글의 비밀번호와 요청할 때 함께 보낸 비밀번호가 일치할 경우에만 수정이 가능합니다.
  * 수정된 게시글의 정보를 반환 받아 확인할 수 있습니다.
     * 반환 받은 게시글의 정보에 비밀번호는 제외 되어있습니다.
* 선택한 게시글 삭제 기능
  * 선택한 게시글을 삭제할 수 있습니다.
     * 서버에 게시글 삭제를 요청할 때 비밀번호를 함께 전달합니다.
     * 선택한 게시글의 비밀번호와 요청할 때 함께 보낸 비밀번호가 일치할 경우에만 삭제가 가능합니다.
-----------
### 프로젝트 설계
#### Use Case Diagram
![image](https://github.com/dlwls423/spring-assignment/assets/99391320/dcb0ef40-a4fe-48d7-96c9-98ba0a8991a3)

#### API 명세서
<img width="499" alt="image" src="https://github.com/dlwls423/spring-assignment/assets/99391320/504f340d-6f5f-4a7d-bf4e-92b25c912890">

#### ERD
![image](https://github.com/dlwls423/spring-assignment/assets/99391320/a8a75633-a016-46e4-a986-1089797e4536)
