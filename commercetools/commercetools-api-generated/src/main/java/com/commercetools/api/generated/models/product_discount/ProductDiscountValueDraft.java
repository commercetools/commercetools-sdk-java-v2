package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsoluteDraft;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueExternalDraft;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelativeDraft;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueExternalDraftImpl.class, name = "external"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelativeDraftImpl.class, name = "relative"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsoluteDraftImpl.class, name = "absolute")
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
public interface ProductDiscountValueDraft  {


   


}