
package com.commercetools.api.predicates.expansion.business_unit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class InheritedAssociateExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private InheritedAssociateExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static InheritedAssociateExpansionBuilderDsl of() {
        return new InheritedAssociateExpansionBuilderDsl(Collections.emptyList());
    }

    public static InheritedAssociateExpansionBuilderDsl of(final List<String> path) {
        return new InheritedAssociateExpansionBuilderDsl(path);
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
