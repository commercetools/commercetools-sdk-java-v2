
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetDependenciesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetDependenciesAction extensionSetDependenciesAction = ExtensionSetDependenciesAction.builder()
 *             .plusDependencies(dependenciesBuilder -> dependenciesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetDependenciesActionBuilder implements Builder<ExtensionSetDependenciesAction> {

    private java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies;

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder dependencies(
            final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        this.dependencies = new ArrayList<>(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder dependencies(
            final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder plusDependencies(
            final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.addAll(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder plusDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder> builder) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder withDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder> builder) {
        this.dependencies = new ArrayList<>();
        this.dependencies.add(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder addDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifier> builder) {
        return plusDependencies(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionSetDependenciesActionBuilder setDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifier> builder) {
        return dependencies(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @return dependencies
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> getDependencies() {
        return this.dependencies;
    }

    /**
     * builds ExtensionSetDependenciesAction with checking for non-null required values
     * @return ExtensionSetDependenciesAction
     */
    public ExtensionSetDependenciesAction build() {
        Objects.requireNonNull(dependencies, ExtensionSetDependenciesAction.class + ": dependencies is missing");
        return new ExtensionSetDependenciesActionImpl(dependencies);
    }

    /**
     * builds ExtensionSetDependenciesAction without checking for non-null required values
     * @return ExtensionSetDependenciesAction
     */
    public ExtensionSetDependenciesAction buildUnchecked() {
        return new ExtensionSetDependenciesActionImpl(dependencies);
    }

    /**
     * factory method for an instance of ExtensionSetDependenciesActionBuilder
     * @return builder
     */
    public static ExtensionSetDependenciesActionBuilder of() {
        return new ExtensionSetDependenciesActionBuilder();
    }

    /**
     * create builder for ExtensionSetDependenciesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetDependenciesActionBuilder of(final ExtensionSetDependenciesAction template) {
        ExtensionSetDependenciesActionBuilder builder = new ExtensionSetDependenciesActionBuilder();
        builder.dependencies = template.getDependencies();
        return builder;
    }

}
