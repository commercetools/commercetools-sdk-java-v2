
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the Product Variant Selection of an existing Product Selection Assignment. If the given Product is not assigned to the Product Selection ProductAssignmentMissing error is raised.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetVariantSelectionAction productSelectionSetVariantSelectionAction = ProductSelectionSetVariantSelectionAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetVariantSelectionActionImpl.class)
public interface ProductSelectionSetVariantSelectionAction extends ProductSelectionUpdateAction {

    String SET_VARIANT_SELECTION = "setVariantSelection";

    /**
     *  <p>ResourceIdentifier to Product</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    public void setProduct(final ProductResourceIdentifier product);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public static ProductSelectionSetVariantSelectionAction of() {
        return new ProductSelectionSetVariantSelectionActionImpl();
    }

    public static ProductSelectionSetVariantSelectionAction of(
            final ProductSelectionSetVariantSelectionAction template) {
        ProductSelectionSetVariantSelectionActionImpl instance = new ProductSelectionSetVariantSelectionActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public static ProductSelectionSetVariantSelectionActionBuilder builder() {
        return ProductSelectionSetVariantSelectionActionBuilder.of();
    }

    public static ProductSelectionSetVariantSelectionActionBuilder builder(
            final ProductSelectionSetVariantSelectionAction template) {
        return ProductSelectionSetVariantSelectionActionBuilder.of(template);
    }

    default <T> T withProductSelectionSetVariantSelectionAction(
            Function<ProductSelectionSetVariantSelectionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetVariantSelectionAction>";
            }
        };
    }
}
