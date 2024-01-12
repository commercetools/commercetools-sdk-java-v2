
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
 * ProductSearchFullTextExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFullTextExpressionImpl implements ProductSearchFullTextExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFullTextValue fullText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFullTextExpressionImpl(
            @JsonProperty("fullText") final com.commercetools.api.models.product_search.ProductSearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    /**
     * create empty instance
     */
    public ProductSearchFullTextExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchFullTextValue getFullText() {
        return this.fullText;
    }

    public void setFullText(final com.commercetools.api.models.product_search.ProductSearchFullTextValue fullText) {
        this.fullText = fullText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFullTextExpressionImpl that = (ProductSearchFullTextExpressionImpl) o;

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

}
