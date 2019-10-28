package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueAbsolute;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueGiftLineItem;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelative;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueAbsoluteImpl.class, name = "absolute"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueGiftLineItemImpl.class, name = "giftLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelativeImpl.class, name = "relative")
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
public interface CartDiscountValue  {


   


}