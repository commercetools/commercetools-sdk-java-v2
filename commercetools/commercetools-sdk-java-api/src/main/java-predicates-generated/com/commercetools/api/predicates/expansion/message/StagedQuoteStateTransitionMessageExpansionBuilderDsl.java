
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StagedQuoteStateTransitionMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StagedQuoteStateTransitionMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StagedQuoteStateTransitionMessageExpansionBuilderDsl of() {
        return new StagedQuoteStateTransitionMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static StagedQuoteStateTransitionMessageExpansionBuilderDsl of(final List<String> path) {
        return new StagedQuoteStateTransitionMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl oldState() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "oldState"));
    }
}
