package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.CartClassificationTier;
import com.commercetools.models.ShippingMethod.CartScoreTier;
import com.commercetools.models.ShippingMethod.CartValueTier;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.CartClassificationTierImpl.class, name = "CartClassification"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.CartScoreTierImpl.class, name = "CartScore"),
   @JsonSubTypes.Type(value = com.commercetools.models.ShippingMethod.CartValueTierImpl.class, name = "CartValue")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRatePriceTier  {


   


}