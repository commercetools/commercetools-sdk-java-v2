
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

/**
 * OrderSearchFullTextValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchFullTextValueImpl implements OrderSearchFullTextValue, ModelBase {

    private String field;

    private Integer boost;

    private String customType;

    private String value;

    private String language;

    private com.commercetools.api.models.order.OrderSearchMatchType mustMatch;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchFullTextValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final String customType, @JsonProperty("value") final String value,
            @JsonProperty("language") final String language,
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
     *
     */

    public String getCustomType() {
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

    public void setCustomType(final String customType) {
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

}
