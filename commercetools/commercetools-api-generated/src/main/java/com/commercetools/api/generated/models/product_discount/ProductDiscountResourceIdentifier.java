package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.product_discount.ProductDiscountResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier extends ResourceIdentifier {


   
   public static ProductDiscountResourceIdentifierImpl of(){
      return new ProductDiscountResourceIdentifierImpl();
   }
   

   public static ProductDiscountResourceIdentifierImpl of(final ProductDiscountResourceIdentifier template) {
      ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}