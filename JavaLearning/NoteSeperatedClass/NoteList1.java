package JavaLearning.NoteSeperatedClass;

import java.io.File;
import java.util.ArrayList;

public class NoteList1 {

    @SuppressWarnings("unused")
    private static final String NoteSaver = null;
    private ArrayList<Note> notes;

    public NoteList1(String directoryPath) {
        notes = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    Note note = new Note();
                    note.setTitle(file.getName());
                    //note.setText(NoteSaver.NoteLoader.loadNoteFromFile(file));
                    notes.add(note);
                }
            }
        }
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNoteToList(Note note) {
        notes.add(note);
    }

    public void removeNoteFromList(Note note) {
        notes.remove(note);
    }

    // public void saveAllNotes(NoteSaver noteSaver) {
    //     for (Note note : notes) {
    //         noteSaver.saveNote(note.getTitle(), note.getText());
    //     }
    // }
}
