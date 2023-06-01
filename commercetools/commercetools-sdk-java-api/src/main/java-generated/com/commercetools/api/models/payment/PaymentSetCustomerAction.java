package com.commercetools.api.models.payment;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetCustomerActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * PaymentSetCustomerAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetCustomerAction paymentSetCustomerAction = PaymentSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetCustomerActionImpl.class)
public interface PaymentSetCustomerAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetCustomerAction
     */
    String SET_CUSTOMER = "setCustomer";

    /**
     *  <p>Value to set. If empty, any existing reference is removed.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Value to set. If empty, any existing reference is removed.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerResourceIdentifier customer);
    

    /**
     * factory method
     * @return instance of PaymentSetCustomerAction
     */
    public static PaymentSetCustomerAction of(){
        return new PaymentSetCustomerActionImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetCustomerAction of(final PaymentSetCustomerAction template) {
        PaymentSetCustomerActionImpl instance = new PaymentSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetCustomerAction deepCopy(@Nullable final PaymentSetCustomerAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetCustomerActionImpl instance = new PaymentSetCustomerActionImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetCustomerAction
     * @return builder
     */
    public static PaymentSetCustomerActionBuilder builder() {
        return PaymentSetCustomerActionBuilder.of();
    }
    
    /**
     * create builder for PaymentSetCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetCustomerActionBuilder builder(final PaymentSetCustomerAction template) {
        return PaymentSetCustomerActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetCustomerAction(Function<PaymentSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetCustomerAction>";
            }
        };
    }
}
