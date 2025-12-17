package RelogioMundial;

import javax.swing.*;
import java.awt.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class RelogioMundialApp extends JFrame {

    private final Map<String, ZoneId> fusosHorarios;

    private final Map<String, JLabel> rotulosHora;

    private final Map<String, JLabel> rotulosData;

    public RelogioMundialApp(){
        super("Relógio Mundial");

        setSize(900, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0x1e2a38));
        setLayout(new BorderLayout());

        fusosHorarios = new LinkedHashMap<>();

        fusosHorarios.put("UTC",ZoneId.of("Etc/UTC"));
        fusosHorarios.put("Nova Iorque",ZoneId.of("America/New_York"));
        fusosHorarios.put("São Paulo",ZoneId.of("America/Sao_Paulo"));
        fusosHorarios.put("Londres",ZoneId.of("Europe/London"));
        fusosHorarios.put("Paris",ZoneId.of("Europe/Paris"));
        fusosHorarios.put("Toquio",ZoneId.of("Asia/Tokyo"));
        fusosHorarios.put("Sidney",ZoneId.of("Australia/Sydney"));

        rotulosHora = new HashMap<>();

        rotulosData = new HashMap<>();

        configurarLayout();
        iniciarAtualizacao();
    }

    private void configurarLayout(){

        Font fontTitulo = new Font("Arial", Font.BOLD, 18);
        JLabel titulo = new JLabel("Relógio Mundial", JLabel.CENTER);
        titulo.setFont(fontTitulo);
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(new Color(0x1e2a38));
        titulo.setOpaque(true);
        add(titulo, BorderLayout.NORTH);
        JPanel painelCentral = new JPanel();

        painelCentral.setBackground(new Color(0x1e2a38));
        painelCentral.setLayout(new javax.swing.BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(painelCentral, BorderLayout.CENTER);

        Font fonteNome = new Font("Arial", Font.BOLD, 14);
        Font fonteHora = new Font("Arial", Font.BOLD, 14);
        Font fonteData = new Font("Arial", Font.PLAIN, 14);

        for(String cidade : fusosHorarios.keySet()){
            JPanel linha = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));

            linha.setBackground(new Color(0x1e2a38));

            JLabel rotuloCidade = new JLabel(cidade);

            rotuloCidade.setFont(fonteNome);
            rotuloCidade.setForeground(Color.WHITE);
            linha.add(rotuloCidade);
            JLabel  rotuloHoraLocal = new JLabel();

            rotuloHoraLocal.setFont(fonteHora);

            rotuloHoraLocal.setForeground(new Color(0x00c1d2));

            linha.add(rotuloHoraLocal);

            rotulosHora.put(cidade, rotuloHoraLocal);

            JLabel rotuloDataLocal = new JLabel();

            rotuloDataLocal.setFont(fonteData);

            rotuloDataLocal.setForeground(new Color(0xb0bec5));

            linha.add(rotuloDataLocal);

            rotulosData.put(cidade, rotuloDataLocal);

            painelCentral.add(linha);
        }




    }

    private void iniciarAtualizacao(){

        Timer temporizador = new Timer(1000, e-> atualizarRelogios());

        temporizador.start();
    }

    private void atualizarRelogios(){

        Locale localePT = new Locale("pt", "BR");

        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy", localePT);

        for (Map.Entry<String, ZoneId> entrada : fusosHorarios.entrySet()){

            String cidade = entrada.getKey();

            ZoneId fuso = entrada.getValue();

            ZonedDateTime agora = ZonedDateTime.now(fuso);
            String horaTexto = agora.format(fmtHora);

            String dataTexto = agora.format(fmtData);

            dataTexto = capitalizarInicio(dataTexto);

            rotulosHora.get(cidade).setText(horaTexto);

            rotulosData.get(cidade).setText(dataTexto);


        }
    }

    private String capitalizarInicio(String texto){
        if(texto == null || texto.isEmpty()) return texto;

        return texto.substring(0,1).toUpperCase() + texto.substring(1);
    }


}

