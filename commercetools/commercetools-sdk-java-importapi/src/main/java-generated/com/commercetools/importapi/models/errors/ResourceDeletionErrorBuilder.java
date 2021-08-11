
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceDeletionErrorBuilder implements Builder<ResourceDeletionError> {

    private String message;

    @Nullable
    private java.lang.Object resource;

    public ResourceDeletionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

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
