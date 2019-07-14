package pl.sda.builder;

public class User {
    private String  name,
                    lastname;
    private boolean active;
    private String  city,
                    password,
                    postalCode;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", active=" + active +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static final class Builder {
        private String  name,
                        lastname;
        private boolean active;
        private String  city,
                        password,
                        postalCode;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public Builder active(boolean active){
            this.active = active;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public User build(){
            User user = new User();
            user.name = this.name;
            user.lastname = this.lastname;
            user.active = this.active;
            user.city = this.city;
            user.password = this.password;
            user.postalCode = this.postalCode;
            return user;
        }
    }
}
