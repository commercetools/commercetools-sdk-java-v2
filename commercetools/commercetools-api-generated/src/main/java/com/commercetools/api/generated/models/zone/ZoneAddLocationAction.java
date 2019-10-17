package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.Location;
import com.commercetools.api.generated.models.zone.ZoneUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneAddLocationActionImpl;

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
@JsonDeserialize(as = ZoneAddLocationActionImpl.class)
public interface ZoneAddLocationAction extends ZoneUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("location")
   public Location getLocation();

   public void setLocation(final Location location);
   
   public static ZoneAddLocationActionImpl of(){
      return new ZoneAddLocationActionImpl();
   }
   

   public static ZoneAddLocationActionImpl of(final ZoneAddLocationAction template) {
      ZoneAddLocationActionImpl instance = new ZoneAddLocationActionImpl();
      instance.setLocation(template.getLocation());
      return instance;
   }

}