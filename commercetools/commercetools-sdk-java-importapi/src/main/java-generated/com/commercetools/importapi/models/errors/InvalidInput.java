package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidInputImpl;

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
*  <p>Invalid input has been sent to the service. The client application should validate the input according to the
*  constraints described in the error message before sending the request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidInputImpl.class)
public interface InvalidInput extends ErrorObject {



    public static InvalidInput of(){
        return new InvalidInputImpl();
    }
    

    public static InvalidInput of(final InvalidInput template) {
        InvalidInputImpl instance = new InvalidInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidInputBuilder builder(){
        return InvalidInputBuilder.of();
    }
    
    public static InvalidInputBuilder builder(final InvalidInput template){
        return InvalidInputBuilder.of(template);
    }
    

    default <T> T withInvalidInput(Function<InvalidInput, T> helper) {
        return helper.apply(this);
    }
}
