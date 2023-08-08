
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
 * OrderSearchDateRangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchDateRangeValueImpl implements OrderSearchDateRangeValue, ModelBase {

    private String field;

    private Integer boost;

    private String customType;

    private java.time.ZonedDateTime gte;

    private java.time.ZonedDateTime lte;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchDateRangeValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final String customType, @JsonProperty("gte") final java.time.ZonedDateTime gte,
            @JsonProperty("lte") final java.time.ZonedDateTime lte) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.gte = gte;
        this.lte = lte;
    }

    /**
     * create empty instance
     */
    public OrderSearchDateRangeValueImpl() {
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

    public java.time.ZonedDateTime getGte() {
        return this.gte;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getLte() {
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

    public void setGte(final java.time.ZonedDateTime gte) {
        this.gte = gte;
    }

    public void setLte(final java.time.ZonedDateTime lte) {
        this.lte = lte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchDateRangeValueImpl that = (OrderSearchDateRangeValueImpl) o;

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

}
