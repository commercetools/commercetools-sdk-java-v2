
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changing an address of the Customer produces the CustomerAddressChanged Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangeAddressAction myCustomerChangeAddressAction = MyCustomerChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangeAddressActionImpl.class)
public interface MyCustomerChangeAddressAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerChangeAddressAction
     */
    String CHANGE_ADDRESS = "changeAddress";

    /**
     *  <p><code>id</code> of the Address to change.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to change.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Value to set.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p><code>id</code> of the Address to change.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to change.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>Value to set.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyCustomerChangeAddressAction
     */
    public static MyCustomerChangeAddressAction of() {
        return new MyCustomerChangeAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerChangeAddressAction of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public MyCustomerChangeAddressAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerChangeAddressAction deepCopy(@Nullable final MyCustomerChangeAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for MyCustomerChangeAddressAction
     * @return builder
     */
    public static MyCustomerChangeAddressActionBuilder builder() {
        return MyCustomerChangeAddressActionBuilder.of();
    }

    /**
     * create builder for MyCustomerChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangeAddressActionBuilder builder(final MyCustomerChangeAddressAction template) {
        return MyCustomerChangeAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerChangeAddressAction(Function<MyCustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangeAddressAction>";
            }
        };
    }
}
