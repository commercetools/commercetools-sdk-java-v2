
package com.commercetools.api.predicates.expansion.common;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CreatedByExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CreatedByExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CreatedByExpansionBuilderDsl of() {
        return new CreatedByExpansionBuilderDsl(Collections.emptyList());
    }

    public static CreatedByExpansionBuilderDsl of(final List<String> path) {
        return new CreatedByExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl associate() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "associate"));
    }
}
