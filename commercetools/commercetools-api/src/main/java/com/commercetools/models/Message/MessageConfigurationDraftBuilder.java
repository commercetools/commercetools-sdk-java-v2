package com.commercetools.models.message;

import java.lang.Boolean;
import java.lang.Integer;
import com.commercetools.models.message.MessageConfigurationDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageConfigurationDraftBuilder {
   
   
   private java.lang.Integer deleteDaysAfterCreation;
   
   
   private java.lang.Boolean enabled;
   
   public MessageConfigurationDraftBuilder deleteDaysAfterCreation( final java.lang.Integer deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }
   
   public MessageConfigurationDraftBuilder enabled( final java.lang.Boolean enabled) {
      this.enabled = enabled;
      return this;
   }
   
   
   public java.lang.Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public java.lang.Boolean getEnabled(){
      return this.enabled;
   }

   public MessageConfigurationDraft build() {
       return new MessageConfigurationDraftImpl(deleteDaysAfterCreation, enabled);
   }
   
   public static MessageConfigurationDraftBuilder of() {
      return new MessageConfigurationDraftBuilder();
   }
   
   public static MessageConfigurationDraftBuilder of(final MessageConfigurationDraft template) {
      MessageConfigurationDraftBuilder builder = new MessageConfigurationDraftBuilder();
      builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
      builder.enabled = template.getEnabled();
      return builder;
   }
   
}