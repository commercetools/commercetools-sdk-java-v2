
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
 *  <p>Change triggered by the Add Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAddressChange addAddressChange = AddAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAddressChangeImpl.class)
public interface AddAddressChange extends Change {

    /**
     * discriminator value for AddAddressChange
     */
    String ADD_ADDRESS_CHANGE = "AddAddressChange";

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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * factory method
     * @return instance of AddAddressChange
     */
    public static AddAddressChange of() {
        return new AddAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAddressChange of(final AddAddressChange template) {
        AddAddressChangeImpl instance = new AddAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddAddressChange deepCopy(@Nullable final AddAddressChange template) {
        if (template == null) {
            return null;
        }
        AddAddressChangeImpl instance = new AddAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddAddressChange
     * @return builder
     */
    public static AddAddressChangeBuilder builder() {
        return AddAddressChangeBuilder.of();
    }

    /**
     * create builder for AddAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAddressChangeBuilder builder(final AddAddressChange template) {
        return AddAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddAddressChange(Function<AddAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAddressChange>";
            }
        };
    }
}
