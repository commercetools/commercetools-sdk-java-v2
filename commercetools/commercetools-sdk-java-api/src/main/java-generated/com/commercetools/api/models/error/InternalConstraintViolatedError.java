package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InternalConstraintViolatedErrorImpl;

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
@JsonDeserialize(as = InternalConstraintViolatedErrorImpl.class)
public interface InternalConstraintViolatedError extends ErrorObject {



    public static InternalConstraintViolatedError of(){
        return new InternalConstraintViolatedErrorImpl();
    }
    

    public static InternalConstraintViolatedError of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InternalConstraintViolatedErrorBuilder builder(){
        return InternalConstraintViolatedErrorBuilder.of();
    }
    
    public static InternalConstraintViolatedErrorBuilder builder(final InternalConstraintViolatedError template){
        return InternalConstraintViolatedErrorBuilder.of(template);
    }
    

    default <T> T withInternalConstraintViolatedError(Function<InternalConstraintViolatedError, T> helper) {
        return helper.apply(this);
    }
}
