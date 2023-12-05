
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
 * OrderSearchSorting
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchSortingImpl implements OrderSearchSorting, ModelBase {

    private String field;

    private String language;

    private com.commercetools.api.models.order.OrderSearchSortOrder order;

    private com.commercetools.api.models.order.OrderSearchSortMode mode;

    private com.commercetools.api.models.order.OrderSearchQueryExpression filter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchSortingImpl(@JsonProperty("field") final String field, @JsonProperty("language") final String language,
            @JsonProperty("order") final com.commercetools.api.models.order.OrderSearchSortOrder order,
            @JsonProperty("mode") final com.commercetools.api.models.order.OrderSearchSortMode mode,
            @JsonProperty("filter") final com.commercetools.api.models.order.OrderSearchQueryExpression filter) {
        this.field = field;
        this.language = language;
        this.order = order;
        this.mode = mode;
        this.filter = filter;
    }

    /**
     * create empty instance
     */
    public OrderSearchSortingImpl() {
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

    public String getLanguage() {
        return this.language;
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchSortOrder getOrder() {
        return this.order;
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchSortMode getMode() {
        return this.mode;
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchQueryExpression getFilter() {
        return this.filter;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setOrder(final com.commercetools.api.models.order.OrderSearchSortOrder order) {
        this.order = order;
    }

    public void setMode(final com.commercetools.api.models.order.OrderSearchSortMode mode) {
        this.mode = mode;
    }

    public void setFilter(final com.commercetools.api.models.order.OrderSearchQueryExpression filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchSortingImpl that = (OrderSearchSortingImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(filter, that.filter)
                .append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(filter, that.filter)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(language)
                .append(order)
                .append(mode)
                .append(filter)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("language", language)
                .append("order", order)
                .append("mode", mode)
                .append("filter", filter)
                .build();
    }

}
