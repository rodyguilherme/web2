import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        int opcao = 0;

        do {
            String input = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1 - Adicionar tarefa\n" +
                "2 - Remover tarefa\n" +
                "3 - Listar todas as tarefas\n" +
                "4 - Sair do programa");

            if (input == null) break;

            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    try {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da tarefa:"));
                        String titulo = JOptionPane.showInputDialog("Digite o título da tarefa:");
                        if (titulo != null && !titulo.isEmpty()) {
                            listaDeTarefas.add(new Tarefa(codigo, titulo));
                            JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso.");
                        } else {
                            JOptionPane.showMessageDialog(null, "O título não pode ser vazio.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Código inválido.");
                    }
                    break;

                case 2:
                    try {
                        int codigoRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da tarefa a remover:"));
                        boolean removido = false;
                        for (Tarefa t : listaDeTarefas) {
                            if (t.getCodigo() == codigoRemover) {
                                listaDeTarefas.remove(t);
                                JOptionPane.showMessageDialog(null, "Tarefa removida.");
                                removido = true;
                                break;
                            }
                        }
                        if (!removido) {
                            JOptionPane.showMessageDialog(null, "Tarefa não encontrada.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Código inválido.");
                    }
                    break;

                case 3:
                    if (listaDeTarefas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada.");
                    } else {
                        StringBuilder sb = new StringBuilder("Lista de Tarefas:\n\n");
                        for (Tarefa t : listaDeTarefas) {
                            sb.append(t.toString()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 4);
    }
}