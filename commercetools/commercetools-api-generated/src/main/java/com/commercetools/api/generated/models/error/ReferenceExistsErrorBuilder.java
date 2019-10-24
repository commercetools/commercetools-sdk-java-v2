package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ReferenceExistsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceExistsErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private com.commercetools.api.generated.models.common.ReferenceTypeId referencedBy;
   
   public ReferenceExistsErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ReferenceExistsErrorBuilder referencedBy(@Nullable final com.commercetools.api.generated.models.common.ReferenceTypeId referencedBy) {
      this.referencedBy = referencedBy;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.ReferenceTypeId getReferencedBy(){
      return this.referencedBy;
   }

   public ReferenceExistsError build() {
       return new ReferenceExistsErrorImpl(message, referencedBy);
   }
   
   public static ReferenceExistsErrorBuilder of() {
      return new ReferenceExistsErrorBuilder();
   }
   
   public static ReferenceExistsErrorBuilder of(final ReferenceExistsError template) {
      ReferenceExistsErrorBuilder builder = new ReferenceExistsErrorBuilder();
      builder.message = template.getMessage();
      builder.referencedBy = template.getReferencedBy();
      return builder;
   }
   
}