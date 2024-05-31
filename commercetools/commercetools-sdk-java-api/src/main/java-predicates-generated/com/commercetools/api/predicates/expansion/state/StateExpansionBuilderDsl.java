
package com.commercetools.api.predicates.expansion.state;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StateExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StateExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StateExpansionBuilderDsl of() {
        return new StateExpansionBuilderDsl(Collections.emptyList());
    }

    public static StateExpansionBuilderDsl of(final List<String> path) {
        return new StateExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl transitions() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "transitions[*]"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl transitions(long index) {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "transitions[" + index + "]"));
    }
}
