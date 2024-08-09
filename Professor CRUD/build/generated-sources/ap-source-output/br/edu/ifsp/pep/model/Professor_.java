package br.edu.ifsp.pep.model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-09T20:52:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Professor.class)
public class Professor_ { 

    public static volatile SingularAttribute<Professor, String> uf;
    public static volatile SingularAttribute<Professor, String> prontuario;
    public static volatile SingularAttribute<Professor, String> cidade;
    public static volatile SingularAttribute<Professor, String> endereço;
    public static volatile SingularAttribute<Professor, String> nome;
    public static volatile SingularAttribute<Professor, Date> dataNascimento;
    public static volatile SingularAttribute<Professor, String> cep;

}