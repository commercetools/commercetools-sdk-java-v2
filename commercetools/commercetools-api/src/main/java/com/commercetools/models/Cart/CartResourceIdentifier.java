package com.commercetools.models.cart;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.cart.CartResourceIdentifierImpl;

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
@JsonDeserialize(as = CartResourceIdentifierImpl.class)
public interface CartResourceIdentifier extends ResourceIdentifier {


   
   public static CartResourceIdentifierImpl of(){
      return new CartResourceIdentifierImpl();
   }
   

   public static CartResourceIdentifierImpl of(final CartResourceIdentifier template) {
      CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}