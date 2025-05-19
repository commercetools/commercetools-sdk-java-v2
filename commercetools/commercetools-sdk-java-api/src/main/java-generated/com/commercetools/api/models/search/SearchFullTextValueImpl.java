
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
 * SearchFullTextValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFullTextValueImpl implements SearchFullTextValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    private String language;

    private com.commercetools.api.models.search.SearchMatchType mustMatch;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchFullTextValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Double boost,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("language") final String language,
            @JsonProperty("mustMatch") final com.commercetools.api.models.search.SearchMatchType mustMatch) {
        this.field = field;
        this.boost = boost;
        this.fieldType = fieldType;
        this.value = value;
        this.language = language;
        this.mustMatch = mustMatch;
    }

    /**
     * create empty instance
     */
    public SearchFullTextValueImpl() {
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
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
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
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchMatchType getMustMatch() {
        return this.mustMatch;
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

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setMustMatch(final com.commercetools.api.models.search.SearchMatchType mustMatch) {
        this.mustMatch = mustMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchFullTextValueImpl that = (SearchFullTextValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(language, that.language)
                .append(mustMatch, that.mustMatch)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(language, that.language)
                .append(mustMatch, that.mustMatch)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(fieldType)
                .append(value)
                .append(language)
                .append(mustMatch)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("fieldType", fieldType)
                .append("value", value)
                .append("language", language)
                .append("mustMatch", mustMatch)
                .build();
    }

    @Override
    public SearchFullTextValue copyDeep() {
        return SearchFullTextValue.deepCopy(this);
    }
}
