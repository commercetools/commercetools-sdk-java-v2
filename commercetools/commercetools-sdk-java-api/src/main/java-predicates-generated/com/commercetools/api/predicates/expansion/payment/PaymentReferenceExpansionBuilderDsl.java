
package com.commercetools.api.predicates.expansion.payment;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentReferenceExpansionBuilderDsl of() {
        return new PaymentReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentReferenceExpansionBuilderDsl of(final List<String> path) {
        return new PaymentReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.payment.PaymentExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.payment.PaymentExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
