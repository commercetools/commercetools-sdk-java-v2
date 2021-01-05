package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.GenericErrorImpl;

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
@JsonDeserialize(as = GenericErrorImpl.class)
public interface GenericError extends ErrorObject {



    public static GenericError of(){
        return new GenericErrorImpl();
    }
    

    public static GenericError of(final GenericError template) {
        GenericErrorImpl instance = new GenericErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static GenericErrorBuilder builder(){
        return GenericErrorBuilder.of();
    }
    
    public static GenericErrorBuilder builder(final GenericError template){
        return GenericErrorBuilder.of(template);
    }
    

    default <T> T withGenericError(Function<GenericError, T> helper) {
        return helper.apply(this);
    }
}
