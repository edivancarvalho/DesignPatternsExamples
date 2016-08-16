package command.solution_2;

import command.problem_2.Compra;

public interface PagamentoCommand {
    void processarCompra(Compra compra);
}