
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TaxRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRateDraft taxRateDraft = TaxRateDraft.builder()
 *             .name("{name}")
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxRateDraftImpl.class)
public interface TaxRateDraft extends io.vrap.rmf.base.client.Draft<TaxRateDraft> {

    /**
     *  <p>Name of the TaxRate.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Tax rate. Must be supplied if no <code>subRates</code> are specified. If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
     * @return amount
     */

    @JsonProperty("amount")
    public Double getAmount();

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @return includedInPrice
     */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a Cart or Order and the <code>taxedPrice</code> field of LineItems, CustomLineItems, and ShippingInfos.</p>
     * @return subRates
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
     *  <p>User-defined unique identifier of the TaxRate.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the TaxRate.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Tax rate. Must be supplied if no <code>subRates</code> are specified. If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
     * @param amount value to be set
     */

    public void setAmount(final Double amount);

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @param includedInPrice value to be set
     */

    public void setIncludedInPrice(final Boolean includedInPrice);

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a Cart or Order and the <code>taxedPrice</code> field of LineItems, CustomLineItems, and ShippingInfos.</p>
     * @param subRates values to be set
     */

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a Cart or Order and the <code>taxedPrice</code> field of LineItems, CustomLineItems, and ShippingInfos.</p>
     * @param subRates values to be set
     */

    public void setSubRates(final List<SubRate> subRates);

    /**
     *  <p>User-defined unique identifier of the TaxRate.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of TaxRateDraft
     */
    public static TaxRateDraft of() {
        return new TaxRateDraftImpl();
    }

    /**
     * factory method to create a shallow copy TaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxRateDraft of(final TaxRateDraft template) {
        TaxRateDraftImpl instance = new TaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        instance.setKey(template.getKey());
        return instance;
    }

    public TaxRateDraft copyDeep();

    /**
     * factory method to create a deep copy of TaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxRateDraft deepCopy(@Nullable final TaxRateDraft template) {
        if (template == null) {
            return null;
        }
        TaxRateDraftImpl instance = new TaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(Optional.ofNullable(template.getSubRates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.tax_category.SubRate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxRateDraft
     * @return builder
     */
    public static TaxRateDraftBuilder builder() {
        return TaxRateDraftBuilder.of();
    }

    /**
     * create builder for TaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxRateDraftBuilder builder(final TaxRateDraft template) {
        return TaxRateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxRateDraft(Function<TaxRateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxRateDraft>";
            }
        };
    }
}
