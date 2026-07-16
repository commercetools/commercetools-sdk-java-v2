
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetNameAction mcpServerSetNameAction = McpServerSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetNameActionBuilder implements Builder<McpServerSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty or absent, the existing name is removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty or absent, the existing name is removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerSetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty or absent, the existing name is removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public McpServerSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set. If empty or absent, the existing name is removed.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds McpServerSetNameAction with checking for non-null required values
     * @return McpServerSetNameAction
     */
    public McpServerSetNameAction build() {
        return new McpServerSetNameActionImpl(name);
    }

    /**
     * builds McpServerSetNameAction without checking for non-null required values
     * @return McpServerSetNameAction
     */
    public McpServerSetNameAction buildUnchecked() {
        return new McpServerSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of McpServerSetNameActionBuilder
     * @return builder
     */
    public static McpServerSetNameActionBuilder of() {
        return new McpServerSetNameActionBuilder();
    }

    /**
     * create builder for McpServerSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetNameActionBuilder of(final McpServerSetNameAction template) {
        McpServerSetNameActionBuilder builder = new McpServerSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
