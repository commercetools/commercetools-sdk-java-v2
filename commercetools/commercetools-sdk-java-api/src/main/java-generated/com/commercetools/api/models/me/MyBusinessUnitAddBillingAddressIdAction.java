
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a billing address to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitBillingAddressAddedMessage" rel="nofollow">BusinessUnitBillingAddressAdded</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("addBillingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddBillingAddressIdActionImpl.class)
public interface MyBusinessUnitAddBillingAddressIdAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitAddBillingAddressIdAction
     */
    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

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
     * @return instance of MyBusinessUnitAddBillingAddressIdAction
     */
    public static MyBusinessUnitAddBillingAddressIdAction of() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitAddBillingAddressIdAction of(final MyBusinessUnitAddBillingAddressIdAction template) {
        MyBusinessUnitAddBillingAddressIdActionImpl instance = new MyBusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public MyBusinessUnitAddBillingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitAddBillingAddressIdAction deepCopy(
            @Nullable final MyBusinessUnitAddBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitAddBillingAddressIdActionImpl instance = new MyBusinessUnitAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitAddBillingAddressIdAction
     * @return builder
     */
    public static MyBusinessUnitAddBillingAddressIdActionBuilder builder() {
        return MyBusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAddBillingAddressIdActionBuilder builder(
            final MyBusinessUnitAddBillingAddressIdAction template) {
        return MyBusinessUnitAddBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitAddBillingAddressIdAction(
            Function<MyBusinessUnitAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddBillingAddressIdAction>";
            }
        };
    }
}
