
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
 * RemoveBillingAddressIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveBillingAddressIdChange removeBillingAddressIdChange = RemoveBillingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveBillingAddressIdChangeImpl.class)
public interface RemoveBillingAddressIdChange extends Change {

    /**
     * discriminator value for RemoveBillingAddressIdChange
     */
    String REMOVE_BILLING_ADDRESS_ID_CHANGE = "RemoveBillingAddressIdChange";

    /**
     *  <p>Update action for <code>removeBillingAddressId</code> action on customers.</p>
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
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Update action for <code>removeBillingAddressId</code> action on customers.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     * set address
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of RemoveBillingAddressIdChange
     */
    public static RemoveBillingAddressIdChange of() {
        return new RemoveBillingAddressIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveBillingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveBillingAddressIdChange of(final RemoveBillingAddressIdChange template) {
        RemoveBillingAddressIdChangeImpl instance = new RemoveBillingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveBillingAddressIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveBillingAddressIdChange deepCopy(@Nullable final RemoveBillingAddressIdChange template) {
        if (template == null) {
            return null;
        }
        RemoveBillingAddressIdChangeImpl instance = new RemoveBillingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.history.models.common.Address::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveBillingAddressIdChange
     * @return builder
     */
    public static RemoveBillingAddressIdChangeBuilder builder() {
        return RemoveBillingAddressIdChangeBuilder.of();
    }

    /**
     * create builder for RemoveBillingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveBillingAddressIdChangeBuilder builder(final RemoveBillingAddressIdChange template) {
        return RemoveBillingAddressIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveBillingAddressIdChange(Function<RemoveBillingAddressIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveBillingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveBillingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveBillingAddressIdChange>";
            }
        };
    }
}
