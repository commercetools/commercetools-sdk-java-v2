
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
 * TextLineItemValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemValueImpl implements TextLineItemValue, ModelBase {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TextLineItemValueImpl(@JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name) {
        this.id = id;
        this.name = name;
    }

    /**
     * create empty instance
     */
    public TextLineItemValueImpl() {
    }

    /**
     *  <p><code>id</code> of the TextLineItem.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the TextLineItem.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TextLineItemValueImpl that = (TextLineItemValueImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(id, that.id)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("name", name)
                .build();
    }

    @Override
    public TextLineItemValue copyDeep() {
        return TextLineItemValue.deepCopy(this);
    }
}
