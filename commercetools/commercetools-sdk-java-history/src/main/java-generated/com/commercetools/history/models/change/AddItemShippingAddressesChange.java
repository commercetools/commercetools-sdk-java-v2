
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddItemShippingAddressesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddItemShippingAddressesChange addItemShippingAddressesChange = AddItemShippingAddressesChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddItemShippingAddressesChangeImpl.class)
public interface AddItemShippingAddressesChange extends Change {

    /**
     * discriminator value for AddItemShippingAddressesChange
     */
    String ADD_ITEM_SHIPPING_ADDRESSES_CHANGE = "AddItemShippingAddressesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addItemShippingAddress</code></p>
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
     *  <p>Update action for <code>addItemShippingAddress</code></p>
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
     * @return instance of AddItemShippingAddressesChange
     */
    public static AddItemShippingAddressesChange of() {
        return new AddItemShippingAddressesChangeImpl();
    }

    /**
     * factory method to copy an instance of AddItemShippingAddressesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddItemShippingAddressesChange of(final AddItemShippingAddressesChange template) {
        AddItemShippingAddressesChangeImpl instance = new AddItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for AddItemShippingAddressesChange
     * @return builder
     */
    public static AddItemShippingAddressesChangeBuilder builder() {
        return AddItemShippingAddressesChangeBuilder.of();
    }

    /**
     * create builder for AddItemShippingAddressesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddItemShippingAddressesChangeBuilder builder(final AddItemShippingAddressesChange template) {
        return AddItemShippingAddressesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddItemShippingAddressesChange(Function<AddItemShippingAddressesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddItemShippingAddressesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddItemShippingAddressesChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddItemShippingAddressesChange>";
            }
        };
    }
}
