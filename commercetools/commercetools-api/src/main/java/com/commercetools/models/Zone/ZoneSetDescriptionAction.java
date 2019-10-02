package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneUpdateAction;
import com.commercetools.models.zone.ZoneSetDescriptionActionImpl;

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
@JsonDeserialize(as = ZoneSetDescriptionActionImpl.class)
public interface ZoneSetDescriptionAction extends ZoneUpdateAction {

   
   
   @JsonProperty("description")
   public String getDescription();

   public void setDescription(final String description);
   
   public static ZoneSetDescriptionActionImpl of(){
      return new ZoneSetDescriptionActionImpl();
   }
   

   public static ZoneSetDescriptionActionImpl of(final ZoneSetDescriptionAction template) {
      ZoneSetDescriptionActionImpl instance = new ZoneSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}