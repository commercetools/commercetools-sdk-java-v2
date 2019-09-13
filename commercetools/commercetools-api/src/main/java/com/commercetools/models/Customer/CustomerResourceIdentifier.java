package com.commercetools.models.customer;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.customer.CustomerResourceIdentifierImpl;

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
@JsonDeserialize(as = CustomerResourceIdentifierImpl.class)
public interface CustomerResourceIdentifier extends ResourceIdentifier {


   
   public static CustomerResourceIdentifierImpl of(){
      return new CustomerResourceIdentifierImpl();
   }
   

   public static CustomerResourceIdentifierImpl of(final CustomerResourceIdentifier template) {
      CustomerResourceIdentifierImpl instance = new CustomerResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}