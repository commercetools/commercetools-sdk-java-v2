
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Remove TaxRate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveTaxRateChange removeTaxRateChange = RemoveTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveTaxRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveTaxRateChangeImpl.class)
public interface RemoveTaxRateChange extends Change {

    /**
     * discriminator value for RemoveTaxRateChange
     */
    String REMOVE_TAX_RATE_CHANGE = "RemoveTaxRateChange";

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
    public TaxRate getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxRate previousValue);

    /**
     * factory method
     * @return instance of RemoveTaxRateChange
     */
    public static RemoveTaxRateChange of() {
        return new RemoveTaxRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveTaxRateChange of(final RemoveTaxRateChange template) {
        RemoveTaxRateChangeImpl instance = new RemoveTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RemoveTaxRateChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveTaxRateChange deepCopy(@Nullable final RemoveTaxRateChange template) {
        if (template == null) {
            return null;
        }
        RemoveTaxRateChangeImpl instance = new RemoveTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveTaxRateChange
     * @return builder
     */
    public static RemoveTaxRateChangeBuilder builder() {
        return RemoveTaxRateChangeBuilder.of();
    }

    /**
     * create builder for RemoveTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveTaxRateChangeBuilder builder(final RemoveTaxRateChange template) {
        return RemoveTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveTaxRateChange(Function<RemoveTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveTaxRateChange>";
            }
        };
    }
}
