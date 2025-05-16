
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
 * OrderSearchStringValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchStringValueImpl implements OrderSearchStringValue, ModelBase {

    private String field;

    private Integer boost;

    private com.commercetools.api.models.order.OrderSearchCustomType customType;

    private String value;

    private String language;

    private Boolean caseInsensitive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchStringValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost,
            @JsonProperty("customType") final com.commercetools.api.models.order.OrderSearchCustomType customType,
            @JsonProperty("value") final String value, @JsonProperty("language") final String language,
            @JsonProperty("caseInsensitive") final Boolean caseInsensitive) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.value = value;
        this.language = language;
        this.caseInsensitive = caseInsensitive;
    }

    /**
     * create empty instance
     */
    public OrderSearchStringValueImpl() {
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

    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
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

    public void setCaseInsensitive(final Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchStringValueImpl that = (OrderSearchStringValueImpl) o;

        return new EqualsBuilder().append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(value, that.value)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(value, that.value)
                .append(language, that.language)
                .append(caseInsensitive, that.caseInsensitive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(field)
                .append(boost)
                .append(customType)
                .append(value)
                .append(language)
                .append(caseInsensitive)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("field", field)
                .append("boost", boost)
                .append("customType", customType)
                .append("value", value)
                .append("language", language)
                .append("caseInsensitive", caseInsensitive)
                .build();
    }

    @Override
    public OrderSearchStringValue copyDeep() {
        return OrderSearchStringValue.deepCopy(this);
    }
}
