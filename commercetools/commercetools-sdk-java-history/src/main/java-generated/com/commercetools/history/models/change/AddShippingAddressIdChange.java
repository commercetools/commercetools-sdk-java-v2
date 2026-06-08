
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddShippingAddressIdAction" rel="nofollow">Add Shipping Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddShippingAddressIdChange addShippingAddressIdChange = AddShippingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddShippingAddressIdChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddShippingAddressIdChangeImpl.class)
public interface AddShippingAddressIdChange extends Change {

    /**
     * discriminator value for AddShippingAddressIdChange
     */
    String ADD_SHIPPING_ADDRESS_ID_CHANGE = "AddShippingAddressIdChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    /**
     *  <p>Address added to <code>shippingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     *  <p>Address added to <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of AddShippingAddressIdChange
     */
    public static AddShippingAddressIdChange of() {
        return new AddShippingAddressIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddShippingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddShippingAddressIdChange of(final AddShippingAddressIdChange template) {
        AddShippingAddressIdChangeImpl instance = new AddShippingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public AddShippingAddressIdChange copyDeep();

    /**
     * factory method to create a deep copy of AddShippingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddShippingAddressIdChange deepCopy(@Nullable final AddShippingAddressIdChange template) {
        if (template == null) {
            return null;
        }
        AddShippingAddressIdChangeImpl instance = new AddShippingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        instance.setAddress(com.commercetools.history.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for AddShippingAddressIdChange
     * @return builder
     */
    public static AddShippingAddressIdChangeBuilder builder() {
        return AddShippingAddressIdChangeBuilder.of();
    }

    /**
     * create builder for AddShippingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddShippingAddressIdChangeBuilder builder(final AddShippingAddressIdChange template) {
        return AddShippingAddressIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddShippingAddressIdChange(Function<AddShippingAddressIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddShippingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddShippingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddShippingAddressIdChange>";
            }
        };
    }
}
