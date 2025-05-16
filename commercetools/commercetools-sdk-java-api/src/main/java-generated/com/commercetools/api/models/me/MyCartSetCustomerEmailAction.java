
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCustomerEmailAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomerEmailAction myCartSetCustomerEmailAction = MyCartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomerEmailActionImpl.class)
public interface MyCartSetCustomerEmailAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetCustomerEmailAction
     */
    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of MyCartSetCustomerEmailAction
     */
    public static MyCartSetCustomerEmailAction of() {
        return new MyCartSetCustomerEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetCustomerEmailAction of(final MyCartSetCustomerEmailAction template) {
        MyCartSetCustomerEmailActionImpl instance = new MyCartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public MyCartSetCustomerEmailAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetCustomerEmailAction deepCopy(@Nullable final MyCartSetCustomerEmailAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetCustomerEmailActionImpl instance = new MyCartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for MyCartSetCustomerEmailAction
     * @return builder
     */
    public static MyCartSetCustomerEmailActionBuilder builder() {
        return MyCartSetCustomerEmailActionBuilder.of();
    }

    /**
     * create builder for MyCartSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCustomerEmailActionBuilder builder(final MyCartSetCustomerEmailAction template) {
        return MyCartSetCustomerEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetCustomerEmailAction(Function<MyCartSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCustomerEmailAction>";
            }
        };
    }
}
