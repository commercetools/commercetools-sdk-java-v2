
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
 *  <p>This is the representation of a single error.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorObject errorObject = ErrorObject.connectorFailedBuilder()
 *             message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = ErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ErrorObject {

    /**
     *  <p>Error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    public ErrorObject copyDeep();

    /**
     * factory method to create a deep copy of ErrorObject
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ErrorObject deepCopy(@Nullable final ErrorObject template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ErrorObjectImpl)) {
            return template.copyDeep();
        }
        ErrorObjectImpl instance = new ErrorObjectImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder for connectorFailed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.ConnectorFailedErrorBuilder connectorFailedBuilder() {
        return com.commercetools.checkout.models.error.ConnectorFailedErrorBuilder.of();
    }

    /**
     * builder for general subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.GeneralErrorBuilder generalBuilder() {
        return com.commercetools.checkout.models.error.GeneralErrorBuilder.of();
    }

    /**
     * builder for invalidInput subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.InvalidInputErrorBuilder invalidInputBuilder() {
        return com.commercetools.checkout.models.error.InvalidInputErrorBuilder.of();
    }

    /**
     * builder for invalidJsonInput subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.InvalidJsonInputErrorBuilder invalidJsonInputBuilder() {
        return com.commercetools.checkout.models.error.InvalidJsonInputErrorBuilder.of();
    }

    /**
     * builder for multipleActionsNotAllowed subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.MultipleActionsNotAllowedErrorBuilder multipleActionsNotAllowedBuilder() {
        return com.commercetools.checkout.models.error.MultipleActionsNotAllowedErrorBuilder.of();
    }

    /**
     * builder for paymentFailure subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.PaymentFailureErrorBuilder paymentFailureBuilder() {
        return com.commercetools.checkout.models.error.PaymentFailureErrorBuilder.of();
    }

    /**
     * builder for requiredField subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.RequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.checkout.models.error.RequiredFieldErrorBuilder.of();
    }

    /**
     * builder for resourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.error.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.checkout.models.error.ResourceNotFoundErrorBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorObject>";
            }
        };
    }
}
