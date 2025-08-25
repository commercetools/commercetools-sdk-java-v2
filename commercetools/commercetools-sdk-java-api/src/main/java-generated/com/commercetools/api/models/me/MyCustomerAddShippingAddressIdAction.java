
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds an address from the <code>addresses</code> array to <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddShippingAddressIdAction myCustomerAddShippingAddressIdAction = MyCustomerAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addShippingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddShippingAddressIdActionImpl.class)
public interface MyCustomerAddShippingAddressIdAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerAddShippingAddressIdAction
     */
    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a shipping address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a shipping address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a shipping address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a shipping address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyCustomerAddShippingAddressIdAction
     */
    public static MyCustomerAddShippingAddressIdAction of() {
        return new MyCustomerAddShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerAddShippingAddressIdAction of(final MyCustomerAddShippingAddressIdAction template) {
        MyCustomerAddShippingAddressIdActionImpl instance = new MyCustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyCustomerAddShippingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerAddShippingAddressIdAction deepCopy(
            @Nullable final MyCustomerAddShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerAddShippingAddressIdActionImpl instance = new MyCustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerAddShippingAddressIdAction
     * @return builder
     */
    public static MyCustomerAddShippingAddressIdActionBuilder builder() {
        return MyCustomerAddShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyCustomerAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddShippingAddressIdActionBuilder builder(
            final MyCustomerAddShippingAddressIdAction template) {
        return MyCustomerAddShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerAddShippingAddressIdAction(Function<MyCustomerAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerAddShippingAddressIdAction>";
            }
        };
    }
}
