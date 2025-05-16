
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
@io.vrap.rmf.base.client.utils.json.SubType("removeBillingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveBillingAddressIdActionImpl.class)
public interface MyBusinessUnitRemoveBillingAddressIdAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitRemoveBillingAddressIdAction
     */
    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    /**
     *  <p>ID of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of MyBusinessUnitRemoveBillingAddressIdAction
     */
    public static MyBusinessUnitRemoveBillingAddressIdAction of() {
        return new MyBusinessUnitRemoveBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitRemoveBillingAddressIdAction of(
            final MyBusinessUnitRemoveBillingAddressIdAction template) {
        MyBusinessUnitRemoveBillingAddressIdActionImpl instance = new MyBusinessUnitRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyBusinessUnitRemoveBillingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitRemoveBillingAddressIdAction deepCopy(
            @Nullable final MyBusinessUnitRemoveBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitRemoveBillingAddressIdActionImpl instance = new MyBusinessUnitRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitRemoveBillingAddressIdAction
     * @return builder
     */
    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder builder() {
        return MyBusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder builder(
            final MyBusinessUnitRemoveBillingAddressIdAction template) {
        return MyBusinessUnitRemoveBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitRemoveBillingAddressIdAction(
            Function<MyBusinessUnitRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveBillingAddressIdAction>";
            }
        };
    }
}
