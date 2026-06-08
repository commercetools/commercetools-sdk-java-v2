
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An invalid JSON input has been sent to the service. Either the JSON is syntactically incorrect or the JSON has an unexpected shape, for example, a required field is missing. The client application should validate the input according to the constraints described in the error message before sending the request again.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInput invalidJsonInput = InvalidJsonInput.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidJsonInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidJsonInputImpl.class)
public interface InvalidJsonInput extends ErrorObject {

    /**
     * discriminator value for InvalidJsonInput
     */
    String INVALID_JSON_INPUT = "InvalidJsonInput";

    /**
     * factory method
     * @return instance of InvalidJsonInput
     */
    public static InvalidJsonInput of() {
        return new InvalidJsonInputImpl();
    }

    /**
     * factory method to create a shallow copy InvalidJsonInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidJsonInput of(final InvalidJsonInput template) {
        InvalidJsonInputImpl instance = new InvalidJsonInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public InvalidJsonInput copyDeep();

    /**
     * factory method to create a deep copy of InvalidJsonInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidJsonInput deepCopy(@Nullable final InvalidJsonInput template) {
        if (template == null) {
            return null;
        }
        InvalidJsonInputImpl instance = new InvalidJsonInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidJsonInput
     * @return builder
     */
    public static InvalidJsonInputBuilder builder() {
        return InvalidJsonInputBuilder.of();
    }

    /**
     * create builder for InvalidJsonInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidJsonInputBuilder builder(final InvalidJsonInput template) {
        return InvalidJsonInputBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidJsonInput(Function<InvalidJsonInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInput>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidJsonInput>";
            }
        };
    }
}
