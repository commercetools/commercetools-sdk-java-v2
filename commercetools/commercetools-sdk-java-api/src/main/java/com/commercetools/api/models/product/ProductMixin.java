
package com.commercetools.api.models.product;

import java.util.Optional;
import java.util.stream.Collectors;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeReference;
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
                .productType(ProductTypeReference.of(template.getProductType()))
                .name(LocalizedString.of(productDataLike.getName()))
                .description(LocalizedString.of(productDataLike.getDescription()))
                .slug(LocalizedString.of(productDataLike.getSlug()))
                .categories(Optional.ofNullable(productDataLike.getCategories())
                        .map(c -> c.stream().map(CategoryReference::of).collect(Collectors.toList()))
                        .orElse(null))
                .categoryOrderHints(CategoryOrderHints.of(productDataLike.getCategoryOrderHints()))
                .metaTitle(LocalizedString.of(productDataLike.getMetaTitle()))
                .metaDescription(LocalizedString.of(productDataLike.getMetaDescription()))
                .metaKeywords(LocalizedString.of(productDataLike.getMetaKeywords()))
                .searchKeywords(SearchKeywords.of(productDataLike.getSearchKeywords()))
                .hasStagedChanges(template.getMasterData().getHasStagedChanges())
                .published(template.getMasterData().getPublished())
                .masterVariant(ProductVariant.of(productDataLike.getMasterVariant()))
                .variants(Optional.ofNullable(productDataLike.getVariants())
                        .map(v -> v.stream().map(ProductVariant::of).collect(Collectors.toList()))
                        .orElse(null))
                .taxCategory(TaxCategoryReference.of(template.getTaxCategory()))
                .state(StateReference.of(template.getState()))
                .reviewRatingStatistics(template.getReviewRatingStatistics())
                .priceMode(template.getPriceMode())
                .build();
    }
}
