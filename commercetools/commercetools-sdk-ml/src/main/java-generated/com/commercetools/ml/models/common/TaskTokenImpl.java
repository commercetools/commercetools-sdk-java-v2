package com.commercetools.ml.models.common;


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
public final class TaskTokenImpl implements TaskToken {

    private String taskId;
    
    private String uriPath;

    @JsonCreator
    TaskTokenImpl(@JsonProperty("taskId") final String taskId, @JsonProperty("uriPath") final String uriPath) {
        this.taskId = taskId;
        this.uriPath = uriPath;
    }
    public TaskTokenImpl() {
       
    }

    /**
    *  <p>The ID for the task. Used to find the status of the task.</p>
    */
    public String getTaskId(){
        return this.taskId;
    }
    
    /**
    *  <p>The URI path to poll for the status of the task.</p>
    */
    public String getUriPath(){
        return this.uriPath;
    }

    public void setTaskId(final String taskId){
        this.taskId = taskId;
    }
    
    public void setUriPath(final String uriPath){
        this.uriPath = uriPath;
    }

}
