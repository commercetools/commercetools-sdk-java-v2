
package com.commercetools.api.models.product;

import java.util.List;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.MetaAttributes;
import com.commercetools.api.models.common.WithLocalizedSlug;

/**
 * Interface to describe commonalities between differen product representations
 */
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
