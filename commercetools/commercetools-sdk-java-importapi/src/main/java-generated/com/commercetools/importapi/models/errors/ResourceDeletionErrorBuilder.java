
package com.commercetools.importapi.models.errors;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.ResourceDeletionError;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceDeletionErrorBuilder {

    private String message;

    @Nullable
    private com.fasterxml.jackson.databind.JsonNode resource;

    public ResourceDeletionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ResourceDeletionErrorBuilder resource(@Nullable final com.fasterxml.jackson.databind.JsonNode resource) {
        this.resource = resource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getResource() {
        return this.resource;
    }

    public ResourceDeletionError build() {
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
