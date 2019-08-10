package ac.za.cput.domain.demography;

import java.util.Objects;

public class Race {
    private String black,coloured,indian,white,id;

    private Race(){}

    private Race (Builder builder){
            this.black=builder.black;
            this.coloured=builder.coloured;
            this.id=builder.id;
            this.white=builder.white;
            this.indian=builder.indian;
    }

    public String getBlack() {
        return black;
    }

    public String getId() {
        return id;
    }

    public String getColoured() {
        return coloured;
    }

    public String getIndian() {
        return indian;
    }

    public String getWhite() {
        return white;
    }

    public static  class Builder{
       private String black,coloured,indian,white,id;
         public Builder black(String black){
             this.black=black;
             return this;
         }
         public Builder white(String white){
             this.white=white;
             return this;
         }
        public Builder coloured(String coloured){
            this.coloured=coloured;
            return this;
        }
        public Builder indian(String indian){
            this.indian=indian;
            return this;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder copy (Race race){
            this.black=race.black;
            this.coloured=race.coloured;
            this.id=race.id;
            this.white=race.white;
            this.indian=race.indian;
            return this;
        }

    public Race build(){return new Race(this);}
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return race.equals(race.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
