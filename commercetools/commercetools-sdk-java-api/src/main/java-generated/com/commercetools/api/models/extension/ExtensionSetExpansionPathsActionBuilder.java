
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetExpansionPathsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetExpansionPathsAction extensionSetExpansionPathsAction = ExtensionSetExpansionPathsAction.builder()
 *             .plusExpansionPaths(expansionPathsBuilder -> expansionPathsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetExpansionPathsActionBuilder implements Builder<ExtensionSetExpansionPathsAction> {

    private java.util.List<String> expansionPaths;

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionSetExpansionPathsActionBuilder expansionPaths(final String... expansionPaths) {
        this.expansionPaths = new ArrayList<>(Arrays.asList(expansionPaths));
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionSetExpansionPathsActionBuilder expansionPaths(final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionSetExpansionPathsActionBuilder plusExpansionPaths(final String... expansionPaths) {
        if (this.expansionPaths == null) {
            this.expansionPaths = new ArrayList<>();
        }
        this.expansionPaths.addAll(Arrays.asList(expansionPaths));
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @return expansionPaths
     */

    public java.util.List<String> getExpansionPaths() {
        return this.expansionPaths;
    }

    /**
     * builds ExtensionSetExpansionPathsAction with checking for non-null required values
     * @return ExtensionSetExpansionPathsAction
     */
    public ExtensionSetExpansionPathsAction build() {
        Objects.requireNonNull(expansionPaths, ExtensionSetExpansionPathsAction.class + ": expansionPaths is missing");
        return new ExtensionSetExpansionPathsActionImpl(expansionPaths);
    }

    /**
     * builds ExtensionSetExpansionPathsAction without checking for non-null required values
     * @return ExtensionSetExpansionPathsAction
     */
    public ExtensionSetExpansionPathsAction buildUnchecked() {
        return new ExtensionSetExpansionPathsActionImpl(expansionPaths);
    }

    /**
     * factory method for an instance of ExtensionSetExpansionPathsActionBuilder
     * @return builder
     */
    public static ExtensionSetExpansionPathsActionBuilder of() {
        return new ExtensionSetExpansionPathsActionBuilder();
    }

    /**
     * create builder for ExtensionSetExpansionPathsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetExpansionPathsActionBuilder of(final ExtensionSetExpansionPathsAction template) {
        ExtensionSetExpansionPathsActionBuilder builder = new ExtensionSetExpansionPathsActionBuilder();
        builder.expansionPaths = template.getExpansionPaths();
        return builder;
    }

}
