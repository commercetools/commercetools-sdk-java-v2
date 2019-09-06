package com.commercetools.models.Message;

import java.lang.Boolean;
import java.lang.Integer;
import com.commercetools.models.Message.MessageConfigurationDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MessageConfigurationDraftImpl.class)
public interface MessageConfigurationDraft  {

   
   @NotNull
   @JsonProperty("enabled")
   public Boolean getEnabled();
   
   @NotNull
   @JsonProperty("deleteDaysAfterCreation")
   public Integer getDeleteDaysAfterCreation();

   public void setEnabled(final Boolean enabled);
   
   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);
   
   public static MessageConfigurationDraftImpl of(){
      return new MessageConfigurationDraftImpl();
   }
   

   public static MessageConfigurationDraftImpl of(final MessageConfigurationDraft template) {
      MessageConfigurationDraftImpl instance = new MessageConfigurationDraftImpl();
      instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
      instance.setEnabled(template.getEnabled());
      return instance;
   }

}