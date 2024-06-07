
package com.commercetools.api.predicates.expansion.order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ItemStateExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ItemStateExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ItemStateExpansionBuilderDsl of() {
        return new ItemStateExpansionBuilderDsl(Collections.emptyList());
    }

    public static ItemStateExpansionBuilderDsl of(final List<String> path) {
        return new ItemStateExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }
}
