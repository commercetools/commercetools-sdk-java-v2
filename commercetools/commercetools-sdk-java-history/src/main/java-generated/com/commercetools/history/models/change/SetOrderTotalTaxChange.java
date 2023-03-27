
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTotalTaxChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalTaxChange setOrderTotalTaxChange = SetOrderTotalTaxChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderTotalTaxChangeImpl.class)
public interface SetOrderTotalTaxChange extends Change {

    /**
     * discriminator value for SetOrderTotalTaxChange
     */
    String SET_ORDER_TOTAL_TAX_CHANGE = "SetOrderTotalTaxChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setOrderTotalTax</code></p>
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
    public Money getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    /**
     *  <p>Update action for <code>setOrderTotalTax</code></p>
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

    public void setNextValue(final Money nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     * factory method
     * @return instance of SetOrderTotalTaxChange
     */
    public static SetOrderTotalTaxChange of() {
        return new SetOrderTotalTaxChangeImpl();
    }

    /**
     * factory method to copy an instance of SetOrderTotalTaxChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderTotalTaxChange of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeImpl instance = new SetOrderTotalTaxChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetOrderTotalTaxChange
     * @return builder
     */
    public static SetOrderTotalTaxChangeBuilder builder() {
        return SetOrderTotalTaxChangeBuilder.of();
    }

    /**
     * create builder for SetOrderTotalTaxChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTotalTaxChangeBuilder builder(final SetOrderTotalTaxChange template) {
        return SetOrderTotalTaxChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderTotalTaxChange(Function<SetOrderTotalTaxChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalTaxChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalTaxChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderTotalTaxChange>";
            }
        };
    }
}
