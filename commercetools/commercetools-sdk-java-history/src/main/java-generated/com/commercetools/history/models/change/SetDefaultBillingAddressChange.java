
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
 *  <p>Change triggered by the Set Default Billing Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDefaultBillingAddressChange setDefaultBillingAddressChange = SetDefaultBillingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDefaultBillingAddressChangeImpl.class)
public interface SetDefaultBillingAddressChange extends Change {

    /**
     * discriminator value for SetDefaultBillingAddressChange
     */
    String SET_DEFAULT_BILLING_ADDRESS_CHANGE = "SetDefaultBillingAddressChange";

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
     * @return instance of SetDefaultBillingAddressChange
     */
    public static SetDefaultBillingAddressChange of() {
        return new SetDefaultBillingAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDefaultBillingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDefaultBillingAddressChange of(final SetDefaultBillingAddressChange template) {
        SetDefaultBillingAddressChangeImpl instance = new SetDefaultBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDefaultBillingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDefaultBillingAddressChange deepCopy(@Nullable final SetDefaultBillingAddressChange template) {
        if (template == null) {
            return null;
        }
        SetDefaultBillingAddressChangeImpl instance = new SetDefaultBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDefaultBillingAddressChange
     * @return builder
     */
    public static SetDefaultBillingAddressChangeBuilder builder() {
        return SetDefaultBillingAddressChangeBuilder.of();
    }

    /**
     * create builder for SetDefaultBillingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDefaultBillingAddressChangeBuilder builder(final SetDefaultBillingAddressChange template) {
        return SetDefaultBillingAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDefaultBillingAddressChange(Function<SetDefaultBillingAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDefaultBillingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDefaultBillingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDefaultBillingAddressChange>";
            }
        };
    }
}
