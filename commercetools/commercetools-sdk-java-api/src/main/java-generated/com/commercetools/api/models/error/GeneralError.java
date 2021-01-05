package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.GeneralErrorImpl;

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
@JsonDeserialize(as = GeneralErrorImpl.class)
public interface GeneralError extends ErrorObject {



    public static GeneralError of(){
        return new GeneralErrorImpl();
    }
    

    public static GeneralError of(final GeneralError template) {
        GeneralErrorImpl instance = new GeneralErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static GeneralErrorBuilder builder(){
        return GeneralErrorBuilder.of();
    }
    
    public static GeneralErrorBuilder builder(final GeneralError template){
        return GeneralErrorBuilder.of(template);
    }
    

    default <T> T withGeneralError(Function<GeneralError, T> helper) {
        return helper.apply(this);
    }
}
