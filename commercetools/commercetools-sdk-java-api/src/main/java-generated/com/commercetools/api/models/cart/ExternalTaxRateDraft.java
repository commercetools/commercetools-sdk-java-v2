
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft {

    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Percentage in the range of [0..1].
    *  Must be supplied if no <code>subRates</code> are specified.
    *  If <code>subRates</code> are specified
    *  then the <code>amount</code> can be omitted or it must be the sum of the amounts of all <code>subRates</code>.</p>
    */

    @JsonProperty("amount")
    public Double getAmount();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>The state in the country</p>
    */

    @JsonProperty("state")
    public String getState();

    /**
    *  <p>For countries (e.g.
    *  the US) where the total tax is a combination of multiple taxes (e.g.
    *  state and local taxes).</p>
    */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
    *  <p>The default value for <code>includedInPrice</code> is FALSE.</p>
    */

    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    public void setName(final String name);

    public void setAmount(final Double amount);

    public void setCountry(final String country);

    public void setState(final String state);

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    public void setSubRates(final List<SubRate> subRates);

    public void setIncludedInPrice(final Boolean includedInPrice);

    public static ExternalTaxRateDraft of() {
        return new ExternalTaxRateDraftImpl();
    }

    public static ExternalTaxRateDraft of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        instance.setIncludedInPrice(template.getIncludedInPrice());
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
}
