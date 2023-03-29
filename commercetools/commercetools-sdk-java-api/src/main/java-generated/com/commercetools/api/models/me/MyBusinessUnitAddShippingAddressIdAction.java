
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a shipping address to a Business Unit generates a BusinessUnitShippingAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddShippingAddressIdAction myBusinessUnitAddShippingAddressIdAction = MyBusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddShippingAddressIdActionImpl.class)
public interface MyBusinessUnitAddShippingAddressIdAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitAddShippingAddressIdAction
     */
    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyBusinessUnitAddShippingAddressIdAction
     */
    public static MyBusinessUnitAddShippingAddressIdAction of() {
        return new MyBusinessUnitAddShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitAddShippingAddressIdAction of(final MyBusinessUnitAddShippingAddressIdAction template) {
        MyBusinessUnitAddShippingAddressIdActionImpl instance = new MyBusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitAddShippingAddressIdAction deepCopy(
            @Nullable final MyBusinessUnitAddShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitAddShippingAddressIdActionImpl instance = new MyBusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitAddShippingAddressIdAction
     * @return builder
     */
    public static MyBusinessUnitAddShippingAddressIdActionBuilder builder() {
        return MyBusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAddShippingAddressIdActionBuilder builder(
            final MyBusinessUnitAddShippingAddressIdAction template) {
        return MyBusinessUnitAddShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitAddShippingAddressIdAction(
            Function<MyBusinessUnitAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddShippingAddressIdAction>";
            }
        };
    }
}
