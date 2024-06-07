
package com.commercetools.api.predicates.expansion.customer_group;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomerGroupReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomerGroupReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomerGroupReferenceExpansionBuilderDsl of() {
        return new CustomerGroupReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomerGroupReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CustomerGroupReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer_group.CustomerGroupExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.customer_group.CustomerGroupExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
