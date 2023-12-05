
package com.commercetools.history.models.change_value;

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
 * SetCartClassificationShippingRateInputValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCartClassificationShippingRateInputValueImpl
        implements SetCartClassificationShippingRateInputValue, ModelBase {

    private String type;

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCartClassificationShippingRateInputValueImpl(@JsonProperty("type") final String type,
            @JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.type = type;
        this.key = key;
        this.label = label;
    }

    /**
     * create empty instance
     */
    public SetCartClassificationShippingRateInputValueImpl() {
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Descriptive localized label of the value.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCartClassificationShippingRateInputValueImpl that = (SetCartClassificationShippingRateInputValueImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(label, that.label)
                .append(type, that.type)
                .append(key, that.key)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("label", label)
                .build();
    }

}
