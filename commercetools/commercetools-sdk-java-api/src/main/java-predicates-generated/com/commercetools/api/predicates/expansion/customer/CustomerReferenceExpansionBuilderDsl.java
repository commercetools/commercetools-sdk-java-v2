
package com.commercetools.api.predicates.expansion.customer;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomerReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomerReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomerReferenceExpansionBuilderDsl of() {
        return new CustomerReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomerReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CustomerReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.customer.CustomerExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
