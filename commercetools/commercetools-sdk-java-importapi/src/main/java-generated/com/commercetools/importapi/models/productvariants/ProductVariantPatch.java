
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Representation for an update of a ProductVariant. Use this type to import updates for existing ProductVariants in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatch productVariantPatch = ProductVariantPatch.builder()
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchImpl.class)
public interface ProductVariantPatch {

    /**
     *  <p>The ProductVariant to which this patch is applied. The Reference to the ProductVariant with which the ProductVariantPatch is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the Project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     */
    @Valid
    @JsonProperty("attributes")
    public Attributes getAttributes();

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both current and staged projected representations of the Product.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    public void setAttributes(final Attributes attributes);

    public void setStaged(final Boolean staged);

    public static ProductVariantPatch of() {
        return new ProductVariantPatchImpl();
    }

    public static ProductVariantPatch of(final ProductVariantPatch template) {
        ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
        instance.setProductVariant(template.getProductVariant());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductVariantPatchBuilder builder() {
        return ProductVariantPatchBuilder.of();
    }

    public static ProductVariantPatchBuilder builder(final ProductVariantPatch template) {
        return ProductVariantPatchBuilder.of(template);
    }

    default <T> T withProductVariantPatch(Function<ProductVariantPatch, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantPatch>";
            }
        };
    }
}
