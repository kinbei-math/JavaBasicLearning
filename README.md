# Java Learning Portfolio

未経験からJavaエンジニアを目指して学習したコードの記録です。
RaiseTechのカリキュラムをベースに、基礎から応用まで実践しています。

## 🛠 開発環境
- OS: Windows 11
- Language: Java 25 (Amazon Corretto)
- JUtil6
- IDE: IntelliJ IDEA Community Edition

## 📚 学習ログ（進捗順）

### 1. Javaの基礎と環境構築
- **日付**: 1/30
- **ファイル**: [basic/Main.java](src/basic/Main.java)
- **学習内容**:
  - JDK/IDEのインストールと設定
  - `Hello World` の出力
  - クラスとメソッドの基本構造（`public static void main`）

### 2. 変数とデータ型（自己紹介プログラム）
- **日付**: 1/30
- **ファイル**: [basic/SelfIntroduction.java](src/basic/SelfIntroduction.java)
- **学習内容**:
  - 変数の宣言と初期化 (`String`, `int`, `double`)
  - 文字列の結合と演算子の優先順位
- **メモ**: `age + 10` の計算時、`()` で囲まないと文字列として連結されてしまう点に注意。

### 4. 配列とループ処理（点数集計システム）
- **日付**: 1/31
- **ファイル**: [basic/ScoreManager.java](src/basic/ScoreManager.java)
- **学習内容**:
  - 配列の宣言 `int[] arr = new int[n];`
  - 配列のインデックスと `ArrayIndexOutOfBoundsException` の回避
  - ループ内で入力を受け取りながらの集計処理

### 5. オブジェクト指向の基礎（RPG勇者作成）
- **日付**: 1/31
- **ファイル**: [oop/GameMain.java](src/oop/GameMain.java), [oop/Hero.java](src/oop/Hero.java)
- **学習内容**:
  - クラス（設計図）とインスタンス（実体）の関係
  - `new` 演算子による生成と、フィールド/メソッドの定義
  - `static` の有無による「クラスの持ち物」と「個人の持ち物」の違い

### 6. コンストラクタとカプセル化
- **日付**: 1/31
- **ファイル**: [oop/Hero.java](src/oop/Hero.java)
- **学習内容**:
  - コンストラクタによる初期化処理（`new oop.Hero("名前")`）
  - `private` 修飾子によるフィールドの保護（カプセル化）
  - Getterメソッドを使った安全な値の取得

### 7. 継承とオーバーライド
- **日付**: 1/31
- **ファイル**: [oop/SuperHero.java](src/oop/SuperHero.java)
- **学習内容**:
  - `extends` を使ったクラスの継承
  - `super()` による親クラスコンストラクタの呼び出し
  - `@Override` によるメソッドの上書き（多態性の準備）

### 8. 多態性とコレクション（ArrayList）
- **日付**: 1/31
- **ファイル**: [oop/GameMain.java](src/oop/GameMain.java)
- **学習内容**:
  - 親クラス型 (`oop.Hero`) のリストに子クラス (`oop.SuperHero`) を混在させる多態性の実践
  - 配列の限界と `ArrayList` の利便性（`add`, `get`, `size`）

### 9. 抽象クラスとインターフェース
- **日付**: 1/31
- **ファイル**: [oop/Character.java](src/oop/Character.java), [oop/Human.java](src/oop/Human.java)
- **学習内容**:
  - `abstract class` による共通仕様の強制
  - `interface` による多重継承的な機能の実装（`implements`）

### 10. 辞書マップ（HashMap）
- **日付**: 1/31
- **ファイル**: [oop/GameMain.java](src/oop/GameMain.java)
- **学習内容**:
  - `HashMap<Key, Value>` を使ったペアでのデータ管理
  - `put`（登録・上書き）と `get`（取得）
  - ラッパークラス（`Integer`）の必要性の理解

### 11. 例外処理（try-catch）
- **日付**: 2/2
- **ファイル**: [exception/SimpleCalc.java](src/exception/SimpleCalc.java)
- **学習内容**:
  - `try-catch-finally` 構文によるエラー制御
  - 一般的な例外クラスの使い分け (`NumberFormatException`, `ArithmeticException`)
  - `Scanner` 使用時の入力チェックとリソース解放 (`close`)

### 12. 例外処理(例外処理をJUnitでテスト)
- **日付**: 2/6
- **ファイル**:[exception/calculator.java](src/exception/Calculator.java),[exceptionTest/CalculatorTest](src/exceptionTest/CalculatorTest.java)
- **学習内容**:
  - JUnitでのテスト
  - 純粋メソッドの中に閉じ込めたロジックに対して例外を処理する
  - 正規表現を用いて文字列を分解、検証

### 13. 例外処理(例外をThrow)
- **日付**: 2/7
- **ファイル**:[exceptionTest/CalculateTest.java](src/exceptionTest/CalculateTest.java),[exception/Calculator.java](src/exception/Calculator.java)
- **学習内容**:
  - JUnitのテストの名称をより実務向けに
  - Partternのインスタンスをメソッドの外にだしてPrivate static finalで定義
  - 負の数を含む計算をテストに追加
  - エラーを検出するだけでなく、エラーの種類を検出できるようにメッセージをもらう

