package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.Location;
import com.commercetools.api.generated.models.zone.ZoneDraftImpl;

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
@JsonDeserialize(as = ZoneDraftImpl.class)
public interface ZoneDraft  {

   
   
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

   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setLocations(final List<Location> locations);
   
   public static ZoneDraftImpl of(){
      return new ZoneDraftImpl();
   }
   

   public static ZoneDraftImpl of(final ZoneDraft template) {
      ZoneDraftImpl instance = new ZoneDraftImpl();
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setLocations(template.getLocations());
      instance.setKey(template.getKey());
      return instance;
   }

}