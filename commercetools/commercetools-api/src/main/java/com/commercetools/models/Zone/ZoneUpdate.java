package com.commercetools.models.Zone;

import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.Long;
import com.commercetools.models.Zone.ZoneUpdateImpl;

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
@JsonDeserialize(as = ZoneUpdateImpl.class)
public interface ZoneUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ZoneUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ZoneUpdateAction> actions);
   
   public static ZoneUpdateImpl of(){
      return new ZoneUpdateImpl();
   }
   

   public static ZoneUpdateImpl of(final ZoneUpdate template) {
      ZoneUpdateImpl instance = new ZoneUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}