
package com.commercetools.api.predicates.expansion.order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class OrderReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private OrderReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static OrderReferenceExpansionBuilderDsl of() {
        return new OrderReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static OrderReferenceExpansionBuilderDsl of(final List<String> path) {
        return new OrderReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.order.OrderExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.order.OrderExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
