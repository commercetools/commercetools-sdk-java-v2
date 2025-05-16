
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the default billing address on a Business Unit generates the BusinessUnitDefaultBillingAddressSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetDefaultBillingAddressAction businessUnitSetDefaultBillingAddressAction = BusinessUnitSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefaultBillingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetDefaultBillingAddressActionImpl.class)
public interface BusinessUnitSetDefaultBillingAddressAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetDefaultBillingAddressAction
     */
    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of BusinessUnitSetDefaultBillingAddressAction
     */
    public static BusinessUnitSetDefaultBillingAddressAction of() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetDefaultBillingAddressAction of(
            final BusinessUnitSetDefaultBillingAddressAction template) {
        BusinessUnitSetDefaultBillingAddressActionImpl instance = new BusinessUnitSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public BusinessUnitSetDefaultBillingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetDefaultBillingAddressAction deepCopy(
            @Nullable final BusinessUnitSetDefaultBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetDefaultBillingAddressActionImpl instance = new BusinessUnitSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetDefaultBillingAddressAction
     * @return builder
     */
    public static BusinessUnitSetDefaultBillingAddressActionBuilder builder() {
        return BusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetDefaultBillingAddressActionBuilder builder(
            final BusinessUnitSetDefaultBillingAddressAction template) {
        return BusinessUnitSetDefaultBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetDefaultBillingAddressAction(
            Function<BusinessUnitSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetDefaultBillingAddressAction>";
            }
        };
    }
}
