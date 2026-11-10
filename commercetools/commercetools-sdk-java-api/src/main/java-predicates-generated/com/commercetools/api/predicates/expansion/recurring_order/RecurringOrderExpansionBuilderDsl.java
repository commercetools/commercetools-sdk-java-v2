
package com.commercetools.api.predicates.expansion.recurring_order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class RecurringOrderExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private RecurringOrderExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static RecurringOrderExpansionBuilderDsl of() {
        return new RecurringOrderExpansionBuilderDsl(Collections.emptyList());
    }

    public static RecurringOrderExpansionBuilderDsl of(final List<String> path) {
        return new RecurringOrderExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.cart.CartReferenceExpansionBuilderDsl cart() {
        return com.commercetools.api.predicates.expansion.cart.CartReferenceExpansionBuilderDsl
                .of(appendOne(path, "cart"));
    }

    public com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl originOrder() {
        return com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl
                .of(appendOne(path, "originOrder"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }
}
