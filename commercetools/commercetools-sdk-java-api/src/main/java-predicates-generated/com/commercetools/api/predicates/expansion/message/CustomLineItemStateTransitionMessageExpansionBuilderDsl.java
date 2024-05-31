
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomLineItemStateTransitionMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomLineItemStateTransitionMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomLineItemStateTransitionMessageExpansionBuilderDsl of() {
        return new CustomLineItemStateTransitionMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomLineItemStateTransitionMessageExpansionBuilderDsl of(final List<String> path) {
        return new CustomLineItemStateTransitionMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl fromState() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "fromState"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl toState() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "toState"));
    }
}
