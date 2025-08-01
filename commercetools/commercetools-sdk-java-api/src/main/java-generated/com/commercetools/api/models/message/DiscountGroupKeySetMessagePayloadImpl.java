
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Key update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupKeySetMessagePayloadImpl implements DiscountGroupKeySetMessagePayload, ModelBase {

    private String type;

    private String key;

    private String oldKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupKeySetMessagePayloadImpl(@JsonProperty("key") final String key,
            @JsonProperty("oldKey") final String oldKey) {
        this.key = key;
        this.oldKey = oldKey;
        this.type = DISCOUNT_GROUP_KEY_SET;
    }

    /**
     * create empty instance
     */
    public DiscountGroupKeySetMessagePayloadImpl() {
        this.type = DISCOUNT_GROUP_KEY_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>key</code> value of the DiscountGroup after the Set Key update action.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the DiscountGroup before the Set Key update action.</p>
     */

    public String getOldKey() {
        return this.oldKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setOldKey(final String oldKey) {
        this.oldKey = oldKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupKeySetMessagePayloadImpl that = (DiscountGroupKeySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(oldKey, that.oldKey)
                .append(type, that.type)
                .append(key, that.key)
                .append(oldKey, that.oldKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(oldKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("oldKey", oldKey)
                .build();
    }

    @Override
    public DiscountGroupKeySetMessagePayload copyDeep() {
        return DiscountGroupKeySetMessagePayload.deepCopy(this);
    }
}
