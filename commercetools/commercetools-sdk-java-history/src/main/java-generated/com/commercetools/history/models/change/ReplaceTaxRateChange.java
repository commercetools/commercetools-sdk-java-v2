
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategoryReplaceTaxRateAction" rel="nofollow">Replace TaxRate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReplaceTaxRateChange replaceTaxRateChange = ReplaceTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ReplaceTaxRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReplaceTaxRateChangeImpl.class)
public interface ReplaceTaxRateChange extends Change {

    /**
     * discriminator value for ReplaceTaxRateChange
     */
    String REPLACE_TAX_RATE_CHANGE = "ReplaceTaxRateChange";

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
    public TaxRate getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxRate nextValue);

    /**
     * factory method
     * @return instance of ReplaceTaxRateChange
     */
    public static ReplaceTaxRateChange of() {
        return new ReplaceTaxRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ReplaceTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReplaceTaxRateChange of(final ReplaceTaxRateChange template) {
        ReplaceTaxRateChangeImpl instance = new ReplaceTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ReplaceTaxRateChange copyDeep();

    /**
     * factory method to create a deep copy of ReplaceTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReplaceTaxRateChange deepCopy(@Nullable final ReplaceTaxRateChange template) {
        if (template == null) {
            return null;
        }
        ReplaceTaxRateChangeImpl instance = new ReplaceTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ReplaceTaxRateChange
     * @return builder
     */
    public static ReplaceTaxRateChangeBuilder builder() {
        return ReplaceTaxRateChangeBuilder.of();
    }

    /**
     * create builder for ReplaceTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReplaceTaxRateChangeBuilder builder(final ReplaceTaxRateChange template) {
        return ReplaceTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReplaceTaxRateChange(Function<ReplaceTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReplaceTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplaceTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ReplaceTaxRateChange>";
            }
        };
    }
}
