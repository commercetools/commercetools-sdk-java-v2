
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a billing address to a Business Unit generates a BusinessUnitBillingAddressAdded Message.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddBillingAddressIdActionImpl.class)
public interface BusinessUnitAddBillingAddressIdAction extends BusinessUnitUpdateAction {

    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitAddBillingAddressIdAction of() {
        return new BusinessUnitAddBillingAddressIdActionImpl();
    }

    public static BusinessUnitAddBillingAddressIdAction of(final BusinessUnitAddBillingAddressIdAction template) {
        BusinessUnitAddBillingAddressIdActionImpl instance = new BusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitAddBillingAddressIdActionBuilder builder() {
        return BusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    public static BusinessUnitAddBillingAddressIdActionBuilder builder(
            final BusinessUnitAddBillingAddressIdAction template) {
        return BusinessUnitAddBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withBusinessUnitAddBillingAddressIdAction(Function<BusinessUnitAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddBillingAddressIdAction>";
            }
        };
    }
}
