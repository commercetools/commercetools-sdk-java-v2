
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitAddShippingAddressIdAction myBusinessUnitAddShippingAddressIdAction = MyBusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddShippingAddressIdActionImpl.class)
public interface MyBusinessUnitAddShippingAddressIdAction extends MyBusinessUnitUpdateAction {

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

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyBusinessUnitAddShippingAddressIdAction of() {
        return new MyBusinessUnitAddShippingAddressIdActionImpl();
    }

    public static MyBusinessUnitAddShippingAddressIdAction of(final MyBusinessUnitAddShippingAddressIdAction template) {
        MyBusinessUnitAddShippingAddressIdActionImpl instance = new MyBusinessUnitAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitAddShippingAddressIdActionBuilder builder() {
        return MyBusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    public static MyBusinessUnitAddShippingAddressIdActionBuilder builder(
            final MyBusinessUnitAddShippingAddressIdAction template) {
        return MyBusinessUnitAddShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitAddShippingAddressIdAction(
            Function<MyBusinessUnitAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddShippingAddressIdAction>";
            }
        };
    }
}
