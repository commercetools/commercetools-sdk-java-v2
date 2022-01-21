
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxCategoryDraftImpl implements TaxCategoryDraft, ModelBase {

    private String name;

    private String description;

    private java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates;

    private String key;

    @JsonCreator
    TaxCategoryDraftImpl(@JsonProperty("name") final String name, @JsonProperty("description") final String description,
            @JsonProperty("rates") final java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates,
            @JsonProperty("key") final String key) {
        this.name = name;
        this.description = description;
        this.rates = rates;
        this.key = key;
    }

    public TaxCategoryDraftImpl() {
    }

    /**
    *  <p>Name of the TaxCategory.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>Description of the TaxCategory.</p>
    */
    public String getDescription() {
        return this.description;
    }

    /**
    *  <p>Tax rates and subrates of states and countries.</p>
    */
    public java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> getRates() {
        return this.rates;
    }

    /**
    *  <p>User-defined unique identifier for the TaxCategory.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setRates(final com.commercetools.api.models.tax_category.TaxRateDraft... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
    }

    public void setRates(final java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates) {
        this.rates = rates;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxCategoryDraftImpl that = (TaxCategoryDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(rates, that.rates)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(description).append(rates).append(key).toHashCode();
    }

}
