package JavaGUI.NoteTaker;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NoteTaker extends JFrame {
    private JPanel panel;
    private JButton saveButton;
    private JComboBox<String> notesComboBox;
    private JTextArea textArea;
    private ArrayList<File> notesList;
    private String directoryPath = "C:/Notes";

    public NoteTaker() {
        super("Note Taker");
        notesList = new ArrayList<File>();
        createGUI();
        loadNotes();
    }

    private void createGUI() {
        // Initialize panel, text area, and button
        panel = new JPanel();
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);

        saveButton = new JButton("Save Note");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveNote();
            }
        });

        // Initialize notes combo box
        notesComboBox = new JComboBox<String>();
        notesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = notesComboBox.getSelectedIndex();
                if (selectedIndex >= 0) {
                    loadNoteFromFile(notesList.get(selectedIndex));
                }
            }
        });

        // Initialize close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Add components to panel
        panel.add(saveButton);
        panel.add(notesComboBox);
        panel.add(closeButton);

        // Add components to panel
        panel.add(saveButton);
        panel.add(notesComboBox);

        // Add components to frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);

        // Set window dimensions and make visible
        setPreferredSize(new Dimension(600, 400));
        pack();
        setVisible(true);
    }

    private void saveNote() {
        // Get filename from user
        String fileName = JOptionPane.showInputDialog("Enter file name:");

        // Get note text from text area
        String note = textArea.getText();

        // Create File object for directory path and write note to file
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Directory created: " + directory.getAbsolutePath());
        }

        try {
            if (!fileName.endsWith(".txt")) {
                fileName += ".txt";
            }
            FileWriter writer = new FileWriter(directoryPath + "\\" + fileName);
            writer.write(note);
            writer.close();
            System.out.println("Your note has been saved to " + directoryPath + "\\" + fileName);
            loadNotes();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void loadNotes() {
        notesComboBox.removeAllItems();
        notesList.clear();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    notesList.add(file);
                    notesComboBox.addItem(file.getName());
                }
            }
        }

        if (notesComboBox.getItemCount() > 0) {
            notesComboBox.setSelectedIndex(0);
            loadNoteFromFile(notesList.get(0));
        }
    }

    private void loadNoteFromFile(File file) {
        textArea.setText("");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new NoteTaker();
    }
}