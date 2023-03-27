
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

    /**
     * discriminator value for MyBusinessUnitSetDefaultBillingAddressAction
     */
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

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyBusinessUnitSetDefaultBillingAddressAction
     */
    public static MyBusinessUnitSetDefaultBillingAddressAction of() {
        return new MyBusinessUnitSetDefaultBillingAddressActionImpl();
    }

    /**
     * factory method to copy an instance of MyBusinessUnitSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetDefaultBillingAddressAction of(
            final MyBusinessUnitSetDefaultBillingAddressAction template) {
        MyBusinessUnitSetDefaultBillingAddressActionImpl instance = new MyBusinessUnitSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetDefaultBillingAddressAction
     * @return builder
     */
    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder builder() {
        return MyBusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder builder(
            final MyBusinessUnitSetDefaultBillingAddressAction template) {
        return MyBusinessUnitSetDefaultBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetDefaultBillingAddressAction(
            Function<MyBusinessUnitSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetDefaultBillingAddressAction>";
            }
        };
    }
}
