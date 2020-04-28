package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.api.ml.generated.models.missing_data.MissingPricesTaskStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingPricesTaskStatusBuilder {
   
   
   private com.commercetools.api.ml.generated.models.common.TaskStatusEnum state;
   
   
   private java.time.ZonedDateTime expires;
   
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingPricesPagedQueryResult result;
   
   public MissingPricesTaskStatusBuilder state( final com.commercetools.api.ml.generated.models.common.TaskStatusEnum state) {
      this.state = state;
      return this;
   }
   
   public MissingPricesTaskStatusBuilder expires( final java.time.ZonedDateTime expires) {
      this.expires = expires;
      return this;
   }
   
   public MissingPricesTaskStatusBuilder result( final com.commercetools.api.ml.generated.models.missing_data.MissingPricesPagedQueryResult result) {
      this.result = result;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.common.TaskStatusEnum getState(){
      return this.state;
   }
   
   
   public java.time.ZonedDateTime getExpires(){
      return this.expires;
   }
   
   
   public com.commercetools.api.ml.generated.models.missing_data.MissingPricesPagedQueryResult getResult(){
      return this.result;
   }

   public MissingPricesTaskStatus build() {
       return new MissingPricesTaskStatusImpl(state, expires, result);
   }
   
   public static MissingPricesTaskStatusBuilder of() {
      return new MissingPricesTaskStatusBuilder();
   }
   
   public static MissingPricesTaskStatusBuilder of(final MissingPricesTaskStatus template) {
      MissingPricesTaskStatusBuilder builder = new MissingPricesTaskStatusBuilder();
      builder.state = template.getState();
      builder.expires = template.getExpires();
      builder.result = template.getResult();
      return builder;
   }
   
}
