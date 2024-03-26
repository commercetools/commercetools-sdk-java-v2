
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
 * ProductSearchFacetResultCount
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultCountImpl implements ProductSearchFacetResultCount, ModelBase {

    private String name;

    private Long value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetResultCountImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final Long value) {
        this.name = name;
        this.value = value;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetResultCountImpl() {
    }

    /**
     *  <p>Name of the facet.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Number of Products (or Product Variants) matching the query.</p>
     */

    public Long getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final Long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetResultCountImpl that = (ProductSearchFacetResultCountImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(value, that.value)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("value", value)
                .build();
    }

}
