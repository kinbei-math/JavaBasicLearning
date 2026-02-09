package exception;


// sealedで結果を網羅できるようにする。
// interface(ラベル)をはる。intにするとメッセージが返せないのでResultという箱を返す。クラスに持たせたい機能の情報をあらかじめ設定しておく。成功と失敗を同じ型でまとめられる。
// permits 許可　　implements 具体的な中身
public sealed interface CalculationResult permits CalculationResult.Success, CalculationResult.Failure {

    //成功した時の箱に何を詰めるか
    public record Success(int value) implements CalculationResult {}

    // enum 決められたリストを作成する。選択肢を入れる箱のような役割
    public enum ErrorCode{INVALID_EXPRESSION,DIVIDE_BY_ZERO}
    //失敗したときの箱に何を詰めるか。
    public record Failure(ErrorCode code, String message) implements CalculationResult {}
}
