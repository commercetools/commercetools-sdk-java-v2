
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.tax_category.SubRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartTaxCalculation" rel="nofollow">Cart tax calculation</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxRateDraft externalTaxRateDraft = ExternalTaxRateDraft.builder()
 *             .name("{name}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft extends io.vrap.rmf.base.client.Draft<ExternalTaxRateDraft> {

    /**
     *  <p>Name of the Tax Rate.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Percentage in the range of 0-1.</p>
     *  <ul>
     *   <li>If no <code>subRates</code> are specified, a value must be defined.</li>
     *   <li>If <code>subRates</code> are specified, this can be omitted or its value must be the sum of all <code>subRates</code> amounts.</li>
     *  </ul>
     * @return amount
     */

    @JsonProperty("amount")
    public Double getAmount();

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     * @return includedInPrice
     */

    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Country for which the tax applies.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the specified country.</p>
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @return subRates
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
     *  <p>Name of the Tax Rate.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Percentage in the range of 0-1.</p>
     *  <ul>
     *   <li>If no <code>subRates</code> are specified, a value must be defined.</li>
     *   <li>If <code>subRates</code> are specified, this can be omitted or its value must be the sum of all <code>subRates</code> amounts.</li>
     *  </ul>
     * @param amount value to be set
     */

    public void setAmount(final Double amount);

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     * @param includedInPrice value to be set
     */

    public void setIncludedInPrice(final Boolean includedInPrice);

    /**
     *  <p>Country for which the tax applies.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>State within the specified country.</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param subRates values to be set
     */

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param subRates values to be set
     */

    public void setSubRates(final List<SubRate> subRates);

    /**
     * factory method
     * @return instance of ExternalTaxRateDraft
     */
    public static ExternalTaxRateDraft of() {
        return new ExternalTaxRateDraftImpl();
    }

    /**
     * factory method to create a shallow copy ExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalTaxRateDraft of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

    public ExternalTaxRateDraft copyDeep();

    /**
     * factory method to create a deep copy of ExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalTaxRateDraft deepCopy(@Nullable final ExternalTaxRateDraft template) {
        if (template == null) {
            return null;
        }
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
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
        return instance;
    }

    /**
     * builder factory method for ExternalTaxRateDraft
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder builder() {
        return ExternalTaxRateDraftBuilder.of();
    }

    /**
     * create builder for ExternalTaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder builder(final ExternalTaxRateDraft template) {
        return ExternalTaxRateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalTaxRateDraft(Function<ExternalTaxRateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxRateDraft>";
            }
        };
    }
}
