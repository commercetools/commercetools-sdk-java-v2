package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.ShippingRatePriceTier;
import com.commercetools.importapi.models.orders.ShippingRateDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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

    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();

    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    public void setPrice(final Money price);

    public void setFreeAbove(final Money freeAbove);

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

}
