
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryUpdate taxCategoryUpdate = TaxCategoryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryUpdateBuilder implements Builder<TaxCategoryUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> actions;

    /**
     *  <p>Expected version of the TaxCategory on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version
     * @return Builder
     */

    public TaxCategoryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @param actions
     * @return Builder
     */

    public TaxCategoryUpdateBuilder actions(
            final com.commercetools.api.models.tax_category.TaxCategoryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @param actions
     * @return Builder
     */

    public TaxCategoryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @param actions
     * @return Builder
     */

    public TaxCategoryUpdateBuilder plusActions(
            final com.commercetools.api.models.tax_category.TaxCategoryUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @return Builder
     */

    public TaxCategoryUpdateBuilder plusActions(
            Function<com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.tax_category.TaxCategoryUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @return Builder
     */

    public TaxCategoryUpdateBuilder withActions(
            Function<com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.tax_category.TaxCategoryUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> getActions() {
        return this.actions;
    }

    public TaxCategoryUpdate build() {
        Objects.requireNonNull(version, TaxCategoryUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, TaxCategoryUpdate.class + ": actions is missing");
        return new TaxCategoryUpdateImpl(version, actions);
    }

    /**
     * builds TaxCategoryUpdate without checking for non null required values
     */
    public TaxCategoryUpdate buildUnchecked() {
        return new TaxCategoryUpdateImpl(version, actions);
    }

    public static TaxCategoryUpdateBuilder of() {
        return new TaxCategoryUpdateBuilder();
    }

    public static TaxCategoryUpdateBuilder of(final TaxCategoryUpdate template) {
        TaxCategoryUpdateBuilder builder = new TaxCategoryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
