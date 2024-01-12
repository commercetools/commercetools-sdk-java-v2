
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
 * ProductSearchSuggestionCompletionExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionCompletionExpressionImpl
        implements ProductSearchSuggestionCompletionExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue completion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchSuggestionCompletionExpressionImpl(
            @JsonProperty("completion") final com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue completion) {
        this.completion = completion;
    }

    /**
     * create empty instance
     */
    public ProductSearchSuggestionCompletionExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue getCompletion() {
        return this.completion;
    }

    public void setCompletion(
            final com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue completion) {
        this.completion = completion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchSuggestionCompletionExpressionImpl that = (ProductSearchSuggestionCompletionExpressionImpl) o;

        return new EqualsBuilder().append(completion, that.completion).append(completion, that.completion).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(completion).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("completion", completion).build();
    }

}
