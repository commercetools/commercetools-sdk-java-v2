
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceDeletionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceDeletionError resourceDeletionError = ResourceDeletionError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceDeletionErrorBuilder implements Builder<ResourceDeletionError> {

    private String message;

    @Nullable
    private java.lang.Object resource;

    /**
     *
     */

    public ResourceDeletionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     */

    public ResourceDeletionErrorBuilder resource(@Nullable final java.lang.Object resource) {
        this.resource = resource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public java.lang.Object getResource() {
        return this.resource;
    }

    public ResourceDeletionError build() {
        Objects.requireNonNull(message, ResourceDeletionError.class + ": message is missing");
        return new ResourceDeletionErrorImpl(message, resource);
    }

    /**
     * builds ResourceDeletionError without checking for non null required values
     */
    public ResourceDeletionError buildUnchecked() {
        return new ResourceDeletionErrorImpl(message, resource);
    }

    public static ResourceDeletionErrorBuilder of() {
        return new ResourceDeletionErrorBuilder();
    }

    public static ResourceDeletionErrorBuilder of(final ResourceDeletionError template) {
        ResourceDeletionErrorBuilder builder = new ResourceDeletionErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
