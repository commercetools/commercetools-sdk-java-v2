
package com.commercetools.api.predicates.expansion.business_unit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AssociateExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AssociateExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AssociateExpansionBuilderDsl of() {
        return new AssociateExpansionBuilderDsl(Collections.emptyList());
    }

    public static AssociateExpansionBuilderDsl of(final List<String> path) {
        return new AssociateExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }
}
