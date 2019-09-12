package com.commercetools.models.CustomerGroup;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CustomerGroup.CustomerGroup;
import com.commercetools.models.CustomerGroup.CustomerGroupReferenceImpl;

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
@JsonDeserialize(as = CustomerGroupReferenceImpl.class)
public interface CustomerGroupReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public CustomerGroup getObj();

   public void setObj(final CustomerGroup obj);
   
   public static CustomerGroupReferenceImpl of(){
      return new CustomerGroupReferenceImpl();
   }
   

   public static CustomerGroupReferenceImpl of(final CustomerGroupReference template) {
      CustomerGroupReferenceImpl instance = new CustomerGroupReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}