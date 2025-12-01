
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when an invalid JSON input has been sent. Either the JSON is syntactically incorrect or does not conform to the expected shape, for example, it is missing a required field.</p>
 *  <p>The client application should validate the input according to the constraints described in the error message before sending the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidJsonInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidJsonInputErrorImpl.class)
public interface InvalidJsonInputError extends ErrorObject {

    /**
     * discriminator value for InvalidJsonInputError
     */
    String INVALID_JSON_INPUT = "InvalidJsonInput";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @return detailedErrorMessage
     */

    @JsonProperty("detailedErrorMessage")
    public String getDetailedErrorMessage();

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage value to be set
     */

    public void setDetailedErrorMessage(final String detailedErrorMessage);

    /**
     * factory method
     * @return instance of InvalidJsonInputError
     */
    public static InvalidJsonInputError of() {
        return new InvalidJsonInputErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidJsonInputError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidJsonInputError of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorImpl instance = new InvalidJsonInputErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setDetailedErrorMessage(template.getDetailedErrorMessage());
        return instance;
    }

    public InvalidJsonInputError copyDeep();

    /**
     * factory method to create a deep copy of InvalidJsonInputError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidJsonInputError deepCopy(@Nullable final InvalidJsonInputError template) {
        if (template == null) {
            return null;
        }
        InvalidJsonInputErrorImpl instance = new InvalidJsonInputErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setDetailedErrorMessage(template.getDetailedErrorMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidJsonInputError
     * @return builder
     */
    public static InvalidJsonInputErrorBuilder builder() {
        return InvalidJsonInputErrorBuilder.of();
    }

    /**
     * create builder for InvalidJsonInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidJsonInputErrorBuilder builder(final InvalidJsonInputError template) {
        return InvalidJsonInputErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidJsonInputError(Function<InvalidJsonInputError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidJsonInputError>";
            }
        };
    }
}
