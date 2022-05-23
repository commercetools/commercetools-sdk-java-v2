
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ResourceUpdateError resourceUpdateError = ResourceUpdateError.builder()
           .message("{message}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceUpdateErrorBuilder implements Builder<ResourceUpdateError> {

    private String message;

    @Nullable
    private java.lang.Object resource;

    public ResourceUpdateErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ResourceUpdateErrorBuilder resource(@Nullable final java.lang.Object resource) {
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

    public ResourceUpdateError build() {
        Objects.requireNonNull(message, ResourceUpdateError.class + ": message is missing");
        return new ResourceUpdateErrorImpl(message, resource);
    }

    /**
     * builds ResourceUpdateError without checking for non null required values
     */
    public ResourceUpdateError buildUnchecked() {
        return new ResourceUpdateErrorImpl(message, resource);
    }

    public static ResourceUpdateErrorBuilder of() {
        return new ResourceUpdateErrorBuilder();
    }

    public static ResourceUpdateErrorBuilder of(final ResourceUpdateError template) {
        ResourceUpdateErrorBuilder builder = new ResourceUpdateErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
