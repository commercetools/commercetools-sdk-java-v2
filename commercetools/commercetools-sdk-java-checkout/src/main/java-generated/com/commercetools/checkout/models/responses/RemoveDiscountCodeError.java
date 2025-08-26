
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when there was an error removing the <span>Discount Code</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDiscountCodeError removeDiscountCodeError = RemoveDiscountCodeError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("remove_discount_code_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveDiscountCodeErrorImpl.class)
public interface RemoveDiscountCodeError extends ResponseMessage {

    /**
     * discriminator value for RemoveDiscountCodeError
     */
    String REMOVE_DISCOUNT_CODE_ERROR = "remove_discount_code_error";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Error removing discount code.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Contains the <code>error</code> object.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Error removing discount code.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>error</code> object.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of RemoveDiscountCodeError
     */
    public static RemoveDiscountCodeError of() {
        return new RemoveDiscountCodeErrorImpl();
    }

    /**
     * factory method to create a shallow copy RemoveDiscountCodeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveDiscountCodeError of(final RemoveDiscountCodeError template) {
        RemoveDiscountCodeErrorImpl instance = new RemoveDiscountCodeErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public RemoveDiscountCodeError copyDeep();

    /**
     * factory method to create a deep copy of RemoveDiscountCodeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveDiscountCodeError deepCopy(@Nullable final RemoveDiscountCodeError template) {
        if (template == null) {
            return null;
        }
        RemoveDiscountCodeErrorImpl instance = new RemoveDiscountCodeErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for RemoveDiscountCodeError
     * @return builder
     */
    public static RemoveDiscountCodeErrorBuilder builder() {
        return RemoveDiscountCodeErrorBuilder.of();
    }

    /**
     * create builder for RemoveDiscountCodeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDiscountCodeErrorBuilder builder(final RemoveDiscountCodeError template) {
        return RemoveDiscountCodeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveDiscountCodeError(Function<RemoveDiscountCodeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveDiscountCodeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveDiscountCodeError>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveDiscountCodeError>";
            }
        };
    }
}
