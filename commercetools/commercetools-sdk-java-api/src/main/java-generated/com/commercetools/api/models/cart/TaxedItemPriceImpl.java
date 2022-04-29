
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxedItemPriceImpl implements TaxedItemPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney totalNet;

    private com.commercetools.api.models.common.TypedMoney totalGross;

    private com.commercetools.api.models.common.TypedMoney totalTax;

    @JsonCreator
    TaxedItemPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.TypedMoney totalNet,
            @JsonProperty("totalGross") final com.commercetools.api.models.common.TypedMoney totalGross,
            @JsonProperty("totalTax") final com.commercetools.api.models.common.TypedMoney totalTax) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.totalTax = totalTax;
    }

    public TaxedItemPriceImpl() {
    }

    public com.commercetools.api.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    /**
    *  <p>TaxedItemPrice fields can not be used in query predicates.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    /**
    *  <p>Platform-calculated value as subtraction of <code>totalGross</code> - <code>totalNet</code>.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getTotalTax() {
        return this.totalTax;
    }

    public void setTotalNet(final com.commercetools.api.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
    }

    public void setTotalTax(final com.commercetools.api.models.common.TypedMoney totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxedItemPriceImpl that = (TaxedItemPriceImpl) o;

        return new EqualsBuilder().append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .append(totalTax, that.totalTax)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet).append(totalGross).append(totalTax).toHashCode();
    }

}
