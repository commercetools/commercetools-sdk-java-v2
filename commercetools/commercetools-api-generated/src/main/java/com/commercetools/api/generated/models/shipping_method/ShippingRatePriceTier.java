package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.CartClassificationTier;
import com.commercetools.api.generated.models.shipping_method.CartScoreTier;
import com.commercetools.api.generated.models.shipping_method.CartValueTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shipping_method.CartClassificationTierImpl.class, name = "CartClassification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shipping_method.CartScoreTierImpl.class, name = "CartScore"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.shipping_method.CartValueTierImpl.class, name = "CartValue")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = ShippingRatePriceTierImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRatePriceTier  {


   


}