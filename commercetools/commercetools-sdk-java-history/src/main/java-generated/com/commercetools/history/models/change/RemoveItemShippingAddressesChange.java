
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveItemShippingAddressesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveItemShippingAddressesChange removeItemShippingAddressesChange = RemoveItemShippingAddressesChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>removeItemShippingAddress</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Update action for <code>removeItemShippingAddress</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

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
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Address::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Address::deepCopy)
                .orElse(null));
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
