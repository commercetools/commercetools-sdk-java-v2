
package com.commercetools.api.predicates.expansion.shipping_method;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShippingMethodReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShippingMethodReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShippingMethodReferenceExpansionBuilderDsl of() {
        return new ShippingMethodReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShippingMethodReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ShippingMethodReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
