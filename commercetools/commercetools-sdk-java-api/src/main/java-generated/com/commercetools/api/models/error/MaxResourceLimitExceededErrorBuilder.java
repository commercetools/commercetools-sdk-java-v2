
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MaxResourceLimitExceededErrorBuilder implements Builder<MaxResourceLimitExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    public MaxResourceLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public MaxResourceLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public MaxResourceLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public MaxResourceLimitExceededErrorBuilder exceededResource(
            final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    public MaxResourceLimitExceededError build() {
        Objects.requireNonNull(message, MaxResourceLimitExceededError.class + ": message is missing");
        Objects.requireNonNull(values, MaxResourceLimitExceededError.class + ": values are missing");
        Objects.requireNonNull(exceededResource, MaxResourceLimitExceededError.class + ": exceededResource is missing");
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }

    /**
     * builds MaxResourceLimitExceededError without checking for non null required values
     */
    public MaxResourceLimitExceededError buildUnchecked() {
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }

    public static MaxResourceLimitExceededErrorBuilder of() {
        return new MaxResourceLimitExceededErrorBuilder();
    }

    public static MaxResourceLimitExceededErrorBuilder of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorBuilder builder = new MaxResourceLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.exceededResource = template.getExceededResource();
        return builder;
    }

}
