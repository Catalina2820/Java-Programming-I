
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        // Verifica si son la misma referencia (es decir, el mismo objeto)
        if (this == compared) {
            return true;
        }

        // Verifica si el objeto es del tipo adecuado (Song)
        if (!(compared instanceof Song)) {
            return false;
        }

        // Convierte el objeto a tipo Person
        Song comparedSong = (Song) compared;

        // Compara los atributos de los objetos
        return this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds;
    }

}
