
package com.commercetools.api.predicates.expansion.common;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ReferenceExpansionBuilderDsl of() {
        return new ReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

}
