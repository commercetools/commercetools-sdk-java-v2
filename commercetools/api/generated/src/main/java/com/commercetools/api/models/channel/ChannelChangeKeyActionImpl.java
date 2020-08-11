package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelChangeKeyActionImpl implements ChannelChangeKeyAction {

   private String action;
   
   private String key;

   @JsonCreator
   ChannelChangeKeyActionImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.action = "changeKey";
   }
   public ChannelChangeKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}
