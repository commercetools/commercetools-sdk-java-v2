package com.commercetools.ml.models.common;


import com.commercetools.ml.models.common.TaskTokenImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaskToken taskToken = TaskToken.builder()
 *             .taskId("{taskId}")
 *             .uriPath("{uriPath}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaskTokenImpl.class)
public interface TaskToken  {


    /**
     *  <p>The ID for the task. Used to find the status of the task.</p>
     * @return taskId
     */
    @NotNull
    @JsonProperty("taskId")
    public String getTaskId();
    /**
     *  <p>The URI path to poll for the status of the task.</p>
     * @return uriPath
     */
    @NotNull
    @JsonProperty("uriPath")
    public String getUriPath();

    /**
     *  <p>The ID for the task. Used to find the status of the task.</p>
     * @param taskId value to be set
     */
    
    public void setTaskId(final String taskId);
    
    
    /**
     *  <p>The URI path to poll for the status of the task.</p>
     * @param uriPath value to be set
     */
    
    public void setUriPath(final String uriPath);
    

    /**
     * factory method
     * @return instance of TaskToken
     */
    public static TaskToken of(){
        return new TaskTokenImpl();
    }
    

    /**
     * factory method to create a shallow copy TaskToken
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaskToken of(final TaskToken template) {
        TaskTokenImpl instance = new TaskTokenImpl();
        instance.setTaskId(template.getTaskId());
        instance.setUriPath(template.getUriPath());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaskToken
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaskToken deepCopy(@Nullable final TaskToken template) {
        if (template == null) {
            return null;
        }
        TaskTokenImpl instance = new TaskTokenImpl();
        instance.setTaskId(template.getTaskId());
        instance.setUriPath(template.getUriPath());
        return instance;
    }

    /**
     * builder factory method for TaskToken
     * @return builder
     */
    public static TaskTokenBuilder builder() {
        return TaskTokenBuilder.of();
    }
    
    /**
     * create builder for TaskToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaskTokenBuilder builder(final TaskToken template) {
        return TaskTokenBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaskToken(Function<TaskToken, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaskToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaskToken>() {
            @Override
            public String toString() {
                return "TypeReference<TaskToken>";
            }
        };
    }
}
