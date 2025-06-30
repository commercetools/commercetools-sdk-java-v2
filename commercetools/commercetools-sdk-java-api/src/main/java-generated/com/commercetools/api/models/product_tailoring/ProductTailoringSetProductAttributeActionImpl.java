
package com.commercetools.api.models.product_tailoring;

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
 * ProductTailoringSetProductAttributeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetProductAttributeActionImpl
        implements ProductTailoringSetProductAttributeAction, ModelBase {

    private String action;

    private String name;

    private java.lang.Object value;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringSetProductAttributeActionImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("staged") final Boolean staged) {
        this.name = name;
        this.value = value;
        this.staged = staged;
        this.action = SET_PRODUCT_ATTRIBUTE;
    }

    /**
     * create empty instance
     */
    public ProductTailoringSetProductAttributeActionImpl() {
        this.action = SET_PRODUCT_ATTRIBUTE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the Attribute to set.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, then any existing value will be removed.</p>
     *  <p>AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use either the <code>key</code> of the Plain Enum Value or Localized Enum Value object or the complete object as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is <strong>not supported</strong>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, then only the staged Attribute is set. If <code>false</code>, then both the current and staged Attributes are set.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringSetProductAttributeActionImpl that = (ProductTailoringSetProductAttributeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(value, that.value)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(name, that.name)
                .append(value, that.value)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).append(value).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("name", name)
                .append("value", value)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductTailoringSetProductAttributeAction copyDeep() {
        return ProductTailoringSetProductAttributeAction.deepCopy(this);
    }
}
