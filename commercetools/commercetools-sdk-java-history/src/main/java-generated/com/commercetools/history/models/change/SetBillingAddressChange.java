
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Billing Address on Orders.</li>
 *   <li>Set Billing Address on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBillingAddressChange setBillingAddressChange = SetBillingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetBillingAddressChangeImpl.class)
public interface SetBillingAddressChange extends Change {

    /**
     * discriminator value for SetBillingAddressChange
     */
    String SET_BILLING_ADDRESS_CHANGE = "SetBillingAddressChange";

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
     * @return instance of SetBillingAddressChange
     */
    public static SetBillingAddressChange of() {
        return new SetBillingAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetBillingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetBillingAddressChange of(final SetBillingAddressChange template) {
        SetBillingAddressChangeImpl instance = new SetBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetBillingAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetBillingAddressChange deepCopy(@Nullable final SetBillingAddressChange template) {
        if (template == null) {
            return null;
        }
        SetBillingAddressChangeImpl instance = new SetBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetBillingAddressChange
     * @return builder
     */
    public static SetBillingAddressChangeBuilder builder() {
        return SetBillingAddressChangeBuilder.of();
    }

    /**
     * create builder for SetBillingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBillingAddressChangeBuilder builder(final SetBillingAddressChange template) {
        return SetBillingAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetBillingAddressChange(Function<SetBillingAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetBillingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetBillingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetBillingAddressChange>";
            }
        };
    }
}
