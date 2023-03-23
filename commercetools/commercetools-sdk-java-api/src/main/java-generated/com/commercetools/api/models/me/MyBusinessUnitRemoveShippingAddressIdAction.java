
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitRemoveShippingAddressIdAction myBusinessUnitRemoveShippingAddressIdAction = MyBusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveShippingAddressIdActionImpl.class)
public interface MyBusinessUnitRemoveShippingAddressIdAction extends MyBusinessUnitUpdateAction {

    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyBusinessUnitRemoveShippingAddressIdAction of() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl();
    }

    public static MyBusinessUnitRemoveShippingAddressIdAction of(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        MyBusinessUnitRemoveShippingAddressIdActionImpl instance = new MyBusinessUnitRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder builder() {
        return MyBusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder builder(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        return MyBusinessUnitRemoveShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitRemoveShippingAddressIdAction(
            Function<MyBusinessUnitRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveShippingAddressIdAction>";
            }
        };
    }
}
