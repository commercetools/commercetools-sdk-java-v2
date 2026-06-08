
package com.commercetools.api.models.business_unit;

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
 *  <p>Adding an address to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddressAddedMessage" rel="nofollow">BusinessUnitAddressAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAddressAction businessUnitAddAddressAction = BusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddAddressActionImpl.class)
public interface BusinessUnitAddAddressAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddAddressAction
     */
    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>Address to add to the addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Address to add to the addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of BusinessUnitAddAddressAction
     */
    public static BusinessUnitAddAddressAction of() {
        return new BusinessUnitAddAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddAddressAction of(final BusinessUnitAddAddressAction template) {
        BusinessUnitAddAddressActionImpl instance = new BusinessUnitAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public BusinessUnitAddAddressAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddAddressAction deepCopy(@Nullable final BusinessUnitAddAddressAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddAddressActionImpl instance = new BusinessUnitAddAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddAddressAction
     * @return builder
     */
    public static BusinessUnitAddAddressActionBuilder builder() {
        return BusinessUnitAddAddressActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddAddressActionBuilder builder(final BusinessUnitAddAddressAction template) {
        return BusinessUnitAddAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddAddressAction(Function<BusinessUnitAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddAddressAction>";
            }
        };
    }
}
