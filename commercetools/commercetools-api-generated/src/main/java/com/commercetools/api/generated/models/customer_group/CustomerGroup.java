package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.customer_group.CustomerGroupImpl;

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
@JsonDeserialize(as = CustomerGroupImpl.class)
public interface CustomerGroup extends LoggedResource {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setCustom(final CustomFields custom);
   
   public static CustomerGroupImpl of(){
      return new CustomerGroupImpl();
   }
   

   public static CustomerGroupImpl of(final CustomerGroup template) {
      CustomerGroupImpl instance = new CustomerGroupImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}