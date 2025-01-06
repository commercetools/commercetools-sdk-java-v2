
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceCreationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceCreationError resourceCreationError = ResourceCreationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceCreationErrorBuilder implements Builder<ResourceCreationError> {

    private String message;

    @Nullable
    private java.lang.Object resource;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ResourceCreationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     * set the value to the resource
     * @param resource value to be set
     * @return Builder
     */

    public ResourceCreationErrorBuilder resource(@Nullable final java.lang.Object resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * value of resource}
     * @return resource
     */

    @Nullable
    public java.lang.Object getResource() {
        return this.resource;
    }

    /**
     * builds ResourceCreationError with checking for non-null required values
     * @return ResourceCreationError
     */
    public ResourceCreationError build() {
        Objects.requireNonNull(message, ResourceCreationError.class + ": message is missing");
        return new ResourceCreationErrorImpl(message, resource);
    }

    /**
     * builds ResourceCreationError without checking for non-null required values
     * @return ResourceCreationError
     */
    public ResourceCreationError buildUnchecked() {
        return new ResourceCreationErrorImpl(message, resource);
    }

    /**
     * factory method for an instance of ResourceCreationErrorBuilder
     * @return builder
     */
    public static ResourceCreationErrorBuilder of() {
        return new ResourceCreationErrorBuilder();
    }

    /**
     * create builder for ResourceCreationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceCreationErrorBuilder of(final ResourceCreationError template) {
        ResourceCreationErrorBuilder builder = new ResourceCreationErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
