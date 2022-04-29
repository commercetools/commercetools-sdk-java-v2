
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An invalid input has been sent to the service. The client application should validate the input according to the
*  constraints described in the error message before sending the request again.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidInputImpl.class)
public interface InvalidInput extends ErrorObject {

    String INVALID_INPUT = "InvalidInput";

    public static InvalidInput of() {
        return new InvalidInputImpl();
    }

    public static InvalidInput of(final InvalidInput template) {
        InvalidInputImpl instance = new InvalidInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidInputBuilder builder() {
        return InvalidInputBuilder.of();
    }

    public static InvalidInputBuilder builder(final InvalidInput template) {
        return InvalidInputBuilder.of(template);
    }

    default <T> T withInvalidInput(Function<InvalidInput, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidInput>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidInput>";
            }
        };
    }
}
