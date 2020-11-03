package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetPredicateActionImpl.class)
public interface ShippingMethodSetPredicateAction extends ShippingMethodUpdateAction {

    /**
    *  <p>A valid Cart predicate.
    *  If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */
    
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ShippingMethodSetPredicateActionImpl of(){
        return new ShippingMethodSetPredicateActionImpl();
    }
    

    public static ShippingMethodSetPredicateActionImpl of(final ShippingMethodSetPredicateAction template) {
        ShippingMethodSetPredicateActionImpl instance = new ShippingMethodSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    default <T> T withShippingMethodSetPredicateAction(Function<ShippingMethodSetPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
