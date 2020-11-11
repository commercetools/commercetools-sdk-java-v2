package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraft;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftImpl.class, name = "giftLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftImpl.class, name = "relative"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftImpl.class, name = "absolute")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = CartDiscountValueDraftImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartDiscountValueDraft  {

    
    @NotNull
    @JsonProperty("type")
    public String getType();




    default <T> T withCartDiscountValueDraft(Function<CartDiscountValueDraft, T> helper) {
        return helper.apply(this);
    }
}
