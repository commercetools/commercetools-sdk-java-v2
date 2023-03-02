
package com.commercetools.api.models.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface ProductProjectionMixin extends ProductDataLike {
    public String getId();

    default Optional<ProductVariant> findVariant(final ByIdVariantIdentifier identifier) {
        return getId().equals(identifier.getProductId()) ? Optional.ofNullable(getVariant(identifier.getVariantId()))
                : Optional.empty();
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
