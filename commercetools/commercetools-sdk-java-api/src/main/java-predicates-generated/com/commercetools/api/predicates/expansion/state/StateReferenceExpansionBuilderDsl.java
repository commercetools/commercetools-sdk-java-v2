
package com.commercetools.api.predicates.expansion.state;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StateReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StateReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StateReferenceExpansionBuilderDsl of() {
        return new StateReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static StateReferenceExpansionBuilderDsl of(final List<String> path) {
        return new StateReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.state.StateExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.state.StateExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
