
package com.commercetools.api.predicates.expansion.common;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ClientLoggingExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ClientLoggingExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ClientLoggingExpansionBuilderDsl of() {
        return new ClientLoggingExpansionBuilderDsl(Collections.emptyList());
    }

    public static ClientLoggingExpansionBuilderDsl of(final List<String> path) {
        return new ClientLoggingExpansionBuilderDsl(path);
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
