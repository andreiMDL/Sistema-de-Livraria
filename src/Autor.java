import java.time.LocalDate;

public class Autor {

    //<editor-fold desc="Atributos">
    private int idAutor;
    private String nome;
    private LocalDate dataNascimento;
    //</editor-fold>

    //<editor-fold desc="Construtor">

    public Autor(int idAutor, String nome, LocalDate dataNascimento) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Autor() {

    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //</editor-fold>

    @Override
    public String toString(){
        return "Autor{" +
                "id =" + idAutor +
                ", nome = '" +
                '\'' + ", dataNascimento = "+ dataNascimento + "}";
    }
}
