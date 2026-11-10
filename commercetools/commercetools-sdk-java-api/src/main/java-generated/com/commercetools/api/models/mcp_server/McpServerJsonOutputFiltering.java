
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Response field-filtering rules applied to <code>tools/call</code> results on the MCP Server. Every field is optional; an empty object filters nothing.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerJsonOutputFiltering mcpServerJsonOutputFiltering = McpServerJsonOutputFiltering.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerJsonOutputFilteringImpl.class)
public interface McpServerJsonOutputFiltering {

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @return redact
     */
    @Valid
    @JsonProperty("redact")
    public McpServerJsonOutputFilteringMatcher getRedact();

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @return drop
     */
    @Valid
    @JsonProperty("drop")
    public McpServerJsonOutputFilteringMatcher getDrop();

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @return fieldPathsToKeep
     */

    @JsonProperty("fieldPathsToKeep")
    public List<String> getFieldPathsToKeep();

    /**
     *  <p>Placeholder written in place of redacted values. When unset, the MCP Server applies its own default (<code>[REDACTED]</code>).</p>
     * @return redactedWith
     */

    @JsonProperty("redactedWith")
    public String getRedactedWith();

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @param redact value to be set
     */

    public void setRedact(final McpServerJsonOutputFilteringMatcher redact);

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @param drop value to be set
     */

    public void setDrop(final McpServerJsonOutputFilteringMatcher drop);

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @param fieldPathsToKeep values to be set
     */

    @JsonIgnore
    public void setFieldPathsToKeep(final String... fieldPathsToKeep);

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @param fieldPathsToKeep values to be set
     */

    public void setFieldPathsToKeep(final List<String> fieldPathsToKeep);

    /**
     *  <p>Placeholder written in place of redacted values. When unset, the MCP Server applies its own default (<code>[REDACTED]</code>).</p>
     * @param redactedWith value to be set
     */

    public void setRedactedWith(final String redactedWith);

    /**
     * factory method
     * @return instance of McpServerJsonOutputFiltering
     */
    public static McpServerJsonOutputFiltering of() {
        return new McpServerJsonOutputFilteringImpl();
    }

    /**
     * factory method to create a shallow copy McpServerJsonOutputFiltering
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerJsonOutputFiltering of(final McpServerJsonOutputFiltering template) {
        McpServerJsonOutputFilteringImpl instance = new McpServerJsonOutputFilteringImpl();
        instance.setRedact(template.getRedact());
        instance.setDrop(template.getDrop());
        instance.setFieldPathsToKeep(template.getFieldPathsToKeep());
        instance.setRedactedWith(template.getRedactedWith());
        return instance;
    }

    public McpServerJsonOutputFiltering copyDeep();

    /**
     * factory method to create a deep copy of McpServerJsonOutputFiltering
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerJsonOutputFiltering deepCopy(@Nullable final McpServerJsonOutputFiltering template) {
        if (template == null) {
            return null;
        }
        McpServerJsonOutputFilteringImpl instance = new McpServerJsonOutputFilteringImpl();
        instance.setRedact(
            com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher.deepCopy(template.getRedact()));
        instance.setDrop(
            com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher.deepCopy(template.getDrop()));
        instance.setFieldPathsToKeep(
            Optional.ofNullable(template.getFieldPathsToKeep()).map(ArrayList::new).orElse(null));
        instance.setRedactedWith(template.getRedactedWith());
        return instance;
    }

    /**
     * builder factory method for McpServerJsonOutputFiltering
     * @return builder
     */
    public static McpServerJsonOutputFilteringBuilder builder() {
        return McpServerJsonOutputFilteringBuilder.of();
    }

    /**
     * create builder for McpServerJsonOutputFiltering instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerJsonOutputFilteringBuilder builder(final McpServerJsonOutputFiltering template) {
        return McpServerJsonOutputFilteringBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerJsonOutputFiltering(Function<McpServerJsonOutputFiltering, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerJsonOutputFiltering> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerJsonOutputFiltering>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerJsonOutputFiltering>";
            }
        };
    }
}
