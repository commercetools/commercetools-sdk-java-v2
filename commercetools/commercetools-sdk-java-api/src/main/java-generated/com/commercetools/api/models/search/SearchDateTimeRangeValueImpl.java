
package com.commercetools.api.models.search;

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
 * SearchDateTimeRangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDateTimeRangeValueImpl implements SearchDateTimeRangeValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.time.ZonedDateTime gte;

    private java.time.ZonedDateTime gt;

    private java.time.ZonedDateTime lte;

    private java.time.ZonedDateTime lt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchDateTimeRangeValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Double boost,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("gte") final java.time.ZonedDateTime gte,
            @JsonProperty("gt") final java.time.ZonedDateTime gt,
            @JsonProperty("lte") final java.time.ZonedDateTime lte,
            @JsonProperty("lt") final java.time.ZonedDateTime lt) {
        this.field = field;
        this.boost = boost;
        this.fieldType = fieldType;
        this.gte = gte;
        this.gt = gt;
        this.lte = lte;
        this.lt = lt;
    }

    /**
     * create empty instance
     */
    public SearchDateTimeRangeValueImpl() {
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
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     */

    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
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

    public java.time.ZonedDateTime getGt() {
        return this.gt;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getLte() {
        return this.lte;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getLt() {
        return this.lt;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Double boost) {
        this.boost = boost;
    }

    public void setFieldType(final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public void setGte(final java.time.ZonedDateTime gte) {
        this.gte = gte;
    }

    public void setGt(final java.time.ZonedDateTime gt) {
        this.gt = gt;
    }

    public void setLte(final java.time.ZonedDateTime lte) {
        this.lte = lte;
    }

    public void setLt(final java.time.ZonedDateTime lt) {
        this.lt = lt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchDateTimeRangeValueImpl that = (SearchDateTimeRangeValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(gte, that.gte)
                .append(gt, that.gt)
                .append(lte, that.lte)
                .append(lt, that.lt)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
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
                .append(fieldType)
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
                .append("fieldType", fieldType)
                .append("gte", gte)
                .append("gt", gt)
                .append("lte", lte)
                .append("lt", lt)
                .build();
    }

}
