
package com.commercetools.api.models.mcp_server;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerJsonOutputFilteringMatcherBuilder
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
public class McpServerJsonOutputFilteringMatcherBuilder implements Builder<McpServerJsonOutputFilteringMatcher> {

    @Nullable
    private java.util.List<String> fieldPaths;

    @Nullable
    private java.util.List<String> fieldNames;

    @Nullable
    private java.util.List<String> fieldNameContains;

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @param fieldPaths value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldPaths(@Nullable final String... fieldPaths) {
        this.fieldPaths = new ArrayList<>(Arrays.asList(fieldPaths));
        return this;
    }

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @param fieldPaths value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldPaths(@Nullable final java.util.List<String> fieldPaths) {
        this.fieldPaths = fieldPaths;
        return this;
    }

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @param fieldPaths value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder plusFieldPaths(@Nullable final String... fieldPaths) {
        if (this.fieldPaths == null) {
            this.fieldPaths = new ArrayList<>();
        }
        this.fieldPaths.addAll(Arrays.asList(fieldPaths));
        return this;
    }

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @param fieldNames value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldNames(@Nullable final String... fieldNames) {
        this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
        return this;
    }

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @param fieldNames value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldNames(@Nullable final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @param fieldNames value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder plusFieldNames(@Nullable final String... fieldNames) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.addAll(Arrays.asList(fieldNames));
        return this;
    }

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @param fieldNameContains value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldNameContains(@Nullable final String... fieldNameContains) {
        this.fieldNameContains = new ArrayList<>(Arrays.asList(fieldNameContains));
        return this;
    }

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @param fieldNameContains value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder fieldNameContains(
            @Nullable final java.util.List<String> fieldNameContains) {
        this.fieldNameContains = fieldNameContains;
        return this;
    }

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @param fieldNameContains value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringMatcherBuilder plusFieldNameContains(
            @Nullable final String... fieldNameContains) {
        if (this.fieldNameContains == null) {
            this.fieldNameContains = new ArrayList<>();
        }
        this.fieldNameContains.addAll(Arrays.asList(fieldNameContains));
        return this;
    }

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     * @return fieldPaths
     */

    @Nullable
    public java.util.List<String> getFieldPaths() {
        return this.fieldPaths;
    }

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     * @return fieldNames
     */

    @Nullable
    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     * @return fieldNameContains
     */

    @Nullable
    public java.util.List<String> getFieldNameContains() {
        return this.fieldNameContains;
    }

    /**
     * builds McpServerJsonOutputFilteringMatcher with checking for non-null required values
     * @return McpServerJsonOutputFilteringMatcher
     */
    public McpServerJsonOutputFilteringMatcher build() {
        return new McpServerJsonOutputFilteringMatcherImpl(fieldPaths, fieldNames, fieldNameContains);
    }

    /**
     * builds McpServerJsonOutputFilteringMatcher without checking for non-null required values
     * @return McpServerJsonOutputFilteringMatcher
     */
    public McpServerJsonOutputFilteringMatcher buildUnchecked() {
        return new McpServerJsonOutputFilteringMatcherImpl(fieldPaths, fieldNames, fieldNameContains);
    }

    /**
     * factory method for an instance of McpServerJsonOutputFilteringMatcherBuilder
     * @return builder
     */
    public static McpServerJsonOutputFilteringMatcherBuilder of() {
        return new McpServerJsonOutputFilteringMatcherBuilder();
    }

    /**
     * create builder for McpServerJsonOutputFilteringMatcher instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerJsonOutputFilteringMatcherBuilder of(final McpServerJsonOutputFilteringMatcher template) {
        McpServerJsonOutputFilteringMatcherBuilder builder = new McpServerJsonOutputFilteringMatcherBuilder();
        builder.fieldPaths = template.getFieldPaths();
        builder.fieldNames = template.getFieldNames();
        builder.fieldNameContains = template.getFieldNameContains();
        return builder;
    }

}
