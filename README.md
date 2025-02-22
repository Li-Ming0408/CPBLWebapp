# CPBL 管理系統

## 本專案為使用 SpringMVC + Thymeleaf 製作的練習專案。使用 enbedded tomcat 部屬並啟動 Spring app 後使用 localhost:8080 開啟，需要 SQL server 內存在名為 cpbl 資料庫方可建立資料庫連線，SQL 登入帳號與密碼請自行至 application.properties 檔做修改。
## 更詳細的規格書請參考 resources/static 內的 wrod 檔。
## A. 資料來源
CPBL Opendata [GitHub](https://github.com/ldkrsi/cpbl-opendata)

## B. 原始資料範例
```
ID,Name,Team ID,Team Name,G,PA,AB,RBI,R,H,1B,2B,3B,HR,TB,SO,SB,GIDP,SH,SF,BB,IBB,HBP,CS,GO,FO
0000004636,江坤宇,ACN,中信,110,457,395,43,55,115,90,20,0,5,150,54,11,7,7,8,42,0,5,4,110,131
```

## C. 資料庫的 Schema

## D. 資料庫 Schema 與原始資料的比較

### 1. **部分資料放棄原因**
由於資料欄位過多，捨棄相對重要性較低的數據。

#### **被放棄的資料**:
- SB (盜壘)
- 1B (一壘安打)
- 2B (二壘安打)
- 3B (三壘安打)
- GIDP (雙殺打)
- SH (犧牲觸擊)
- IBB (故意四壞球)
- HBP (觸身球)
- CS (盜壘失敗)
- GO (滾地球出局)
- FO (飛球出局)

### 2. **新增資料**
- AVG (打擊率)
- OBP (上壘率)
- SLG (長打率)
- OPS (標準攻擊指數)

## E. 網站地圖

## F. 網頁畫面截圖

## G. 使用技術說明
- **前端**: HTML, CSS, JavaScript, Thymeleaf
- **後端**: Java Spring Boot 4.23.1
- **資料庫**: SQL Server 19
- **大型語言模型**: ChatGPT 4.0

## H. 使用注意事項
- **新增資料時** 不得填入 `ID` (由系統自動生成)。
- **修改與刪除資料時** 必須填入 `ID` (以 `ID` 確定修改的資料)。
- **查詢** 只能針對 `姓名`、`隊伍名稱` 和 `球季` 進行篩選。
- **上傳檔案** 必須符合 CSV 格式。

