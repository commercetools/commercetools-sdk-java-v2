
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
 *  <p>Change triggered by the Set Default Shipping Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDefaultShippingAddressChange setDefaultShippingAddressChange = SetDefaultShippingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDefaultShippingAddressChangeImpl.class)
public interface SetDefaultShippingAddressChange extends Change {

    /**
     * discriminator value for SetDefaultShippingAddressChange
     */
    String SET_DEFAULT_SHIPPING_ADDRESS_CHANGE = "SetDefaultShippingAddressChange";

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
     * @return instance of SetDefaultShippingAddressChange
     */
    public static SetDefaultShippingAddressChange of() {
        return new SetDefaultShippingAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDefaultShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDefaultShippingAddressChange of(final SetDefaultShippingAddressChange template) {
        SetDefaultShippingAddressChangeImpl instance = new SetDefaultShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDefaultShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDefaultShippingAddressChange deepCopy(@Nullable final SetDefaultShippingAddressChange template) {
        if (template == null) {
            return null;
        }
        SetDefaultShippingAddressChangeImpl instance = new SetDefaultShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDefaultShippingAddressChange
     * @return builder
     */
    public static SetDefaultShippingAddressChangeBuilder builder() {
        return SetDefaultShippingAddressChangeBuilder.of();
    }

    /**
     * create builder for SetDefaultShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDefaultShippingAddressChangeBuilder builder(final SetDefaultShippingAddressChange template) {
        return SetDefaultShippingAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDefaultShippingAddressChange(Function<SetDefaultShippingAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDefaultShippingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDefaultShippingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDefaultShippingAddressChange>";
            }
        };
    }
}
