
package com.commercetools.api.models.product_type;

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
 *  <p>Updates the <code>inputHint</code> of an AttributeDefinition.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeInputHintActionImpl implements ProductTypeChangeInputHintAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.TextInputHint newValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeInputHintActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newValue") final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = CHANGE_INPUT_HINT;
    }

    /**
     * create empty instance
     */
    public ProductTypeChangeInputHintActionImpl() {
        this.action = CHANGE_INPUT_HINT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     */

    public com.commercetools.api.models.product_type.TextInputHint getNewValue() {
        return this.newValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewValue(final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeInputHintActionImpl that = (ProductTypeChangeInputHintActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("newValue", newValue)
                .build();
    }

    @Override
    public ProductTypeChangeInputHintAction copyDeep() {
        return ProductTypeChangeInputHintAction.deepCopy(this);
    }
}
