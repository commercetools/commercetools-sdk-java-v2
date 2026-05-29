
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetAdditionalContextActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetAdditionalContextAction extensionSetAdditionalContextAction = ExtensionSetAdditionalContextAction.builder()
 *             .additionalContext(additionalContextBuilder -> additionalContextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetAdditionalContextActionBuilder implements Builder<ExtensionSetAdditionalContextAction> {

    private com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext;

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the additionalContext value
     * @return Builder
     */

    public ExtensionSetAdditionalContextActionBuilder additionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the additionalContext value
     * @return Builder
     */

    public ExtensionSetAdditionalContextActionBuilder withAdditionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContextDraft> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param additionalContext value to be set
     * @return Builder
     */

    public ExtensionSetAdditionalContextActionBuilder additionalContext(
            final com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return additionalContext
     */

    public com.commercetools.api.models.extension.ExtensionAdditionalContextDraft getAdditionalContext() {
        return this.additionalContext;
    }

    /**
     * builds ExtensionSetAdditionalContextAction with checking for non-null required values
     * @return ExtensionSetAdditionalContextAction
     */
    public ExtensionSetAdditionalContextAction build() {
        Objects.requireNonNull(additionalContext,
            ExtensionSetAdditionalContextAction.class + ": additionalContext is missing");
        return new ExtensionSetAdditionalContextActionImpl(additionalContext);
    }

    /**
     * builds ExtensionSetAdditionalContextAction without checking for non-null required values
     * @return ExtensionSetAdditionalContextAction
     */
    public ExtensionSetAdditionalContextAction buildUnchecked() {
        return new ExtensionSetAdditionalContextActionImpl(additionalContext);
    }

    /**
     * factory method for an instance of ExtensionSetAdditionalContextActionBuilder
     * @return builder
     */
    public static ExtensionSetAdditionalContextActionBuilder of() {
        return new ExtensionSetAdditionalContextActionBuilder();
    }

    /**
     * create builder for ExtensionSetAdditionalContextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetAdditionalContextActionBuilder of(final ExtensionSetAdditionalContextAction template) {
        ExtensionSetAdditionalContextActionBuilder builder = new ExtensionSetAdditionalContextActionBuilder();
        builder.additionalContext = template.getAdditionalContext();
        return builder;
    }

}
