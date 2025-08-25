
package com.commercetools.api.models.type;

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
 *  <p>Defines an allowed value of a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">CustomFieldLocalizedEnumType</a> field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldLocalizedEnumValueImpl implements CustomFieldLocalizedEnumValue, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldLocalizedEnumValueImpl(@JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
    }

    /**
     * create empty instance
     */
    public CustomFieldLocalizedEnumValueImpl() {
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

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldLocalizedEnumValueImpl that = (CustomFieldLocalizedEnumValueImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(label, that.label)
                .append(key, that.key)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("label", label)
                .build();
    }

    @Override
    public CustomFieldLocalizedEnumValue copyDeep() {
        return CustomFieldLocalizedEnumValue.deepCopy(this);
    }
}
