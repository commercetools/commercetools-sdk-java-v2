
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ErrorObjectImpl.class)
public interface ErrorObject {

    @NotNull
    @JsonProperty("code")
    public String getCode();

    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setCode(final String code);

    public void setMessage(final String message);

    public static ErrorObject of() {
        return new ErrorObjectImpl();
    }

    public static ErrorObject of(final ErrorObject template) {
        ErrorObjectImpl instance = new ErrorObjectImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ErrorObjectBuilder builder() {
        return ErrorObjectBuilder.of();
    }

    public static ErrorObjectBuilder builder(final ErrorObject template) {
        return ErrorObjectBuilder.of(template);
    }

    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorObject>";
            }
        };
    }
}
