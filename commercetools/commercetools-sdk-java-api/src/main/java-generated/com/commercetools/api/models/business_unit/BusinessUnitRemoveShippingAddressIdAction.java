
package com.commercetools.api.models.business_unit;

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
 *     BusinessUnitRemoveShippingAddressIdAction businessUnitRemoveShippingAddressIdAction = BusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeShippingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveShippingAddressIdActionImpl.class)
public interface BusinessUnitRemoveShippingAddressIdAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveShippingAddressIdAction
     */
    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p>ID of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of BusinessUnitRemoveShippingAddressIdAction
     */
    public static BusinessUnitRemoveShippingAddressIdAction of() {
        return new BusinessUnitRemoveShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveShippingAddressIdAction of(
            final BusinessUnitRemoveShippingAddressIdAction template) {
        BusinessUnitRemoveShippingAddressIdActionImpl instance = new BusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public BusinessUnitRemoveShippingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitRemoveShippingAddressIdAction deepCopy(
            @Nullable final BusinessUnitRemoveShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitRemoveShippingAddressIdActionImpl instance = new BusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveShippingAddressIdAction
     * @return builder
     */
    public static BusinessUnitRemoveShippingAddressIdActionBuilder builder() {
        return BusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveShippingAddressIdActionBuilder builder(
            final BusinessUnitRemoveShippingAddressIdAction template) {
        return BusinessUnitRemoveShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveShippingAddressIdAction(
            Function<BusinessUnitRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveShippingAddressIdAction>";
            }
        };
    }
}
