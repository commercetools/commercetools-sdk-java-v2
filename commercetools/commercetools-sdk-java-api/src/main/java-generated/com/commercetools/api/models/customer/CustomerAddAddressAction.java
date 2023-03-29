
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding an address to the Customer produces the CustomerAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddAddressAction customerAddAddressAction = CustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddAddressActionImpl.class)
public interface CustomerAddAddressAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerAddAddressAction
     */
    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of CustomerAddAddressAction
     */
    public static CustomerAddAddressAction of() {
        return new CustomerAddAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddAddressAction of(final CustomerAddAddressAction template) {
        CustomerAddAddressActionImpl instance = new CustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddAddressAction deepCopy(@Nullable final CustomerAddAddressAction template) {
        if (template == null) {
            return null;
        }
        CustomerAddAddressActionImpl instance = new CustomerAddAddressActionImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerAddAddressAction
     * @return builder
     */
    public static CustomerAddAddressActionBuilder builder() {
        return CustomerAddAddressActionBuilder.of();
    }

    /**
     * create builder for CustomerAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddAddressActionBuilder builder(final CustomerAddAddressAction template) {
        return CustomerAddAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddAddressAction(Function<CustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddAddressAction>";
            }
        };
    }
}
