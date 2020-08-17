package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.InvalidJsonInputImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Invalid JSON input has been sent to the service. Either the JSON is syntactically not correct, or the JSON does not
*  conform to the expected shape (e.g. is missing a required field). The client application should validate the input
*  according to the constraints described in the error message before sending the request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidJsonInputImpl.class)
public interface InvalidJsonInput extends ErrorObject {



    public static InvalidJsonInputImpl of(){
        return new InvalidJsonInputImpl();
    }
    

    public static InvalidJsonInputImpl of(final InvalidJsonInput template) {
        InvalidJsonInputImpl instance = new InvalidJsonInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

}
