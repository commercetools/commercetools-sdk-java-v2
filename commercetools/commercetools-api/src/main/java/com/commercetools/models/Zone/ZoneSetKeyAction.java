package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.zone.ZoneSetKeyActionImpl;

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
@JsonDeserialize(as = ZoneSetKeyActionImpl.class)
public interface ZoneSetKeyAction extends ZoneUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ZoneSetKeyActionImpl of(){
      return new ZoneSetKeyActionImpl();
   }
   

   public static ZoneSetKeyActionImpl of(final ZoneSetKeyAction template) {
      ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}