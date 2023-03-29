
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue;
import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodTaxAmountChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxAmountChange setShippingMethodTaxAmountChange = SetShippingMethodTaxAmountChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodTaxAmountChangeImpl.class)
public interface SetShippingMethodTaxAmountChange extends Change {

    /**
     * discriminator value for SetShippingMethodTaxAmountChange
     */
    String SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE = "SetShippingMethodTaxAmountChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setShippingMethodTaxAmount</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ShippingMethodTaxAmountChangeValue getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ShippingMethodTaxAmountChangeValue getPreviousValue();

    /**
     *  <p>Update action for <code>setShippingMethodTaxAmount</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set taxMode
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ShippingMethodTaxAmountChangeValue nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ShippingMethodTaxAmountChangeValue previousValue);

    /**
     * factory method
     * @return instance of SetShippingMethodTaxAmountChange
     */
    public static SetShippingMethodTaxAmountChange of() {
        return new SetShippingMethodTaxAmountChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingMethodTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingMethodTaxAmountChange of(final SetShippingMethodTaxAmountChange template) {
        SetShippingMethodTaxAmountChangeImpl instance = new SetShippingMethodTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingMethodTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingMethodTaxAmountChange deepCopy(@Nullable final SetShippingMethodTaxAmountChange template) {
        if (template == null) {
            return null;
        }
        SetShippingMethodTaxAmountChangeImpl instance = new SetShippingMethodTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue
                .deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue
                .deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingMethodTaxAmountChange
     * @return builder
     */
    public static SetShippingMethodTaxAmountChangeBuilder builder() {
        return SetShippingMethodTaxAmountChangeBuilder.of();
    }

    /**
     * create builder for SetShippingMethodTaxAmountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxAmountChangeBuilder builder(final SetShippingMethodTaxAmountChange template) {
        return SetShippingMethodTaxAmountChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingMethodTaxAmountChange(Function<SetShippingMethodTaxAmountChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxAmountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxAmountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodTaxAmountChange>";
            }
        };
    }
}
