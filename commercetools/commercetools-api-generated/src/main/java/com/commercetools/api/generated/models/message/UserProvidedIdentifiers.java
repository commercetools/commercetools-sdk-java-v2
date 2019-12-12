package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.message.UserProvidedIdentifiersImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = UserProvidedIdentifiersImpl.class)
public interface UserProvidedIdentifiers  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   
   @JsonProperty("orderNumber")
   public String getOrderNumber();
   
   
   @JsonProperty("customerNumber")
   public String getCustomerNumber();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setKey(final String key);
   
   public void setExternalId(final String externalId);
   
   public void setOrderNumber(final String orderNumber);
   
   public void setCustomerNumber(final String customerNumber);
   
   public void setSku(final String sku);
   
   public void setSlug(final LocalizedString slug);
   
   public static UserProvidedIdentifiersImpl of(){
      return new UserProvidedIdentifiersImpl();
   }
   

   public static UserProvidedIdentifiersImpl of(final UserProvidedIdentifiers template) {
      UserProvidedIdentifiersImpl instance = new UserProvidedIdentifiersImpl();
      instance.setOrderNumber(template.getOrderNumber());
      instance.setExternalId(template.getExternalId());
      instance.setSku(template.getSku());
      instance.setCustomerNumber(template.getCustomerNumber());
      instance.setSlug(template.getSlug());
      instance.setKey(template.getKey());
      return instance;
   }

}