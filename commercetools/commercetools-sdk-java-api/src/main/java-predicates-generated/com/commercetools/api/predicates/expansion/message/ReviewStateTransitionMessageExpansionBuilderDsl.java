
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ReviewStateTransitionMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ReviewStateTransitionMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ReviewStateTransitionMessageExpansionBuilderDsl of() {
        return new ReviewStateTransitionMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ReviewStateTransitionMessageExpansionBuilderDsl of(final List<String> path) {
        return new ReviewStateTransitionMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl oldState() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "oldState"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl newState() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "newState"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl target() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "target"));
    }
}
