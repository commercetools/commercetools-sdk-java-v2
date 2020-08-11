package com.commercetools.api.models.store;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import java.time.ZonedDateTime;
import com.commercetools.api.models.store.StoreImpl;

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
@JsonDeserialize(as = StoreImpl.class)
public interface Store extends LoggedResource {


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

   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();

   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>User-specific unique identifier for the store.
   *  The <code>key</code> is mandatory and immutable.
   *  It is used to reference the store.</p>
   */
   @NotNull
   @JsonProperty("key")
   public String getKey();
   /**
   *  <p>The name of the store</p>
   */
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setId(final String id);

   public void setVersion(final Long version);

   public void setCreatedAt(final ZonedDateTime createdAt);

   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

   public void setCreatedBy(final CreatedBy createdBy);

   public void setKey(final String key);

   public void setName(final LocalizedString name);

   public static StoreImpl of(){
      return new StoreImpl();
   }


   public static StoreImpl of(final Store template) {
      StoreImpl instance = new StoreImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}
