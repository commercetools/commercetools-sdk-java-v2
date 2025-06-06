
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TaxCalculationMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change TaxCalculationMode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTaxCalculationModeChange changeTaxCalculationModeChange = ChangeTaxCalculationModeChange.builder()
 *             .change("{change}")
 *             .previousValue(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .nextValue(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTaxCalculationModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTaxCalculationModeChangeImpl.class)
public interface ChangeTaxCalculationModeChange extends Change {

    /**
     * discriminator value for ChangeTaxCalculationModeChange
     */
    String CHANGE_TAX_CALCULATION_MODE_CHANGE = "ChangeTaxCalculationModeChange";

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
    @JsonProperty("previousValue")
    public TaxCalculationMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public TaxCalculationMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxCalculationMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxCalculationMode nextValue);

    /**
     * factory method
     * @return instance of ChangeTaxCalculationModeChange
     */
    public static ChangeTaxCalculationModeChange of() {
        return new ChangeTaxCalculationModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTaxCalculationModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTaxCalculationModeChange of(final ChangeTaxCalculationModeChange template) {
        ChangeTaxCalculationModeChangeImpl instance = new ChangeTaxCalculationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeTaxCalculationModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeTaxCalculationModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTaxCalculationModeChange deepCopy(@Nullable final ChangeTaxCalculationModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeTaxCalculationModeChangeImpl instance = new ChangeTaxCalculationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTaxCalculationModeChange
     * @return builder
     */
    public static ChangeTaxCalculationModeChangeBuilder builder() {
        return ChangeTaxCalculationModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeTaxCalculationModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTaxCalculationModeChangeBuilder builder(final ChangeTaxCalculationModeChange template) {
        return ChangeTaxCalculationModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTaxCalculationModeChange(Function<ChangeTaxCalculationModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTaxCalculationModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTaxCalculationModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTaxCalculationModeChange>";
            }
        };
    }
}
