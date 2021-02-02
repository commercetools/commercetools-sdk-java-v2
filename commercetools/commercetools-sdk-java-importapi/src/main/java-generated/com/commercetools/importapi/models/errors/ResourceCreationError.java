
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResourceCreationErrorImpl.class)
public interface ResourceCreationError extends ErrorObject {

    String RESOURCE_CREATION = "ResourceCreation";

    @JsonProperty("resource")
    public Object getResource();

    public void setResource(final Object resource);

    public static ResourceCreationError of() {
        return new ResourceCreationErrorImpl();
    }

    public static ResourceCreationError of(final ResourceCreationError template) {
        ResourceCreationErrorImpl instance = new ResourceCreationErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceCreationErrorBuilder builder() {
        return ResourceCreationErrorBuilder.of();
    }

    public static ResourceCreationErrorBuilder builder(final ResourceCreationError template) {
        return ResourceCreationErrorBuilder.of(template);
    }

    default <T> T withResourceCreationError(Function<ResourceCreationError, T> helper) {
        return helper.apply(this);
    }
}
