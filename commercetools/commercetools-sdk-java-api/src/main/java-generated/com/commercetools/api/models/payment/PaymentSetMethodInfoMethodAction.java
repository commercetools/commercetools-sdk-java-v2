
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoMethodSetMessage" rel="nofollow">PaymentMethodInfoMethodSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoMethodAction paymentSetMethodInfoMethodAction = PaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoMethod")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoMethodActionImpl.class)
public interface PaymentSetMethodInfoMethodAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoMethodAction
     */
    String SET_METHOD_INFO_METHOD = "setMethodInfoMethod";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoMethodAction
     */
    public static PaymentSetMethodInfoMethodAction of() {
        return new PaymentSetMethodInfoMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoMethodAction of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionImpl instance = new PaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    public PaymentSetMethodInfoMethodAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoMethodAction deepCopy(@Nullable final PaymentSetMethodInfoMethodAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoMethodActionImpl instance = new PaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoMethodAction
     * @return builder
     */
    public static PaymentSetMethodInfoMethodActionBuilder builder() {
        return PaymentSetMethodInfoMethodActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoMethodActionBuilder builder(final PaymentSetMethodInfoMethodAction template) {
        return PaymentSetMethodInfoMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoMethodAction(Function<PaymentSetMethodInfoMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoMethodAction>";
            }
        };
    }
}
