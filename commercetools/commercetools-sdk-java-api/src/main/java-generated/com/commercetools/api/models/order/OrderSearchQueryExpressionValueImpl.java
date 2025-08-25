
package com.commercetools.api.models.order;

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
 * OrderSearchQueryExpressionValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchQueryExpressionValueImpl implements OrderSearchQueryExpressionValue, ModelBase {

    private String field;

    private Integer boost;

    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchQueryExpressionValueImpl(@JsonProperty("field") final String field,
            @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
    }

    /**
     * create empty instance
     */
    public OrderSearchQueryExpressionValueImpl() {
    }

    /**
     *
     */

    public String getField() {
        return this.field;
    }

    /**
     *
     */

    public Integer getBoost() {
        return this.boost;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     */

    public com.commercetools.api.models.order.OrderSearchCustomType getCustomType() {
        return this.customType;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Integer boost) {
        this.boost = boost;
    }

    public void setCustomType(final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.customType = customType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchQueryExpressionValueImpl that = (OrderSearchQueryExpressionValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field).append(boost).append(customType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("customType", customType)
                .build();
    }

    @Override
    public OrderSearchQueryExpressionValue copyDeep() {
        return OrderSearchQueryExpressionValue.deepCopy(this);
    }
}
