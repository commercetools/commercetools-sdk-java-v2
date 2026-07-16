
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Override applied to a single parameter of a tool's input schema. At least one of <code>description</code>, <code>const</code>, <code>default</code>, or <code>allowedTypes</code> must be present. <code>const</code> is mutually exclusive with both <code>default</code> and <code>allowedTypes</code>. Parameter values are JSON values.</p>
 *
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
@JsonDeserialize(as = ParameterOverrideImpl.class)
public interface ParameterOverride {

    /**
     *  <p>Name of the parameter in the tool's input schema to override.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Replacement description for the parameter, shown to the AI agent.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Pins the parameter to a fixed value. Mutually exclusive with <code>default</code> and <code>allowedTypes</code>.</p>
     * @return const
     */

    @JsonProperty("const")
    public Object getConst();

    /**
     *  <p>Default value applied when the caller omits the parameter. Mutually exclusive with <code>const</code>.</p>
     * @return default
     */

    @JsonProperty("default")
    public Object getDefault();

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @return allowedTypes
     */

    @JsonProperty("allowedTypes")
    public List<Object> getAllowedTypes();

    /**
     *  <p>Name of the parameter in the tool's input schema to override.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Replacement description for the parameter, shown to the AI agent.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Pins the parameter to a fixed value. Mutually exclusive with <code>default</code> and <code>allowedTypes</code>.</p>
     * @param _const value to be set
     */

    public void setConst(final Object _const);

    /**
     *  <p>Default value applied when the caller omits the parameter. Mutually exclusive with <code>const</code>.</p>
     * @param _default value to be set
     */

    public void setDefault(final Object _default);

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @param allowedTypes values to be set
     */

    @JsonIgnore
    public void setAllowedTypes(final Object... allowedTypes);

    /**
     *  <p>Restricts accepted values to this set. Mutually exclusive with <code>const</code>.</p>
     * @param allowedTypes values to be set
     */

    public void setAllowedTypes(final List<Object> allowedTypes);

    /**
     * factory method
     * @return instance of ParameterOverride
     */
    public static ParameterOverride of() {
        return new ParameterOverrideImpl();
    }

    /**
     * factory method to create a shallow copy ParameterOverride
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParameterOverride of(final ParameterOverride template) {
        ParameterOverrideImpl instance = new ParameterOverrideImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setConst(template.getConst());
        instance.setDefault(template.getDefault());
        instance.setAllowedTypes(template.getAllowedTypes());
        return instance;
    }

    public ParameterOverride copyDeep();

    /**
     * factory method to create a deep copy of ParameterOverride
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParameterOverride deepCopy(@Nullable final ParameterOverride template) {
        if (template == null) {
            return null;
        }
        ParameterOverrideImpl instance = new ParameterOverrideImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setConst(template.getConst());
        instance.setDefault(template.getDefault());
        instance.setAllowedTypes(Optional.ofNullable(template.getAllowedTypes()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ParameterOverride
     * @return builder
     */
    public static ParameterOverrideBuilder builder() {
        return ParameterOverrideBuilder.of();
    }

    /**
     * create builder for ParameterOverride instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParameterOverrideBuilder builder(final ParameterOverride template) {
        return ParameterOverrideBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParameterOverride(Function<ParameterOverride, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ParameterOverride> typeReference() {
        return new tools.jackson.core.type.TypeReference<ParameterOverride>() {
            @Override
            public String toString() {
                return "TypeReference<ParameterOverride>";
            }
        };
    }
}
