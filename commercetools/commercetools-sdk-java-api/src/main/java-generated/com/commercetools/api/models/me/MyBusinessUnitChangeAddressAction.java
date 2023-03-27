
package com.commercetools.api.models.me;

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
 *  <p>Changing the address on a Business Unit generates the BusinessUnitAddressChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAddressAction myBusinessUnitChangeAddressAction = MyBusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeAddressActionImpl.class)
public interface MyBusinessUnitChangeAddressAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitChangeAddressAction
     */
    String CHANGE_ADDRESS = "changeAddress";

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>New address to set.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>New address to set.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyBusinessUnitChangeAddressAction
     */
    public static MyBusinessUnitChangeAddressAction of() {
        return new MyBusinessUnitChangeAddressActionImpl();
    }

    /**
     * factory method to copy an instance of MyBusinessUnitChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitChangeAddressAction of(final MyBusinessUnitChangeAddressAction template) {
        MyBusinessUnitChangeAddressActionImpl instance = new MyBusinessUnitChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitChangeAddressAction
     * @return builder
     */
    public static MyBusinessUnitChangeAddressActionBuilder builder() {
        return MyBusinessUnitChangeAddressActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeAddressActionBuilder builder(final MyBusinessUnitChangeAddressAction template) {
        return MyBusinessUnitChangeAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitChangeAddressAction(Function<MyBusinessUnitChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeAddressAction>";
            }
        };
    }
}
