package cz.sosjh.web.repository;

import cz.sosjh.web.model.BlogEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class BlogRepository {

    private BlogRepository() {
        // static repository, do not initialize
    }

    private static Map<String, BlogEntry> entries = new HashMap<>();

    public static void add(BlogEntry entry) {
        entries.put(entry.getId(), entry);
    }

    public static List<BlogEntry> getAll() {
        return Collections.unmodifiableList(new ArrayList(entries.values()));
    }

    public static BlogEntry get(String id) {
        return entries.get(id);
    }
}
