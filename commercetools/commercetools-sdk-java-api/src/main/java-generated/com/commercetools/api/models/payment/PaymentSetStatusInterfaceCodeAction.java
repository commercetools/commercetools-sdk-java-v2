
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the PaymentStatusInterfaceCodeSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceCodeAction paymentSetStatusInterfaceCodeAction = PaymentSetStatusInterfaceCodeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetStatusInterfaceCodeActionImpl.class)
public interface PaymentSetStatusInterfaceCodeAction extends PaymentUpdateAction {

    String SET_STATUS_INTERFACE_CODE = "setStatusInterfaceCode";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setInterfaceCode(final String interfaceCode);

    public static PaymentSetStatusInterfaceCodeAction of() {
        return new PaymentSetStatusInterfaceCodeActionImpl();
    }

    public static PaymentSetStatusInterfaceCodeAction of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionImpl instance = new PaymentSetStatusInterfaceCodeActionImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder builder() {
        return PaymentSetStatusInterfaceCodeActionBuilder.of();
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder builder(
            final PaymentSetStatusInterfaceCodeAction template) {
        return PaymentSetStatusInterfaceCodeActionBuilder.of(template);
    }

    default <T> T withPaymentSetStatusInterfaceCodeAction(Function<PaymentSetStatusInterfaceCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetStatusInterfaceCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetStatusInterfaceCodeAction>";
            }
        };
    }
}
