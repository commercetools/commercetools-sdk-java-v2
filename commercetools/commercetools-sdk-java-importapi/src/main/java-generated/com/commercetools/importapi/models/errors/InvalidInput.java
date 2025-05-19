
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An invalid input has been sent to the service. The client application should validate the input according to the constraints described in the error message before sending the request again.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInput invalidInput = InvalidInput.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidInputImpl.class)
public interface InvalidInput extends ErrorObject {

    /**
     * discriminator value for InvalidInput
     */
    String INVALID_INPUT = "InvalidInput";

    /**
     * factory method
     * @return instance of InvalidInput
     */
    public static InvalidInput of() {
        return new InvalidInputImpl();
    }

    /**
     * factory method to create a shallow copy InvalidInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidInput of(final InvalidInput template) {
        InvalidInputImpl instance = new InvalidInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public InvalidInput copyDeep();

    /**
     * factory method to create a deep copy of InvalidInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidInput deepCopy(@Nullable final InvalidInput template) {
        if (template == null) {
            return null;
        }
        InvalidInputImpl instance = new InvalidInputImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidInput
     * @return builder
     */
    public static InvalidInputBuilder builder() {
        return InvalidInputBuilder.of();
    }

    /**
     * create builder for InvalidInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidInputBuilder builder(final InvalidInput template) {
        return InvalidInputBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidInput(Function<InvalidInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidInput>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidInput>";
            }
        };
    }
}
