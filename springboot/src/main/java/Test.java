/**
 * @author Herbert
 * @create 2019-06-02 08:56
 * catch里面有return语句，finally会执行吗？如果过会，return是在finally前执行还是后执行？
 * ---会，finally优先与catch执行
 */
public class Test {
    public static void main(String[] args) {
        int r= getDiv(10,0);
        System.out.println("r="+r);
    }


    public static int getDiv(int a , int b){
        int i;
        try {
            i= a/b;
            System.out.println("异常后代码执行了。。。");
            return i;
        }catch (Exception e){
            System.out.println("分母不能为0");
            i=-1;
            return i;  //如果r=-1，代表catch里的return先执行，然后是finally
            }finally {
            System.out.println("finally被执行了。。。");
            i=-2;  //如果R=-2，代表finally先执行，然后是catch里的return
            return i;
        }

    }
}
