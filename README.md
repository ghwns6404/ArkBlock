


<div align="center">

# Ark Block
<b>비주얼 스크립팅을 활용한 딥러닝 교육 지원 솔루션</b><br>
<br><img src="./media/logo.png" width="300"/>
<br>





<h3>"코딩 없이 AI모델의 학습과 최적화를 동시에"</h3>

> ARK BLOCK는 **Node 기반 시각적 설계 → 자동 코드 생성 → 하이퍼파라미터 최적화까지** 한 번에 제공하는  
> **교육용 Visual Deep Learning 플랫폼**입니다.




<br />

🌐Official Website: https://www.bit41.net/

</div>

<br />

## 1. 프로젝트 개요

### 1.1 프로젝트 배경 & 기획 의도

AI는 이제 우리 생활에 필수적이지만
여전히 **코딩이라는 진입 장벽**으로 인해 많은 학습자들이 실습 단계에서 어려움을 겪고 있습니다.



ARK BLOCK는 이러한 문제를 해결하기 위해  
**코드 없이도 딥러닝 모델의 구조를 직접 설계하고 실험할 수 있는 환경**을 목표로 기획되었습니다.

---

### 1.2 설계의 중점

- Visual Scripting을 통한 직관적인 모델 설계
- 세부 설정 & 레이어 자동 최적화
- 커스텀 데이터를 통해 나만의 데이터셋 활용

---

## 2. 핵심 기능

### 2.1 노드 기반 Visual Model구현
- 블록 연결 방식으로 딥러닝 레이어 구성
- 데이터 흐름과 모델 구조를 시각적으로 표현

<img src="./media/line.gif" width="600"/>

---

### 2.2 자동 모델 최적화
- 모델 성능에 영향을 주는 파라미터 자동 탐색
- 사용자는 구조 설계와 결과 해석에 집중 가능

<img src="./media/opt.gif" width="600"/>

---

### 2.3 커스텀 데이터 기반 빠른 테스트
- 사용자 데이터 업로드 후 즉시 학습 및 평가
- 실험 중심 학습 및 검증 가능

<img src="./media/custom.gif" width="600"/>

---

## 3. 시스템 구조

### 3.1 전체 아키텍처

> 자세한 내용은 여기!!  🔍 [ArkBlock 아키텍쳐](./STRUCTURE.md)

<img src="./media/전체구성도.png" width="500"/>

- 클라이언트: 모델 설계 및 시각화
- 서버: 모델 코드 생성, 학습 실행, 최적화 처리

---

## 4. 데이터베이스 설계

<img src="./media/테이블구조.png" width="500"/>

- 기본 메타 데이터는 PostgreSQL에 저장
- 대용량 커스텀 데이터셋은 별도의 파일 서버(S3) 사용

---

## 기술 스택

<table>
<thead>
<tr>
<th>분류</th>
<th>주요 기술 스택</th>
</tr>
</thead>

<tbody>

<tr>
<td>개발 환경</td>
<td>
<img src="https://img.shields.io/badge/Windows_11-0078D6?style=for-the-badge&logo=windows&logoColor=white"/>
<img src="https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black"/>
<img src="https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"/>
<img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>
<img src="https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white"/>
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/>
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"/>
</td>
</tr>

<tr>
<td>개발 도구</td>
<td>
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
<img src="https://img.shields.io/badge/ESLint-4B32C3?style=for-the-badge&logo=eslint&logoColor=white"/>
<img src="https://img.shields.io/badge/Prettier-F7B93E?style=for-the-badge&logo=prettier&logoColor=black"/>
<img src="https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white"/>
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"/>
<img src="https://img.shields.io/badge/AWS_CLI-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"/>
</td>
</tr>

<tr>
<td>개발 언어</td>
<td>
<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Python_3-3776AB?style=for-the-badge&logo=python&logoColor=white"/>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/>
<img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white"/>
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"/>
<img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white"/>
</td>
</tr>

<tr>
<td>라이브러리</td>
<td>
<img src="https://img.shields.io/badge/Optuna-2C5BB4?style=for-the-badge"/>
<img src="https://img.shields.io/badge/TensorFlow--Keras-FF6F00?style=for-the-badge&logo=tensorflow&logoColor=white"/>
<img src="https://img.shields.io/badge/AWS_S3_SDK-569A31?style=for-the-badge&logo=amazons3&logoColor=white"/>
<img src="https://img.shields.io/badge/TestContainers-000000?style=for-the-badge"/>
<img src="https://img.shields.io/badge/TailwindCSS-06B6D4?style=for-the-badge&logo=tailwindcss&logoColor=white"/>
</td>
</tr>

</tbody>
</table>


---

## 6. 기대되는 효과

1. AI 기초 개념을 시각적으로 빠르게 이해 가능  
2. 코드 작성 부담 없이 모델 구조 학습 가능  
3. 자동 최적화를 통해 모델 설계에 집중  
4. 빠른 프로토타입 구성 및 테스트  
5. 실습 중심의 AI 학습 환경 제공  

---

## 7. 개선하고 싶은 방향

1. 서버 메모리 확장을 통해 여러 사용자 처리 개선  
2. Transformer 등 고급 레이어 확장  
3. 사용자 편의성을 고려한 UX 개선  

---

## 8. 팀 구성
비트고급 41기 1조
| 이름 | 담당 역할 |
|----|----|
| 성원빈 | AI 코드 생성, 최적화 로직, Python 모델 구현 |
| 박서연 | 모델 인텔리전스, 자동 전처리 |
| 정찬호 | 서버 아키텍처, API 및 DB 설계, Docker |
| 최정욱 | 통신 API 구현, UI/UX 기획 및 개발 |
| 천호준 | 클라이언트 기능 설계 및 구현 |

---

## 9. 실행 및 사용 가이드
👉 [Launch Guide](https://github.com/ghwns6404/ArkBlock/blob/main/LaunchGuide.md)
