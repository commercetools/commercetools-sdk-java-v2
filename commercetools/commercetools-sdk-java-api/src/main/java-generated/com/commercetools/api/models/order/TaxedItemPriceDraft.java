
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedItemPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedItemPriceDraft taxedItemPriceDraft = TaxedItemPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedItemPriceDraftImpl.class)
public interface TaxedItemPriceDraft extends io.vrap.rmf.base.client.Draft<TaxedItemPriceDraft> {

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param totalNet value to be set
     */

    public void setTotalNet(final Money totalNet);

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param totalGross value to be set
     */

    public void setTotalGross(final Money totalGross);

    /**
     * factory method
     * @return instance of TaxedItemPriceDraft
     */
    public static TaxedItemPriceDraft of() {
        return new TaxedItemPriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy TaxedItemPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxedItemPriceDraft of(final TaxedItemPriceDraft template) {
        TaxedItemPriceDraftImpl instance = new TaxedItemPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxedItemPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxedItemPriceDraft deepCopy(@Nullable final TaxedItemPriceDraft template) {
        if (template == null) {
            return null;
        }
        TaxedItemPriceDraftImpl instance = new TaxedItemPriceDraftImpl();
        instance.setTotalNet(com.commercetools.api.models.common.Money.deepCopy(template.getTotalNet()));
        instance.setTotalGross(com.commercetools.api.models.common.Money.deepCopy(template.getTotalGross()));
        return instance;
    }

    /**
     * builder factory method for TaxedItemPriceDraft
     * @return builder
     */
    public static TaxedItemPriceDraftBuilder builder() {
        return TaxedItemPriceDraftBuilder.of();
    }

    /**
     * create builder for TaxedItemPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedItemPriceDraftBuilder builder(final TaxedItemPriceDraft template) {
        return TaxedItemPriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxedItemPriceDraft(Function<TaxedItemPriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxedItemPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedItemPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedItemPriceDraft>";
            }
        };
    }
}
