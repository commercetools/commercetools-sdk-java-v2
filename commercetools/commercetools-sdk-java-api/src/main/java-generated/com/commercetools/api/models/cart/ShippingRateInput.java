package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInput;
import com.commercetools.api.models.cart.ScoreShippingRateInput;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputImpl.class, name = "Classification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputImpl.class, name = "Score")
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





    default <T> T withShippingRateInput(Function<ShippingRateInput, T> helper) {
        return helper.apply(this);
    }
}
