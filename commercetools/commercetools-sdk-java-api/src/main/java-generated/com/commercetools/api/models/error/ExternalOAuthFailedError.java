package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ExternalOAuthFailedErrorImpl;

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
@JsonDeserialize(as = ExternalOAuthFailedErrorImpl.class)
public interface ExternalOAuthFailedError extends ErrorObject {



    public static ExternalOAuthFailedError of(){
        return new ExternalOAuthFailedErrorImpl();
    }
    

    public static ExternalOAuthFailedError of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorImpl instance = new ExternalOAuthFailedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ExternalOAuthFailedErrorBuilder builder(){
        return ExternalOAuthFailedErrorBuilder.of();
    }
    
    public static ExternalOAuthFailedErrorBuilder builder(final ExternalOAuthFailedError template){
        return ExternalOAuthFailedErrorBuilder.of(template);
    }
    

    default <T> T withExternalOAuthFailedError(Function<ExternalOAuthFailedError, T> helper) {
        return helper.apply(this);
    }
}
