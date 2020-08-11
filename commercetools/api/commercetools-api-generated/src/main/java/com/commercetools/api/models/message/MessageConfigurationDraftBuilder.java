package com.commercetools.api.models.message;


import com.commercetools.api.models.message.MessageConfigurationDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessageConfigurationDraftBuilder {


   private Integer deleteDaysAfterCreation;


   private Boolean enabled;

   public MessageConfigurationDraftBuilder deleteDaysAfterCreation( final Integer deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }

   public MessageConfigurationDraftBuilder enabled( final Boolean enabled) {
      this.enabled = enabled;
      return this;
   }


   public Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }


   public Boolean getEnabled(){
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
