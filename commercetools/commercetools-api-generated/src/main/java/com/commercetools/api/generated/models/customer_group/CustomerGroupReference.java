package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReferenceImpl;

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