package com.commercetools.models.Common;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.CustomObject.CustomObject;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Product.ProductProjection;
import com.commercetools.models.ShippingMethod.ShippingMethod;
import com.commercetools.models.Store.Store;
import com.commercetools.models.Zone.Zone;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.BaseResourceImpl;

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
@JsonDeserialize(as = BaseResourceImpl.class)
public interface BaseResource  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public static BaseResourceImpl of(){
      return new BaseResourceImpl();
   }
   

   public static BaseResourceImpl of(final BaseResource template) {
      BaseResourceImpl instance = new BaseResourceImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      return instance;
   }

}