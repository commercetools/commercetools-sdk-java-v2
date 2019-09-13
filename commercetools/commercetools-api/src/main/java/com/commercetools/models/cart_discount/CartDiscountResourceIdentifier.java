package com.commercetools.models.cart_discount;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.cart_discount.CartDiscountResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = CartDiscountResourceIdentifierImpl.class)
public interface CartDiscountResourceIdentifier extends ResourceIdentifier {


   
   public static CartDiscountResourceIdentifierImpl of(){
      return new CartDiscountResourceIdentifierImpl();
   }
   

   public static CartDiscountResourceIdentifierImpl of(final CartDiscountResourceIdentifier template) {
      CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}