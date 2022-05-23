
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceNotFoundError resourceNotFoundError = ResourceNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceNotFoundErrorBuilder implements Builder<ResourceNotFoundError> {

    private String message;

    @Nullable
    private java.lang.Object resource;

    /**
     <>
     */

    public ResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     <>
     */

    public ResourceNotFoundErrorBuilder resource(@Nullable final java.lang.Object resource) {
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

    public ResourceNotFoundError build() {
        Objects.requireNonNull(message, ResourceNotFoundError.class + ": message is missing");
        return new ResourceNotFoundErrorImpl(message, resource);
    }

    /**
     * builds ResourceNotFoundError without checking for non null required values
     */
    public ResourceNotFoundError buildUnchecked() {
        return new ResourceNotFoundErrorImpl(message, resource);
    }

    public static ResourceNotFoundErrorBuilder of() {
        return new ResourceNotFoundErrorBuilder();
    }

    public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
