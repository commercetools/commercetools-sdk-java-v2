package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InsufficientScopeErrorImpl;

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
@JsonDeserialize(as = InsufficientScopeErrorImpl.class)
public interface InsufficientScopeError extends ErrorObject {



    public static InsufficientScopeErrorImpl of(){
        return new InsufficientScopeErrorImpl();
    }
    

    public static InsufficientScopeErrorImpl of(final InsufficientScopeError template) {
        InsufficientScopeErrorImpl instance = new InsufficientScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withInsufficientScopeError(Function<InsufficientScopeError, T> helper) {
        return helper.apply(this);
    }
}
