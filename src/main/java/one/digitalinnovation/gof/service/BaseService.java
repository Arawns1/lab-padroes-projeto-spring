package one.digitalinnovation.gof.service;

public interface BaseService<T> {
    Iterable<T> buscarTodos();

    T buscarPorId(Long id);

    void inserir(T entity);

    void atualizar(Long id, T entity);

    void deletar(Long id);

}
