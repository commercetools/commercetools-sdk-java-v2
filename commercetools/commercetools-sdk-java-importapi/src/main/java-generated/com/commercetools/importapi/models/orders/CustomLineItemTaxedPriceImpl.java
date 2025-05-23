
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CustomLineItemTaxedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemTaxedPriceImpl implements CustomLineItemTaxedPrice, ModelBase {

    private com.commercetools.importapi.models.common.TypedMoney totalNet;

    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemTaxedPriceImpl(
            @JsonProperty("totalNet") final com.commercetools.importapi.models.common.TypedMoney totalNet,
            @JsonProperty("totalGross") final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }

    /**
     * create empty instance
     */
    public CustomLineItemTaxedPriceImpl() {
    }

    /**
     *
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    /**
     *
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

        return new EqualsBuilder().append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet).append(totalGross).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("totalNet", totalNet)
                .append("totalGross", totalGross)
                .build();
    }

    @Override
    public CustomLineItemTaxedPrice copyDeep() {
        return CustomLineItemTaxedPrice.deepCopy(this);
    }
}
