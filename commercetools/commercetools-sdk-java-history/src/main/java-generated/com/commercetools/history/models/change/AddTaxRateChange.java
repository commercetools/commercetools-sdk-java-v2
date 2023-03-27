
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddTaxRateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTaxRateChange addTaxRateChange = AddTaxRateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddTaxRateChangeImpl.class)
public interface AddTaxRateChange extends Change {

    /**
     * discriminator value for AddTaxRateChange
     */
    String ADD_TAX_RATE_CHANGE = "AddTaxRateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addTaxRate</code> on tax categories</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    /**
     *  <p>Update action for <code>addTaxRate</code> on tax categories</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxRate nextValue);

    /**
     * factory method
     * @return instance of AddTaxRateChange
     */
    public static AddTaxRateChange of() {
        return new AddTaxRateChangeImpl();
    }

    /**
     * factory method to copy an instance of AddTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddTaxRateChange of(final AddTaxRateChange template) {
        AddTaxRateChangeImpl instance = new AddTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for AddTaxRateChange
     * @return builder
     */
    public static AddTaxRateChangeBuilder builder() {
        return AddTaxRateChangeBuilder.of();
    }

    /**
     * create builder for AddTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTaxRateChangeBuilder builder(final AddTaxRateChange template) {
        return AddTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddTaxRateChange(Function<AddTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddTaxRateChange>";
            }
        };
    }
}
