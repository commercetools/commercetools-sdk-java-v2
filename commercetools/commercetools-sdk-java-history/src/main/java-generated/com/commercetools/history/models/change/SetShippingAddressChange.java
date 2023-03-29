
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
 * SetShippingAddressChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressChange setShippingAddressChange = SetShippingAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingAddressChangeImpl.class)
public interface SetShippingAddressChange extends Change {

    /**
     * discriminator value for SetShippingAddressChange
     */
    String SET_SHIPPING_ADDRESS_CHANGE = "SetShippingAddressChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setShippingAddress</code></p>
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
     *  <p>Update action for <code>setShippingAddress</code></p>
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
     * @return instance of SetShippingAddressChange
     */
    public static SetShippingAddressChange of() {
        return new SetShippingAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingAddressChange of(final SetShippingAddressChange template) {
        SetShippingAddressChangeImpl instance = new SetShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingAddressChange deepCopy(@Nullable final SetShippingAddressChange template) {
        if (template == null) {
            return null;
        }
        SetShippingAddressChangeImpl instance = new SetShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingAddressChange
     * @return builder
     */
    public static SetShippingAddressChangeBuilder builder() {
        return SetShippingAddressChangeBuilder.of();
    }

    /**
     * create builder for SetShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressChangeBuilder builder(final SetShippingAddressChange template) {
        return SetShippingAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingAddressChange(Function<SetShippingAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingAddressChange>";
            }
        };
    }
}
