
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.tax_category.SubRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
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
     */

    @JsonProperty("amount")
    public Double getAmount();

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     */

    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Country for which the tax applies.</p>
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the specified country.</p>
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    public void setName(final String name);

    public void setAmount(final Double amount);

    public void setIncludedInPrice(final Boolean includedInPrice);

    public void setCountry(final String country);

    public void setState(final String state);

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    public void setSubRates(final List<SubRate> subRates);

    public static ExternalTaxRateDraft of() {
        return new ExternalTaxRateDraftImpl();
    }

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

    public static ExternalTaxRateDraftBuilder builder() {
        return ExternalTaxRateDraftBuilder.of();
    }

    public static ExternalTaxRateDraftBuilder builder(final ExternalTaxRateDraft template) {
        return ExternalTaxRateDraftBuilder.of(template);
    }

    default <T> T withExternalTaxRateDraft(Function<ExternalTaxRateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxRateDraft>";
            }
        };
    }
}
