package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValueAbsolute;
import com.commercetools.models.CartDiscount.CartDiscountValueGiftLineItem;
import com.commercetools.models.CartDiscount.CartDiscountValueRelative;
import java.lang.String;


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
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountValueAbsoluteImpl.class, name = "absolute"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountValueGiftLineItemImpl.class, name = "giftLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.CartDiscount.CartDiscountValueRelativeImpl.class, name = "relative")
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