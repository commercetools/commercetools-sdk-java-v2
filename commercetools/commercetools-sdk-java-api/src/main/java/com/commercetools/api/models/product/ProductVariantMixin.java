
package com.commercetools.api.models.product;

public interface ProductVariantMixin {

    public Long getId();
    /**
     * Gets the id of the product and the variant. This operation may not be available.
     * It will be available if this {@link ProductVariant} has been created
     * by loading a {@link Product} or a {@link ProductProjection} from JSON.
     * @return identifier for this variant
     * @throws UnsupportedOperationException if the operation is not available
     */
    //    @JsonIgnore
    //    @Nullable
    //    public default ByIdVariantIdentifier getIdentifier() {
    //        return Optional.ofNullable(productId).map(pId -> ByIdVariantIdentifier.of(pId, getId())).orElseThrow(UnsupportedOperationException::new);
    //    }

    //    default void setProductId(@Nullable String productId) {
    //        this.productId = productId;
    //    }
}
