
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the default billing address from <code>addresses</code>. If the address is not currently a billing address, it is added to <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDefaultBillingAddressAction myCustomerSetDefaultBillingAddressAction = MyCustomerSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefaultBillingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetDefaultBillingAddressActionImpl.class)
public interface MyCustomerSetDefaultBillingAddressAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetDefaultBillingAddressAction
     */
    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default billing address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default billing address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default billing address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default billing address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyCustomerSetDefaultBillingAddressAction
     */
    public static MyCustomerSetDefaultBillingAddressAction of() {
        return new MyCustomerSetDefaultBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetDefaultBillingAddressAction of(final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionImpl instance = new MyCustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyCustomerSetDefaultBillingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetDefaultBillingAddressAction deepCopy(
            @Nullable final MyCustomerSetDefaultBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetDefaultBillingAddressActionImpl instance = new MyCustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetDefaultBillingAddressAction
     * @return builder
     */
    public static MyCustomerSetDefaultBillingAddressActionBuilder builder() {
        return MyCustomerSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetDefaultBillingAddressActionBuilder builder(
            final MyCustomerSetDefaultBillingAddressAction template) {
        return MyCustomerSetDefaultBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetDefaultBillingAddressAction(
            Function<MyCustomerSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetDefaultBillingAddressAction>";
            }
        };
    }
}
