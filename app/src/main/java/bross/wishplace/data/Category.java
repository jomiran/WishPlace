package bross.wishplace.data;

/**
 * Created by bross on 2015. 3. 19..
 */
public class Category {
    public static String[] getTopCategory() {
        String[] topCategory = {"음식", "생활서비스", "소매", "도매/유통/무역", "관광/여가/오락", "스포츠", "학문/교육"};
        return topCategory;
    }

    public static String[] getMiddlecategory(int selectTopCategory) {

        String[] str = null;
        switch (selectTopCategory) {
            case 1:
                String[] tmp = {"한식", "중식", "일식/수산물", "분식", "닭/오리요리", "양식", "패스트푸드", "제과제빵떡케익", "유흥주점", "별식/퓨전요리", "커피점/카페", "음식배달서비스", "기타음식점", "부페"};
                str = tmp;
                break;
            case 2:
                String[] tmp2 = {"이/미용/건강", "세탁/가사서비스", "개인/가정용품수리", "운송/배달/택배", "인력/고용/용역알선", "사진", "물품기기대여", "대행업", "목욕탕/휴게", "개인서비스", "광고/인쇄", "기타서비스업", "자동차/이륜차",
                        "주택수리", "주유소/충전소", "예식/의례/관혼상제", "장례/묘지", "법무세무회계", "행사/이벤트"};
                str = tmp2;
                break;
            case 3:
                String[] tmp3 = {"음/식료품소매", "선물/팬시/기념품", "종합소매점", "취미/오락관련소매", "의복의류", "가방/신발/액세서리", "가정/주방/인테리어", "사무/문구/컴퓨터", "애견/애완/동물",
                        "건강/미용식품", "유아용품", "가전제품소매", "책/서적/도서", "운동/경기용품소매", "가구소매", "화장품소매", "예술품/골동품/수석/분재", "사진/광학/정밀기기소매", "종교용품판매", "의약/의료품소매",
                        "철물/난방/건설자재소매", "페인트/유리제품소매", "자동차/자동차용품", "중고품소매/교환", "기타판매업", "시계/귀금속소매"};
                str = tmp3;
                break;
            case 4:
                String[] tmp4 = {"곡물/종자도매", "사료도매", "화초/식물도매", "청과물도매", "동물도매", "축산물도매", "수산물도매", "자연산원료도매", "가공식품도매", "주류/기호품도매", "섬유/직물도매",
                        "의류도매", "신발도매", "가죽/모피제품도매", "가구도매", "가전제품도매", "주방용품도매", "장식재도매", "요업/목제품도매", "기타생활용품도매", "의약/의료품도매", "화장품/비누/세정제도매", "종이류도매",
                        "서적/음반/문구도매", "사진/광학/정밀기기도매", "취미/오락용품도매", "시계/귀금속도매", "운동용품도매", "연료도매", "철근/금속재도매", "목재도매", "건축관련자재도매", "유리도매", "도료도매",
                        "화합물/화학제품도매", "고무/플라스틱류도매", "재료도매/수집", "기계장비도매", "무역업", "상품중개", "기타유통관련업"};
                str = tmp4;
                break;
            case 5:
                String[] tmp5 = {"PC/오락/당구/볼링등", "무도/유흥/가무", "연극/영화/극장", "스포츠/운동", "요가/단전/마사지", "전시/관람", "놀이/여가/취미", "경마/경륜/성인오락"};
                str = tmp5;
                break;
            case 6:
                String[] tmp6 = {"운영관리시설", "실내운동시설", "실외운동시설",};
                break;
            case 7:
                String[] tmp7 = {"학원-보습교습입시", "학원-창업취업취미", "학원-자격/국가고시", "학원-어학", "학원-음악미술무용", "학원-컴퓨터", "학원-예능취미체육", "유아교육", "학원기타", "도서관/독서실", "학교", "특수교육기관", "학문교육기타", "연구소", "기타교육기관"};
                break;

        }

        return str;
    }

