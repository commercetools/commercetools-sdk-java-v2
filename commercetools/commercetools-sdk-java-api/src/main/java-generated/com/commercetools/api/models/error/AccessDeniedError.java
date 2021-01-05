package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AccessDeniedErrorImpl;

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
@JsonDeserialize(as = AccessDeniedErrorImpl.class)
public interface AccessDeniedError extends ErrorObject {



    public static AccessDeniedError of(){
        return new AccessDeniedErrorImpl();
    }
    

    public static AccessDeniedError of(final AccessDeniedError template) {
        AccessDeniedErrorImpl instance = new AccessDeniedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static AccessDeniedErrorBuilder builder(){
        return AccessDeniedErrorBuilder.of();
    }
    
    public static AccessDeniedErrorBuilder builder(final AccessDeniedError template){
        return AccessDeniedErrorBuilder.of(template);
    }
    

    default <T> T withAccessDeniedError(Function<AccessDeniedError, T> helper) {
        return helper.apply(this);
    }
}
