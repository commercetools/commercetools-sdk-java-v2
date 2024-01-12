
package com.commercetools.api.models.product_search;

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
 * ProductSearchDateRangeExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchDateRangeExpressionImpl implements ProductSearchDateRangeExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchDateRangeValue range;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchDateRangeExpressionImpl(
            @JsonProperty("range") final com.commercetools.api.models.product_search.ProductSearchDateRangeValue range) {
        this.range = range;
    }

    /**
     * create empty instance
     */
    public ProductSearchDateRangeExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchDateRangeValue getRange() {
        return this.range;
    }

    public void setRange(final com.commercetools.api.models.product_search.ProductSearchDateRangeValue range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchDateRangeExpressionImpl that = (ProductSearchDateRangeExpressionImpl) o;

        return new EqualsBuilder().append(range, that.range).append(range, that.range).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(range).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("range", range).build();
    }

}
