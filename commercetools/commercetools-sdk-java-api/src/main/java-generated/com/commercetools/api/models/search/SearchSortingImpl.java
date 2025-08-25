
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
 *  <p>Sorting parameters provided with a Search request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchSortingImpl implements SearchSorting, ModelBase {

    private String field;

    private String language;

    private com.commercetools.api.models.search.SearchSortOrder order;

    private com.commercetools.api.models.search.SearchSortMode mode;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private com.commercetools.api.models.search.SearchQuery filter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchSortingImpl(@JsonProperty("field") final String field, @JsonProperty("language") final String language,
            @JsonProperty("order") final com.commercetools.api.models.search.SearchSortOrder order,
            @JsonProperty("mode") final com.commercetools.api.models.search.SearchSortMode mode,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("filter") final com.commercetools.api.models.search.SearchQuery filter) {
        this.field = field;
        this.language = language;
        this.order = order;
        this.mode = mode;
        this.fieldType = fieldType;
        this.filter = filter;
    }

    /**
     * create empty instance
     */
    public SearchSortingImpl() {
    }

    /**
     *  <p>Use any searchable field of the resource as sort criterion, or <code>"score"</code> to sort by relevance score calculated by the API.</p>
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>Specify the order in which the search results should be sorted. Can be <code>asc</code> for ascending, or <code>desc</code> for descending order.</p>
     */

    public com.commercetools.api.models.search.SearchSortOrder getOrder() {
        return this.order;
    }

    /**
     *  <p>Specify the sort mode to be applied for a set-type <code>field</code>.</p>
     */

    public com.commercetools.api.models.search.SearchSortMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Provide the data type of the given <code>field</code>.</p>
     */

    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     *  <p>Allows you to apply a <span>sort filter</span>.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getFilter() {
        return this.filter;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setOrder(final com.commercetools.api.models.search.SearchSortOrder order) {
        this.order = order;
    }

    public void setMode(final com.commercetools.api.models.search.SearchSortMode mode) {
        this.mode = mode;
    }

    public void setFieldType(final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public void setFilter(final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchSortingImpl that = (SearchSortingImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(fieldType, that.fieldType)
                .append(filter, that.filter)
                .append(field, that.field)
                .append(language, that.language)
                .append(order, that.order)
                .append(mode, that.mode)
                .append(fieldType, that.fieldType)
                .append(filter, that.filter)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(language)
                .append(order)
                .append(mode)
                .append(fieldType)
                .append(filter)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("language", language)
                .append("order", order)
                .append("mode", mode)
                .append("fieldType", fieldType)
                .append("filter", filter)
                .build();
    }

    @Override
    public SearchSorting copyDeep() {
        return SearchSorting.deepCopy(this);
    }
}
