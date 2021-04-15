
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PendingOperationErrorImpl.class)
public interface PendingOperationError extends ErrorObject {

    String PENDING_OPERATION = "PendingOperation";

    public static PendingOperationError of() {
        return new PendingOperationErrorImpl();
    }

    public static PendingOperationError of(final PendingOperationError template) {
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static PendingOperationErrorBuilder builder() {
        return PendingOperationErrorBuilder.of();
    }

    public static PendingOperationErrorBuilder builder(final PendingOperationError template) {
        return PendingOperationErrorBuilder.of(template);
    }

    default <T> T withPendingOperationError(Function<PendingOperationError, T> helper) {
        return helper.apply(this);
    }
}
