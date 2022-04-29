
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MaxResourceLimitExceededErrorImpl.class)
public interface MaxResourceLimitExceededError extends ErrorObject {

    String MAX_RESOURCE_LIMIT_EXCEEDED = "MaxResourceLimitExceeded";

    @NotNull
    @JsonProperty("exceededResource")
    public ReferenceTypeId getExceededResource();

    public void setExceededResource(final ReferenceTypeId exceededResource);

    public static MaxResourceLimitExceededError of() {
        return new MaxResourceLimitExceededErrorImpl();
    }

    public static MaxResourceLimitExceededError of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorImpl instance = new MaxResourceLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setExceededResource(template.getExceededResource());
        return instance;
    }

    public static MaxResourceLimitExceededErrorBuilder builder() {
        return MaxResourceLimitExceededErrorBuilder.of();
    }

    public static MaxResourceLimitExceededErrorBuilder builder(final MaxResourceLimitExceededError template) {
        return MaxResourceLimitExceededErrorBuilder.of(template);
    }

    default <T> T withMaxResourceLimitExceededError(Function<MaxResourceLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MaxResourceLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MaxResourceLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<MaxResourceLimitExceededError>";
            }
        };
    }
}
