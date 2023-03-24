
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaskTokenBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaskTokenBuilder implements Builder<TaskToken> {

    private String taskId;

    private String uriPath;

    /**
     *  <p>The ID for the task. Used to find the status of the task.</p>
     * @param taskId value to be set
     * @return Builder
     */

    public TaskTokenBuilder taskId(final String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     *  <p>The URI path to poll for the status of the task.</p>
     * @param uriPath value to be set
     * @return Builder
     */

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

    /**
     * builds TaskToken with checking for non-null required values
     * @return TaskToken
     */
    public TaskToken build() {
        Objects.requireNonNull(taskId, TaskToken.class + ": taskId is missing");
        Objects.requireNonNull(uriPath, TaskToken.class + ": uriPath is missing");
        return new TaskTokenImpl(taskId, uriPath);
    }

    /**
     * builds TaskToken without checking for non-null required values
     * @return TaskToken
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
