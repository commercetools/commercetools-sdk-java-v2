
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
 *  <p>Returned when <code>actions</code> in the request body contains more than one object.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultipleActionsNotAllowedError multipleActionsNotAllowedError = MultipleActionsNotAllowedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MultipleActionsNotAllowed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MultipleActionsNotAllowedErrorImpl.class)
public interface MultipleActionsNotAllowedError extends ErrorObject {

    /**
     * discriminator value for MultipleActionsNotAllowedError
     */
    String MULTIPLE_ACTIONS_NOT_ALLOWED = "MultipleActionsNotAllowed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Actions accepts only one action at time. Array size must be 1."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Actions accepts only one action at time. Array size must be 1."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MultipleActionsNotAllowedError
     */
    public static MultipleActionsNotAllowedError of() {
        return new MultipleActionsNotAllowedErrorImpl();
    }

    /**
     * factory method to create a shallow copy MultipleActionsNotAllowedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MultipleActionsNotAllowedError of(final MultipleActionsNotAllowedError template) {
        MultipleActionsNotAllowedErrorImpl instance = new MultipleActionsNotAllowedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public MultipleActionsNotAllowedError copyDeep();

    /**
     * factory method to create a deep copy of MultipleActionsNotAllowedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MultipleActionsNotAllowedError deepCopy(@Nullable final MultipleActionsNotAllowedError template) {
        if (template == null) {
            return null;
        }
        MultipleActionsNotAllowedErrorImpl instance = new MultipleActionsNotAllowedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for MultipleActionsNotAllowedError
     * @return builder
     */
    public static MultipleActionsNotAllowedErrorBuilder builder() {
        return MultipleActionsNotAllowedErrorBuilder.of();
    }

    /**
     * create builder for MultipleActionsNotAllowedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultipleActionsNotAllowedErrorBuilder builder(final MultipleActionsNotAllowedError template) {
        return MultipleActionsNotAllowedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMultipleActionsNotAllowedError(Function<MultipleActionsNotAllowedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MultipleActionsNotAllowedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultipleActionsNotAllowedError>() {
            @Override
            public String toString() {
                return "TypeReference<MultipleActionsNotAllowedError>";
            }
        };
    }
}
