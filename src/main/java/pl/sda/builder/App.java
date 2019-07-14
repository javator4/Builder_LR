package pl.sda.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User.Builder()
                .name("Jan")
                .lastname("Kowalski")
                .active(true)
                .city("Torun")
                .password("bassword")
                .postalCode("87-100")
                .build();

        System.out.println(user.toString());

    }
}
