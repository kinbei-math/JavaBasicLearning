package exception;


// sealedで結果を網羅できるようにする。
// interface(ラベル)をはる。intにするとメッセージが返せないのでResultという箱を返す。クラスに持たせたい機能の情報をあらかじめ設定しておく。成功と失敗を同じ型でまとめられる。
// permits 許可　　implements 具体的な中身
public sealed interface CalculationResult permits CalculationResult.Success, CalculationResult.Failure {

    //成功した時の箱に何を詰めるか
    public record Success(int value) implements CalculationResult {}

    // enum 決められたリストを作成する。選択肢を入れる箱のような役割
    public enum ErrorCode{
        // 定数を定義　エラーコード(機械用)とエラーメッセージ
        INVALID_EXPRESSION("invalid expression"),
        DIVISION_BY_ZERO("Division by zero"),
        INTERNAL_ERROR("internal error");

        // メッセージを保持する変数(不変にしておく)
        private  final String message;

        // コンストラクタ(定数作成時に呼ばれる)
        //enumのコンストラクタは自動的にprivate
        ErrorCode(String message){
            this.message = message;
        }

        // メッセージを取り出すメソッド
        public String getMessage(){
            return this.message;
        }

    }
    //失敗したときの箱に何を詰めるか。
    public record Failure(ErrorCode code) implements CalculationResult {}
}
