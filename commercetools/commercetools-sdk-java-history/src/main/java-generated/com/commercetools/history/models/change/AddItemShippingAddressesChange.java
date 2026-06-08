
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddItemShippingAddressAction" rel="nofollow">Add ItemShippingAddress</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddItemShippingAddressAction" rel="nofollow">Add ItemShippingAddress</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddItemShippingAddressesChange addItemShippingAddressesChange = AddItemShippingAddressesChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddItemShippingAddressesChange")
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
     * @return instance of AddItemShippingAddressesChange
     */
    public static AddItemShippingAddressesChange of() {
        return new AddItemShippingAddressesChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddItemShippingAddressesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddItemShippingAddressesChange of(final AddItemShippingAddressesChange template) {
        AddItemShippingAddressesChangeImpl instance = new AddItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddItemShippingAddressesChange copyDeep();

    /**
     * factory method to create a deep copy of AddItemShippingAddressesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddItemShippingAddressesChange deepCopy(@Nullable final AddItemShippingAddressesChange template) {
        if (template == null) {
            return null;
        }
        AddItemShippingAddressesChangeImpl instance = new AddItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
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
