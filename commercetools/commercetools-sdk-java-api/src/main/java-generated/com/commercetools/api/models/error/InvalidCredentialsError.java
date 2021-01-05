package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidCredentialsErrorImpl;

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
@JsonDeserialize(as = InvalidCredentialsErrorImpl.class)
public interface InvalidCredentialsError extends ErrorObject {



    public static InvalidCredentialsError of(){
        return new InvalidCredentialsErrorImpl();
    }
    

    public static InvalidCredentialsError of(final InvalidCredentialsError template) {
        InvalidCredentialsErrorImpl instance = new InvalidCredentialsErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidCredentialsErrorBuilder builder(){
        return InvalidCredentialsErrorBuilder.of();
    }
    
    public static InvalidCredentialsErrorBuilder builder(final InvalidCredentialsError template){
        return InvalidCredentialsErrorBuilder.of(template);
    }
    

    default <T> T withInvalidCredentialsError(Function<InvalidCredentialsError, T> helper) {
        return helper.apply(this);
    }
}
