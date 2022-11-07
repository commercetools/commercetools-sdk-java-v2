
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the default shipping address from <code>addresses</code>. If the address is not currently a shipping address, it is added to <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDefaultShippingAddressAction myCustomerSetDefaultShippingAddressAction = MyCustomerSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetDefaultShippingAddressActionImpl.class)
public interface MyCustomerSetDefaultShippingAddressAction extends MyCustomerUpdateAction {

    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

    /**
     *  <p><code>id</code> of the Address to become the default shipping address.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to become the default shipping address.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerSetDefaultShippingAddressAction of() {
        return new MyCustomerSetDefaultShippingAddressActionImpl();
    }

    public static MyCustomerSetDefaultShippingAddressAction of(
            final MyCustomerSetDefaultShippingAddressAction template) {
        MyCustomerSetDefaultShippingAddressActionImpl instance = new MyCustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder builder() {
        return MyCustomerSetDefaultShippingAddressActionBuilder.of();
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder builder(
            final MyCustomerSetDefaultShippingAddressAction template) {
        return MyCustomerSetDefaultShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetDefaultShippingAddressAction(
            Function<MyCustomerSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetDefaultShippingAddressAction>";
            }
        };
    }
}
