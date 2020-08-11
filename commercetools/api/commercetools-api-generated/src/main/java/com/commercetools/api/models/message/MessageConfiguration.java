package com.commercetools.api.models.message;


import com.commercetools.api.models.message.MessageConfigurationImpl;

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
@JsonDeserialize(as = MessageConfigurationImpl.class)
public interface MessageConfiguration  {


   @NotNull
   @JsonProperty("enabled")
   public Boolean getEnabled();


   @JsonProperty("deleteDaysAfterCreation")
   public Integer getDeleteDaysAfterCreation();

   public void setEnabled(final Boolean enabled);

   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

   public static MessageConfigurationImpl of(){
      return new MessageConfigurationImpl();
   }


   public static MessageConfigurationImpl of(final MessageConfiguration template) {
      MessageConfigurationImpl instance = new MessageConfigurationImpl();
      instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
      instance.setEnabled(template.getEnabled());
      return instance;
   }

}
