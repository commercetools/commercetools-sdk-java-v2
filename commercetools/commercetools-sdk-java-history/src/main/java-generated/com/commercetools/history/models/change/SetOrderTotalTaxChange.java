
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetOrderTotalTaxAction" rel="nofollow">Set OrderTotalTax</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalTaxChange setOrderTotalTaxChange = SetOrderTotalTaxChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetOrderTotalTaxChange")
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
    public Money getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * factory method
     * @return instance of SetOrderTotalTaxChange
     */
    public static SetOrderTotalTaxChange of() {
        return new SetOrderTotalTaxChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetOrderTotalTaxChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderTotalTaxChange of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeImpl instance = new SetOrderTotalTaxChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public SetOrderTotalTaxChange copyDeep();

    /**
     * factory method to create a deep copy of SetOrderTotalTaxChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderTotalTaxChange deepCopy(@Nullable final SetOrderTotalTaxChange template) {
        if (template == null) {
            return null;
        }
        SetOrderTotalTaxChangeImpl instance = new SetOrderTotalTaxChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        instance.setTaxMode(template.getTaxMode());
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
