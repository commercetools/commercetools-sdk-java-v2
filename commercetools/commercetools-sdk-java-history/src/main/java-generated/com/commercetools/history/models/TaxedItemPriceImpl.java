
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedItemPriceImpl implements TaxedItemPrice {

    private com.commercetools.history.models.Money totalNet;

    private com.commercetools.history.models.Money totalGross;

    @JsonCreator
    TaxedItemPriceImpl(@JsonProperty("totalNet") final com.commercetools.history.models.Money totalNet,
            @JsonProperty("totalGross") final com.commercetools.history.models.Money totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }

    public TaxedItemPriceImpl() {
    }

    public com.commercetools.history.models.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.history.models.Money getTotalGross() {
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.history.models.Money totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.history.models.Money totalGross) {
        this.totalGross = totalGross;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxedItemPriceImpl that = (TaxedItemPriceImpl) o;

        return new EqualsBuilder().append(totalNet, that.totalNet).append(totalGross, that.totalGross).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet).append(totalGross).toHashCode();
    }

}
