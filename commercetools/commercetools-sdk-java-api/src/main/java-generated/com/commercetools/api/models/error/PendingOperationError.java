package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.PendingOperationErrorImpl;

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
@JsonDeserialize(as = PendingOperationErrorImpl.class)
public interface PendingOperationError extends ErrorObject {



    public static PendingOperationErrorImpl of(){
        return new PendingOperationErrorImpl();
    }
    

    public static PendingOperationErrorImpl of(final PendingOperationError template) {
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withPendingOperationError(Function<PendingOperationError, T> helper) {
        return helper.apply(this);
    }
}
