package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesTaskStatusImpl implements MissingImagesTaskStatus {

   private com.commercetools.api.ml.generated.models.common.TaskStatusEnum state;
   
   private java.time.ZonedDateTime expires;
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult result;

   @JsonCreator
   MissingImagesTaskStatusImpl(@JsonProperty("state") final com.commercetools.api.ml.generated.models.common.TaskStatusEnum state, @JsonProperty("expires") final java.time.ZonedDateTime expires, @JsonProperty("result") final com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult result) {
      this.state = state;
      this.expires = expires;
      this.result = result;
   }
   public MissingImagesTaskStatusImpl() {
      
   }
   
   
   public com.commercetools.api.ml.generated.models.common.TaskStatusEnum getState(){
      return this.state;
   }
   
   /**
   *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
   */
   public java.time.ZonedDateTime getExpires(){
      return this.expires;
   }
   
   /**
   *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
   */
   public com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult getResult(){
      return this.result;
   }

   public void setState(final com.commercetools.api.ml.generated.models.common.TaskStatusEnum state){
      this.state = state;
   }
   
   public void setExpires(final java.time.ZonedDateTime expires){
      this.expires = expires;
   }
   
   public void setResult(final com.commercetools.api.ml.generated.models.missing_data.MissingImagesPagedQueryResult result){
      this.result = result;
   }

}
