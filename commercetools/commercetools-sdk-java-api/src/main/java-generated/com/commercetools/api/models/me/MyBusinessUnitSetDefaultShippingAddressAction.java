
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the default shipping address on a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitDefaultShippingAddressSetMessage" rel="nofollow">BusinessUnitDefaultShippingAddressSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetDefaultShippingAddressAction myBusinessUnitSetDefaultShippingAddressAction = MyBusinessUnitSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefaultShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetDefaultShippingAddressActionImpl.class)
public interface MyBusinessUnitSetDefaultShippingAddressAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitSetDefaultShippingAddressAction
     */
    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

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
     * @return instance of MyBusinessUnitSetDefaultShippingAddressAction
     */
    public static MyBusinessUnitSetDefaultShippingAddressAction of() {
        return new MyBusinessUnitSetDefaultShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitSetDefaultShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetDefaultShippingAddressAction of(
            final MyBusinessUnitSetDefaultShippingAddressAction template) {
        MyBusinessUnitSetDefaultShippingAddressActionImpl instance = new MyBusinessUnitSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyBusinessUnitSetDefaultShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitSetDefaultShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitSetDefaultShippingAddressAction deepCopy(
            @Nullable final MyBusinessUnitSetDefaultShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitSetDefaultShippingAddressActionImpl instance = new MyBusinessUnitSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetDefaultShippingAddressAction
     * @return builder
     */
    public static MyBusinessUnitSetDefaultShippingAddressActionBuilder builder() {
        return MyBusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetDefaultShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetDefaultShippingAddressActionBuilder builder(
            final MyBusinessUnitSetDefaultShippingAddressAction template) {
        return MyBusinessUnitSetDefaultShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetDefaultShippingAddressAction(
            Function<MyBusinessUnitSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetDefaultShippingAddressAction>";
            }
        };
    }
}
