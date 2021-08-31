
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetPredicateActionBuilder implements Builder<ShippingMethodSetPredicateAction> {

    @Nullable
    private String predicate;

    public ShippingMethodSetPredicateActionBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    public ShippingMethodSetPredicateAction build() {
        return new ShippingMethodSetPredicateActionImpl(predicate);
    }

    /**
     * builds ShippingMethodSetPredicateAction without checking for non null required values
     */
    public ShippingMethodSetPredicateAction buildUnchecked() {
        return new ShippingMethodSetPredicateActionImpl(predicate);
    }

    public static ShippingMethodSetPredicateActionBuilder of() {
        return new ShippingMethodSetPredicateActionBuilder();
    }

    public static ShippingMethodSetPredicateActionBuilder of(final ShippingMethodSetPredicateAction template) {
        ShippingMethodSetPredicateActionBuilder builder = new ShippingMethodSetPredicateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
