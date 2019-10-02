package com.commercetools.models.cart;

import com.commercetools.models.cart.ClassificationShippingRateInput;
import com.commercetools.models.cart.ScoreShippingRateInput;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.cart.ClassificationShippingRateInputImpl.class, name = "Classification"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.ScoreShippingRateInputImpl.class, name = "Score")
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
public interface ShippingRateInput  {


   


}