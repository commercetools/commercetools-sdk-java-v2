
package com.commercetools.api.predicates.expansion.recurrence_policy;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class RecurrencePolicyExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private RecurrencePolicyExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static RecurrencePolicyExpansionBuilderDsl of() {
        return new RecurrencePolicyExpansionBuilderDsl(Collections.emptyList());
    }

    public static RecurrencePolicyExpansionBuilderDsl of(final List<String> path) {
        return new RecurrencePolicyExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }
}
