
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing a shipping address from a Business Unit generates a BusinessUnitShippingAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveShippingAddressIdAction businessUnitRemoveShippingAddressIdAction = BusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveShippingAddressIdActionImpl.class)
public interface BusinessUnitRemoveShippingAddressIdAction extends BusinessUnitUpdateAction {

    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p>ID of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitRemoveShippingAddressIdAction of() {
        return new BusinessUnitRemoveShippingAddressIdActionImpl();
    }

    public static BusinessUnitRemoveShippingAddressIdAction of(
            final BusinessUnitRemoveShippingAddressIdAction template) {
        BusinessUnitRemoveShippingAddressIdActionImpl instance = new BusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitRemoveShippingAddressIdActionBuilder builder() {
        return BusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    public static BusinessUnitRemoveShippingAddressIdActionBuilder builder(
            final BusinessUnitRemoveShippingAddressIdAction template) {
        return BusinessUnitRemoveShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withBusinessUnitRemoveShippingAddressIdAction(
            Function<BusinessUnitRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveShippingAddressIdAction>";
            }
        };
    }
}
