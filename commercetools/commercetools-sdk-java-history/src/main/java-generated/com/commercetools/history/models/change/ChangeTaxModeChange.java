
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTaxModeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTaxModeChange changeTaxModeChange = ChangeTaxModeChange.builder()
 *             .change("{change}")
 *             .previousValue(TaxMode.PLATFORM)
 *             .nextValue(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTaxModeChangeImpl.class)
public interface ChangeTaxModeChange extends Change {

    /**
     * discriminator value for ChangeTaxModeChange
     */
    String CHANGE_TAX_MODE_CHANGE = "ChangeTaxModeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeTaxMode</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public TaxMode getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public TaxMode getNextValue();

    /**
     *  <p>Shape of the action for <code>changeTaxMode</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxMode previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxMode nextValue);

    /**
     * factory method
     * @return instance of ChangeTaxModeChange
     */
    public static ChangeTaxModeChange of() {
        return new ChangeTaxModeChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeTaxModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTaxModeChange of(final ChangeTaxModeChange template) {
        ChangeTaxModeChangeImpl instance = new ChangeTaxModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTaxModeChange
     * @return builder
     */
    public static ChangeTaxModeChangeBuilder builder() {
        return ChangeTaxModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeTaxModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTaxModeChangeBuilder builder(final ChangeTaxModeChange template) {
        return ChangeTaxModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTaxModeChange(Function<ChangeTaxModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTaxModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTaxModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTaxModeChange>";
            }
        };
    }
}
