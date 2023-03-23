
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTaxedPriceChange setOrderTaxedPriceChange = SetOrderTaxedPriceChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderTaxedPriceChangeImpl.class)
public interface SetOrderTaxedPriceChange extends Change {

    String SET_ORDER_TAXED_PRICE_CHANGE = "SetOrderTaxedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setOrderTaxedPrice</code></p>
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
    public TaxedItemPrice getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedItemPrice getPreviousValue();

    public void setChange(final String change);

    public void setTaxMode(final TaxMode taxMode);

    public void setNextValue(final TaxedItemPrice nextValue);

    public void setPreviousValue(final TaxedItemPrice previousValue);

    public static SetOrderTaxedPriceChange of() {
        return new SetOrderTaxedPriceChangeImpl();
    }

    public static SetOrderTaxedPriceChange of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeImpl instance = new SetOrderTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetOrderTaxedPriceChangeBuilder builder() {
        return SetOrderTaxedPriceChangeBuilder.of();
    }

    public static SetOrderTaxedPriceChangeBuilder builder(final SetOrderTaxedPriceChange template) {
        return SetOrderTaxedPriceChangeBuilder.of(template);
    }

    default <T> T withSetOrderTaxedPriceChange(Function<SetOrderTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderTaxedPriceChange>";
            }
        };
    }
}
