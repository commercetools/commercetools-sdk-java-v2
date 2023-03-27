
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the default shipping address on a Business Unit generates a BusinessUnitDefaultShippingAddressSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetDefaultShippingAddressAction businessUnitSetDefaultShippingAddressAction = BusinessUnitSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetDefaultShippingAddressActionImpl.class)
public interface BusinessUnitSetDefaultShippingAddressAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetDefaultShippingAddressAction
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
     * @return instance of BusinessUnitSetDefaultShippingAddressAction
     */
    public static BusinessUnitSetDefaultShippingAddressAction of() {
        return new BusinessUnitSetDefaultShippingAddressActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitSetDefaultShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetDefaultShippingAddressAction of(
            final BusinessUnitSetDefaultShippingAddressAction template) {
        BusinessUnitSetDefaultShippingAddressActionImpl instance = new BusinessUnitSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetDefaultShippingAddressAction
     * @return builder
     */
    public static BusinessUnitSetDefaultShippingAddressActionBuilder builder() {
        return BusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetDefaultShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetDefaultShippingAddressActionBuilder builder(
            final BusinessUnitSetDefaultShippingAddressAction template) {
        return BusinessUnitSetDefaultShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetDefaultShippingAddressAction(
            Function<BusinessUnitSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetDefaultShippingAddressAction>";
            }
        };
    }
}
