package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidScopeErrorImpl;

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

/**
*  <p>The requested scope is invalid, unknown, malformed, or exceeds the scope granted by the resource owner.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidScopeErrorImpl.class)
public interface InvalidScopeError extends ErrorObject {



    public static InvalidScopeError of(){
        return new InvalidScopeErrorImpl();
    }
    

    public static InvalidScopeError of(final InvalidScopeError template) {
        InvalidScopeErrorImpl instance = new InvalidScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidScopeErrorBuilder builder(){
        return InvalidScopeErrorBuilder.of();
    }
    
    public static InvalidScopeErrorBuilder builder(final InvalidScopeError template){
        return InvalidScopeErrorBuilder.of(template);
    }
    

    default <T> T withInvalidScopeError(Function<InvalidScopeError, T> helper) {
        return helper.apply(this);
    }
}
