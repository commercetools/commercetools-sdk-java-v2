
package com.commercetools.api.models.product;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public interface ProductProjectionMixin {

    String getId();

    ProductVariant getVariant(final long variantId);

    List<ProductVariant> getAllVariants();

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
