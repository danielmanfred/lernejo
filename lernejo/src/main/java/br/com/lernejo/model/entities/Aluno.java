
package br.com.lernejo.model.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Representa a tabela Aluno do banco de dados.
 */
@Entity
@Table (name = "aluno")
public class Aluno extends Pessoa
{
    @Column (name = "DataDeMatricula", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataMatricula;
    
    
    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}