
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Represents the portions that sum up to the <code>totalGross</code> field of a TaxedPrice.</p>
 *  <p>The portions are calculated from the TaxRates. If a Tax Rate has SubRates, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> will be accumulated to the same tax portion.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionDraftImpl implements TaxPortionDraft, ModelBase {

    private String name;

    private Double rate;

    private com.commercetools.api.models.common.Money amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxPortionDraftImpl(@JsonProperty("name") final String name, @JsonProperty("rate") final Double rate,
            @JsonProperty("amount") final com.commercetools.api.models.common.Money amount) {
        this.name = name;
        this.rate = rate;
        this.amount = amount;
    }

    /**
     * create empty instance
     */
    public TaxPortionDraftImpl() {
    }

    /**
     *  <p>Name of the tax portion.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>A number in the range 0-1.</p>
     */

    public Double getRate() {
        return this.rate;
    }

    /**
     *  <p>Money value for the tax portion.</p>
     */

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRate(final Double rate) {
        this.rate = rate;
    }

    public void setAmount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxPortionDraftImpl that = (TaxPortionDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(rate, that.rate)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(rate).append(amount).toHashCode();
    }

}
