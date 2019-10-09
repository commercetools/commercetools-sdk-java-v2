package com.commercetools.models.message;


import com.commercetools.models.message.MessageConfiguration;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageConfigurationBuilder {
   
   @Nullable
   private Integer deleteDaysAfterCreation;
   
   
   private Boolean enabled;
   
   public MessageConfigurationBuilder deleteDaysAfterCreation(@Nullable final Integer deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }
   
   public MessageConfigurationBuilder enabled( final Boolean enabled) {
      this.enabled = enabled;
      return this;
   }
   
   @Nullable
   public Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public Boolean getEnabled(){
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