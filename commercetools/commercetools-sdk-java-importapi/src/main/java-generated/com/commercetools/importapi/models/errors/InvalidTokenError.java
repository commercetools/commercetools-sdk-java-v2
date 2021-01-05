package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidTokenErrorImpl;

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
@JsonDeserialize(as = InvalidTokenErrorImpl.class)
public interface InvalidTokenError extends ErrorObject {



    public static InvalidTokenError of(){
        return new InvalidTokenErrorImpl();
    }
    

    public static InvalidTokenError of(final InvalidTokenError template) {
        InvalidTokenErrorImpl instance = new InvalidTokenErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidTokenErrorBuilder builder(){
        return InvalidTokenErrorBuilder.of();
    }
    
    public static InvalidTokenErrorBuilder builder(final InvalidTokenError template){
        return InvalidTokenErrorBuilder.of(template);
    }
    

    default <T> T withInvalidTokenError(Function<InvalidTokenError, T> helper) {
        return helper.apply(this);
    }
}
