
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>One match group for <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerJsonOutputFiltering" rel="nofollow">McpServerJsonOutputFiltering</a>. Selects fields three ways, each with a fixed case-sensitivity rule. All fields are optional.</p>
 *  <ul>
 *   <li><code>fieldPaths</code>: exact dotted path, for example <code>customer.password</code>. Matched case-sensitively.</li>
 *   <li><code>fieldNames</code>: exact field name at any depth, for example <code>password</code>. Matched case-sensitively.</li>
 *   <li><code>fieldNameContains</code>: substring of a field name at any depth, for example <code>secret</code> catching <code>clientSecret</code>. Matched case-insensitively to widen the net.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerJsonOutputFilteringMatcher mcpServerJsonOutputFilteringMatcher = McpServerJsonOutputFilteringMatcher.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerJsonOutputFilteringMatcherImpl.class)
public interface McpServerJsonOutputFilteringMatcher {

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @return fieldPaths
     */

    @JsonProperty("fieldPaths")
    public List<String> getFieldPaths();

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @return fieldNames
     */

    @JsonProperty("fieldNames")
    public List<String> getFieldNames();

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @return fieldNameContains
     */

    @JsonProperty("fieldNameContains")
    public List<String> getFieldNameContains();

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @param fieldPaths values to be set
     */

    @JsonIgnore
    public void setFieldPaths(final String... fieldPaths);

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @param fieldPaths values to be set
     */

    public void setFieldPaths(final List<String> fieldPaths);

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @param fieldNames values to be set
     */

    @JsonIgnore
    public void setFieldNames(final String... fieldNames);

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @param fieldNames values to be set
     */

    public void setFieldNames(final List<String> fieldNames);

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @param fieldNameContains values to be set
     */

    @JsonIgnore
    public void setFieldNameContains(final String... fieldNameContains);

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @param fieldNameContains values to be set
     */

    public void setFieldNameContains(final List<String> fieldNameContains);

    /**
     * factory method
     * @return instance of McpServerJsonOutputFilteringMatcher
     */
    public static McpServerJsonOutputFilteringMatcher of() {
        return new McpServerJsonOutputFilteringMatcherImpl();
    }

    /**
     * factory method to create a shallow copy McpServerJsonOutputFilteringMatcher
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerJsonOutputFilteringMatcher of(final McpServerJsonOutputFilteringMatcher template) {
        McpServerJsonOutputFilteringMatcherImpl instance = new McpServerJsonOutputFilteringMatcherImpl();
        instance.setFieldPaths(template.getFieldPaths());
        instance.setFieldNames(template.getFieldNames());
        instance.setFieldNameContains(template.getFieldNameContains());
        return instance;
    }

    public McpServerJsonOutputFilteringMatcher copyDeep();

    /**
     * factory method to create a deep copy of McpServerJsonOutputFilteringMatcher
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerJsonOutputFilteringMatcher deepCopy(
            @Nullable final McpServerJsonOutputFilteringMatcher template) {
        if (template == null) {
            return null;
        }
        McpServerJsonOutputFilteringMatcherImpl instance = new McpServerJsonOutputFilteringMatcherImpl();
        instance.setFieldPaths(Optional.ofNullable(template.getFieldPaths()).map(ArrayList::new).orElse(null));
        instance.setFieldNames(Optional.ofNullable(template.getFieldNames()).map(ArrayList::new).orElse(null));
        instance.setFieldNameContains(
            Optional.ofNullable(template.getFieldNameContains()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerJsonOutputFilteringMatcher
     * @return builder
     */
    public static McpServerJsonOutputFilteringMatcherBuilder builder() {
        return McpServerJsonOutputFilteringMatcherBuilder.of();
    }

    /**
     * create builder for McpServerJsonOutputFilteringMatcher instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerJsonOutputFilteringMatcherBuilder builder(
            final McpServerJsonOutputFilteringMatcher template) {
        return McpServerJsonOutputFilteringMatcherBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerJsonOutputFilteringMatcher(Function<McpServerJsonOutputFilteringMatcher, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerJsonOutputFilteringMatcher> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerJsonOutputFilteringMatcher>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerJsonOutputFilteringMatcher>";
            }
        };
    }
}
