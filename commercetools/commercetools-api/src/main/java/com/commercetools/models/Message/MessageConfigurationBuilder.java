package com.commercetools.models.message;

import java.lang.Boolean;
import java.lang.Integer;
import com.commercetools.models.message.MessageConfiguration;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageConfigurationBuilder {
   
   @Nullable
   private java.lang.Integer deleteDaysAfterCreation;
   
   
   private java.lang.Boolean enabled;
   
   public MessageConfigurationBuilder deleteDaysAfterCreation(@Nullable final java.lang.Integer deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }
   
   public MessageConfigurationBuilder enabled( final java.lang.Boolean enabled) {
      this.enabled = enabled;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public java.lang.Boolean getEnabled(){
      return this.enabled;
   }

   public MessageConfiguration build() {
       return new MessageConfigurationImpl(deleteDaysAfterCreation, enabled);
   }
   
   public static MessageConfigurationBuilder of() {
      return new MessageConfigurationBuilder();
   }
   
   public static MessageConfigurationBuilder of(final MessageConfiguration template) {
      MessageConfigurationBuilder builder = new MessageConfigurationBuilder();
      builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
      builder.enabled = template.getEnabled();
      return builder;
   }
   
}