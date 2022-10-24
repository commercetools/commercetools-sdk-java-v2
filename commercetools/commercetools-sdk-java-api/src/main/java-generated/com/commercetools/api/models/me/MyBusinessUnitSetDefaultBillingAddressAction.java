
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitSetDefaultBillingAddressAction myBusinessUnitSetDefaultBillingAddressAction = MyBusinessUnitSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetDefaultBillingAddressActionImpl.class)
public interface MyBusinessUnitSetDefaultBillingAddressAction extends MyBusinessUnitUpdateAction {

    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

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

    public static MyBusinessUnitSetDefaultBillingAddressAction of() {
        return new MyBusinessUnitSetDefaultBillingAddressActionImpl();
    }

    public static MyBusinessUnitSetDefaultBillingAddressAction of(
            final MyBusinessUnitSetDefaultBillingAddressAction template) {
        MyBusinessUnitSetDefaultBillingAddressActionImpl instance = new MyBusinessUnitSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder builder() {
        return MyBusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder builder(
            final MyBusinessUnitSetDefaultBillingAddressAction template) {
        return MyBusinessUnitSetDefaultBillingAddressActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitSetDefaultBillingAddressAction(
            Function<MyBusinessUnitSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetDefaultBillingAddressAction>";
            }
        };
    }
}
