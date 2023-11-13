
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaskTokenImpl implements TaskToken, ModelBase {

    private String taskId;

    private String uriPath;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaskTokenImpl(@JsonProperty("taskId") final String taskId, @JsonProperty("uriPath") final String uriPath) {
        this.taskId = taskId;
        this.uriPath = uriPath;
    }

    /**
     * create empty instance
     */
    public TaskTokenImpl() {
    }

    /**
     *  <p>The ID for the task. Used to find the status of the task.</p>
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     *  <p>The URI path to poll for the status of the task.</p>
     */

    public String getUriPath() {
        return this.uriPath;
    }

    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    public void setUriPath(final String uriPath) {
        this.uriPath = uriPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaskTokenImpl that = (TaskTokenImpl) o;

        return new EqualsBuilder().append(taskId, that.taskId)
                .append(uriPath, that.uriPath)
                .append(taskId, that.taskId)
                .append(uriPath, that.uriPath)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(taskId).append(uriPath).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("taskId", taskId)
                .append("uriPath", uriPath)
                .build();
    }

}
