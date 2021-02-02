
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OverCapacityErrorImpl.class)
public interface OverCapacityError extends ErrorObject {

    String OVER_CAPACITY = "OverCapacity";

    public static OverCapacityError of() {
        return new OverCapacityErrorImpl();
    }

    public static OverCapacityError of(final OverCapacityError template) {
        OverCapacityErrorImpl instance = new OverCapacityErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static OverCapacityErrorBuilder builder() {
        return OverCapacityErrorBuilder.of();
    }

    public static OverCapacityErrorBuilder builder(final OverCapacityError template) {
        return OverCapacityErrorBuilder.of(template);
    }

    default <T> T withOverCapacityError(Function<OverCapacityError, T> helper) {
        return helper.apply(this);
    }
}
