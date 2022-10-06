
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

    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitSetDefaultShippingAddressAction of() {
        return new BusinessUnitSetDefaultShippingAddressActionImpl();
    }

    public static BusinessUnitSetDefaultShippingAddressAction of(
            final BusinessUnitSetDefaultShippingAddressAction template) {
        BusinessUnitSetDefaultShippingAddressActionImpl instance = new BusinessUnitSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitSetDefaultShippingAddressActionBuilder builder() {
        return BusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    public static BusinessUnitSetDefaultShippingAddressActionBuilder builder(
            final BusinessUnitSetDefaultShippingAddressAction template) {
        return BusinessUnitSetDefaultShippingAddressActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetDefaultShippingAddressAction(
            Function<BusinessUnitSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetDefaultShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetDefaultShippingAddressAction>";
            }
        };
    }
}
