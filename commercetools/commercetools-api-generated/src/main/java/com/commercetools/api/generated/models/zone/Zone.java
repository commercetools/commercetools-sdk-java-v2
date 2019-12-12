package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.zone.Location;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.zone.ZoneImpl;

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
@JsonDeserialize(as = ZoneImpl.class)
public interface Zone extends LoggedResource {

   /**
   *  <p>The unique ID of the zone.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the zone.</p>
   */
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
   *  <p>User-specific unique identifier for a zone.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("description")
   public String getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("locations")
   public List<Location> getLocations();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setLocations(final List<Location> locations);
   
   public static ZoneImpl of(){
      return new ZoneImpl();
   }
   

   public static ZoneImpl of(final Zone template) {
      ZoneImpl instance = new ZoneImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setLocations(template.getLocations());
      instance.setKey(template.getKey());
      return instance;
   }

}