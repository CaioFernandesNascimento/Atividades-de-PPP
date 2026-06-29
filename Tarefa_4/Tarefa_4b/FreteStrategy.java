public interface FreteStrategy {
    double calcula(double distancia);
}

// poderia ter implementado o calcula frete dentro do calcula total, mas daria mais trabalho e teria q adicionar
// mais parametros a função calcula total, ai ficou separado