
package com.commercetools.api.predicates.expansion.order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentInfoExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentInfoExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentInfoExpansionBuilderDsl of() {
        return new PaymentInfoExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentInfoExpansionBuilderDsl of(final List<String> path) {
        return new PaymentInfoExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.payment.PaymentReferenceExpansionBuilderDsl payments() {
        return com.commercetools.api.predicates.expansion.payment.PaymentReferenceExpansionBuilderDsl
                .of(appendOne(path, "payments[*]"));
    }

    public com.commercetools.api.predicates.expansion.payment.PaymentReferenceExpansionBuilderDsl payments(long index) {
        return com.commercetools.api.predicates.expansion.payment.PaymentReferenceExpansionBuilderDsl
                .of(appendOne(path, "payments[" + index + "]"));
    }
}
