
package com.commercetools.api.predicates.expansion.order_edit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class OrderEditReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private OrderEditReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static OrderEditReferenceExpansionBuilderDsl of() {
        return new OrderEditReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static OrderEditReferenceExpansionBuilderDsl of(final List<String> path) {
        return new OrderEditReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.order_edit.OrderEditExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.order_edit.OrderEditExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
