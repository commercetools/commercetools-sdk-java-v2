
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
 * ProductSearchFacetDistinctStartsWith
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctStartsWithImpl implements ProductSearchFacetDistinctStartsWith, ModelBase {

    private String value;

    private Boolean caseInsensitive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetDistinctStartsWithImpl(@JsonProperty("value") final String value,
            @JsonProperty("caseInsensitive") final Boolean caseInsensitive) {
        this.value = value;
        this.caseInsensitive = caseInsensitive;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetDistinctStartsWithImpl() {
    }

    /**
     *  <p>Text to match against the start of the target value.</p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, the <code>value</code> is not case sensitive.</p>
     */

    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void setCaseInsensitive(final Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetDistinctStartsWithImpl that = (ProductSearchFacetDistinctStartsWithImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(caseInsensitive, that.caseInsensitive)
                .append(value, that.value)
                .append(caseInsensitive, that.caseInsensitive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(caseInsensitive).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("caseInsensitive", caseInsensitive)
                .build();
    }

}
