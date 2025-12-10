package Interface_Grafica;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Crud_JLIst {

    static class Item {
        final int id;

        String nome;

        Item(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return nome;
        }
    }

    private final List<Item> dados = new ArrayList<>();

    private int proximoId = 1;
    private JFrame janela;

    private JList<Item> lista;

    private DefaultListModel<Item> modeloFiltrado;

    private JTextField campoNome;
    private JTextField campoPesquisa;

    private JLabel rotuloContagem;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Crud_JLIst().iniciar());
    }

    private void iniciar() {
        janela = new JFrame("JList - CRUD + Pesquisa");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setSize(800, 500);

        janela.setLocationRelativeTo(null);

        janela.setLayout(new BorderLayout(10, 10));

        adicionarItemInicial("maça");
        adicionarItemInicial("Banana");
        adicionarItemInicial("Laranja");
        adicionarItemInicial("Uva");
        adicionarItemInicial("Pêra");

        JPanel painellTopo = new JPanel(new BorderLayout(8, 8));

        JPanel painelPesquisa = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));

        painelPesquisa.add(new JLabel("Pesquisar"));

        campoPesquisa = new JTextField(25);

        JButton botaoLimparBusca = new JButton("Limpar");

        painelPesquisa.add(campoPesquisa);

        painelPesquisa.add(botaoLimparBusca);

        rotuloContagem = new JLabel("Itens: 0");
        JPanel painelDireitaTopo = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));


        painelDireitaTopo.add(rotuloContagem);

        painellTopo.add(painelPesquisa, BorderLayout.WEST);


        painellTopo.add(painelDireitaTopo, BorderLayout.EAST);


        janela.add(painellTopo, BorderLayout.NORTH);

        modeloFiltrado = new DefaultListModel<>();

        lista = new JList<>(modeloFiltrado);

        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        lista.setVisibleRowCount(12);

        lista.setFixedCellHeight(24);

        lista.addMouseListener(new MouseAdapter() {


            public void mouseCliked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Item sel = lista.getSelectedValue();

                    if (sel != null) campoNome.setText(sel.nome);

                }
            }
        });

        lista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    excluirSelecionado();
                }
            }
        });

        JScrollPane rolagem = new JScrollPane(lista);

        janela.add(rolagem, BorderLayout.CENTER);

        JPanel painelRodape = new JPanel(new GridBagLayout());

        painelRodape.setBorder(BorderFactory.createTitledBorder("Cadastro simples"));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(6, 6, 6, 6);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;

        painelRodape.add(new JLabel("Nome: "), gbc);

        campoNome = new JTextField(30);

        gbc.gridx = 1; gbc.gridy = 0;

        gbc.weightx = 1.0;

        painelRodape.add(campoNome, gbc);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));

        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnAlterar = new JButton("Alterar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnLimpar);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 0;

        painelRodape.add(painelBotoes, gbc);
        janela.add(painelRodape, BorderLayout.SOUTH);

        campoPesquisa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                aplicarFiltro();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                aplicarFiltro();

            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                aplicarFiltro();

            }
        });

        botaoLimparBusca.addActionListener(e -> {
            campoPesquisa.setText("");
            aplicarFiltro();
        });

        btnAdicionar.addActionListener(e -> {
            String nome = campoNome.getText().trim();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(janela, "Digite um nome para adicionar.");
                return;
            }
            dados.add(new Item(proximoId++, nome));

            campoNome.setText("");

            aplicarFiltro();

            JOptionPane.showMessageDialog(janela, "Item adicionado com sucesso!");
        });

        btnAlterar.addActionListener(e -> {
            alterarSelecionado();

        });
        btnExcluir.addActionListener(e -> excluirSelecionado());

        btnLimpar.addActionListener(e -> campoNome.setText(""));
        aplicarFiltro();

        janela.setVisible(true);





    }

    private void aplicarFiltro() {
        String termo = campoPesquisa == null ? " " : campoPesquisa.getText().trim().toLowerCase();

        modeloFiltrado.clear();
        for (Item it : dados) {
            if (termo.isEmpty() || it.nome.toLowerCase().contains(termo)) {
                modeloFiltrado.addElement(it);
            }
        }
        atualizaContagem();
    }

    private void atualizaContagem() {
        rotuloContagem.setText("Itens exibidos: " + modeloFiltrado.getSize() + " | Total: " + dados.size());
    }

    private void alterarSelecionado() {
        Item sel = lista.getSelectedValue();

        if (sel == null) {
            JOptionPane.showMessageDialog(janela, "Selecione um item para alterar.");
            return;
        }
        String novoNome = campoNome.getText().trim();
        if (novoNome.isEmpty()) {
            JOptionPane.showMessageDialog(janela, "Digite o novo nome no campo 'Nome'.");
            return;

        }
        sel.nome = novoNome;

        aplicarFiltro();
        JOptionPane.showMessageDialog(janela, "Item alterado com sucesso!");
    }


    private void adicionarItemInicial(String nome) {
        dados.add(new Item(proximoId++, nome));
    }

    private void excluirSelecionado() {

        Item sel = lista.getSelectedValue();
        if (sel == null) {
            JOptionPane.showMessageDialog(janela, "Selecione o item para excluir");
            return;
        }
        int op = JOptionPane.showConfirmDialog(janela, "Excluir \"" + sel.nome + "\"?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_NO_OPTION) {
            dados.removeIf(i -> i.id == sel.id);
            aplicarFiltro();
            JOptionPane.showMessageDialog(janela, "Item excluído!");
        }

    }


}
