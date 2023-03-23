
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetDefaultBillingAddressActionImpl.class)
public interface BusinessUnitSetDefaultBillingAddressAction extends BusinessUnitUpdateAction {

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

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitSetDefaultBillingAddressAction of() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl();
    }

    public static BusinessUnitSetDefaultBillingAddressAction of(
            final BusinessUnitSetDefaultBillingAddressAction template) {
        BusinessUnitSetDefaultBillingAddressActionImpl instance = new BusinessUnitSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitSetDefaultBillingAddressActionBuilder builder() {
        return BusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    public static BusinessUnitSetDefaultBillingAddressActionBuilder builder(
            final BusinessUnitSetDefaultBillingAddressAction template) {
        return BusinessUnitSetDefaultBillingAddressActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetDefaultBillingAddressAction(
            Function<BusinessUnitSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetDefaultBillingAddressAction>";
            }
        };
    }
}
