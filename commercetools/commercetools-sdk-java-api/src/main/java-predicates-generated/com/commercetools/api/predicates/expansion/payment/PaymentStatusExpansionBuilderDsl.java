
package com.commercetools.api.predicates.expansion.payment;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentStatusExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentStatusExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentStatusExpansionBuilderDsl of() {
        return new PaymentStatusExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentStatusExpansionBuilderDsl of(final List<String> path) {
        return new PaymentStatusExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }
}
