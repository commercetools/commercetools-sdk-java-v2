
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInfo paymentInfo = PaymentInfo.builder()
 *             .plusPayments(paymentsBuilder -> paymentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentInfoImpl.class)
public interface PaymentInfo {

    /**
     *
     * @return payments
     */
    @NotNull
    @Valid
    @JsonProperty("payments")
    public List<PaymentReference> getPayments();

    /**
     * set payments
     * @param payments values to be set
     */

    @JsonIgnore
    public void setPayments(final PaymentReference... payments);

    /**
     * set payments
     * @param payments values to be set
     */

    public void setPayments(final List<PaymentReference> payments);

    /**
     * factory method
     * @return instance of PaymentInfo
     */
    public static PaymentInfo of() {
        return new PaymentInfoImpl();
    }

    /**
     * factory method to copy an instance of PaymentInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentInfo of(final PaymentInfo template) {
        PaymentInfoImpl instance = new PaymentInfoImpl();
        instance.setPayments(template.getPayments());
        return instance;
    }

    /**
     * builder factory method for PaymentInfo
     * @return builder
     */
    public static PaymentInfoBuilder builder() {
        return PaymentInfoBuilder.of();
    }

    /**
     * create builder for PaymentInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInfoBuilder builder(final PaymentInfo template) {
        return PaymentInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentInfo(Function<PaymentInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInfo>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInfo>";
            }
        };
    }
}
