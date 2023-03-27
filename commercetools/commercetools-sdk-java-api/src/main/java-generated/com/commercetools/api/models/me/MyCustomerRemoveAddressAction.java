
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing an address of the Customer produces the CustomerAddressRemoved Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveAddressAction myCustomerRemoveAddressAction = MyCustomerRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerRemoveAddressActionImpl.class)
public interface MyCustomerRemoveAddressAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerRemoveAddressAction
     */
    String REMOVE_ADDRESS = "removeAddress";

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyCustomerRemoveAddressAction
     */
    public static MyCustomerRemoveAddressAction of() {
        return new MyCustomerRemoveAddressActionImpl();
    }

    /**
     * factory method to copy an instance of MyCustomerRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerRemoveAddressAction of(final MyCustomerRemoveAddressAction template) {
        MyCustomerRemoveAddressActionImpl instance = new MyCustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerRemoveAddressAction
     * @return builder
     */
    public static MyCustomerRemoveAddressActionBuilder builder() {
        return MyCustomerRemoveAddressActionBuilder.of();
    }

    /**
     * create builder for MyCustomerRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveAddressActionBuilder builder(final MyCustomerRemoveAddressAction template) {
        return MyCustomerRemoveAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerRemoveAddressAction(Function<MyCustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerRemoveAddressAction>";
            }
        };
    }
}
