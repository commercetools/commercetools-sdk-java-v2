
package com.commercetools.api.models.product;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface ProductProjectionMixin {
    ProductVariant getMasterVariant();

    List<ProductVariant> getVariants();

    /**
     * Finds a product variant by id.
     *
     * @param variantId the id of the variant to find
     * @return variant or null if no variant exists with {@code id}
     */
    @Nullable
    default ProductVariant getVariant(final long variantId) {
        final ProductVariant result;
        if (variantId == getMasterVariant().getId()) {
            result = getMasterVariant();
        }
        else {
            result = getVariants().stream().filter(v -> v.getId() == variantId).findFirst().orElse(null);
        }
        return result;
    }

    /**
     * Gets all variants in the product including the master variant as first element in the list.
     *
     * @see #getMasterVariant()
     * @see #getVariants()
     * @return all variants
     */
    @JsonIgnore
    default List<ProductVariant> getAllVariants() {
        return ProductsPackage.getAllVariants(this);
    }

    default Optional<ProductVariant> findVariant(final ByIdVariantIdentifier identifier) {
        return getId().equals(identifier.getProductId()) ? Optional.ofNullable(getVariant(identifier.getVariantId()))
                : Optional.empty();
    }

    /**
     * Finds a variant by SKU.
     * @param sku the sku for the variant
     * @return Optional of the found variant
     */
    default Optional<ProductVariant> findVariantBySku(final String sku) {
        Objects.requireNonNull(sku);
        return getAllVariants().stream().filter(v -> sku.equals(v.getSku())).findFirst();
    }

    /**
     * Finds all variants that match the search criteria used in the search request, if any.
     * @return the list containing all matching variants
     */
    default List<ProductVariant> findMatchingVariants() {
        return getAllVariants().stream()
                .filter(v -> Optional.ofNullable(v.getIsMatchingVariant()).orElse(false))
                .collect(Collectors.toList());
    }

    /**
     * Finds the first matching variant according to the search criteria used in the search request, if any.
     * @return the first product variant that matches the search criteria, or empty if none does
     */
    default Optional<ProductVariant> findFirstMatchingVariant() {
        return findMatchingVariants().stream().findFirst();
    }
}
