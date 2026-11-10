
package com.commercetools.api.predicates.expansion.recurring_order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class RecurringOrderReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private RecurringOrderReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static RecurringOrderReferenceExpansionBuilderDsl of() {
        return new RecurringOrderReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static RecurringOrderReferenceExpansionBuilderDsl of(final List<String> path) {
        return new RecurringOrderReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.recurring_order.RecurringOrderExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.recurring_order.RecurringOrderExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
