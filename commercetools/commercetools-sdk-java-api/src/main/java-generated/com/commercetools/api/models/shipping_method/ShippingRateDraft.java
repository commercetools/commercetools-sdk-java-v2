package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateDraftImpl;

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
@JsonDeserialize(as = ShippingRateDraftImpl.class)
public interface ShippingRateDraft  {

    
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();
    /**
    *  <p>The shipping is free if the order total (the sum of line item prices) exceeds the freeAbove value.
    *  Note: <code>freeAbove</code> applies before any Cart or Product discounts, and can cause discounts to apply in invalid scenarios.
    *  Use a Cart Discount to set the shipping price to 0 to avoid providing free shipping in invalid discount scenarios.</p>
    */
    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();
    /**
    *  <p>A list of shipping rate price tiers.</p>
    */
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    public void setPrice(final Money price);
    
    public void setFreeAbove(final Money freeAbove);
    
    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier ...tiers);
    public void setTiers(final List<ShippingRatePriceTier> tiers);

    public static ShippingRateDraftImpl of(){
        return new ShippingRateDraftImpl();
    }
    

    public static ShippingRateDraftImpl of(final ShippingRateDraft template) {
        ShippingRateDraftImpl instance = new ShippingRateDraftImpl();
        instance.setPrice(template.getPrice());
        instance.setFreeAbove(template.getFreeAbove());
        instance.setTiers(template.getTiers());
        return instance;
    }

    default <T> T withShippingRateDraft(Function<ShippingRateDraft, T> helper) {
        return helper.apply(this);
    }
}
