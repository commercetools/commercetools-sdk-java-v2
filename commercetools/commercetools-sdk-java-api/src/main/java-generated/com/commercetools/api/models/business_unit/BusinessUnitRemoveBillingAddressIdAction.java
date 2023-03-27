
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing a billing address from a Business Unit generates a BusinessUnitBillingAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveBillingAddressIdAction businessUnitRemoveBillingAddressIdAction = BusinessUnitRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveBillingAddressIdActionImpl.class)
public interface BusinessUnitRemoveBillingAddressIdAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveBillingAddressIdAction
     */
    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    /**
     *  <p>ID of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of BusinessUnitRemoveBillingAddressIdAction
     */
    public static BusinessUnitRemoveBillingAddressIdAction of() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveBillingAddressIdAction of(final BusinessUnitRemoveBillingAddressIdAction template) {
        BusinessUnitRemoveBillingAddressIdActionImpl instance = new BusinessUnitRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveBillingAddressIdAction
     * @return builder
     */
    public static BusinessUnitRemoveBillingAddressIdActionBuilder builder() {
        return BusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveBillingAddressIdActionBuilder builder(
            final BusinessUnitRemoveBillingAddressIdAction template) {
        return BusinessUnitRemoveBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveBillingAddressIdAction(
            Function<BusinessUnitRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveBillingAddressIdAction>";
            }
        };
    }
}
