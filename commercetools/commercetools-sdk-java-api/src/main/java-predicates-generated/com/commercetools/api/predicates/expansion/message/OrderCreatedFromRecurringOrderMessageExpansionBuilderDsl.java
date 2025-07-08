
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl of() {
        return new OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl of(final List<String> path) {
        return new OrderCreatedFromRecurringOrderMessageExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.order.OrderExpansionBuilderDsl order() {
        return com.commercetools.api.predicates.expansion.order.OrderExpansionBuilderDsl.of(appendOne(path, "order"));
    }

    public com.commercetools.api.predicates.expansion.recurring_order.RecurringOrderReferenceExpansionBuilderDsl recurringOrderRef() {
        return com.commercetools.api.predicates.expansion.recurring_order.RecurringOrderReferenceExpansionBuilderDsl
                .of(appendOne(path, "recurringOrderRef"));
    }
}
