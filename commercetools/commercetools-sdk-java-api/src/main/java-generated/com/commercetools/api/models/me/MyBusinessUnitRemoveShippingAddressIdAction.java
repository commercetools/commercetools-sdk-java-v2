
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing a shipping address from a Business Unit generates a BusinessUnitShippingAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveShippingAddressIdAction myBusinessUnitRemoveShippingAddressIdAction = MyBusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeShippingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveShippingAddressIdActionImpl.class)
public interface MyBusinessUnitRemoveShippingAddressIdAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitRemoveShippingAddressIdAction
     */
    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyBusinessUnitRemoveShippingAddressIdAction
     */
    public static MyBusinessUnitRemoveShippingAddressIdAction of() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitRemoveShippingAddressIdAction of(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        MyBusinessUnitRemoveShippingAddressIdActionImpl instance = new MyBusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyBusinessUnitRemoveShippingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitRemoveShippingAddressIdAction deepCopy(
            @Nullable final MyBusinessUnitRemoveShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitRemoveShippingAddressIdActionImpl instance = new MyBusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitRemoveShippingAddressIdAction
     * @return builder
     */
    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder builder() {
        return MyBusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder builder(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        return MyBusinessUnitRemoveShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitRemoveShippingAddressIdAction(
            Function<MyBusinessUnitRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveShippingAddressIdAction>";
            }
        };
    }
}
