
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
 * SearchWildCardExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchWildCardExpressionImpl implements SearchWildCardExpression, ModelBase {

    private com.commercetools.api.models.search.SearchAnyValue wildcard;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchWildCardExpressionImpl(
            @JsonProperty("wildcard") final com.commercetools.api.models.search.SearchAnyValue wildcard) {
        this.wildcard = wildcard;
    }

    /**
     * create empty instance
     */
    public SearchWildCardExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchAnyValue getWildcard() {
        return this.wildcard;
    }

    public void setWildcard(final com.commercetools.api.models.search.SearchAnyValue wildcard) {
        this.wildcard = wildcard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchWildCardExpressionImpl that = (SearchWildCardExpressionImpl) o;

        return new EqualsBuilder().append(wildcard, that.wildcard).append(wildcard, that.wildcard).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(wildcard).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("wildcard", wildcard).build();
    }

    @Override
    public SearchWildCardExpression copyDeep() {
        return SearchWildCardExpression.deepCopy(this);
    }
}
