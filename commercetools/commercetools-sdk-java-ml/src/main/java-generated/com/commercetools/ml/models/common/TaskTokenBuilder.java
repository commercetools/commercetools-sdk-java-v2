
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaskTokenBuilder implements Builder<TaskToken> {

    private String taskId;

    private String uriPath;

    public TaskTokenBuilder taskId(final String taskId) {
        this.taskId = taskId;
        return this;
    }

    public TaskTokenBuilder uriPath(final String uriPath) {
        this.uriPath = uriPath;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getUriPath() {
        return this.uriPath;
    }

    public TaskToken build() {
        Objects.requireNonNull(taskId, TaskToken.class + ": taskId is missing");
        Objects.requireNonNull(uriPath, TaskToken.class + ": uriPath is missing");
        return new TaskTokenImpl(taskId, uriPath);
    }

    /**
     * builds TaskToken without checking for non null required values
     */
    public TaskToken buildUnchecked() {
        return new TaskTokenImpl(taskId, uriPath);
    }

    public static TaskTokenBuilder of() {
        return new TaskTokenBuilder();
    }

    public static TaskTokenBuilder of(final TaskToken template) {
        TaskTokenBuilder builder = new TaskTokenBuilder();
        builder.taskId = template.getTaskId();
        builder.uriPath = template.getUriPath();
        return builder;
    }

}
