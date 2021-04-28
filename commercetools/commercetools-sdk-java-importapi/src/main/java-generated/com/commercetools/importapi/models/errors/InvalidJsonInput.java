
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An invalid JSON input has been sent to the service.
*  Either the JSON is syntactically incorrect or the JSON has an unexpected shape, for example, a required field is missing.
*  The client application should validate the input according to the constraints described in the error message before sending the request again.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidJsonInputImpl.class)
public interface InvalidJsonInput extends ErrorObject {

    String INVALID_JSON_INPUT = "InvalidJsonInput";

    public static InvalidJsonInput of() {
        return new InvalidJsonInputImpl();
    }

    public static InvalidJsonInput of(final InvalidJsonInput template) {
        InvalidJsonInputImpl instance = new InvalidJsonInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidJsonInputBuilder builder() {
        return InvalidJsonInputBuilder.of();
    }

    public static InvalidJsonInputBuilder builder(final InvalidJsonInput template) {
        return InvalidJsonInputBuilder.of(template);
    }

    default <T> T withInvalidJsonInput(Function<InvalidJsonInput, T> helper) {
        return helper.apply(this);
    }
}
