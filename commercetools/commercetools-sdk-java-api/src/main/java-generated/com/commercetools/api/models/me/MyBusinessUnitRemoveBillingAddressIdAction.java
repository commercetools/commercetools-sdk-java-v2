
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing a billing address from a Business Unit generates a BusinessUnitBillingAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveBillingAddressIdAction myBusinessUnitRemoveBillingAddressIdAction = MyBusinessUnitRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveBillingAddressIdActionImpl.class)
public interface MyBusinessUnitRemoveBillingAddressIdAction extends MyBusinessUnitUpdateAction {

    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    /**
     *  <p>ID of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyBusinessUnitRemoveBillingAddressIdAction of() {
        return new MyBusinessUnitRemoveBillingAddressIdActionImpl();
    }

    public static MyBusinessUnitRemoveBillingAddressIdAction of(
            final MyBusinessUnitRemoveBillingAddressIdAction template) {
        MyBusinessUnitRemoveBillingAddressIdActionImpl instance = new MyBusinessUnitRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder builder() {
        return MyBusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder builder(
            final MyBusinessUnitRemoveBillingAddressIdAction template) {
        return MyBusinessUnitRemoveBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitRemoveBillingAddressIdAction(
            Function<MyBusinessUnitRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveBillingAddressIdAction>";
            }
        };
    }
}
