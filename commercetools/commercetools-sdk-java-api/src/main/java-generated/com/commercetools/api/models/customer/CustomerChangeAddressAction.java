
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing an address of the Customer produces the CustomerAddressChanged Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerChangeAddressAction customerChangeAddressAction = CustomerChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerChangeAddressActionImpl.class)
public interface CustomerChangeAddressAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerChangeAddressAction
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
     * @return instance of CustomerChangeAddressAction
     */
    public static CustomerChangeAddressAction of() {
        return new CustomerChangeAddressActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerChangeAddressAction of(final CustomerChangeAddressAction template) {
        CustomerChangeAddressActionImpl instance = new CustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * builder factory method for CustomerChangeAddressAction
     * @return builder
     */
    public static CustomerChangeAddressActionBuilder builder() {
        return CustomerChangeAddressActionBuilder.of();
    }

    /**
     * create builder for CustomerChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangeAddressActionBuilder builder(final CustomerChangeAddressAction template) {
        return CustomerChangeAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerChangeAddressAction(Function<CustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerChangeAddressAction>";
            }
        };
    }
}
