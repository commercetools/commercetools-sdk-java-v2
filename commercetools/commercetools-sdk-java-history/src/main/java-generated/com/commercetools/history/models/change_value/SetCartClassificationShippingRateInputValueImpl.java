
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the cart classification shipping input rate value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCartClassificationShippingRateInputValueImpl
        implements SetCartClassificationShippingRateInputValue {

    private String type;

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    @JsonCreator
    SetCartClassificationShippingRateInputValueImpl(@JsonProperty("type") final String type,
            @JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.type = type;
        this.key = key;
        this.label = label;
    }

    public SetCartClassificationShippingRateInputValueImpl() {
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

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

        return new EqualsBuilder().append(type, that.type).append(key, that.key).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(label).toHashCode();
    }

}
