
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ResourceUpdateErrorImpl.class)
public interface ResourceUpdateError extends ErrorObject {

    String RESOURCE_UPDATE = "ResourceUpdate";

    @JsonProperty("resource")
    public Object getResource();

    public void setResource(final Object resource);

    public static ResourceUpdateError of() {
        return new ResourceUpdateErrorImpl();
    }

    public static ResourceUpdateError of(final ResourceUpdateError template) {
        ResourceUpdateErrorImpl instance = new ResourceUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceUpdateErrorBuilder builder() {
        return ResourceUpdateErrorBuilder.of();
    }

    public static ResourceUpdateErrorBuilder builder(final ResourceUpdateError template) {
        return ResourceUpdateErrorBuilder.of(template);
    }

    default <T> T withResourceUpdateError(Function<ResourceUpdateError, T> helper) {
        return helper.apply(this);
    }
}
