package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")   // mapped to Mongodb Collection
            // journal entry's instance is equals to the row
@Data      // lombok -> generates byte code for methods like
            // (reduces boile plate code to create getter setter constructor equals tostring hashcode )
// This generated code is added to the complied class files.
public class JournalEntry {       // POJO -> Plain Old Java Object
    @Id  // unique key primary key
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;


}
