
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
 *  <pre><code>{
 *    "de": "Hundefutter",
 *    "en": "dog food"
 *  }
 *  </code></pre>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedStringImpl implements LocalizedString, ModelBase {

    private Map<String, String> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocalizedStringImpl(@JsonAnySetter @JsonProperty("values") final Map<String, String> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public LocalizedStringImpl() {
    }

    /**
     *
     */

    public Map<String, String> values() {
        return values;
    }

    public void setValue(String key, String value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LocalizedStringImpl that = (LocalizedStringImpl) o;

        return new EqualsBuilder().append(values, that.values).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("values", values).build();
    }

    @Override
    public LocalizedString copyDeep() {
        return LocalizedString.deepCopy(this);
    }
}