    public static String[][] getBottomCategory(int selectTopCategory) {
        String[][] str = null;

        switch (selectTopCategory) {
            case 1:
                String[][] tmp1 = {
                        {
                                "갈비/삼겹살", "곱창/양구이전문", "기사식당", "기타고기요리", "냉면집", "돌손/비빔밥전문점", "두부요리전문", "버섯전문점", "보리밥전문", "부대찌개/섞어찌개",
                                "설렁탕집", "순두부전문", "쌈밥전문", "재첩국전문", "족발/보쌈전문", "추어탕전문", "파전전문", "한식/백반/한정식", "한정식전문", "해장국/감자탕", "황태전문"
                        },

                        {
                                "중국음식/중국집", "탕수육전문점"
                        },

                        {
                                "갈치/생선구이", "게장전문", "고등어전문", "곰장어전문", "굴요리전문", "낙지/오징어", "매운탕전문", "민물장어전문", "바닷가재/게요리전문", "복전문", "붕어찜전문", "수산물전문음식점-종합",
                                "아구전문", "음식점-일식", "음식점-초밥전문", "조개구이전문", "참치전문점", "해물찜/탕전문", "홍어전문", "횟집"
                        },

                        {
                                "국수/만두/칼국수", "떡볶이전문", "라면김밥분식", "스낵", "우동전문점"

                        },

                        {
                                "닭갈비전문", "닭갈비전문", "닭내장/닭발요리", "닭도리탕전문", "불닭전문", "삼계탕전문", "오리고기전문", "옻닭전문", "찜닭전문점", "토종닭전문", "후라이드/양념치킨"
                        },

                        {
                                "기타전문서양음식점", "돈가스전문점", "바베큐전문", "스테이크전문점", "스파게티전문점", "정통양식/경양식", "카레전문점", "패밀리레스토랑"
                        },

                        {
                                "도너츠전문", "도시락전문점", "샌드위치전문점", "생과자점", "아이스크림판매", "유산균아이스크림전문", "토스트전문", "패스트푸드", "피자전문", "핫도그"
                        },

                        {
                                "떡/한과집", "떡전문", "제과점", "찐빵전문", "케익전문점"

                        },

                        {
                                "관광/유흥주점", "기타일반유흥주점", "꼬치구이전문점", "락카페", "로바다야끼", "룸살롱/단란주점", "민속주점", "빠/카페/스탠드빠", "소주방/포장마차", "호프/맥주"

                        },
                        {
                                "돌구이요리전문", "동남아음식전문점", "사철탕전문", "샤브샤브전문", "순대전문점", "죽전문점", "징기스칸요리전문", "철판구이요리전문", "퓨전음식전문"
                        },
                        {
                                "보드게임카페", "사주카페", "생과일주스전문점", "애견카페", "전통찻집/인삼찻집", "커피전문점/카페/다방"
                        },
                        {
                                "국/찌개배달", "야식집", "음식출장조달"
                        },
                        {
                                "고속도로휴게소", "구내식당/자급식음식점", "국도휴게소"
                        },
                        {
                                "고기부페", "종합부페", "채식/한식부페", "한식부페", "해물부페"
                        }

                };

                str = tmp1;
                break;
            case 2:
                String[][] tmp2 =
                        {
                                {
                                        "남성미용실", "미용실-어린이", "발/네일케어", "비만/피부관리", "여성미용실"
                                },

                                {
                                        "가죽모피세탁", "냉온수기소독/수리", "방앗간/정미소", "세탁대행", "세탁소/빨래방", "소파침대카펫트세탁", "솜틀집", "신발세탁", "청소/소독"
                                },
                                {
                                        "가구수리", "가방구두수전", "가전제품수리", "가죽/모피수선", "개인/가정용품수리-종합", "골동품수리", "금고수리", "농기구수리", "악기수선", "액세서리수선", "에어컨수리/설치", "열쇠제작", "옷수선", "정보통신기기수리", "컴퓨터수리", "피아노조율"
                                },
                                {
                                        "문서송달대행", "물품보관소", "용달/개별화물", "우체국/우편물취급소", "운전대행/대리운전", "이삿짐보관", "종합이삿짐대행", "퀵배달", "택배업", "피아노운반", "화물운송-용달", "화물운송대리"
                                },
                                {
                                        "가사도우미알선", "인력공급/고용알선", "해외취업알선"
                                },
                                {
                                        "사진관", "상업사진", "스티커사진방"
                                },
                                {
                                        "가방대여", "가정용가구/기기임대", "도서/만화대여", "도자기대여", "렌트카", "명품대여", "목재대여", "물수건대여", "물품대여종합", "비디오/오디오테이프대여", "비디오카메라대여",
                                        "사무기기대여", "사진/원고/기록물대여", "생활용품대여", "악기대여", "연극공연/영화제작용품임대", "오락/스포츠용품대여", "의류/한복대여", "장식품대여", "컴퓨터대여", "화환/화분대여"
                                },
                                {
                                        "고객관리대행", "꽃꽂이(대행)", "복사대행", "사무대리서비스", "신용조사/흥신소", "심부름센터", "이민유학알선", "전단지배포대행"
                                },
                                {
                                        "목욕업-찜질방", "사우나/증기탕/온천", "욕탕업-종합", "휴게텔"
                                },
                                {
                                        "대서소", "번역/통역서비스", "운명감정작명", "초상화제작", "탐정/경호", "호스피스"
                                },
                                {
                                        "간판제작종합", "광고대행-전화번호부", "광고물제작", "광고물제작-종합", "생활정보제공서비스", "인쇄종합", "지역정보지", "차트제작", "컴퓨터입력대행", "편집대행"
                                },
                                {
                                        "골프회원권거래소", "공연티켓예매", "국제회의용역", "도면제작대행", "디스플레이대행", "물품감정서비스", "박제표본", "보석감정", "사업경영상담", "사업중개업", "상품권판매", "상품전시", "상품포장", "작곡", "조감도/투시도전문", "지도제작", "지물재단", "패션디자인", "패션쇼대행", "펜팔소개", "필체감정"
                                },
                                {
                                        "광택전문", "세차장", "오토바이판매/수리", "자동차검사소", "자동차등록/검사/폐차대행", "자동차정비/카센타", "자전거판매/수리", "주차장운영"
                                },
                                {
                                        "가스설비", "미장타일도배도장", "배관난방보일러", "수도설비", "유리창호", "조립칸막이/파티션", "주택수리종합"
                                },
                                {
                                        "주유소", "차량가스충전소", "차량연료소매-종합"
                                },
                                {
                                        "결혼상담소", "예식장/예식서비스", "제사음식", "폐백전문", "회갑연서비스"
                                },
                                {
                                        "묘지관리-종합", "장의사/관련서비스-종합"
                                },
                                {
                                        "공인노무사", "공인회계사", "공증인", "관세사", "법무관련서비스-종합", "법무사", "변리사", "변호사", "세무사", "속기사무소", "손해사정인", "행정서사", "회계관련서비스-종합"
                                },
                                {
                                        "연예인대리업", "응원기획", "이벤트기획", "출장파티/연회대행", "행사대행"
                                }
                        };

                str = tmp2;
                break;
            case 3:
                String[][] tmp3 =
                        {
                                {
                                        "건과류판매", "건어물상", "곡물소매", "김치판매", "냉동식품판매", "닭집", "두유판매", "드라이아이스판매", "머리고기전문", "미곡상", "반찬가게", "생수판매", "수산물소매", "식료품점", "식용유판매", "식자재판매", "어물상", "얼음가게", "우유판매", "유과판매", "유기농식품판매", "육류소매", "정육점", "제과재료판매", "청과물소매"
                                },
                                {
                                        "공예품판매", "관광/민예품/선물용품소매", "기념패/휘장", "꽃집/꽃배달", "선물용품판매", "캐릭터상품", "토산품/기념품점", "황토상품전문점"
                                },
                                {
                                        "구판장/직판장", "면세백화점", "백화점", "생활용품판매", "수입품판매점", "수퍼마켓", "시장/종합상가", "아케이드/쇼핑센타", "어판장", "잡화점", "조합/연금매장", "종합소매", "편의점", "할인점", "혼수전문점"
                                },
                                {
                                        "그림/액자판매", "바둑/장기용품판매", "수족관", "악기판매", "액자점", "오락게임기구/장난감소매", "완구점", "우표/공중전화카드수집상", "이벤트용품판매", "전자오락기구판매", "조립모형소매", "지점토판매", "화폐수집상"
                                },
                                {
                                        "가죽/모피의류", "교복판매", "남성의류전문점", "맞춤양복/양복점", "맞춤양장/양장점", "법복(승복)판매", "섬유/직물/주단", "셔츠/내의/속옷", "아동복판매", "여성내의전문점", "여성의류전문점", "예복/웨딩드레스", "유니폼/맞춤복/단체복", "일반의류", "청바지판매", "캐쥬얼/스포츠의류", "특수복판매", "한복/갈옷/민속옷"
                                },
                                {
                                        "가발판매", "가방/가죽제품소매", "구두제화/캐주얼화", "기능성신발판매", "신발소매", "액세서리판매", "양품점", "우산/우의판매", "재봉용품판매", "휴대폰튜닝"
                                },
                                {
                                        "가스레인지판매", "그릇판매", "등세공품판매", "리본공예판매", "비데판매", "비즈공예", "십자수/뜨개", "유리/페인트/철물건축자재", "인테리어/욕실용품/커튼", "정수기연수기", "조명기구/전기용품", "주방가구판매", "주방용품", "지물판매", "침구/수예품", "카페트판매", "퀼트전문", "풍선도소매", "홈패션"
                                },
                                {
                                        "사무/문구용품", "사무용기기소매", "인장/도장", "잉크충전", "컴퓨터/사무용기기종합", "컴퓨터/주변기기", "컴퓨터전문매장", "컴퓨터프로그램판매", "화방/필방"
                                },
                                {
                                        "애견/애완/동물사육판매", "애완동물 미용실"
                                },
                                {
                                        "건강식품판매", "건강원", "금연관련제품판매", "녹즙판매", "다이어트상품판매", "생식판매", "선식판매", "인삼제품판매"
                                },
                                {
                                        "유아/임부복", "유아식품판매", "유아용품/장난감대여판매", "유아용품판매"
                                },
                                {
                                        "노래방기기판매", "수입가전제품판매", "오디오전문점", "일반가전제품", "전화기판매"
                                },
                                {
                                        "고서적판매", "기독교서적판매", "불교서적판매", "서적/신문소매", "서점", "외국서적판매", "잡지/신문소매", "종교서적판매", "중고서적판매", "지도판매", "천주교서적판매", "컴퓨터서적판매", "할인/아동도서"
                                },
                                {
                                        "건강/헬스용품", "골프용품판매", "낚시용품판매", "등산용품판매", "볼링용품판매", "석궁용품판매", "수상운동용품판매", "수영용품판매", "스키장비판매", "운동/경기용품", "인라인스케이트판매", "자전거판매", "총포상"
                                },
                                {
                                        "가구판매-돌침대", "가구판매-등가구", "가구판매-사무용가구", "가구판매-수입가구", "가구판매-응접세트", "가구판매-장농", "가구판매-침대전문", "일반가구소매"
                                },
                                {
                                        "향수전문점", "화장품판매점"
                                },
                                {
                                        "골동품판매", "분재판매", "수석판매", "예술품/골동품소매", "표구점", "화랑"
                                },
                                {
                                        "경보기판매", "금고판매", "무전기(판매/수리)", "사진/광학/정밀기기소매", "안경원", "영사기판매", "저울판매", "카메라판매", "특수사진기", "필름판매점", "핸드폰소매", "현미경/망원경판매"
                                },
                                {
                                        "종교용품판매", "종교용품판매-기독교", "종교용품판매-불교", "종교용품판매-천주교"
                                },
                                {
                                        "건강보조기구판매", "보청기판매", "의료용품소매", "의약품소매", "의족/의수판매"
                                },
                                {
                                        "건축백화점", "목제품판매", "보일러/냉난방용품", "셔터/새시판매", "심야전기보일러판매", "열쇠판매/수리", "조립식앵글판매", "진열장판매", "철물/건설자재소매", "태양열온수기판매"
                                },
                                {
                                        "도료염료", "유리/거울판매", "페인트/유리제품소매"
                                },
                                {
                                        "네비게이션판매", "수입자동차판매", "수입중고자동차판매", "자동차부품판매", "자동차유리전문점", "자동차장식품판매", "자동차판매", "중고자동차판매", "중고타이어판매", "카오디오전문", "타이어판매"
                                },
                                {
                                        "물물교환센타", "재활용/고물수집", "중고가전가구", "중고명품판매교환"
                                },
                                {
                                        "LPG판매", "가정용연료소매", "광촉매판매", "노점/유사이동판매", "농기구판매", "농자재판매", "담배소매", "동물약품판매", "미싱판매", "복권판매", "사료소매", "성인용품판매", "세탁기구판매", "수입담배판매", "신용카드조회기판매", "안전보호구판매", "업소용가전제품", "연탄판매", "유류판매", "음반/테이프/CD", "자동판매기운영", "제기용품판매", "통신판매", "파라솔판매", "호신용품판매"
                                },
                                {
                                        "금은방", "다이아몬드매매", "시계/귀금속", "시계방"
                                }
                        };
                str = tmp3;
                break;
            case 4:
                String[][] tmp4 =
                        {
                                {
                                        "가공곡물도매", "감자도매", "고추/마늘도매", "곡물/종자도매-기타", "곡물/종자도매-종합", "곡물도매", "기름용씨/열매도매", "땅콩도매", "종묘상"
                                },
                                {
                                        "사료도매"
                                },
                                {
                                        "화훼/꽃/나무/식물재배도매"
                                },
                                {
                                        "건과도매", "과실도매", "채소도매", "청과물도매-기타", "청과물도매-종합"
                                },
                                {
                                        "가축도매", "동물도매-기타", "동물도매-종합"
                                },
                                {
                                        "개/염소/양고기도매", "계란도매", "닭고기도매", "소/돼지고기도매", "우유제품도매", "육류도매", "축산물도매-기타", "축산물도매-종합", "햄도매"
                                },
                                {
                                        "건어물도매", "생선도매", "소금도매", "수산물도매-기타", "수산물도매-종합", "해조류도매", "활어도매"
                                },
                                {
                                        "가죽도매", "누에고치도매", "섬유원료도매", "약초도매", "원면도매", "원모도매", "원모피도매", "원피도매", "잎담배도매"
                                },
                                {
                                        "가공식품도매-기타", "가공식품도매-종합", "고기통조림도매", "기호식품도매", "농산물통조림도매", "라면도매", "빵/과자도매", "설탕도매", "수산물통조림도매", "식용유도매", "식품첨가물도매", "음료도매", "조미식품도매", "통조림식품도매-기타", "통조림식품도매-종합"
                                },
                                {
                                        "건강식품도매", "담배도매", "맥주도매", "소주도매", "주류도매-기타", "주류도매-종합", "탁주도매"
                                },
                                {
                                        "린네르도매", "방적사도매", "방직용섬유/사/직물도매-기타", "방직용섬유/사/직물도매-종합", "방직용섬유도매", "방직용합성섬유도매", "섬유/실도매", "섬유사/직물제품도매-기타", "섬유사/직물제품도매-종합", "섬유사도매", "수건도매", "수예품도매", "슬립커버도매", "양복지도매", "양장지도매", "직물도매", "침구류도매", "커튼도매", "한복지도매"
                                },
                                {
                                        "가발도매", "남성용외의도매", "내의도매", "넥타이도매", "머플러도매", "모자도매", "모조신변장식품도매", "셔츠/내의도매-기타", "셔츠/내의도매-종합", "셔츠도매", "손수건도매", "쇼올도매", "스카프도매", "스포츠웨어도매", "실내복도매", "아동용외의도매", "안감/의류부속재료도매", "양말도매", "여성용외의도매", "외의도매-기타", "외의도매-종합", "요대도매", "의복액세서리도매", "장갑도매", "특수복도매", "파스너도매"
                                },
                                {
                                        "구두도매", "신발도매-기타", "신발도매-종합", "운동화도매", "캐쥬얼화도매"
                                },
                                {
                                        "가죽/모피제품도매-기타", "가죽/모피제품도매-종합", "가죽의복도매", "가죽제품도매", "모피의복도매", "모피제품도매"
                                },
                                {
                                        "가구도매-기타", "가구도매-종합", "가정용가구도매", "사무용가구도매", "침대도매"
                                },
                                {
                                        "가전제품도매", "가정용전기기기도매-기타", "가정용전기기기도매-종합", "전기용품도매", "조명기구도매"
                                },
                                {
                                        "그릇도매", "조리가열기기도매", "주방가구/기기도매-기타", "주방가구/기기도매-종합", "주방가구도매", "주방기구도매"
                                },
                                {
                                        "리놀륨도매", "벽지/양탄자/마루덮개도매-기타", "벽지/양탄자/마루덮개도매-종합", "벽지도매", "양탄자도매", "장판지도매", "화문석도매"
                                },
                                {
                                        "나전칠기도매", "도자기제품도매", "등세공품도매", "요업제품/목제품도매-기타", "요업제품/목제품도매-종합", "유리제품도매", "장식용품도매"
                                },
                                {
                                        "가방도매", "가정용플라스틱제품도매", "광택제/접착제도매", "미싱도매", "비닐제품도매", "우산/양산도매", "위생소독재료도매", "유모차도매", "청소기구도매", "청소용품도매", "칠보도매"
                                },
                                {
                                        "보청기도매", "의료용품도매-기타", "의료용품도매-종합", "의수/의족도매", "의약품도매", "의약품도매-기타", "의약품도매-종합", "한약건재도매", "한의용품도매"
                                },
                                {
                                        "비누도매", "세제도매", "치약샴푸도매", "화장품/비누/세정제도매-기타", "화장품/비누/세정제도매-종합", "화장품도매"
                                },
                                {
                                        "골판지도매", "종이/종이제품도매-기타", "종이/종이제품도매-종합", "종이도매", "판지도매", "화장지도매"
                                },
                                {
                                        "공테이프/디스크도매", "문구용품도매", "문구용품도매-기타", "문구용품도매-종합", "비디오테이프도매", "서적/기타기록물도매-기타", "서적/기타기록물도매-종합", "서적도매", "음반도매", "잡지도매", "학습교구도매", "회화용품도매"
                                },
                                {
                                        "광학기구도매", "광학용품도매", "렌즈도매", "망원경도매", "사진/광학/정밀기기도매-기타", "사진/광학/정밀기기도매-종합", "사진용품도매", "사진필름도매", "안경틀도매", "저울도매", "카메라도매", "현미경도매"
                                },
                                {
                                        "당구장비도매", "바둑용품도매", "악기도매", "오락게임용품도매", "오락용기기도매", "인형도매", "장난감/오락용품도매-기타", "장난감/오락용품도매-종합", "장난감도매", "전자오락게임기도매"
                                },
                                {
                                        "귀금속도매", "시계/귀금속도매-기타", "시계/귀금속도매-종합", "시계도매", "시계부품도매"
                                },
                                {
                                        "경기용품도매", "낚시도구도매", "등산장비도매", "사냥용품도매", "운동/경기용품도매-기타", "운동/경기용품도매-종합", "운동장비도매", "자전거/자전거부품도매", "잠수장비도매"
                                },
                                {
                                        "LPG도매", "갈탄도매", "고체연료/관련제품도매-기타", "고체연료/관련제품도매-종합", "공업용가스도매", "기체연료/관련제품도매-기타", "기체연료/관련제품도매-종합", "기체연료도매", "석유정제제품도매", "석탄도매", "숯도매", "액체연료/관련제품도매-기타", "액체연료/관련제품도매-종합", "액체연료도매", "원유도매", "윤활유/그리스도매", "착화탄도매", "코크스도매", "토탄도매"
                                },
                                {
                                        "금속관도매", "금속관도매-기타", "금속관도매-종합", "금속광물도매", "금속선도매", "금속선도매-기타", "금속선도매-종합", "금속케이블도매", "금속판재도매", "금속판재도매-기타", "금속판재도매-종합", "동파이프판매", "바늘도매", "비철금속관도매", "스텐레스판도매", "철강관도매", "철강판재도매", "철근도매", "철근도매-기타", "철근도매-종합", "철망도매", "철선제품도매", "함석도매"
                                },
                                {
                                        "가공목재도매", "목재도매-기타", "목재도매-종합", "원목도매", "재생목재도매"
                                },
                                {
                                        "골재도매", "기와/벽돌/블록도매-기타", "기와/벽돌/블록도매-종합", "기와도매", "난방장치도매", "단열재도매", "루핑지도매", "모르타르도매", "목욕탕/사우나기자재도매", "방음자재도매", "배관자재도매", "벽돌도매", "보일러도매", "블록도매", "석회/시멘트도매-기타", "석회/시멘트도매-종합", "석회도매", "소방설비도매", "수공구도매", "시멘트도매", "열쇠도매", "위생도자제품도매", "조립구조재도매", "조립식건물세트도매", "조립식건축물/구조재도매-기타", "조립식건축물/구조재도매-종합", "조립식벽돌도매", "철물/수공구/난방장치도매-기타", "철물/수공구/난방장치도매-종합", "철물도매", "콘크리트제품도매", "타일도매", "톱도매", "프라스터도매", "플라스틱관도매"
                                },
                                {
                                        "위생용도자기도매", "유리도매", "유리도매-기타", "유리도매-종합", "유리섬유도매"
                                },
                                {
                                        "도료도매-기타", "도료도매-종합", "래커도매", "요업도료도매", "페인트도매"
                                },
                                {
                                        "농약도매", "비료도매", "산업용기초화합물도매-기타", "산업용기초화합물도매-종합", "안료도매", "염료/안료/관련제품도매-기타", "염료/안료/관련제품도매-종합", "염료도매", "유연제도매", "착색제도매", "화공약품도매"
                                },
                                {
                                        "플라스틱도매", "합성고무/플라스틱물질도매-기타", "합성고무/플라스틱물질도매-종합", "합성고무도매", "합성수지도매"
                                },
                                {
                                        "고무벨트도매", "금속재생재료수집도매", "비금속재생재료수집도매", "재생재료수집/도매-기타", "재생재료수집/도매-종합", "티타늄도매", "폐품수집도매", "포장재료도매", "플라스틱필름도매"
                                },
                                {
                                        "X선기구도매", "건설/광업용기계장비도매-기타", "건설/광업용기계장비도매-종합", "공기정화기판매", "공작기계도매", "과학기구장비도매", "금속공작/목공기계도매-기타", "금속공작/목공기계도매-종합", "금전등록기도매", "기계부속품판매", "내과/외과기기도매", "농업용기계장비도매", "목공기계도매", "무전기(도매)", "물리시험기구도매", "반도체도매", "반송장비도매", "발전기도매", "방송장비도매", "방직기도매", "밸브도매", "베어링도매", "복사기도매", "비금속제품성형기계도매", "사무용기계도매-기타", "사무용기계도매-종합", "산업용노/오븐/버너도매", "산업용분쇄기판매", "산업용수송장비도매", "상업용기계장비도매", "선반도매", "섬유가공기도매", "섬유기계장비도매", "소프트웨어도매", "송풍기/환풍기도매", "수의기기도매", "순찰시계판매", "식품기계장비도매", "영화촬영기도매", "위성방송설비도매", "유압기계도매", "의료용기기도매-기타", "의료용기기도매-종합", "이화학용기구도매", "인쇄기도매", "일반기계장비도매-기타", "일반기계장비도매-종합", "전기기계장비도매-기타", "전기기계장비도매-종합", "전기측정기기도매", "전기케이블도매", "전문및과학기기도매-기타", "전문및과학기기도매-종합", "전자계산기도매", "전자부품도매", "전화기도매", "제도기도매", "제본기도매", "제지용기계장비도매", "주조기도매", "중장비도매", "중장비매매중개", "중장비부품도매", "중장비정비", "직조기도매", "축전기도매", "출퇴근기록기판매", "측량기기도매", "치과기기도매", "컴퓨터도매", "통신기기도매", "통신장비도매-기타", "통신장비도매-종합", "통신케이블도매", "펌프도매", "프레스기도매", "화학기계장비도매"
                                },
                                {
                                        "가정용품무역", "농축산물무역", "담배무역", "무역업-기타", "무역업-종합", "무역중개", "산업용기계장비무역", "산업용중간재무역", "수산물무역", "음식료품무역"
                                },
                                {
                                        "곡물/사료중개", "골동품/예술품중개-기타", "골동품/예술품중개-종합", "골동품중개", "과실/채소중개", "기타상품중개", "농축수산물중개-기타", "농축수산물중개-종합", "담배중개", "동물중개", "수산물중개", "예술품중개", "음식료품/담배중개-기타", "음식료품/담배중개-종합", "음식료품중개", "축산물중개", "화훼작물중개"
                                },
                                {
                                        "광고재료도매", "납품업", "상품연쇄화사업", "선구/어구도매", "수산물위탁판매", "이미용기재도매", "일회용품도매", "호텔용품공급"
                                }
                        };
                str = tmp4;
                break;
            case 5:
                String[][] tmp5 =
                        {
                                {
                                        "기원", "당구장", "볼링장", "비디오감상실", "오락용사격장", "인터넷PC방", "전자오락실", "탁구장", "포켓볼장"
                                },
                                {
                                        "극장식유흥주점", "나이트클럽", "노래방", "무도유흥주점-종합", "무도장", "한국식유흥주점"
                                },
                                {
                                        "연극/음악/예술관련기타", "연극극장", "영화관", "음악감상", "자동차극장", "종합공연장"
                                },
                                {
                                        "롤러스케이트장", "서바이벌게임장", "스케이트장", "실내낚시", "실내사격장", "실내스케이트장", "실내야구연습장", "실외야구연습장"
                                },
                                {
                                        "단식원", "단전호흡", "스포츠마사지", "안마시술소", "요가/단식", "지압원", "체형미교실", "활기원"
                                },
                                {
                                        "과학관/전시관", "국립민속박물관", "국립중앙박물관", "국립현대미술관", "동물원/식물원", "문화원", "미술관/박물관", "박물관/사적지관리", "식물원/동물원", "유적지", "자연학습원"
                                },
                                {
                                        "공원", "기타오락관련산업", "낚시터", "놀이배", "유원지", "전망대", "종합위락시설", "주말농장", "해수욕장", "휴양림"
                                },
                                {
                                        "게임룸", "경륜장", "경마장", "동물경기", "카지노"
                                }
                        };
                str = tmp5;
                break;
            case 6:
                String[][] tmp6 =
                        {
                                {
                                        "기타경기후원업/경기단체", "기타운영설비", "수렵장관리운영", "운동경기협회", "프로골프", "프로권투", "프로레슬링", "프로스포츠경기운영", "프로씨름", "프로야구", "프로축구"
                                },
                                {
                                        "기타실내운동시설", "복싱도장", "석궁장", "스쿼시장", "스포츠센터", "실내골프연습장", "실내궁도장", "실내수영장", "실내테니스장", "이종격투기", "체육관", "쿵후도장", "킥복싱", "택견도장", "헬스클럽"
                                },
                                {
                                        "게이트볼장", "경비행기", "골프장", "기타실외운동시설", "눈썰매장", "래프팅", "번지점프", "사격장", "수상스키", "수영장", "스키장", "스킨스쿠버강습", "승마장", "실외골프연습장", "실외궁도장", "야구장", "인공암벽", "축구장", "테니스장", "패러글라이딩", "풋살경기장", "행글라이더"
                                }
                        };
                str = tmp6;
                break;
            case 7:
                String[][] tmp7 =
                        {
                                {
                                        "학원-검정고시", "학원-입시", "학원-편입"
                                },
                                {
                                        "학원-TV기술", "학원-간판디자인", "학원-경리", "학원-경영", "학원-공예", "학원-광고디자인", "학원-광섬유", "학원-네일아트", "학원-동물사육", "학원-디스플레이", "학원-디자인", "학원-만화영화", "학원-목공예", "학원-목욕관리사", "학원-미싱자수", "학원-병아리감별", "학원-복장", "학원-분장", "학원-비디오", "학원-섬유기술", "학원-세탁기술", "학원-속독", "학원-스튜디어스", "학원-시계기술학원", "학원-안경기술", "학원-애견미용", "학원-양재", "학원-용접기술", "학원-차트", "학원-칵테일", "학원-캐드", "학원-캐디", "학원-텔렉스/통신", "학원-편물기술", "학원-표구기술", "학원-피부미용", "학원-한복기술"
                                },
                                {
                                        "학원-간호조무사", "학원-건축토목기술", "학원-경찰", "학원-공인중개사", "학원-관광통역", "학원-국가고시", "학원-기계/금형기술", "학원-기계고시", "학원-냉동열관리", "학원-도배", "학원-미용", "학원-배관용접", "학원-보석감정", "학원-비파괴", "학원-속기", "학원-이용", "학원-자동차운전", "학원-자동차정비", "학원-전기기술", "학원-전자기술", "학원-전자통신", "학원-제과기술", "학원-중장비", "학원-품질관리", "학원-항공기술", "학원-환경기사", "학원/국가고시"
                                },
                                {
                                        "학원-어린이영어", "학원-외국어/어학"
                                },
                                {
                                        "서예/서화/미술", "피아노/바이올린/기타", "학원-국악", "학원-무용"
                                },
                                {
                                        "컴퓨터학원"
                                },
                                {
                                        "검도도장", "레크레이션지도/상담", "유도장", "태권도장", "학원-가요", "학원-기억법", "학원-꽃꽃이", "학원-레크리에이션", "학원-마술", "학원-바둑", "학원-배우/탤런트", "학원-사교춤", "학원-사진", "학원-서당", "학원-스포츠/재즈댄스", "학원-아트플라워", "학원-에어로빅", "학원-요리", "학원-웅변", "학원-자수/동양자수", "학원-주산암산부기속셈", "학원-지점토", "학원-펜글씨/한문", "합기도장"
                                },
                                {
                                        "놀이방", "동화구연", "블럭놀이방", "실내놀이터-유아", "어린이집", "유아교육기관기타", "유치원"
                                },
                                {
                                        "비행훈련원", "예절지도", "운전연수전문", "학원(종합)", "학원-기타", "학원-말더듬", "학원-모델", "학원-실내운전", "학원-심리변론", "학원-역학", "학원-침술"
                                },
                                {
                                        "고시원", "국립중앙도서관", "국회도서관", "기록보존업", "도서관", "도서관/독서실/기록보존", "독서실", "이동도서관운영"
                                },
                                {
                                        "고등공민학교", "고등기술학교", "고등학교", "기타고등교육기관", "기타중등교육기관", "대학교", "대학원", "신학대학", "전문대학", "중학교", "직업전문학교", "초등학교",
                                },
                                {
                                        "특수교육기관-기타", "특수교육기관-종합", "특수학교"
                                },
                                {
                                        "시험정보안내", "운동/코치학교", "학습지보급"
                                },
                                {
                                        "경영연구소", "경제연구소", "공학연구소", "국립국어연구원", "농학연구소", "물리연구소", "사회과학연구소", "생명과학연구소", "수의학연구소", "양학연구소", "의학연구소", "인문/사회과학연구개발-기타", "인문/사회과학연구개발-종합", "자연과학연구개발-기타", "자연과학연구개발-종합", "화학연구소"
                                },
                                {
                                        "문화센터", "사회교육단체", "상설직원훈련기관", "야학", "외국인학교", "적성검사", "직업훈련소", "직장위탁교육", "학교-노인대학", "향교"
                                }
                        };
                str = tmp7;
                break;
        }

        return str;
    }
}