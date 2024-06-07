
package com.commercetools.api.predicates.expansion.type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class FieldContainerExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private FieldContainerExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static FieldContainerExpansionBuilderDsl of() {
        return new FieldContainerExpansionBuilderDsl(Collections.emptyList());
    }

    public static FieldContainerExpansionBuilderDsl of(final List<String> path) {
        return new FieldContainerExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.ObjectExpansionDsl withName(final String name) {
        return com.commercetools.api.predicates.expansion.ObjectExpansionDsl.of(appendOne(path, name));
    }
}
