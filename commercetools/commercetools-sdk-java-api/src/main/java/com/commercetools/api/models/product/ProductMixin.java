
package com.commercetools.api.models.product;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;

public interface ProductMixin extends Referencable<Product>, ResourceIdentifiable<Product> {
    @Override
    public default ProductResourceIdentifier toResourceIdentifier() {
        return ProductResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductReference toReference() {
        return ProductReference.builder().id(getId()).build();
    }

    public static ProductProjection toProjection(final Product template,
            final ProductProjectionType productProjectionType) {
        ProductDataLike productDataLike = template.getMasterData().get(productProjectionType);
        return ProductProjection.builder()
                .id(template.getId())
                .version(template.getVersion())
                .createdAt(template.getCreatedAt())
                .lastModifiedAt(template.getLastModifiedAt())
                .key(template.getKey())
                .productType(ProductTypeReference.deepCopy(template.getProductType()))
                .name(LocalizedString.deepCopy(productDataLike.getName()))
                .description(LocalizedString.deepCopy(productDataLike.getDescription()))
                .slug(LocalizedString.deepCopy(productDataLike.getSlug()))
                .categories(Optional.ofNullable(productDataLike.getCategories())
                        .map(c -> c.stream().map(CategoryReference::deepCopy).collect(Collectors.toList()))
                        .orElse(null))
                .categoryOrderHints(CategoryOrderHints.deepCopy(productDataLike.getCategoryOrderHints()))
                .metaTitle(LocalizedString.deepCopy(productDataLike.getMetaTitle()))
                .metaDescription(LocalizedString.deepCopy(productDataLike.getMetaDescription()))
                .metaKeywords(LocalizedString.deepCopy(productDataLike.getMetaKeywords()))
                .searchKeywords(SearchKeywords.deepCopy(productDataLike.getSearchKeywords()))
                .hasStagedChanges(template.getMasterData().getHasStagedChanges())
                .published(template.getMasterData().getPublished())
                .masterVariant(ProductVariant.deepCopy(productDataLike.getMasterVariant()))
                .variants(Optional.ofNullable(productDataLike.getVariants())
                        .map(v -> v.stream().map(ProductVariant::deepCopy).collect(Collectors.toList()))
                        .orElse(null))
                .taxCategory(TaxCategoryReference.deepCopy(template.getTaxCategory()))
                .state(StateReference.deepCopy(template.getState()))
                .reviewRatingStatistics(ReviewRatingStatistics.deepCopy(template.getReviewRatingStatistics()))
                .priceMode(template.getPriceMode())
                .attributes(Optional.ofNullable(productDataLike.getAttributes())
                        .map(a -> a.stream().map(Attribute::deepCopy).collect(Collectors.toList()))
                        .orElse(Collections.emptyList()))
                .build();
    }
}
