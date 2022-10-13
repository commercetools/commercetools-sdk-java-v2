
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitAddBillingAddressIdAction myBusinessUnitAddBillingAddressIdAction = MyBusinessUnitAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddBillingAddressIdActionImpl.class)
public interface MyBusinessUnitAddBillingAddressIdAction extends MyBusinessUnitUpdateAction {

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

    public static MyBusinessUnitAddBillingAddressIdAction of() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl();
    }

    public static MyBusinessUnitAddBillingAddressIdAction of(final MyBusinessUnitAddBillingAddressIdAction template) {
        MyBusinessUnitAddBillingAddressIdActionImpl instance = new MyBusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitAddBillingAddressIdActionBuilder builder() {
        return MyBusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    public static MyBusinessUnitAddBillingAddressIdActionBuilder builder(
            final MyBusinessUnitAddBillingAddressIdAction template) {
        return MyBusinessUnitAddBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitAddBillingAddressIdAction(
            Function<MyBusinessUnitAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddBillingAddressIdAction>";
            }
        };
    }
}
