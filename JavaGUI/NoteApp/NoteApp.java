package JavaGUI.NoteApp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NoteApp {
  private JFrame frame;
  private JTextArea textArea;

  public NoteApp() {
    createGUI();
  }

  private void createGUI() {
    frame = new JFrame("Note App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textArea = new JTextArea();
    textArea.setFont(new Font("Arial", Font.PLAIN, 16));
    JScrollPane scrollPane = new JScrollPane(textArea);

    JButton saveButton = new JButton("Save");
    saveButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        saveNote();
      }
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(saveButton);

    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

    frame.setPreferredSize(new Dimension(600, 400));
    frame.pack();
    frame.setVisible(true);
  }

  private void saveNote() {
    // we have to create this folder manully on c drive
    String directoryPath = "C:\\Notes"; // replace with your desired directory path
    String fileName = "note.txt";
    String note = textArea.getText();

    try {
      FileWriter writer = new FileWriter(directoryPath + "\\" + fileName);
      writer.write(note);
      writer.close();
      System.out.println("Your note has been saved to " + directoryPath + "\\" + fileName);
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    new NoteApp();
  }
}
