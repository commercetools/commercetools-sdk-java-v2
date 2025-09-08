
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemoveItemShippingAddressAction" rel="nofollow">Remove Item Shipping Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveItemShippingAddressesChange removeItemShippingAddressesChange = RemoveItemShippingAddressesChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveItemShippingAddressesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveItemShippingAddressesChangeImpl.class)
public interface RemoveItemShippingAddressesChange extends Change {

    /**
     * discriminator value for RemoveItemShippingAddressesChange
     */
    String REMOVE_ITEM_SHIPPING_ADDRESSES_CHANGE = "RemoveItemShippingAddressesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * factory method
     * @return instance of RemoveItemShippingAddressesChange
     */
    public static RemoveItemShippingAddressesChange of() {
        return new RemoveItemShippingAddressesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveItemShippingAddressesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveItemShippingAddressesChange of(final RemoveItemShippingAddressesChange template) {
        RemoveItemShippingAddressesChangeImpl instance = new RemoveItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public RemoveItemShippingAddressesChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveItemShippingAddressesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveItemShippingAddressesChange deepCopy(
            @Nullable final RemoveItemShippingAddressesChange template) {
        if (template == null) {
            return null;
        }
        RemoveItemShippingAddressesChangeImpl instance = new RemoveItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveItemShippingAddressesChange
     * @return builder
     */
    public static RemoveItemShippingAddressesChangeBuilder builder() {
        return RemoveItemShippingAddressesChangeBuilder.of();
    }

    /**
     * create builder for RemoveItemShippingAddressesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveItemShippingAddressesChangeBuilder builder(final RemoveItemShippingAddressesChange template) {
        return RemoveItemShippingAddressesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveItemShippingAddressesChange(Function<RemoveItemShippingAddressesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveItemShippingAddressesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveItemShippingAddressesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveItemShippingAddressesChange>";
            }
        };
    }
}
