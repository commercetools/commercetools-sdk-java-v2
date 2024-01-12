
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
 * ProductSearchAnyValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchAnyValueImpl implements ProductSearchAnyValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    private java.lang.Object value;

    private String language;

    private Boolean caseInsensitive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchAnyValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Double boost,
            @JsonProperty("attributeType") final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("language") final String language,
            @JsonProperty("caseInsensitive") final Boolean caseInsensitive) {
        this.field = field;
        this.boost = boost;
        this.attributeType = attributeType;
        this.value = value;
        this.language = language;
        this.caseInsensitive = caseInsensitive;
    }

    /**
     * create empty instance
     */
    public ProductSearchAnyValueImpl() {
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

    public Double getBoost() {
        return this.boost;
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchAttributeType getAttributeType() {
        return this.attributeType;
    }

    /**
     *
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *
     */

    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Double boost) {
        this.boost = boost;
    }

    public void setAttributeType(
            final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setLanguage(final String language) {
        this.language = language;
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

        ProductSearchAnyValueImpl that = (ProductSearchAnyValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(attributeType, that.attributeType)
                .append(value, that.value)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(attributeType, that.attributeType)
                .append(value, that.value)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(attributeType)
                .append(value)
                .append(language)
                .append(caseInsensitive)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("attributeType", attributeType)
                .append("value", value)
                .append("language", language)
                .append("caseInsensitive", caseInsensitive)
                .build();
    }

}
