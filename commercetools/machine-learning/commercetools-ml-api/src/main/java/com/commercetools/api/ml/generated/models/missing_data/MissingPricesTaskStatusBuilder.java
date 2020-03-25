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
   
   
   private TaskStatusEnum state;
   
   
   private ZonedDateTime expires;
   
   
   private MissingPricesPagedQueryResult result;
   
   public MissingPricesTaskStatusBuilder state( final TaskStatusEnum state) {
      this.state = state;
      return this;
   }
   
   public MissingPricesTaskStatusBuilder expires( final ZonedDateTime expires) {
      this.expires = expires;
      return this;
   }
   
   public MissingPricesTaskStatusBuilder result( final MissingPricesPagedQueryResult result) {
      this.result = result;
      return this;
   }
   
   
   public TaskStatusEnum getState(){
      return this.state;
   }
   
   
   public ZonedDateTime getExpires(){
      return this.expires;
   }
   
   
   public MissingPricesPagedQueryResult getResult(){
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
