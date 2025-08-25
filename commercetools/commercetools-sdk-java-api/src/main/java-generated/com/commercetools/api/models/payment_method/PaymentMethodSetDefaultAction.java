
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodDefaultSetMessage" rel="nofollow">PaymentMethodDefaultSet</a> Message.</p>
 *  <p>An inactive Payment Method cannot be set as the default, and the action will return an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetDefaultAction paymentMethodSetDefaultAction = PaymentMethodSetDefaultAction.builder()
 *             .default(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefault")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetDefaultActionImpl.class)
public interface PaymentMethodSetDefaultAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetDefaultAction
     */
    String SET_DEFAULT = "setDefault";

    /**
     *  <p>Value to set.</p>
     * @return default
     */
    @NotNull
    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Value to set.</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     * factory method
     * @return instance of PaymentMethodSetDefaultAction
     */
    public static PaymentMethodSetDefaultAction of() {
        return new PaymentMethodSetDefaultActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetDefaultAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetDefaultAction of(final PaymentMethodSetDefaultAction template) {
        PaymentMethodSetDefaultActionImpl instance = new PaymentMethodSetDefaultActionImpl();
        instance.setDefault(template.getDefault());
        return instance;
    }

    public PaymentMethodSetDefaultAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetDefaultAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetDefaultAction deepCopy(@Nullable final PaymentMethodSetDefaultAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetDefaultActionImpl instance = new PaymentMethodSetDefaultActionImpl();
        instance.setDefault(template.getDefault());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetDefaultAction
     * @return builder
     */
    public static PaymentMethodSetDefaultActionBuilder builder() {
        return PaymentMethodSetDefaultActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetDefaultAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetDefaultActionBuilder builder(final PaymentMethodSetDefaultAction template) {
        return PaymentMethodSetDefaultActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetDefaultAction(Function<PaymentMethodSetDefaultAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetDefaultAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetDefaultAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetDefaultAction>";
            }
        };
    }
}
