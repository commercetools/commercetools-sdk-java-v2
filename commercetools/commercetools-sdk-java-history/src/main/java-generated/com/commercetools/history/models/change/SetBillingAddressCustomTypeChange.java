
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetBillingAddressCustomTypeAction" rel="nofollow">Set Billing Address Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBillingAddressCustomTypeChange setBillingAddressCustomTypeChange = SetBillingAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetBillingAddressCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetBillingAddressCustomTypeChangeImpl.class)
public interface SetBillingAddressCustomTypeChange extends Change {

    /**
     * discriminator value for SetBillingAddressCustomTypeChange
     */
    String SET_BILLING_ADDRESS_CUSTOM_TYPE_CHANGE = "SetBillingAddressCustomTypeChange";

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
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetBillingAddressCustomTypeChange
     */
    public static SetBillingAddressCustomTypeChange of() {
        return new SetBillingAddressCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetBillingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetBillingAddressCustomTypeChange of(final SetBillingAddressCustomTypeChange template) {
        SetBillingAddressCustomTypeChangeImpl instance = new SetBillingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetBillingAddressCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetBillingAddressCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetBillingAddressCustomTypeChange deepCopy(
            @Nullable final SetBillingAddressCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetBillingAddressCustomTypeChangeImpl instance = new SetBillingAddressCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetBillingAddressCustomTypeChange
     * @return builder
     */
    public static SetBillingAddressCustomTypeChangeBuilder builder() {
        return SetBillingAddressCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetBillingAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBillingAddressCustomTypeChangeBuilder builder(final SetBillingAddressCustomTypeChange template) {
        return SetBillingAddressCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetBillingAddressCustomTypeChange(Function<SetBillingAddressCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetBillingAddressCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetBillingAddressCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetBillingAddressCustomTypeChange>";
            }
        };
    }
}
