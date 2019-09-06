package com.commercetools.models.CartDiscount;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifierImpl;

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