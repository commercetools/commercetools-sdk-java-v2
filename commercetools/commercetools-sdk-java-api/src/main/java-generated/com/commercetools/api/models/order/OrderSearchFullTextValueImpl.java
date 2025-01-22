
package com.commercetools.api.models.order;

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
 * OrderSearchFullTextValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchFullTextValueImpl implements OrderSearchFullTextValue, ModelBase {

    private String field;

    private Integer boost;

    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    private String value;

    private String language;

    private com.commercetools.api.models.order.OrderSearchMatchType mustMatch;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchFullTextValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final com.commercetools.api.models.order.OrderSearchCustomType customType,
            @JsonProperty("value") final String value, @JsonProperty("language") final String language,
            @JsonProperty("mustMatch") final com.commercetools.api.models.order.OrderSearchMatchType mustMatch) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.value = value;
        this.language = language;
        this.mustMatch = mustMatch;
    }

    /**
     * create empty instance
     */
    public OrderSearchFullTextValueImpl() {
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

    public Integer getBoost() {
        return this.boost;
    }

    /**
     *  <p>Possible values for the <code>customType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     */

    public com.commercetools.api.models.order.OrderSearchCustomType getCustomType() {
        return this.customType;
    }

    /**
     *
     */

    public String getValue() {
        return this.value;
    }

    /**
     *
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchMatchType getMustMatch() {
        return this.mustMatch;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setBoost(final Integer boost) {
        this.boost = boost;
    }

    public void setCustomType(final com.commercetools.api.models.order.OrderSearchCustomType customType) {
        this.customType = customType;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setMustMatch(final com.commercetools.api.models.order.OrderSearchMatchType mustMatch) {
        this.mustMatch = mustMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchFullTextValueImpl that = (OrderSearchFullTextValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(value, that.value)
                .append(language, that.language)
                .append(mustMatch, that.mustMatch)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(value, that.value)
                .append(language, that.language)
                .append(mustMatch, that.mustMatch)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(customType)
                .append(value)
                .append(language)
                .append(mustMatch)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("customType", customType)
                .append("value", value)
                .append("language", language)
                .append("mustMatch", mustMatch)
                .build();
    }

}
