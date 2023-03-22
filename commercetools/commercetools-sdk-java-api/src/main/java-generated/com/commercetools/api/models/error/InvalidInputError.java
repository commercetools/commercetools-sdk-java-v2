
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an invalid input has been sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInputError invalidInputError = InvalidInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidInputErrorImpl.class)
public interface InvalidInputError extends ErrorObject {

    String INVALID_INPUT = "InvalidInput";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the constraints that are not met by the request. For example, <code>"Invalid $propertyName. It may be a non-empty string up to $maxLength"</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    public static InvalidInputError of() {
        return new InvalidInputErrorImpl();
    }

    public static InvalidInputError of(final InvalidInputError template) {
        InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidInputErrorBuilder builder() {
        return InvalidInputErrorBuilder.of();
    }

    public static InvalidInputErrorBuilder builder(final InvalidInputError template) {
        return InvalidInputErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidInputError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidInputError>";
            }
        };
    }
}
