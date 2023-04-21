
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

/**
 * OrderSearchLongRangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchLongRangeValueImpl implements OrderSearchLongRangeValue, ModelBase {

    private String field;

    private Integer boost;

    private String customType;

    private Long gte;

    private Long lte;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchLongRangeValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final String customType, @JsonProperty("gte") final Long gte,
            @JsonProperty("lte") final Long lte) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.gte = gte;
        this.lte = lte;
    }

    /**
     * create empty instance
     */
    public OrderSearchLongRangeValueImpl() {
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
     *
     */

    public String getCustomType() {
        return this.customType;
    }

    /**
     *
     */

    public Long getGte() {
        return this.gte;
    }

    /**
     *
     */

    public Long getLte() {
        return this.lte;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Integer boost) {
        this.boost = boost;
    }

    public void setCustomType(final String customType) {
        this.customType = customType;
    }

    public void setGte(final Long gte) {
        this.gte = gte;
    }

    public void setLte(final Long lte) {
        this.lte = lte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchLongRangeValueImpl that = (OrderSearchLongRangeValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
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

}
