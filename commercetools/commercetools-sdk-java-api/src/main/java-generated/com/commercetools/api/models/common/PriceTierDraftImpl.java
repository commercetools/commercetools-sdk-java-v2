
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Specifies a Price tier that applies when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceTierDraftImpl implements PriceTierDraft, ModelBase {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.Money value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceTierDraftImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity,
            @JsonProperty("value") final com.commercetools.api.models.common.Money value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }

    /**
     * create empty instance
     */
    public PriceTierDraftImpl() {
    }

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1. A Price or StandalonePrice cannot contain more than one tier with the same <code>minimumQuantity</code>. In the case one of the constraint is not met an InvalidField is returned.</p>
     */

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>. To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
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

        return new EqualsBuilder().append(minimumQuantity, that.minimumQuantity)
                .append(value, that.value)
                .append(minimumQuantity, that.minimumQuantity)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(minimumQuantity).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("minimumQuantity", minimumQuantity)
                .append("value", value)
                .build();
    }

}
