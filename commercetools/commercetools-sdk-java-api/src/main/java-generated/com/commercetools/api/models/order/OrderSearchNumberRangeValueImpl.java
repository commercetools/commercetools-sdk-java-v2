
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
 * OrderSearchNumberRangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchNumberRangeValueImpl implements OrderSearchNumberRangeValue, ModelBase {

    private String field;

    private Integer boost;

    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    private Double gte;

    private Double lte;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchNumberRangeValueImpl(@JsonProperty("field") final String field,
            @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final com.commercetools.api.models.order.OrderSearchCustomType customType,
            @JsonProperty("gte") final Double gte, @JsonProperty("lte") final Double lte) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.gte = gte;
        this.lte = lte;
    }

    /**
     * create empty instance
     */
    public OrderSearchNumberRangeValueImpl() {
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
     *  <p>Possible values for the <code>customType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     */

    public com.commercetools.api.models.order.OrderSearchCustomType getCustomType() {
        return this.customType;
    }

    /**
     *
     */

    public Double getGte() {
        return this.gte;
    }

    /**
     *
     */

    public Double getLte() {
        return this.lte;
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

    public void setGte(final Double gte) {
        this.gte = gte;
    }

    public void setLte(final Double lte) {
        this.lte = lte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchNumberRangeValueImpl that = (OrderSearchNumberRangeValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(gte, that.gte)
                .append(lte, that.lte)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(gte, that.gte)
                .append(lte, that.lte)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(customType)
                .append(gte)
                .append(lte)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("customType", customType)
                .append("gte", gte)
                .append("lte", lte)
                .build();
    }

    @Override
    public OrderSearchNumberRangeValue copyDeep() {
        return OrderSearchNumberRangeValue.deepCopy(this);
    }
}
