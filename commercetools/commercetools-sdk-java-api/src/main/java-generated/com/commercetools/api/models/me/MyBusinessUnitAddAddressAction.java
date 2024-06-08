
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
 *  <p>Adding an address to a Business Unit generates a BusinessUnitAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddAddressAction myBusinessUnitAddAddressAction = MyBusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddAddressActionImpl.class)
public interface MyBusinessUnitAddAddressAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitAddAddressAction
     */
    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyBusinessUnitAddAddressAction
     */
    public static MyBusinessUnitAddAddressAction of() {
        return new MyBusinessUnitAddAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitAddAddressAction of(final MyBusinessUnitAddAddressAction template) {
        MyBusinessUnitAddAddressActionImpl instance = new MyBusinessUnitAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitAddAddressAction deepCopy(@Nullable final MyBusinessUnitAddAddressAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitAddAddressActionImpl instance = new MyBusinessUnitAddAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitAddAddressAction
     * @return builder
     */
    public static MyBusinessUnitAddAddressActionBuilder builder() {
        return MyBusinessUnitAddAddressActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAddAddressActionBuilder builder(final MyBusinessUnitAddAddressAction template) {
        return MyBusinessUnitAddAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitAddAddressAction(Function<MyBusinessUnitAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddAddressAction>";
            }
        };
    }
}
