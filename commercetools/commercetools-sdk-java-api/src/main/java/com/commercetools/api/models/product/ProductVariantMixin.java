
package com.commercetools.api.models.product;

import javax.annotation.Nullable;

public interface ProductVariantMixin extends AttributeContainer {
    /**
     * Gets the id of the product and the variant. This operation may not be available.
     * It will be available if this {@link ProductVariant} has been created
     * by loading a {@link Product} or a {@link ProductProjection} from JSON.
     * @return identifier for this variant
     * @throws UnsupportedOperationException if the operation is not available
     */
    @Nullable
    ByIdVariantIdentifier getIdentifier();
}
