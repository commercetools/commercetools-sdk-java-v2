package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidOperationErrorImpl;

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
@JsonDeserialize(as = InvalidOperationErrorImpl.class)
public interface InvalidOperationError extends ErrorObject {



    public static InvalidOperationErrorImpl of(){
        return new InvalidOperationErrorImpl();
    }
    

    public static InvalidOperationErrorImpl of(final InvalidOperationError template) {
        InvalidOperationErrorImpl instance = new InvalidOperationErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withInvalidOperationError(Function<InvalidOperationError, T> helper) {
        return helper.apply(this);
    }
}
