package com.commercetools.ml.models.common;


import com.commercetools.ml.models.common.TaskTokenImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaskTokenImpl.class)
public interface TaskToken  {

   /**
   *  <p>The ID for the task. Used to find the status of the task.</p>
   */
   @NotNull
   @JsonProperty("taskId")
   public String getTaskId();
   /**
   *  <p>The URI path to poll for the status of the task.</p>
   */
   @NotNull
   @JsonProperty("uriPath")
   public String getUriPath();

   public void setTaskId(final String taskId);
   
   public void setUriPath(final String uriPath);
   
   public static TaskTokenImpl of(){
      return new TaskTokenImpl();
   }
   

   public static TaskTokenImpl of(final TaskToken template) {
      TaskTokenImpl instance = new TaskTokenImpl();
      instance.setTaskId(template.getTaskId());
      instance.setUriPath(template.getUriPath());
      return instance;
   }

}
