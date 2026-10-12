
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when the referenced resources violate a constraint required for the operation, for example, when a Cart and a PaymentMethod are expected to belong to the same customer but do not.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InternalConstraintViolatedError internalConstraintViolatedError = InternalConstraintViolatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InternalConstraintViolated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InternalConstraintViolatedErrorImpl.class)
public interface InternalConstraintViolatedError extends ErrorObject {

    /**
     * discriminator value for InternalConstraintViolatedError
     */
    String INTERNAL_CONSTRAINT_VIOLATED = "InternalConstraintViolated";

    /**
     *  <p>Error code, always <code>InternalConstraintViolated</code>.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InternalConstraintViolatedError
     */
    public static InternalConstraintViolatedError of() {
        return new InternalConstraintViolatedErrorImpl();
    }

    /**
     * factory method to create a shallow copy InternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InternalConstraintViolatedError of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public InternalConstraintViolatedError copyDeep();

    /**
     * factory method to create a deep copy of InternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InternalConstraintViolatedError deepCopy(@Nullable final InternalConstraintViolatedError template) {
        if (template == null) {
            return null;
        }
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InternalConstraintViolatedError
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder builder() {
        return InternalConstraintViolatedErrorBuilder.of();
    }

    /**
     * create builder for InternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder builder(final InternalConstraintViolatedError template) {
        return InternalConstraintViolatedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInternalConstraintViolatedError(Function<InternalConstraintViolatedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InternalConstraintViolatedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<InternalConstraintViolatedError>() {
            @Override
            public String toString() {
                return "TypeReference<InternalConstraintViolatedError>";
            }
        };
    }
}
