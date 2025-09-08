
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
 * SearchExactValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExactValueImpl implements SearchExactValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    private java.util.List<java.lang.Object> values;

    private String language;

    private Boolean caseInsensitive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchExactValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Double boost,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("value") final java.lang.Object value,
            @JsonProperty("values") final java.util.List<java.lang.Object> values,
            @JsonProperty("language") final String language,
            @JsonProperty("caseInsensitive") final Boolean caseInsensitive) {
        this.field = field;
        this.boost = boost;
        this.fieldType = fieldType;
        this.value = value;
        this.values = values;
        this.language = language;
        this.caseInsensitive = caseInsensitive;
    }

    /**
     * create empty instance
     */
    public SearchExactValueImpl() {
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
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     */

    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     *
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *
     */

    public java.util.List<java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
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

    public void setFieldType(final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setValues(final java.lang.Object... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(final java.util.List<java.lang.Object> values) {
        this.values = values;
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

        SearchExactValueImpl that = (SearchExactValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(values, that.values)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(values, that.values)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(fieldType)
                .append(value)
                .append(values)
                .append(language)
                .append(caseInsensitive)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("fieldType", fieldType)
                .append("value", value)
                .append("values", values)
                .append("language", language)
                .append("caseInsensitive", caseInsensitive)
                .build();
    }

    @Override
    public SearchExactValue copyDeep() {
        return SearchExactValue.deepCopy(this);
    }
}
