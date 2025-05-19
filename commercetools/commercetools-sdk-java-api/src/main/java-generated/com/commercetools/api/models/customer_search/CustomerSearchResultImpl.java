
package com.commercetools.api.models.customer_search;

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
 * CustomerSearchResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSearchResultImpl implements CustomerSearchResult, ModelBase {

    private String id;

    private Double relevance;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSearchResultImpl(@JsonProperty("id") final String id, @JsonProperty("relevance") final Double relevance) {
        this.id = id;
        this.relevance = relevance;
    }

    /**
     * create empty instance
     */
    public CustomerSearchResultImpl() {
    }

    /**
     *  <p><code>id</code> of the Customer matching the search query.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>How closely this customer matches the search query.</p>
     */

    public Double getRelevance() {
        return this.relevance;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setRelevance(final Double relevance) {
        this.relevance = relevance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSearchResultImpl that = (CustomerSearchResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(relevance, that.relevance)
                .append(id, that.id)
                .append(relevance, that.relevance)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(relevance).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("relevance", relevance)
                .build();
    }

    @Override
    public CustomerSearchResult copyDeep() {
        return CustomerSearchResult.deepCopy(this);
    }
}
