
package com.commercetools.api.predicates.expansion.payment_method;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentMethodReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentMethodReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentMethodReferenceExpansionBuilderDsl of() {
        return new PaymentMethodReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentMethodReferenceExpansionBuilderDsl of(final List<String> path) {
        return new PaymentMethodReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.payment_method.PaymentMethodExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.payment_method.PaymentMethodExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
