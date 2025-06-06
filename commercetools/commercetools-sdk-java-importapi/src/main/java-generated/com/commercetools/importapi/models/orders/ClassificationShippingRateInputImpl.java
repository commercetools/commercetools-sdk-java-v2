
package com.commercetools.importapi.models.orders;

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
 * ClassificationShippingRateInput
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClassificationShippingRateInputImpl implements ClassificationShippingRateInput, ModelBase {

    private com.commercetools.importapi.models.orders.ShippingRateInputType type;

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ClassificationShippingRateInputImpl(@JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
        this.type = ShippingRateInputType.findEnum("Classification");
    }

    /**
     * create empty instance
     */
    public ClassificationShippingRateInputImpl() {
        this.type = ShippingRateInputType.findEnum("Classification");
    }

    /**
     *
     */

    public com.commercetools.importapi.models.orders.ShippingRateInputType getType() {
        return this.type;
    }

    /**
     *
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ClassificationShippingRateInputImpl that = (ClassificationShippingRateInputImpl) o;

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

    @Override
    public ClassificationShippingRateInput copyDeep() {
        return ClassificationShippingRateInput.deepCopy(this);
    }
}
