package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.customer_group.CustomerGroupDraftImpl;

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
@JsonDeserialize(as = CustomerGroupDraftImpl.class)
public interface CustomerGroupDraft  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("groupName")
   public String getGroupName();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setKey(final String key);
   
   public void setGroupName(final String groupName);
   
   public void setCustom(final CustomFields custom);
   
   public static CustomerGroupDraftImpl of(){
      return new CustomerGroupDraftImpl();
   }
   

   public static CustomerGroupDraftImpl of(final CustomerGroupDraft template) {
      CustomerGroupDraftImpl instance = new CustomerGroupDraftImpl();
      instance.setGroupName(template.getGroupName());
      instance.setCustom(template.getCustom());
      instance.setKey(template.getKey());
      return instance;
   }

}