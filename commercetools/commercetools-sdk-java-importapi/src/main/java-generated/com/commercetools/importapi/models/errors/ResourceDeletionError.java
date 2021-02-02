
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResourceDeletionErrorImpl.class)
public interface ResourceDeletionError extends ErrorObject {

    String RESOURCE_DELETION = "ResourceDeletion";

    @JsonProperty("resource")
    public Object getResource();

    public void setResource(final Object resource);

    public static ResourceDeletionError of() {
        return new ResourceDeletionErrorImpl();
    }

    public static ResourceDeletionError of(final ResourceDeletionError template) {
        ResourceDeletionErrorImpl instance = new ResourceDeletionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceDeletionErrorBuilder builder() {
        return ResourceDeletionErrorBuilder.of();
    }

    public static ResourceDeletionErrorBuilder builder(final ResourceDeletionError template) {
        return ResourceDeletionErrorBuilder.of(template);
    }

    default <T> T withResourceDeletionError(Function<ResourceDeletionError, T> helper) {
        return helper.apply(this);
    }
}
