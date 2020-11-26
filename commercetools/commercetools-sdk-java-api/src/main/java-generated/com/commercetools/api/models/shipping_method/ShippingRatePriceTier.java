package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.CartClassificationTier;
import com.commercetools.api.models.shipping_method.CartScoreTier;
import com.commercetools.api.models.shipping_method.CartValueTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartValueTierImpl.class, name = "CartValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartScoreTierImpl.class, name = "CartScore"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.CartClassificationTierImpl.class, name = "CartClassification")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ShippingRatePriceTierImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRatePriceTier  {

    
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();




    default <T> T withShippingRatePriceTier(Function<ShippingRatePriceTier, T> helper) {
        return helper.apply(this);
    }
}
