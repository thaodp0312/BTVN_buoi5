public class giaithua {
    int i, gt=1;
    int tinhgiaithua(int n){
        if (n==0) {
            return 1;
        }
            for (i=1;i<=n;i++){
                gt=i*gt;
                gt=gt;
            }
        return gt;
        }

    }



