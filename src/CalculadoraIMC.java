import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // criacao do obj leitor do java
        
        System.out.println("Digite sua Altura sem usar virgula:");
        //leia altura 
        float altura = leia.nextFloat();
        
        System.out.println("Digite agora seu peso, lembre de não usar virgula:");
        //leia peso
        float peso = leia.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("IMC = " + imc);
        if (imc < 18.5) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc < 24.9) {
                System.out.println("Seu peso está normal.");
            } else if (imc < 29.9) {
                System.out.println("Você está com sobrepeso.");
            } else if (imc < 34.9) {
                System.out.println("Você está com obesidade grau I.");
            } else if (imc < 39.9) {
                System.out.println("Você está com obesidade grau II (severa).");
            } else {
                System.out.println("Você está com obesidade grau III (mórbida).");
            }

    leia.close();
    }
}
/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraIMC extends JFrame {
    private JLabel lblPeso, lblAltura, lblResultado;
    private JTextField txtPeso, txtAltura;
    private JButton btnCalcular;

    public CalculadoraIMC() {
        setTitle("Calculadora de IMC");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        lblPeso = new JLabel("Peso (Kg): ");
        add(lblPeso);

        txtPeso = new JTextField();
        add(txtPeso);

        lblAltura = new JLabel("Altura (Cm): ");
        add(lblAltura);

        txtAltura = new JTextField();
        add(txtAltura);

        lblResultado = new JLabel();
        add(lblResultado);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        setVisible(true);
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText()) / 100; // Convertendo para metros
            double imc = peso / (altura * altura);

            String resultado = "Seu IMC é: " + String.format("%.2f", imc) + ".\n";

           
            lblResultado.setText(resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIMC();
            }
        });
    }
}
*/