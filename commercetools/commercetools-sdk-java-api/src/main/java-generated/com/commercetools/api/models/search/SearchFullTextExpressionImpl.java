
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
 * SearchFullTextExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFullTextExpressionImpl implements SearchFullTextExpression, ModelBase {

    private com.commercetools.api.models.search.SearchFullTextValue fullText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchFullTextExpressionImpl(
            @JsonProperty("fullText") final com.commercetools.api.models.search.SearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    /**
     * create empty instance
     */
    public SearchFullTextExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchFullTextValue getFullText() {
        return this.fullText;
    }

    public void setFullText(final com.commercetools.api.models.search.SearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchFullTextExpressionImpl that = (SearchFullTextExpressionImpl) o;

        return new EqualsBuilder().append(fullText, that.fullText).append(fullText, that.fullText).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(fullText).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("fullText", fullText).build();
    }

    @Override
    public SearchFullTextExpression copyDeep() {
        return SearchFullTextExpression.deepCopy(this);
    }
}
