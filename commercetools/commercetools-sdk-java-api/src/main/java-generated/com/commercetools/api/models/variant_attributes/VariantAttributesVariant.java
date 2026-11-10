
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A Variant with its requested Attributes and lightweight availability information.</p>
 *
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
@JsonDeserialize(as = VariantAttributesVariantImpl.class)
public interface VariantAttributesVariant {

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @return availability
     */
    @Valid
    @JsonProperty("availability")
    public VariantAttributesAvailability getAvailability();

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Key of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Availability information for this variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the variant's SKU.</p>
     * @param availability value to be set
     */

    public void setAvailability(final VariantAttributesAvailability availability);

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Requested <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> of the Variant. Only Variant-level Attributes that exist on this Variant and were requested via <code>filter[attributes]</code> are included.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of VariantAttributesVariant
     */
    public static VariantAttributesVariant of() {
        return new VariantAttributesVariantImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributesVariant
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributesVariant of(final VariantAttributesVariant template) {
        VariantAttributesVariantImpl instance = new VariantAttributesVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setAvailability(template.getAvailability());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public VariantAttributesVariant copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributesVariant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributesVariant deepCopy(@Nullable final VariantAttributesVariant template) {
        if (template == null) {
            return null;
        }
        VariantAttributesVariantImpl instance = new VariantAttributesVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setAvailability(com.commercetools.api.models.variant_attributes.VariantAttributesAvailability
                .deepCopy(template.getAvailability()));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantAttributesVariant
     * @return builder
     */
    public static VariantAttributesVariantBuilder builder() {
        return VariantAttributesVariantBuilder.of();
    }

    /**
     * create builder for VariantAttributesVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesVariantBuilder builder(final VariantAttributesVariant template) {
        return VariantAttributesVariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributesVariant(Function<VariantAttributesVariant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributesVariant> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributesVariant>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributesVariant>";
            }
        };
    }
}
