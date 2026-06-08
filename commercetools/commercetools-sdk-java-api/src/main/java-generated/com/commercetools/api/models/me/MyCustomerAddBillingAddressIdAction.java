
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds an address from the <code>addresses</code> array to <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddBillingAddressIdAction myCustomerAddBillingAddressIdAction = MyCustomerAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addBillingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddBillingAddressIdActionImpl.class)
public interface MyCustomerAddBillingAddressIdAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerAddBillingAddressIdAction
     */
    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyCustomerAddBillingAddressIdAction
     */
    public static MyCustomerAddBillingAddressIdAction of() {
        return new MyCustomerAddBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerAddBillingAddressIdAction of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionImpl instance = new MyCustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyCustomerAddBillingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerAddBillingAddressIdAction deepCopy(
            @Nullable final MyCustomerAddBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerAddBillingAddressIdActionImpl instance = new MyCustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerAddBillingAddressIdAction
     * @return builder
     */
    public static MyCustomerAddBillingAddressIdActionBuilder builder() {
        return MyCustomerAddBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyCustomerAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddBillingAddressIdActionBuilder builder(
            final MyCustomerAddBillingAddressIdAction template) {
        return MyCustomerAddBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerAddBillingAddressIdAction(Function<MyCustomerAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerAddBillingAddressIdAction>";
            }
        };
    }
}
