
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

    public void setChange(final String change);

    public void setTaxMode(final TaxMode taxMode);

    public void setNextValue(final Money nextValue);

    public void setPreviousValue(final Money previousValue);

    public static SetOrderTotalTaxChange of() {
        return new SetOrderTotalTaxChangeImpl();
    }

    public static SetOrderTotalTaxChange of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeImpl instance = new SetOrderTotalTaxChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetOrderTotalTaxChangeBuilder builder() {
        return SetOrderTotalTaxChangeBuilder.of();
    }

    public static SetOrderTotalTaxChangeBuilder builder(final SetOrderTotalTaxChange template) {
        return SetOrderTotalTaxChangeBuilder.of(template);
    }

    default <T> T withSetOrderTotalTaxChange(Function<SetOrderTotalTaxChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalTaxChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalTaxChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderTotalTaxChange>";
            }
        };
    }
}
