
package com.commercetools.api.predicates.expansion.customer;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomerPasswordTokenReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomerPasswordTokenReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomerPasswordTokenReferenceExpansionBuilderDsl of() {
        return new CustomerPasswordTokenReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomerPasswordTokenReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CustomerPasswordTokenReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

}
