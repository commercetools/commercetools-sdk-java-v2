
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemTaxedPriceImpl implements CustomLineItemTaxedPrice {

    private com.commercetools.importapi.models.common.TypedMoney totalNet;

    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    @JsonCreator
    CustomLineItemTaxedPriceImpl(
            @JsonProperty("totalNet") final com.commercetools.importapi.models.common.TypedMoney totalNet,
            @JsonProperty("totalGross") final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }

    public CustomLineItemTaxedPriceImpl() {
    }

    /**
    *  <p>TypedMoney is what is called BaseMoney in the HTTP API.</p>
    */
    public com.commercetools.importapi.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    /**
    *  <p>TypedMoney is what is called BaseMoney in the HTTP API.</p>
    */
    public com.commercetools.importapi.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.importapi.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemTaxedPriceImpl that = (CustomLineItemTaxedPriceImpl) o;

        return new EqualsBuilder().append(totalNet, that.totalNet).append(totalGross, that.totalGross).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet).append(totalGross).toHashCode();
    }

}
