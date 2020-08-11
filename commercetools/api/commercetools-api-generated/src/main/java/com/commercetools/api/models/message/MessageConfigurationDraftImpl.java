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
public final class MessageConfigurationDraftImpl implements MessageConfigurationDraft {

   private Integer deleteDaysAfterCreation;

   private Boolean enabled;

   @JsonCreator
   MessageConfigurationDraftImpl(@JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation, @JsonProperty("enabled") final Boolean enabled) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      this.enabled = enabled;
   }
   public MessageConfigurationDraftImpl() {

   }


   public Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }


   public Boolean getEnabled(){
      return this.enabled;
   }

   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }

   public void setEnabled(final Boolean enabled){
      this.enabled = enabled;
   }

}
