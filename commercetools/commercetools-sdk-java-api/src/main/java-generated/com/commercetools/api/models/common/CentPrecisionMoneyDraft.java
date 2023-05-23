
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This draft type is the alternative to Money.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoneyDraft centPrecisionMoneyDraft = CentPrecisionMoneyDraft.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyDraftImpl.class)
public interface CentPrecisionMoneyDraft
        extends TypedMoneyDraft, io.vrap.rmf.base.client.Draft<CentPrecisionMoneyDraft> {

    /**
     * discriminator value for CentPrecisionMoneyDraft
     */
    String CENT_PRECISION = "centPrecision";

    /**
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
     * @return fractionDigits
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     * factory method
     * @return instance of CentPrecisionMoneyDraft
     */
    public static CentPrecisionMoneyDraft of() {
        return new CentPrecisionMoneyDraftImpl();
    }

    /**
     * factory method to create a shallow copy CentPrecisionMoneyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CentPrecisionMoneyDraft of(final CentPrecisionMoneyDraft template) {
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * factory method to create a deep copy of CentPrecisionMoneyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CentPrecisionMoneyDraft deepCopy(@Nullable final CentPrecisionMoneyDraft template) {
        if (template == null) {
            return null;
        }
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * builder factory method for CentPrecisionMoneyDraft
     * @return builder
     */
    public static CentPrecisionMoneyDraftBuilder builder() {
        return CentPrecisionMoneyDraftBuilder.of();
    }

    /**
     * create builder for CentPrecisionMoneyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CentPrecisionMoneyDraftBuilder builder(final CentPrecisionMoneyDraft template) {
        return CentPrecisionMoneyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCentPrecisionMoneyDraft(Function<CentPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    public static CentPrecisionMoneyDraft of(final javax.money.MonetaryAmount monetaryAmount) {
        return MoneyUtil.draftOf(monetaryAmount);
    }

    public static CentPrecisionMoneyDraft of(final CentPrecisionMoney template) {
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CentPrecisionMoneyDraft>";
            }
        };
    }
}
