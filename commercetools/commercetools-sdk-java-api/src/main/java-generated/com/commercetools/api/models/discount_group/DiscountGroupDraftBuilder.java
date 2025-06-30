
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupDraft discountGroupDraft = DiscountGroupDraft.builder()
 *             .key("{key}")
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupDraftBuilder implements Builder<DiscountGroupDraft> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String sortOrder;

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountGroupDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountGroup.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountGroupDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountGroupDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public DiscountGroupDraftBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountGroup.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * builds DiscountGroupDraft with checking for non-null required values
     * @return DiscountGroupDraft
     */
    public DiscountGroupDraft build() {
        Objects.requireNonNull(key, DiscountGroupDraft.class + ": key is missing");
        Objects.requireNonNull(sortOrder, DiscountGroupDraft.class + ": sortOrder is missing");
        return new DiscountGroupDraftImpl(name, key, description, sortOrder);
    }

    /**
     * builds DiscountGroupDraft without checking for non-null required values
     * @return DiscountGroupDraft
     */
    public DiscountGroupDraft buildUnchecked() {
        return new DiscountGroupDraftImpl(name, key, description, sortOrder);
    }

    /**
     * factory method for an instance of DiscountGroupDraftBuilder
     * @return builder
     */
    public static DiscountGroupDraftBuilder of() {
        return new DiscountGroupDraftBuilder();
    }

    /**
     * create builder for DiscountGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupDraftBuilder of(final DiscountGroupDraft template) {
        DiscountGroupDraftBuilder builder = new DiscountGroupDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
