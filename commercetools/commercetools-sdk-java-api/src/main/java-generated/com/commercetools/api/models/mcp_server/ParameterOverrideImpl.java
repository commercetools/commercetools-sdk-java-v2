
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Override applied to a single parameter of a tool's input schema. At least one of <code>description</code>, <code>const</code>, <code>default</code>, or <code>allowedTypes</code> must be present. <code>const</code> is mutually exclusive with both <code>default</code> and <code>allowedTypes</code>. Parameter values are JSON values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParameterOverrideImpl implements ParameterOverride, ModelBase {

    private String name;

    private String description;

    private java.lang.Object _const;

    private java.lang.Object _default;

    private java.util.List<java.lang.Object> allowedTypes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParameterOverrideImpl(@JsonProperty("name") final String name,
            @JsonProperty("description") final String description, @JsonProperty("const") final java.lang.Object _const,
            @JsonProperty("default") final java.lang.Object _default,
            @JsonProperty("allowedTypes") final java.util.List<java.lang.Object> allowedTypes) {
        this.name = name;
        this.description = description;
        this._const = _const;
        this._default = _default;
        this.allowedTypes = allowedTypes;
    }

    /**
     * create empty instance
     */
    public ParameterOverrideImpl() {
    }

    /**
     *  <p>Name of the parameter in the tool's input schema to override.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Replacement description for the parameter, shown to the AI agent.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Pins the parameter to a fixed value. Mutually exclusive with <code>default</code> and <code>allowedTypes</code>.</p>
     */

    public java.lang.Object getConst() {
        return this._const;
    }

    /**
     *  <p>Default value applied when the caller omits the parameter. Mutually exclusive with <code>const</code>.</p>
     */

    public java.lang.Object getDefault() {
        return this._default;
    }

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     */

    public java.util.List<java.lang.Object> getAllowedTypes() {
        return this.allowedTypes;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setConst(final java.lang.Object _const) {
        this._const = _const;
    }

    public void setDefault(final java.lang.Object _default) {
        this._default = _default;
    }

    public void setAllowedTypes(final java.lang.Object... allowedTypes) {
        this.allowedTypes = new ArrayList<>(Arrays.asList(allowedTypes));
    }

    public void setAllowedTypes(final java.util.List<java.lang.Object> allowedTypes) {
        this.allowedTypes = allowedTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParameterOverrideImpl that = (ParameterOverrideImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(_const, that._const)
                .append(_default, that._default)
                .append(allowedTypes, that.allowedTypes)
                .append(name, that.name)
                .append(description, that.description)
                .append(_const, that._const)
                .append(_default, that._default)
                .append(allowedTypes, that.allowedTypes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(_const)
                .append(_default)
                .append(allowedTypes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("description", description)
                .append("const", _const)
                .append("default", _default)
                .append("allowedTypes", allowedTypes)
                .build();
    }

    @Override
    public ParameterOverride copyDeep() {
        return ParameterOverride.deepCopy(this);
    }
}
