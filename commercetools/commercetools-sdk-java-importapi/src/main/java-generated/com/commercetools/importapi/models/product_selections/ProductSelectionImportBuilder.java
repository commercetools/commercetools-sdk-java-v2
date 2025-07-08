
package com.commercetools.importapi.models.product_selections;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionImport productSelectionImport = ProductSelectionImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionImportBuilder implements Builder<ProductSelectionImport> {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.importapi.models.product_selections.ProductSelectionMode mode;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> assignments;

    /**
     *  <p>User-defined unique identifier. If an ProductSelection with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionImportBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.mode</code>.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder mode(
            @Nullable final com.commercetools.importapi.models.product_selections.ProductSelectionMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ProductSelectionImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ProductSelectionImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param assignments value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder assignments(
            @Nullable final com.commercetools.importapi.models.product_selections.ProductSelectionAssignment... assignments) {
        this.assignments = new ArrayList<>(Arrays.asList(assignments));
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param assignments value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder assignments(
            @Nullable final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param assignments value to be set
     * @return Builder
     */

    public ProductSelectionImportBuilder plusAssignments(
            @Nullable final com.commercetools.importapi.models.product_selections.ProductSelectionAssignment... assignments) {
        if (this.assignments == null) {
            this.assignments = new ArrayList<>();
        }
        this.assignments.addAll(Arrays.asList(assignments));
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param builder function to build the assignments value
     * @return Builder
     */

    public ProductSelectionImportBuilder plusAssignments(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder> builder) {
        if (this.assignments == null) {
            this.assignments = new ArrayList<>();
        }
        this.assignments.add(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param builder function to build the assignments value
     * @return Builder
     */

    public ProductSelectionImportBuilder withAssignments(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder> builder) {
        this.assignments = new ArrayList<>();
        this.assignments.add(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>List of product assignments.</p>
     * @param builder function to build the assignments value
     * @return Builder
     */

    public ProductSelectionImportBuilder addAssignments(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> builder) {
        return plusAssignments(builder
                .apply(com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder.of()));
    }

    /**
     *  <p>List of product assignments.</p>
     * @param builder function to build the assignments value
     * @return Builder
     */

    public ProductSelectionImportBuilder setAssignments(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> builder) {
        return assignments(builder
                .apply(com.commercetools.importapi.models.product_selections.ProductSelectionAssignmentBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier. If an ProductSelection with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @return name
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductSelection.mode</code>.</p>
     * @return mode
     */

    @Nullable
    public com.commercetools.importapi.models.product_selections.ProductSelectionMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>List of product assignments.</p>
     * @return assignments
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> getAssignments() {
        return this.assignments;
    }

    /**
     * builds ProductSelectionImport with checking for non-null required values
     * @return ProductSelectionImport
     */
    public ProductSelectionImport build() {
        Objects.requireNonNull(key, ProductSelectionImport.class + ": key is missing");
        Objects.requireNonNull(name, ProductSelectionImport.class + ": name is missing");
        return new ProductSelectionImportImpl(key, name, mode, custom, assignments);
    }

    /**
     * builds ProductSelectionImport without checking for non-null required values
     * @return ProductSelectionImport
     */
    public ProductSelectionImport buildUnchecked() {
        return new ProductSelectionImportImpl(key, name, mode, custom, assignments);
    }

    /**
     * factory method for an instance of ProductSelectionImportBuilder
     * @return builder
     */
    public static ProductSelectionImportBuilder of() {
        return new ProductSelectionImportBuilder();
    }

    /**
     * create builder for ProductSelectionImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionImportBuilder of(final ProductSelectionImport template) {
        ProductSelectionImportBuilder builder = new ProductSelectionImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.mode = template.getMode();
        builder.custom = template.getCustom();
        builder.assignments = template.getAssignments();
        return builder;
    }

}
