
package com.commercetools.api.predicates.expansion.order_edit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class OrderEditExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private OrderEditExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static OrderEditExpansionBuilderDsl of() {
        return new OrderEditExpansionBuilderDsl(Collections.emptyList());
    }

    public static OrderEditExpansionBuilderDsl of(final List<String> path) {
        return new OrderEditExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
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
