
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
 * SearchFuzzyExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFuzzyExpressionImpl implements SearchFuzzyExpression, ModelBase {

    private com.commercetools.api.models.search.SearchFuzzyValue fuzzy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchFuzzyExpressionImpl(@JsonProperty("fuzzy") final com.commercetools.api.models.search.SearchFuzzyValue fuzzy) {
        this.fuzzy = fuzzy;
    }

    /**
     * create empty instance
     */
    public SearchFuzzyExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchFuzzyValue getFuzzy() {
        return this.fuzzy;
    }

    public void setFuzzy(final com.commercetools.api.models.search.SearchFuzzyValue fuzzy) {
        this.fuzzy = fuzzy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchFuzzyExpressionImpl that = (SearchFuzzyExpressionImpl) o;

        return new EqualsBuilder().append(fuzzy, that.fuzzy).append(fuzzy, that.fuzzy).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(fuzzy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("fuzzy", fuzzy).build();
    }

    @Override
    public SearchFuzzyExpression copyDeep() {
        return SearchFuzzyExpression.deepCopy(this);
    }
}
