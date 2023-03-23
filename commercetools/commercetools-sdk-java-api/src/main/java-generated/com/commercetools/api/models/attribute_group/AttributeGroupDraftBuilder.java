
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupDraft attributeGroupDraft = AttributeGroupDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupDraftBuilder implements Builder<AttributeGroupDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;

    @Nullable
    private String key;

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @return Builder
     */

    public AttributeGroupDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param name
     * @return Builder
     */

    public AttributeGroupDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @return Builder
     */

    public AttributeGroupDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param description
     * @return Builder
     */

    public AttributeGroupDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes
     * @return Builder
     */

    public AttributeGroupDraftBuilder attributes(
            final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes
     * @return Builder
     */

    public AttributeGroupDraftBuilder attributes(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes
     * @return Builder
     */

    public AttributeGroupDraftBuilder plusAttributes(
            final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes with unique values.</p>
     * @return Builder
     */

    public AttributeGroupDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes with unique values.</p>
     * @return Builder
     */

    public AttributeGroupDraftBuilder withAttributes(
            Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     * @param key
     * @return Builder
     */

    public AttributeGroupDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public AttributeGroupDraft build() {
        Objects.requireNonNull(name, AttributeGroupDraft.class + ": name is missing");
        Objects.requireNonNull(attributes, AttributeGroupDraft.class + ": attributes is missing");
        return new AttributeGroupDraftImpl(name, description, attributes, key);
    }

    /**
     * builds AttributeGroupDraft without checking for non null required values
     */
    public AttributeGroupDraft buildUnchecked() {
        return new AttributeGroupDraftImpl(name, description, attributes, key);
    }

    public static AttributeGroupDraftBuilder of() {
        return new AttributeGroupDraftBuilder();
    }

    public static AttributeGroupDraftBuilder of(final AttributeGroupDraft template) {
        AttributeGroupDraftBuilder builder = new AttributeGroupDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        builder.key = template.getKey();
        return builder;
    }

}
