
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing the address from a Business Unit generates the BusinessUnitAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAddressAction businessUnitRemoveAddressAction = BusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveAddressActionImpl.class)
public interface BusinessUnitRemoveAddressAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveAddressAction
     */
    String REMOVE_ADDRESS = "removeAddress";

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of BusinessUnitRemoveAddressAction
     */
    public static BusinessUnitRemoveAddressAction of() {
        return new BusinessUnitRemoveAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveAddressAction of(final BusinessUnitRemoveAddressAction template) {
        BusinessUnitRemoveAddressActionImpl instance = new BusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitRemoveAddressAction deepCopy(@Nullable final BusinessUnitRemoveAddressAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitRemoveAddressActionImpl instance = new BusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveAddressAction
     * @return builder
     */
    public static BusinessUnitRemoveAddressActionBuilder builder() {
        return BusinessUnitRemoveAddressActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveAddressActionBuilder builder(final BusinessUnitRemoveAddressAction template) {
        return BusinessUnitRemoveAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveAddressAction(Function<BusinessUnitRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveAddressAction>";
            }
        };
    }
}
