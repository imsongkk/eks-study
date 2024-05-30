# AWS 기술 센싱 대시보드 백엔드
- AWS 신기술 관련 포스팅 백엔드


## Directory 구조
***

## 개발환경 세팅
***

### AWS-CLI, AWS-SAM-CLI 설치
```
brew install aws-cli

brew tap aws/tap
brew install aws-sam-cli
```

### AWS configure profile 설정
* 'awsReportDashboard'로 profile 생성
* '~/.aws/credentials'에 AWS계정에서 발급 받은 Key 기입
```
[awsReportDashboard]
aws_access_key_id = <발급한 Key id>
aws_secret_access_key = <발급한 Secret Access Key>
```

### 빌드 및 배포
```
sam build --profile awsReportDashboard
sam deploy --profile awsReportDashboard 
```
- build 시에 `Error: JavaGradleWorkflow:GradleBuild - Gradle Failed: ~`와 같은 사유로 빌드 에러 발생시, ./build/generated 디렉토리 삭제
