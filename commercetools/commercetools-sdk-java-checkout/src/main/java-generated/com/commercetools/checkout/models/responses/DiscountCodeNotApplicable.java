
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
 *  <p>Generated when the <span>Discount Code</span> is not applicable for the current Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeNotApplicable discountCodeNotApplicable = DiscountCodeNotApplicable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("discount_code_not_applicable")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeNotApplicableImpl.class)
public interface DiscountCodeNotApplicable extends ResponseMessage {

    /**
     * discriminator value for DiscountCodeNotApplicable
     */
    String DISCOUNT_CODE_NOT_APPLICABLE = "discount_code_not_applicable";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`info`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Discount code not applicable.</p>
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
     *  <p>Contains the <code>cartId</code> and <code>discountCode</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Discount code not applicable.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cartId</code> and <code>discountCode</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of DiscountCodeNotApplicable
     */
    public static DiscountCodeNotApplicable of() {
        return new DiscountCodeNotApplicableImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeNotApplicable
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeNotApplicable of(final DiscountCodeNotApplicable template) {
        DiscountCodeNotApplicableImpl instance = new DiscountCodeNotApplicableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public DiscountCodeNotApplicable copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeNotApplicable
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeNotApplicable deepCopy(@Nullable final DiscountCodeNotApplicable template) {
        if (template == null) {
            return null;
        }
        DiscountCodeNotApplicableImpl instance = new DiscountCodeNotApplicableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeNotApplicable
     * @return builder
     */
    public static DiscountCodeNotApplicableBuilder builder() {
        return DiscountCodeNotApplicableBuilder.of();
    }

    /**
     * create builder for DiscountCodeNotApplicable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeNotApplicableBuilder builder(final DiscountCodeNotApplicable template) {
        return DiscountCodeNotApplicableBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeNotApplicable(Function<DiscountCodeNotApplicable, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNotApplicable> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNotApplicable>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeNotApplicable>";
            }
        };
    }
}
