package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueAbsoluteDraft;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueGiftLineItemDraft;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelativeDraft;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueGiftLineItemDraftImpl.class, name = "giftLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelativeDraftImpl.class, name = "relative"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart_discount.CartDiscountValueAbsoluteDraftImpl.class, name = "absolute")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = CartDiscountValueDraftImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountValueDraft  {


   


}