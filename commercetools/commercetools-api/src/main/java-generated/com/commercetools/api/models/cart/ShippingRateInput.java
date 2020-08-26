package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInput;
import com.commercetools.api.models.cart.ScoreShippingRateInput;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputImpl.class, name = "Score"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputImpl.class, name = "Classification")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ShippingRateInputImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRateInput  {





}
