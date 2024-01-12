
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
 * ProductSearchSorting
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSortingImpl implements ProductSearchSorting, ModelBase {

    private String field;

    private String language;

    private com.commercetools.api.models.product_search.ProductSearchSortOrder order;

    private com.commercetools.api.models.product_search.ProductSearchSortMode mode;

    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    private com.commercetools.api.models.product_search.ProductSearchQueryExpression filter;

    private Boolean internal;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchSortingImpl(@JsonProperty("field") final String field, @JsonProperty("language") final String language,
            @JsonProperty("order") final com.commercetools.api.models.product_search.ProductSearchSortOrder order,
            @JsonProperty("mode") final com.commercetools.api.models.product_search.ProductSearchSortMode mode,
            @JsonProperty("attributeType") final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType,
            @JsonProperty("filter") final com.commercetools.api.models.product_search.ProductSearchQueryExpression filter,
            @JsonProperty("internal") final Boolean internal) {
        this.field = field;
        this.language = language;
        this.order = order;
        this.mode = mode;
        this.attributeType = attributeType;
        this.filter = filter;
        this.internal = internal;
    }

    /**
     * create empty instance
     */
    public ProductSearchSortingImpl() {
    }

    /**
     *
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchSortOrder getOrder() {
        return this.order;
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchSortMode getMode() {
        return this.mode;
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

    public com.commercetools.api.models.product_search.ProductSearchQueryExpression getFilter() {
        return this.filter;
    }

    /**
     *
     */

    public Boolean getInternal() {
        return this.internal;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setOrder(final com.commercetools.api.models.product_search.ProductSearchSortOrder order) {
        this.order = order;
    }

    public void setMode(final com.commercetools.api.models.product_search.ProductSearchSortMode mode) {
        this.mode = mode;
    }

    public void setAttributeType(
            final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public void setFilter(final com.commercetools.api.models.product_search.ProductSearchQueryExpression filter) {
        this.filter = filter;
    }

    public void setInternal(final Boolean internal) {
        this.internal = internal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchSortingImpl that = (ProductSearchSortingImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(attributeType, that.attributeType)
                .append(filter, that.filter)
                .append(internal, that.internal)
                .append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(attributeType, that.attributeType)
                .append(filter, that.filter)
                .append(internal, that.internal)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(language)
                .append(order)
                .append(mode)
                .append(attributeType)
                .append(filter)
                .append(internal)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("language", language)
                .append("order", order)
                .append("mode", mode)
                .append("attributeType", attributeType)
                .append("filter", filter)
                .append("internal", internal)
                .build();
    }

}
