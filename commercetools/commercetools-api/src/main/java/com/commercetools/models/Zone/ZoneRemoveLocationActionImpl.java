package com.commercetools.models.Zone;

import com.commercetools.models.Zone.Location;
import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRemoveLocationActionImpl implements ZoneRemoveLocationAction {

   private java.lang.String action;
   
   private com.commercetools.models.Zone.Location location;

   @JsonCreator
   ZoneRemoveLocationActionImpl(@JsonProperty("location") final com.commercetools.models.Zone.Location location) {
      this.location = location;
      this.action = "removeLocation";
   }
   public ZoneRemoveLocationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Zone.Location getLocation(){
      return this.location;
   }

   public void setLocation(final com.commercetools.models.Zone.Location location){
      this.location = location;
   }

}