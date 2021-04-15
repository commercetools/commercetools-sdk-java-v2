package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidCurrentPasswordErrorImpl;

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
@JsonDeserialize(as = InvalidCurrentPasswordErrorImpl.class)
public interface InvalidCurrentPasswordError extends ErrorObject {

    String INVALID_CURRENT_PASSWORD = "InvalidCurrentPassword";



    public static InvalidCurrentPasswordError of(){
        return new InvalidCurrentPasswordErrorImpl();
    }
    

    public static InvalidCurrentPasswordError of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidCurrentPasswordErrorBuilder builder(){
        return InvalidCurrentPasswordErrorBuilder.of();
    }
    
    public static InvalidCurrentPasswordErrorBuilder builder(final InvalidCurrentPasswordError template){
        return InvalidCurrentPasswordErrorBuilder.of(template);
    }
    

    default <T> T withInvalidCurrentPasswordError(Function<InvalidCurrentPasswordError, T> helper) {
        return helper.apply(this);
    }
}
