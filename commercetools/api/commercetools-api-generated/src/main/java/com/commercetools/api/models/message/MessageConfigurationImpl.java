package com.commercetools.api.models.message;


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
public final class MessageConfigurationImpl implements MessageConfiguration {

   private Boolean enabled;
   
   private Integer deleteDaysAfterCreation;

   @JsonCreator
   MessageConfigurationImpl(@JsonProperty("enabled") final Boolean enabled, @JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation) {
      this.enabled = enabled;
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }
   public MessageConfigurationImpl() {
      
   }
   
   
   public Boolean getEnabled(){
      return this.enabled;
   }
   
   
   public Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }

   public void setEnabled(final Boolean enabled){
      this.enabled = enabled;
   }
   
   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }

}
