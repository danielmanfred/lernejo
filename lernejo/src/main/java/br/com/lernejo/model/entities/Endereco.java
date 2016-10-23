
package br.com.lernejo.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Representa a tabela Endereco no banco de dados.
 */
@Entity
@Table (name = "endereco")
public class Endereco implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column (name = "IdEndereco", nullable = false)
    private Integer idEndereco;
    @Column (name = "Bairro", length = 50)
    private String bairro;
    @Column (name = "Rua", length = 50)
    private String rua;
    @Column (name = "CEP", length = 9)
    private String cep;
    @Column (name = "Numero")
    private Integer numero;
}
