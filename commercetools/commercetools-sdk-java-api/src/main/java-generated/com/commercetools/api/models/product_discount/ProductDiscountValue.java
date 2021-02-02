
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteImpl.class, name = ProductDiscountValueAbsolute.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueExternalImpl.class, name = ProductDiscountValueExternal.EXTERNAL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueRelativeImpl.class, name = ProductDiscountValueRelative.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductDiscountValueImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductDiscountValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withProductDiscountValue(Function<ProductDiscountValue, T> helper) {
        return helper.apply(this);
    }
}
