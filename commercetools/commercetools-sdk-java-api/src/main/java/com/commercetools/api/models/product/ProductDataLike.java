
package com.commercetools.api.models.product;

import java.util.List;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.MetaAttributes;
import com.commercetools.api.models.common.WithLocalizedSlug;

public interface ProductDataLike extends WithLocalizedSlug, MetaAttributes {

    LocalizedString getName();

    List<CategoryReference> getCategories();

    @Nullable
    LocalizedString getDescription();

    LocalizedString getSlug();

    @Nullable
    LocalizedString getMetaTitle();

    @Nullable
    LocalizedString getMetaDescription();

    @Nullable
    LocalizedString getMetaKeywords();

    /**
     * Returns the master variant. Every product as 1 to n variants, so this is always present.
     *
     * @see #getAllVariants()
     * @see #getVariants()
     * @return the main variant in the product
     */
    ProductVariant getMasterVariant();

    /**
     * Gets the variants which are not identical to the master variant. This list can be empty.
     *
     * @see #getAllVariants()
     * @see #getMasterVariant()
     *
     *
     * @return all variants except the one in {@link #getMasterVariant()}
     */
    List<ProductVariant> getVariants();

    /**
     * Gets all variants in the product including the master variant as first element in the list.
     *
     * @see #getMasterVariant()
     * @see #getVariants()
     * @return all variants
     */
    default List<ProductVariant> getAllVariants() {
        return ProductsPackage.getAllVariants(this);
    }

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
     * Finds a product variant by id and returns the master variant if not variant with the id is present.
     * @param variantId the id of the variant to find
     * @return a variant
     */
    default ProductVariant getVariantOrMaster(final long variantId) {
        return ProductsPackage.getVariantOrMaster(variantId, this);
    }

    SearchKeywords getSearchKeywords();

    @Nullable
    CategoryOrderHints getCategoryOrderHints();
}
