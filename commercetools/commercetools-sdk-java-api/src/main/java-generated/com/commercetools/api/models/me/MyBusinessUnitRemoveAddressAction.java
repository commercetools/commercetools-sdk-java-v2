
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing the address from a Business Unit generates the BusinessUnitAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveAddressAction myBusinessUnitRemoveAddressAction = MyBusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveAddressActionImpl.class)
public interface MyBusinessUnitRemoveAddressAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitRemoveAddressAction
     */
    String REMOVE_ADDRESS = "removeAddress";

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyBusinessUnitRemoveAddressAction
     */
    public static MyBusinessUnitRemoveAddressAction of() {
        return new MyBusinessUnitRemoveAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitRemoveAddressAction of(final MyBusinessUnitRemoveAddressAction template) {
        MyBusinessUnitRemoveAddressActionImpl instance = new MyBusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitRemoveAddressAction deepCopy(
            @Nullable final MyBusinessUnitRemoveAddressAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitRemoveAddressActionImpl instance = new MyBusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitRemoveAddressAction
     * @return builder
     */
    public static MyBusinessUnitRemoveAddressActionBuilder builder() {
        return MyBusinessUnitRemoveAddressActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveAddressActionBuilder builder(final MyBusinessUnitRemoveAddressAction template) {
        return MyBusinessUnitRemoveAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitRemoveAddressAction(Function<MyBusinessUnitRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveAddressAction>";
            }
        };
    }
}
