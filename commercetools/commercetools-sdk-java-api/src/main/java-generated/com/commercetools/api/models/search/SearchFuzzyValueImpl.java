
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
 * SearchFuzzyValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFuzzyValueImpl implements SearchFuzzyValue, ModelBase {

    private String field;

    private Double boost;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    private Integer level;

    private String language;

    private com.commercetools.api.models.search.SearchMatchType mustMatch;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchFuzzyValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Double boost,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("level") final Integer level,
            @JsonProperty("language") final String language,
            @JsonProperty("mustMatch") final com.commercetools.api.models.search.SearchMatchType mustMatch) {
        this.field = field;
        this.boost = boost;
        this.fieldType = fieldType;
        this.value = value;
        this.level = level;
        this.language = language;
        this.mustMatch = mustMatch;
    }

    /**
     * create empty instance
     */
    public SearchFuzzyValueImpl() {
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
     *  <p>The search term to find fuzzy matches for. If multiple terms are provided (separated by whitespace), the fuzziness level is applied to each term individually.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>The maximum fuzziness level desired for the search term. Allowed values are <code>0</code>, <code>1</code>, and <code>2</code>. The API automatically adjusts the effective fuzziness level based on the length of the search term if it exceeds the maximum allowed for the given string length according to the following rules:</p>
     *  <ul>
     *   <li>Terms with 1-2 characters: 0 (exact match)</li>
     *   <li>Terms with 3-5 characters: 1 (up to one difference is allowed)</li>
     *   <li>Terms with more than 5 characters: 2 (up to two differences are allowed)</li>
     *  </ul>
     */

    public Integer getLevel() {
        return this.level;
    }

    /**
     *  <p>Language of the localized value. Must be provided when the field is of type <code>localizedTextField</code>. The provided Locale must be one of the Project's languages.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>Controls whether all of the provided terms must match (<code>all</code>, default) or any of those (<code>any</code>).</p>
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

    public void setLevel(final Integer level) {
        this.level = level;
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

        SearchFuzzyValueImpl that = (SearchFuzzyValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(level, that.level)
                .append(language, that.language)
                .append(mustMatch, that.mustMatch)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(fieldType, that.fieldType)
                .append(value, that.value)
                .append(level, that.level)
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
                .append(level)
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
                .append("level", level)
                .append("language", language)
                .append("mustMatch", mustMatch)
                .build();
    }

    @Override
    public SearchFuzzyValue copyDeep() {
        return SearchFuzzyValue.deepCopy(this);
    }
}
