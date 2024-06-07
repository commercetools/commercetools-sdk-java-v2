
package com.commercetools.api.predicates.expansion.customer;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomerEmailTokenReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomerEmailTokenReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomerEmailTokenReferenceExpansionBuilderDsl of() {
        return new CustomerEmailTokenReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomerEmailTokenReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CustomerEmailTokenReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

}
