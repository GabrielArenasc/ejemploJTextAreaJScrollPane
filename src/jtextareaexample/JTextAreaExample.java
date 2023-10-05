
package jtextareaexample;

import javax.swing.*;
import java.awt.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        // Crear un nuevo marco (ventana)
        JFrame frame = new JFrame("Ejemplo de JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,600,500);
        
        // Crear un JTextArea con texto inicial
        JTextArea textArea = new JTextArea("Este es un JTextArea.\nPuedes escribir texto aquí.");
        
        // Configurar el JTextArea (opcional)
        textArea.setFont(new Font("Cambria", Font.PLAIN, 20)); // Establecer fuente y tamaño de texto
        textArea.setLineWrap(true); // Habilitar ajuste automático de línea
        textArea.setWrapStyleWord(false); // Ajustar palabras completas
        
        // Agregar el JTextArea al marco
        frame.getContentPane().add(new JScrollPane(textArea)); // Usamos JScrollPane para permitir desplazamiento
        
        // Hacer visible el marco
        frame.setVisible(true);
    }
}
