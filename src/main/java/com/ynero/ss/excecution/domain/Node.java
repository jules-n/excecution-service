package com.ynero.ss.excecution.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = Node.COLLECTION_NAME)
public class Node {
    public static final String COLLECTION_NAME = "nodes";
    @Indexed(unique = true)
    private UUID nodeId;
    private String script;
    private byte[] compiledScript;
    private List<String> args;
}
