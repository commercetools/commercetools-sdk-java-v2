
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
 * ProductSearchLongRangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchLongRangeValueImpl implements ProductSearchLongRangeValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    private Long gte;

    private Long gt;

    private Long lte;

    private Long lt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchLongRangeValueImpl(@JsonProperty("field") final String field,
            @JsonProperty("boost") final Double boost,
            @JsonProperty("attributeType") final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType,
            @JsonProperty("gte") final Long gte, @JsonProperty("gt") final Long gt, @JsonProperty("lte") final Long lte,
            @JsonProperty("lt") final Long lt) {
        this.field = field;
        this.boost = boost;
        this.attributeType = attributeType;
        this.gte = gte;
        this.gt = gt;
        this.lte = lte;
        this.lt = lt;
    }

    /**
     * create empty instance
     */
    public ProductSearchLongRangeValueImpl() {
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

    public Double getBoost() {
        return this.boost;
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchAttributeType getAttributeType() {
        return this.attributeType;
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

    public Long getGt() {
        return this.gt;
    }

    /**
     *
     */

    public Long getLte() {
        return this.lte;
    }

    /**
     *
     */

    public Long getLt() {
        return this.lt;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Double boost) {
        this.boost = boost;
    }

    public void setAttributeType(
            final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public void setGte(final Long gte) {
        this.gte = gte;
    }

    public void setGt(final Long gt) {
        this.gt = gt;
    }

    public void setLte(final Long lte) {
        this.lte = lte;
    }

    public void setLt(final Long lt) {
        this.lt = lt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchLongRangeValueImpl that = (ProductSearchLongRangeValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(attributeType, that.attributeType)
                .append(gte, that.gte)
                .append(gt, that.gt)
                .append(lte, that.lte)
                .append(lt, that.lt)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(attributeType, that.attributeType)
                .append(gte, that.gte)
                .append(gt, that.gt)
                .append(lte, that.lte)
                .append(lt, that.lt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(attributeType)
                .append(gte)
                .append(gt)
                .append(lte)
                .append(lt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("attributeType", attributeType)
                .append("gte", gte)
                .append("gt", gt)
                .append("lte", lte)
                .append("lt", lt)
                .build();
    }

}
