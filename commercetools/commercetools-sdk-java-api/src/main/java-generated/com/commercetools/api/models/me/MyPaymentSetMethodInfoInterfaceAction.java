
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoInterfaceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoInterfaceAction myPaymentSetMethodInfoInterfaceAction = MyPaymentSetMethodInfoInterfaceAction.builder()
 *             .interface("{interface}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoInterfaceActionImpl.class)
public interface MyPaymentSetMethodInfoInterfaceAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoInterfaceAction
     */
    String SET_METHOD_INFO_INTERFACE = "setMethodInfoInterface";

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @return interface
     */
    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @param _interface value to be set
     */

    public void setInterface(final String _interface);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoInterfaceAction
     */
    public static MyPaymentSetMethodInfoInterfaceAction of() {
        return new MyPaymentSetMethodInfoInterfaceActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoInterfaceAction of(final MyPaymentSetMethodInfoInterfaceAction template) {
        MyPaymentSetMethodInfoInterfaceActionImpl instance = new MyPaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoInterfaceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoInterfaceAction deepCopy(
            @Nullable final MyPaymentSetMethodInfoInterfaceAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoInterfaceActionImpl instance = new MyPaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoInterfaceAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceActionBuilder builder() {
        return MyPaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoInterfaceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceActionBuilder builder(
            final MyPaymentSetMethodInfoInterfaceAction template) {
        return MyPaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoInterfaceAction(Function<MyPaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoInterfaceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoInterfaceAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoInterfaceAction>";
            }
        };
    }
}