### 14.W1回収：戻り値版（sealed Result）着手 + テスト追加開始
- **日付**: 2026/02/10
- **ファイル**:[exception/Calculator.java](src/main/java/exception/Calculator.java),[exception/ResultCalculator.java](src/main/java/exception/ResultCalculator.java),[exception/CalculationResult.java](src/main/java/exception/CalculationResult.java),[exceptionTest/CalculateTest.java](src/test/java/exceptionTest/CalculateTest.java),[exceptionTest/ResultCalculateTest.java](src/test/java/exceptionTest/ResultCalculateTest.java)
- **学習内容**:
  - sealed interface + record Success/Failure で計算結果を型として表現
  - 戻り値版のJUnitを1本追加（Successケース）
  - 仕様（invalid expression統一、演算子制約、/0）との整合性をレビュー観点で確認

  ### 15. equals/hashCode の手動実装（Itemクラス）
  - **日付**: 2026/02/12
  - **ファイル**: [production/Item.java](src/production/Item.java)
  - **学習内容**:
    - `record`禁止条件のもとで`equals`/`hashCode`/`toString`を手動実装
    - 等価性の根拠を「品目コード(`itemCode`)のみ」と定義した設計判断
    - `private final`フィールドによる不変オブジェクトの設計
    - `instanceof`のパターンマッチングとnull安全性の確認
    - Getterはクラス外向けの窓口であり、クラス内部では直接参照が適切
    - `int`と`Integer`の使い分け（未設定を表現するためのnull許容）

### 16. equals/hashCode のテスト（ItemCodeTest）
- **日付**: 2026/02/13
- **ファイル**: [productionTest/ItemCodeTest.java](src/productionTest/ItemCodeTest.java)
- **学習内容**:
  - JUnitで equals/hashCode の挙動を4ケースで証明
  - assertTrue より assertEquals の方がItemの等価性検証として意図が明確
  - HashSetの重複排除がhashCode/equalsに依存することを確認
  - ItemオブジェクトをHashMapのキーとして使い、別オブジェクトでも取得できることを証明

### 17. クラス分割（ItemValidator / ItemManager）
- **日付**: 2026/02/15
- **ファイル**: [production/ItemValidator.java](src/production/ItemValidator.java), [production/ItemManager.java](src/production/ItemManager.java)
- **学習内容**:
  - 入力検証（ItemValidator）/ ドメイン（Item）/ 管理ロジック（ItemManager）の3層分割
  - `Objects.requireNonNull()`によるnullチェックの慣習的な書き方
  - `null`返却より`NoSuchElementException`を投げる設計判断
  - `private final`でフィールドを保護する重要性

### 18. クラス分割のテスト（ItemValidatorTest / ItemManagerTest）
- **日付**: 2026/02/15
- **ファイル**: [productionTest/ItemValidatorTest.java](src/productionTest/ItemValidatorTest.java), [productionTest/ItemManegerTest.java](src/productionTest/ItemManegerTest.java)
- **学習内容**:
  - 異なる不正入力パターンは別テストに分ける（どの入力で落ちたか特定できるようにする）
  - 同じ観点の検証は1テストにまとめる
  - テストを分ける基準：「条件が異なるか／観点が異なるか」

### 19. Git ブランチ運用
- **日付**: 2026/02/15
- **学習内容**:
  - `feature/w2-item-equals`ブランチで作業→mainにmergeするフローを実践
  - コミットメッセージは`feat:` / `test:` / `fix:` / `refactor:`で内容を明示する
  - 作業開始前に`git pull`する習慣をつける

### 20. Stream API 基礎（getAllItems / getTotalSafetyStock / getItemsBelowSafetyStock）

- **日付**: 2026/02/15
- **ファイル**: [production/ItemManager.java](src/production/ItemManager.java), [productionTest/ItemManagerTest.java](src/productionTest/ItemManagerTest.java)
- **学習内容**:
  - `getAllItems()`: `HashMap.values()` → `List.copyOf()` で変更不可リストを返す設計
  - `getTotalSafetyStock()`: ループ版 → Stream版（`mapToInt` + `sum`）への書き換え
  - `getItemsBelowSafetyStock()`: `filter` を使った条件抽出
  - テスト設計：正常系・空リスト・境界値（片方だけ引っかかるケース）の観点

### 21. Stream API 応用（groupByCategory / exportToCsv / findItem）

- **日付**: 2026/02/17
- **ファイル**: [production/ItemManager.java](src/production/ItemManager.java), [productionTest/ItemManagerTest.java](src/productionTest/ItemManagerTest.java)
- **学習内容**:
  - `groupByCategory()`: `Collectors.groupingBy` でカテゴリ別に分類
  - `exportToCsv()`: `BufferedWriter` + `try-with-resources` でCSV出力
  - `findItem()`: `Optional.ofNullable` で null安全な検索を実装
  - `@AfterEach` でテスト後の一時ファイル削除

### 22. flatMap による平坦化

- **日付**: 2026/02/18
- **ファイル**: [production/ItemManager.java](src/production/ItemManager.java), [productionTest/ItemManagerTest.java](src/productionTest/ItemManagerTest.java)
- **学習内容**:
  - `getAllItemsFromCategories()`: `flatMap` でネストしたリスト（`List<List<Item>>`）を平坦化
  - `flatMap(List::stream)` でリストの集まりを1つのStreamに変換する仕組みを理解
  - W3のDoD（Stream API / Optional / CSV出力）を完了
---
Last Updated: 2026/02/18
