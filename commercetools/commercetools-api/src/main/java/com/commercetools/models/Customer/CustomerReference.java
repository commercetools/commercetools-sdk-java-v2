package com.commercetools.models.Customer;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Customer.Customer;
import com.commercetools.models.Customer.CustomerReferenceImpl;

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
@JsonDeserialize(as = CustomerReferenceImpl.class)
public interface CustomerReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Customer getObj();

   public void setObj(final Customer obj);
   
   public static CustomerReferenceImpl of(){
      return new CustomerReferenceImpl();
   }
   

   public static CustomerReferenceImpl of(final CustomerReference template) {
      CustomerReferenceImpl instance = new CustomerReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}