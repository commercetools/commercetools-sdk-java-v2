
package com.commercetools.api.predicates.expansion;

import java.util.Collections;
import java.util.List;

public class ObjectExpansionDsl implements ExpansionDsl {
    private final List<String> path;

    private ObjectExpansionDsl(final List<String> path) {
        this.path = path;
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public static ObjectExpansionDsl of() {
        return new ObjectExpansionDsl(Collections.emptyList());
    }

    public static ObjectExpansionDsl of(final List<String> path) {
        return new ObjectExpansionDsl(path);
    }
}
