package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ResourceSizeLimitExceededErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ResourceSizeLimitExceededErrorImpl.class)
public interface ResourceSizeLimitExceededError extends ErrorObject {

    String RESOURCE_SIZE_LIMIT_EXCEEDED = "ResourceSizeLimitExceeded";



    public static ResourceSizeLimitExceededError of(){
        return new ResourceSizeLimitExceededErrorImpl();
    }
    

    public static ResourceSizeLimitExceededError of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorImpl instance = new ResourceSizeLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ResourceSizeLimitExceededErrorBuilder builder(){
        return ResourceSizeLimitExceededErrorBuilder.of();
    }
    
    public static ResourceSizeLimitExceededErrorBuilder builder(final ResourceSizeLimitExceededError template){
        return ResourceSizeLimitExceededErrorBuilder.of(template);
    }
    

    default <T> T withResourceSizeLimitExceededError(Function<ResourceSizeLimitExceededError, T> helper) {
        return helper.apply(this);
    }
}
