package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ObjectNotFoundErrorImpl;

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
@JsonDeserialize(as = ObjectNotFoundErrorImpl.class)
public interface ObjectNotFoundError extends ErrorObject {



    public static ObjectNotFoundError of(){
        return new ObjectNotFoundErrorImpl();
    }
    

    public static ObjectNotFoundError of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorImpl instance = new ObjectNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ObjectNotFoundErrorBuilder builder(){
        return ObjectNotFoundErrorBuilder.of();
    }
    
    public static ObjectNotFoundErrorBuilder builder(final ObjectNotFoundError template){
        return ObjectNotFoundErrorBuilder.of(template);
    }
    

    default <T> T withObjectNotFoundError(Function<ObjectNotFoundError, T> helper) {
        return helper.apply(this);
    }
}
