package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.api.ml.generated.models.missing_data.MissingImagesTaskStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesTaskStatusBuilder {
   
   
   private TaskStatusEnum state;
   
   
   private ZonedDateTime expires;
   
   
   private MissingImagesPagedQueryResult result;
   
   public MissingImagesTaskStatusBuilder state( final TaskStatusEnum state) {
      this.state = state;
      return this;
   }
   
   public MissingImagesTaskStatusBuilder expires( final ZonedDateTime expires) {
      this.expires = expires;
      return this;
   }
   
   public MissingImagesTaskStatusBuilder result( final MissingImagesPagedQueryResult result) {
      this.result = result;
      return this;
   }
   
   
   public TaskStatusEnum getState(){
      return this.state;
   }
   
   
   public ZonedDateTime getExpires(){
      return this.expires;
   }
   
   
   public MissingImagesPagedQueryResult getResult(){
      return this.result;
   }

   public MissingImagesTaskStatus build() {
       return new MissingImagesTaskStatusImpl(state, expires, result);
   }
   
   public static MissingImagesTaskStatusBuilder of() {
      return new MissingImagesTaskStatusBuilder();
   }
   
   public static MissingImagesTaskStatusBuilder of(final MissingImagesTaskStatus template) {
      MissingImagesTaskStatusBuilder builder = new MissingImagesTaskStatusBuilder();
      builder.state = template.getState();
      builder.expires = template.getExpires();
      builder.result = template.getResult();
      return builder;
   }
   
}
