interface voteing
{
    String  vote(int age);
}
public class Votingeligibility {
    public static void main(String[] args) {
        voteing v=(age)->
        {
            if(age>18)
            {
                return " eligibal for voting";
            }
            else
            {
                return " not eligibal";
            }
        };
        v.vote(15);
    }

}
