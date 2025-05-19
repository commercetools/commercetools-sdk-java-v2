
package com.commercetools.history.models.common;

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
 * TaxedItemPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedItemPriceImpl implements TaxedItemPrice, ModelBase {

    private com.commercetools.history.models.common.Money totalNet;

    private com.commercetools.history.models.common.Money totalGross;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxedItemPriceImpl(@JsonProperty("totalNet") final com.commercetools.history.models.common.Money totalNet,
            @JsonProperty("totalGross") final com.commercetools.history.models.common.Money totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }

    /**
     * create empty instance
     */
    public TaxedItemPriceImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.history.models.common.Money totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.history.models.common.Money totalGross) {
        this.totalGross = totalGross;
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
    public TaxedItemPrice copyDeep() {
        return TaxedItemPrice.deepCopy(this);
    }
}
