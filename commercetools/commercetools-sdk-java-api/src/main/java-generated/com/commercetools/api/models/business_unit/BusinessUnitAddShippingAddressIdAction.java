
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a shipping address to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitShippingAddressAddedMessage" rel="nofollow">BusinessUnitShippingAddressAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddShippingAddressIdAction businessUnitAddShippingAddressIdAction = BusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addShippingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddShippingAddressIdActionImpl.class)
public interface BusinessUnitAddShippingAddressIdAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddShippingAddressIdAction
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
     * @return instance of BusinessUnitAddShippingAddressIdAction
     */
    public static BusinessUnitAddShippingAddressIdAction of() {
        return new BusinessUnitAddShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddShippingAddressIdAction of(final BusinessUnitAddShippingAddressIdAction template) {
        BusinessUnitAddShippingAddressIdActionImpl instance = new BusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public BusinessUnitAddShippingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddShippingAddressIdAction deepCopy(
            @Nullable final BusinessUnitAddShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddShippingAddressIdActionImpl instance = new BusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddShippingAddressIdAction
     * @return builder
     */
    public static BusinessUnitAddShippingAddressIdActionBuilder builder() {
        return BusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddShippingAddressIdActionBuilder builder(
            final BusinessUnitAddShippingAddressIdAction template) {
        return BusinessUnitAddShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddShippingAddressIdAction(
            Function<BusinessUnitAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddShippingAddressIdAction>";
            }
        };
    }
}
