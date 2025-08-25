
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceAccountSetMessage" rel="nofollow">PaymentMethodInfoInterfaceAccountSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoInterfaceAccountAction myPaymentSetMethodInfoInterfaceAccountAction = MyPaymentSetMethodInfoInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoInterfaceAccount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoInterfaceAccountActionImpl.class)
public interface MyPaymentSetMethodInfoInterfaceAccountAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoInterfaceAccountAction
     */
    String SET_METHOD_INFO_INTERFACE_ACCOUNT = "setMethodInfoInterfaceAccount";

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoInterfaceAccountAction
     */
    public static MyPaymentSetMethodInfoInterfaceAccountAction of() {
        return new MyPaymentSetMethodInfoInterfaceAccountActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoInterfaceAccountAction of(
            final MyPaymentSetMethodInfoInterfaceAccountAction template) {
        MyPaymentSetMethodInfoInterfaceAccountActionImpl instance = new MyPaymentSetMethodInfoInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    public MyPaymentSetMethodInfoInterfaceAccountAction copyDeep();

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoInterfaceAccountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoInterfaceAccountAction deepCopy(
            @Nullable final MyPaymentSetMethodInfoInterfaceAccountAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoInterfaceAccountActionImpl instance = new MyPaymentSetMethodInfoInterfaceAccountActionImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoInterfaceAccountAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceAccountActionBuilder builder() {
        return MyPaymentSetMethodInfoInterfaceAccountActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceAccountActionBuilder builder(
            final MyPaymentSetMethodInfoInterfaceAccountAction template) {
        return MyPaymentSetMethodInfoInterfaceAccountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoInterfaceAccountAction(
            Function<MyPaymentSetMethodInfoInterfaceAccountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoInterfaceAccountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoInterfaceAccountAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoInterfaceAccountAction>";
            }
        };
    }
}
