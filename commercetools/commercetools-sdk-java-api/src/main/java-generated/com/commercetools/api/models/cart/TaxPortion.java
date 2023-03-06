
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The tax portions are calculated from the TaxRates. If a Tax Rate has SubRates, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> are accumulated to the same tax portion.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion {

    /**
     *  <p>Name of the tax portion.</p>
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>A number in the range 0-1.</p>
     */
    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    /**
     *  <p>Money value of the tax portion.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public CentPrecisionMoney getAmount();

    public void setName(final String name);

    public void setRate(final Double rate);

    public void setAmount(final CentPrecisionMoney amount);

    public static TaxPortion of() {
        return new TaxPortionImpl();
    }

    public static TaxPortion of(final TaxPortion template) {
        TaxPortionImpl instance = new TaxPortionImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static TaxPortionBuilder builder() {
        return TaxPortionBuilder.of();
    }

    public static TaxPortionBuilder builder(final TaxPortion template) {
        return TaxPortionBuilder.of(template);
    }

    default <T> T withTaxPortion(Function<TaxPortion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxPortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxPortion>() {
            @Override
            public String toString() {
                return "TypeReference<TaxPortion>";
            }
        };
    }
}
