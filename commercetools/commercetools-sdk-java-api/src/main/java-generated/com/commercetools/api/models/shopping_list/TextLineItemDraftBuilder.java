
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItemDraft textLineItemDraft = TextLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemDraftBuilder implements Builder<TextLineItemDraft> {

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Long quantity;

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt
     * @return Builder
     */

    public TextLineItemDraftBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     * @return Builder
     */

    public TextLineItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the TextLineItem.</p>
     * @param custom
     * @return Builder
     */

    public TextLineItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @return Builder
     */

    public TextLineItemDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description
     * @return Builder
     */

    public TextLineItemDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Name of the TextLineItem.</p>
     * @return Builder
     */

    public TextLineItemDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name
     * @return Builder
     */

    public TextLineItemDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity
     * @return Builder
     */

    public TextLineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public TextLineItemDraft build() {
        Objects.requireNonNull(name, TextLineItemDraft.class + ": name is missing");
        return new TextLineItemDraftImpl(addedAt, custom, description, name, quantity);
    }

    /**
     * builds TextLineItemDraft without checking for non null required values
     */
    public TextLineItemDraft buildUnchecked() {
        return new TextLineItemDraftImpl(addedAt, custom, description, name, quantity);
    }

    public static TextLineItemDraftBuilder of() {
        return new TextLineItemDraftBuilder();
    }

    public static TextLineItemDraftBuilder of(final TextLineItemDraft template) {
        TextLineItemDraftBuilder builder = new TextLineItemDraftBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.description = template.getDescription();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
