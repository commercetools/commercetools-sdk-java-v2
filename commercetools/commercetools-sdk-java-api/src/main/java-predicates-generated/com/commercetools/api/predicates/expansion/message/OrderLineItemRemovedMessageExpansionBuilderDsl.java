
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class OrderLineItemRemovedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private OrderLineItemRemovedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static OrderLineItemRemovedMessageExpansionBuilderDsl of() {
        return new OrderLineItemRemovedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static OrderLineItemRemovedMessageExpansionBuilderDsl of(final List<String> path) {
        return new OrderLineItemRemovedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl newState() {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "newState[*]"));
    }

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl newState(long index) {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "newState[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl newPrice() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "newPrice"));
    }
}
