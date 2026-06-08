
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
 *  <p>Generated when there was an error adding a Discount Code.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDiscountCodeError addDiscountCodeError = AddDiscountCodeError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("add_discount_code_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddDiscountCodeErrorImpl.class)
public interface AddDiscountCodeError extends ResponseMessage {

    /**
     * discriminator value for AddDiscountCodeError
     */
    String ADD_DISCOUNT_CODE_ERROR = "add_discount_code_error";

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
     *  <p>Error adding discount code.</p>
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
     *  <p>Error adding discount code.</p>
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
     * @return instance of AddDiscountCodeError
     */
    public static AddDiscountCodeError of() {
        return new AddDiscountCodeErrorImpl();
    }

    /**
     * factory method to create a shallow copy AddDiscountCodeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddDiscountCodeError of(final AddDiscountCodeError template) {
        AddDiscountCodeErrorImpl instance = new AddDiscountCodeErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public AddDiscountCodeError copyDeep();

    /**
     * factory method to create a deep copy of AddDiscountCodeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddDiscountCodeError deepCopy(@Nullable final AddDiscountCodeError template) {
        if (template == null) {
            return null;
        }
        AddDiscountCodeErrorImpl instance = new AddDiscountCodeErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for AddDiscountCodeError
     * @return builder
     */
    public static AddDiscountCodeErrorBuilder builder() {
        return AddDiscountCodeErrorBuilder.of();
    }

    /**
     * create builder for AddDiscountCodeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDiscountCodeErrorBuilder builder(final AddDiscountCodeError template) {
        return AddDiscountCodeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddDiscountCodeError(Function<AddDiscountCodeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeError>() {
            @Override
            public String toString() {
                return "TypeReference<AddDiscountCodeError>";
            }
        };
    }
}
