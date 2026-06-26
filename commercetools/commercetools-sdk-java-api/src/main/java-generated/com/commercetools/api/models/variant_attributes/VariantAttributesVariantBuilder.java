
package com.commercetools.api.models.variant_attributes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesVariant variantAttributesVariant = VariantAttributesVariant.builder()
 *             .id("{id}")
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesVariantBuilder implements Builder<VariantAttributesVariant> {

    private String id;

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.variant_attributes.VariantAttributesAvailability availability;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @param builder function to build the availability value
     * @return Builder
     */

    public VariantAttributesVariantBuilder availability(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityBuilder> builder) {
        this.availability = builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @param builder function to build the availability value
     * @return Builder
     */

    public VariantAttributesVariantBuilder withAvailability(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAvailability> builder) {
        this.availability = builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAvailabilityBuilder.of());
        return this;
    }

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @param availability value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder availability(
            @Nullable final com.commercetools.api.models.variant_attributes.VariantAttributesAvailability availability) {
        this.availability = availability;
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder attributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesVariantBuilder plusAttributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesVariantBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesVariantBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesVariantBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesVariantBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @return availability
     */

    @Nullable
    public com.commercetools.api.models.variant_attributes.VariantAttributesAvailability getAvailability() {
        return this.availability;
    }

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds VariantAttributesVariant with checking for non-null required values
     * @return VariantAttributesVariant
     */
    public VariantAttributesVariant build() {
        Objects.requireNonNull(id, VariantAttributesVariant.class + ": id is missing");
        Objects.requireNonNull(attributes, VariantAttributesVariant.class + ": attributes is missing");
        return new VariantAttributesVariantImpl(id, sku, key, availability, attributes);
    }

    /**
     * builds VariantAttributesVariant without checking for non-null required values
     * @return VariantAttributesVariant
     */
    public VariantAttributesVariant buildUnchecked() {
        return new VariantAttributesVariantImpl(id, sku, key, availability, attributes);
    }

    /**
     * factory method for an instance of VariantAttributesVariantBuilder
     * @return builder
     */
    public static VariantAttributesVariantBuilder of() {
        return new VariantAttributesVariantBuilder();
    }

    /**
     * create builder for VariantAttributesVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesVariantBuilder of(final VariantAttributesVariant template) {
        VariantAttributesVariantBuilder builder = new VariantAttributesVariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.availability = template.getAvailability();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
