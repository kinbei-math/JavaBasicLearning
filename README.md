# Java Learning Portfolio

未経験からJavaエンジニアを目指して学習したコードの記録です。
RaiseTechのカリキュラムをベースに、基礎から応用まで実践しています。

## 🛠 開発環境
- OS: Windows 11
- Language: Java 17 (Amazon Corretto)
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
---
Last Updated: 2026/02/06
