
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an invalid JSON input has been sent. Either the JSON is syntactically incorrect or does not conform to the expected shape (for example is missing a required field).</p>
 *  <p>The client application should validate the input according to the constraints described in the error message before sending the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidJsonInputErrorImpl.class)
public interface InvalidJsonInputError extends ErrorObject {

    String INVALID_JSON_INPUT = "InvalidJsonInput";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     */
    @NotNull
    @JsonProperty("detailedErrorMessage")
    public String getDetailedErrorMessage();

    public void setMessage(final String message);

    public void setDetailedErrorMessage(final String detailedErrorMessage);

    public static InvalidJsonInputError of() {
        return new InvalidJsonInputErrorImpl();
    }

    public static InvalidJsonInputError of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorImpl instance = new InvalidJsonInputErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setDetailedErrorMessage(template.getDetailedErrorMessage());
        return instance;
    }

    public static InvalidJsonInputErrorBuilder builder() {
        return InvalidJsonInputErrorBuilder.of();
    }

    public static InvalidJsonInputErrorBuilder builder(final InvalidJsonInputError template) {
        return InvalidJsonInputErrorBuilder.of(template);
    }

    default <T> T withInvalidJsonInputError(Function<InvalidJsonInputError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidJsonInputError>";
            }
        };
    }
}
