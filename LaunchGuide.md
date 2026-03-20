# 🚀 ArkBlock 통합 프로젝트 설치 가이드 (Launch Guide)

이 문서는 **ArkBlock 통합 프로젝트**의 구성 요소 설명과 Docker를 이용한 설치 및 실행 방법을 안내합니다.

---

## 📂 프로젝트 구조

### 1. Server
API 서버 및 핵심 로직을 담당하는 프로젝트 및 라이브러리 모음입니다.
* **apiserver**: 주요 API 서버
* **arkmanager**: 블록 코드 관리 라이브러리
* **blockdata**: 블록 데이터 로드 공통 라이브러리
* **blockgenerator**: 파이썬 코드 -> 블록 생성 라이브러리
* **blockintellisense**: 블록 코딩 오류 분석 라이브러리
* **blockoptimizer**: 블록 코드 최적화 라이브러리
* **blockpreprocessor**: 블록 전처리 라이브러리
* **codegenerator**: 블록 코딩 -> 소스 코드 생성 라이브러리

### 2. Web
* **web**: 프론트엔드 웹 서버 (사용자 인터페이스)

---

## 🛠 설치 및 실행 방법

> 본 가이드는 **Windows OS**를 기준으로 작성되었습니다.

### 1. 사전 준비
* [Docker Desktop](https://www.docker.com/products/docker-desktop/)을 설치합니다. (모든 옵션 기본값 권장)

### 2. 프로젝트 경로 진입
명령 프롬프트(CMD) 또는 PowerShell을 열고 프로젝트의 루트 디렉토리로 이동합니다.

### 3. API 서버 빌드
```bash
cd server
docker build -t "arkblock/apiserver:0.1.0" ./
4. AI 관련 이미지 빌드 (학습 및 최적화)
경로를 이동하며 순차적으로 빌드합니다.

Bash
# AI 학습 이미지 빌드
cd apiserver/docker/ai-train
docker build -t arkblock/apiserver/ai-train:0.1.0 ./

# AI 최적화 이미지 빌드
cd ../ai-optimize
docker build -t arkblock/apiserver/ai-optimize:0.1.0 ./
5. 프론트엔드 웹 서버 빌드
Bash
# web 폴더로 이동
cd ../../../../web

# 웹 서버 이미지 빌드 (API 주소 설정 포함)
docker build -t "arkblock/web:0.1.0" ./ ^
--build-arg PUBLIC_APP_BASE=http://localhost:3000 ^
--build-arg PUBLIC_APP_API_BASE=http://apiserver:8080
(참고: Windows CMD에서는 줄바꿈 기호로 ^를 사용하며, PowerShell에서는 `를 사용합니다.)

6. 환경 설정 및 실행
루트 경로로 돌아갑니다. (cd ..)

compose.yaml 파일을 열어 다음 환경 변수를 본인의 설정에 맞게 수정합니다.

services.apiserver.environment.APP_S3_KEY

services.apiserver.environment.APP_S3_SECRET

전체 서비스를 실행합니다.

Bash
docker compose up -d
🌐 접속 및 종료
웹 접속: 브라우저 주소창에 http://localhost:3000 입력

서비스 종료: 프로젝트 루트 경로에서 아래 명령어 실행

Bash
docker compose down
