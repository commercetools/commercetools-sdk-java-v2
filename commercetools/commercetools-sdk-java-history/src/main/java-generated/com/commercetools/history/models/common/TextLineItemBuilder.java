
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItem textLineItem = TextLineItem.builder()
 *             .addedAt("{addedAt}")
 *             .custom(customBuilder -> customBuilder)
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemBuilder implements Builder<TextLineItem> {

    private String addedAt;

    private com.commercetools.history.models.common.CustomFields custom;

    private com.commercetools.history.models.common.LocalizedString description;

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer quantity;

    /**
     *
     * @param addedAt
     * @return Builder
     */

    public TextLineItemBuilder addedAt(final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public TextLineItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param custom
     * @return Builder
     */

    public TextLineItemBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public TextLineItemBuilder description(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param description
     * @return Builder
     */

    public TextLineItemBuilder description(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *
     * @param id
     * @return Builder
     */

    public TextLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public TextLineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param name
     * @return Builder
     */

    public TextLineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param quantity
     * @return Builder
     */

    public TextLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.history.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public TextLineItem build() {
        Objects.requireNonNull(addedAt, TextLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(custom, TextLineItem.class + ": custom is missing");
        Objects.requireNonNull(description, TextLineItem.class + ": description is missing");
        Objects.requireNonNull(id, TextLineItem.class + ": id is missing");
        Objects.requireNonNull(name, TextLineItem.class + ": name is missing");
        Objects.requireNonNull(quantity, TextLineItem.class + ": quantity is missing");
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }

    /**
     * builds TextLineItem without checking for non null required values
     */
    public TextLineItem buildUnchecked() {
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }

    public static TextLineItemBuilder of() {
        return new TextLineItemBuilder();
    }

    public static TextLineItemBuilder of(final TextLineItem template) {
        TextLineItemBuilder builder = new TextLineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.description = template.getDescription();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
