
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

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitRemoveBillingAddressIdAction of() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl();
    }

    public static BusinessUnitRemoveBillingAddressIdAction of(final BusinessUnitRemoveBillingAddressIdAction template) {
        BusinessUnitRemoveBillingAddressIdActionImpl instance = new BusinessUnitRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitRemoveBillingAddressIdActionBuilder builder() {
        return BusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    public static BusinessUnitRemoveBillingAddressIdActionBuilder builder(
            final BusinessUnitRemoveBillingAddressIdAction template) {
        return BusinessUnitRemoveBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withBusinessUnitRemoveBillingAddressIdAction(
            Function<BusinessUnitRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveBillingAddressIdAction>";
            }
        };
    }
}
