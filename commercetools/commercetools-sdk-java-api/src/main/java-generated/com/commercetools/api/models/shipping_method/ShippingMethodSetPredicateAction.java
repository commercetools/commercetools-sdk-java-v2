
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetPredicateActionImpl.class)
public interface ShippingMethodSetPredicateAction extends ShippingMethodUpdateAction {

    String SET_PREDICATE = "setPredicate";

    /**
    *  <p>A valid Cart predicate.
    *  If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */

    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ShippingMethodSetPredicateAction of() {
        return new ShippingMethodSetPredicateActionImpl();
    }

    public static ShippingMethodSetPredicateAction of(final ShippingMethodSetPredicateAction template) {
        ShippingMethodSetPredicateActionImpl instance = new ShippingMethodSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static ShippingMethodSetPredicateActionBuilder builder() {
        return ShippingMethodSetPredicateActionBuilder.of();
    }

    public static ShippingMethodSetPredicateActionBuilder builder(final ShippingMethodSetPredicateAction template) {
        return ShippingMethodSetPredicateActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetPredicateAction(Function<ShippingMethodSetPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
