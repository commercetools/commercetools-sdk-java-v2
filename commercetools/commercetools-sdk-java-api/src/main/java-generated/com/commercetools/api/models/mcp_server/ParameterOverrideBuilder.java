
package com.commercetools.api.models.mcp_server;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParameterOverrideBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParameterOverride parameterOverride = ParameterOverride.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParameterOverrideBuilder implements Builder<ParameterOverride> {

    private String name;

    @Nullable
    private String description;

    @Nullable
    private java.lang.Object _const;

    @Nullable
    private java.lang.Object _default;

    @Nullable
    private java.util.List<java.lang.Object> allowedTypes;

    /**
     *  <p>Name of the parameter in the tool's input schema to override.</p>
     * @param name value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Replacement description for the parameter, shown to the AI agent.</p>
     * @param description value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Pins the parameter to a fixed value. Mutually exclusive with <code>default</code> and <code>allowedTypes</code>.</p>
     * @param _const value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder _const(@Nullable final java.lang.Object _const) {
        this._const = _const;
        return this;
    }

    /**
     *  <p>Default value applied when the caller omits the parameter. Mutually exclusive with <code>const</code>.</p>
     * @param _default value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder _default(@Nullable final java.lang.Object _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @param allowedTypes value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder allowedTypes(@Nullable final java.lang.Object... allowedTypes) {
        this.allowedTypes = new ArrayList<>(Arrays.asList(allowedTypes));
        return this;
    }

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @param allowedTypes value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder allowedTypes(@Nullable final java.util.List<java.lang.Object> allowedTypes) {
        this.allowedTypes = allowedTypes;
        return this;
    }

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @param allowedTypes value to be set
     * @return Builder
     */

    public ParameterOverrideBuilder plusAllowedTypes(@Nullable final java.lang.Object... allowedTypes) {
        if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>();
        }
        this.allowedTypes.addAll(Arrays.asList(allowedTypes));
        return this;
    }

    /**
     *  <p>Name of the parameter in the tool's input schema to override.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Replacement description for the parameter, shown to the AI agent.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Pins the parameter to a fixed value. Mutually exclusive with <code>default</code> and <code>allowedTypes</code>.</p>
     * @return const
     */

    @Nullable
    public java.lang.Object getConst() {
        return this._const;
    }

    /**
     *  <p>Default value applied when the caller omits the parameter. Mutually exclusive with <code>const</code>.</p>
     * @return default
     */

    @Nullable
    public java.lang.Object getDefault() {
        return this._default;
    }

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @return allowedTypes
     */

    @Nullable
    public java.util.List<java.lang.Object> getAllowedTypes() {
        return this.allowedTypes;
    }

    /**
     * builds ParameterOverride with checking for non-null required values
     * @return ParameterOverride
     */
    public ParameterOverride build() {
        Objects.requireNonNull(name, ParameterOverride.class + ": name is missing");
        return new ParameterOverrideImpl(name, description, _const, _default, allowedTypes);
    }

    /**
     * builds ParameterOverride without checking for non-null required values
     * @return ParameterOverride
     */
    public ParameterOverride buildUnchecked() {
        return new ParameterOverrideImpl(name, description, _const, _default, allowedTypes);
    }

    /**
     * factory method for an instance of ParameterOverrideBuilder
     * @return builder
     */
    public static ParameterOverrideBuilder of() {
        return new ParameterOverrideBuilder();
    }

    /**
     * create builder for ParameterOverride instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParameterOverrideBuilder of(final ParameterOverride template) {
        ParameterOverrideBuilder builder = new ParameterOverrideBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder._const = template.getConst();
        builder._default = template.getDefault();
        builder.allowedTypes = template.getAllowedTypes();
        return builder;
    }

}
