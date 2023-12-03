public class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // New method to add a new note
    public static Note addNewNote(String title, String content) {
        return new Note(title, content);
    }

    // New method to edit the content of the note
    public void editNoteContent(String newContent) {
        this.content = newContent;
    }

    // Update the version number
    public static final String VERSION = "1.0.1";
}
