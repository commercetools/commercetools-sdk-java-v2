
package com.commercetools.api.models.common;

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
public class PriceTierDraftImpl implements PriceTierDraft, ModelBase {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.Money value;

    @JsonCreator
    PriceTierDraftImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity,
            @JsonProperty("value") final com.commercetools.api.models.common.Money value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }

    public PriceTierDraftImpl() {
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public void setMinimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceTierDraftImpl that = (PriceTierDraftImpl) o;

        return new EqualsBuilder().append(minimumQuantity, that.minimumQuantity).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(minimumQuantity).append(value).toHashCode();
    }

}
