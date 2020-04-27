package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.api.ml.generated.models.missing_data.MissingDataTaskStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingDataTaskStatusBuilder {
   
   
   private com.commercetools.api.ml.generated.models.common.TaskStatusEnum state;
   
   
   private java.time.ZonedDateTime expires;
   
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResult result;
   
   public MissingDataTaskStatusBuilder state( final com.commercetools.api.ml.generated.models.common.TaskStatusEnum state) {
      this.state = state;
      return this;
   }
   
   public MissingDataTaskStatusBuilder expires( final java.time.ZonedDateTime expires) {
      this.expires = expires;
      return this;
   }
   
   public MissingDataTaskStatusBuilder result( final com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResult result) {
      this.result = result;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.common.TaskStatusEnum getState(){
      return this.state;
   }
   
   
   public java.time.ZonedDateTime getExpires(){
      return this.expires;
   }
   
   
   public com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResult getResult(){
      return this.result;
   }

   public MissingDataTaskStatus build() {
       return new MissingDataTaskStatusImpl(state, expires, result);
   }
   
   public static MissingDataTaskStatusBuilder of() {
      return new MissingDataTaskStatusBuilder();
   }
   
   public static MissingDataTaskStatusBuilder of(final MissingDataTaskStatus template) {
      MissingDataTaskStatusBuilder builder = new MissingDataTaskStatusBuilder();
      builder.state = template.getState();
      builder.expires = template.getExpires();
      builder.result = template.getResult();
      return builder;
   }
   
}
