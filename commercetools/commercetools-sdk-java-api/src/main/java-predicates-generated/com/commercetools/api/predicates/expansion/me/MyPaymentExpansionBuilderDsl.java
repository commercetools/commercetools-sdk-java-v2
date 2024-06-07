
package com.commercetools.api.predicates.expansion.me;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class MyPaymentExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private MyPaymentExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static MyPaymentExpansionBuilderDsl of() {
        return new MyPaymentExpansionBuilderDsl(Collections.emptyList());
    }

    public static MyPaymentExpansionBuilderDsl of(final List<String> path) {
        return new MyPaymentExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
