
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

/**
 *  <p>A Price tier is selected instead of the default Price when a certain quantity of the ProductVariant is added to a Cart and ordered. <em>For example: the Price can be lower if more than 10 items are ordered.</em> If no Price tier is found for the Order quantity, the base Price is used. A Price tier is applied for the entire quantity of a Product Variant put as LineItem in a Cart as soon as the minimum quantity for the Price tier is reached. The Price tier is applied per Line Item of the Product Variant. If, for example, the same Product Variant appears in the same Cart as several Line Items, (what can be achieved by different values of a Custom Field on the Line Items) for each Line Item the minimum quantity must be reached to get the Price tier.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceTierImpl implements PriceTier, ModelBase {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.TypedMoney value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceTierImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity,
            @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }

    /**
     * create empty instance
     */
    public PriceTierImpl() {
    }

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     */

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public void setMinimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceTierImpl that = (PriceTierImpl) o;

        return new EqualsBuilder().append(minimumQuantity, that.minimumQuantity).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(minimumQuantity).append(value).toHashCode();
    }

}
