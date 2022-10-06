
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a shipping address to a Business Unit generates a BusinessUnitShippingAddressAdded Message.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddShippingAddressIdActionImpl.class)
public interface BusinessUnitAddShippingAddressIdAction extends BusinessUnitUpdateAction {

    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

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

    public static BusinessUnitAddShippingAddressIdAction of() {
        return new BusinessUnitAddShippingAddressIdActionImpl();
    }

    public static BusinessUnitAddShippingAddressIdAction of(final BusinessUnitAddShippingAddressIdAction template) {
        BusinessUnitAddShippingAddressIdActionImpl instance = new BusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitAddShippingAddressIdActionBuilder builder() {
        return BusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    public static BusinessUnitAddShippingAddressIdActionBuilder builder(
            final BusinessUnitAddShippingAddressIdAction template) {
        return BusinessUnitAddShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withBusinessUnitAddShippingAddressIdAction(
            Function<BusinessUnitAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddShippingAddressIdAction>";
            }
        };
    }
}
