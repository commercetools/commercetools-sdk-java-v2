
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetDescriptionAction mcpServerSetDescriptionAction = McpServerSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetDescriptionActionBuilder implements Builder<McpServerSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public McpServerSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds McpServerSetDescriptionAction with checking for non-null required values
     * @return McpServerSetDescriptionAction
     */
    public McpServerSetDescriptionAction build() {
        return new McpServerSetDescriptionActionImpl(description);
    }

    /**
     * builds McpServerSetDescriptionAction without checking for non-null required values
     * @return McpServerSetDescriptionAction
     */
    public McpServerSetDescriptionAction buildUnchecked() {
        return new McpServerSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of McpServerSetDescriptionActionBuilder
     * @return builder
     */
    public static McpServerSetDescriptionActionBuilder of() {
        return new McpServerSetDescriptionActionBuilder();
    }

    /**
     * create builder for McpServerSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetDescriptionActionBuilder of(final McpServerSetDescriptionAction template) {
        McpServerSetDescriptionActionBuilder builder = new McpServerSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
