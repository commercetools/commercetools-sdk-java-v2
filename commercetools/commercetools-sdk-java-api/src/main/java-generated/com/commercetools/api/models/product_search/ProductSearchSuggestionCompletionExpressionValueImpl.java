
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
 * ProductSearchSuggestionCompletionExpressionValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionCompletionExpressionValueImpl
        implements ProductSearchSuggestionCompletionExpressionValue, ModelBase {

    private String name;

    private String field;

    private String prefix;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchSuggestionCompletionExpressionValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("field") final String field, @JsonProperty("prefix") final String prefix) {
        this.name = name;
        this.field = field;
        this.prefix = prefix;
    }

    /**
     * create empty instance
     */
    public ProductSearchSuggestionCompletionExpressionValueImpl() {
    }

    /**
     *
     */

    public String getName() {
        return this.name;
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

    public String getPrefix() {
        return this.prefix;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchSuggestionCompletionExpressionValueImpl that = (ProductSearchSuggestionCompletionExpressionValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(field, that.field)
                .append(prefix, that.prefix)
                .append(name, that.name)
                .append(field, that.field)
                .append(prefix, that.prefix)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(field).append(prefix).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("field", field)
                .append("prefix", prefix)
                .build();
    }

}
