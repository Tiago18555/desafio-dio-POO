package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargahoraria;


    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargahoraria;
    }

    @Override
    public String toString(){
        return String
                .format("Mentoria{ \ntitulo = '%s'\ndescricao='%s'\ncarga horaria='%s'\n}",
                getTitulo(), getDescricao(), cargahoraria);
    }
}
