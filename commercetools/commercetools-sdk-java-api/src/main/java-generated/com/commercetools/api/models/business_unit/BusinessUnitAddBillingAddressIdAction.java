
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a billing address to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitBillingAddressAddedMessage" rel="nofollow">BusinessUnitBillingAddressAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddBillingAddressIdAction businessUnitAddBillingAddressIdAction = BusinessUnitAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addBillingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddBillingAddressIdActionImpl.class)
public interface BusinessUnitAddBillingAddressIdAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddBillingAddressIdAction
     */
    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

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
     * @return instance of BusinessUnitAddBillingAddressIdAction
     */
    public static BusinessUnitAddBillingAddressIdAction of() {
        return new BusinessUnitAddBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddBillingAddressIdAction of(final BusinessUnitAddBillingAddressIdAction template) {
        BusinessUnitAddBillingAddressIdActionImpl instance = new BusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public BusinessUnitAddBillingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddBillingAddressIdAction deepCopy(
            @Nullable final BusinessUnitAddBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddBillingAddressIdActionImpl instance = new BusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddBillingAddressIdAction
     * @return builder
     */
    public static BusinessUnitAddBillingAddressIdActionBuilder builder() {
        return BusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddBillingAddressIdActionBuilder builder(
            final BusinessUnitAddBillingAddressIdAction template) {
        return BusinessUnitAddBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddBillingAddressIdAction(Function<BusinessUnitAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddBillingAddressIdAction>";
            }
        };
    }
}
