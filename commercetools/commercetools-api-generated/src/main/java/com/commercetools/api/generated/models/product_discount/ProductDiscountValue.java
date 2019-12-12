package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsolute;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueExternal;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelative;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsoluteImpl.class, name = "absolute"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueExternalImpl.class, name = "external"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelativeImpl.class, name = "relative")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = ProductDiscountValueImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductDiscountValue  {


   


}