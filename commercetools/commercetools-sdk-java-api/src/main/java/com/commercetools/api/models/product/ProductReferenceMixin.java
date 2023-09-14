
package com.commercetools.api.models.product;

import com.commercetools.api.models.common.ReferenceMixin;

public interface ProductReferenceMixin extends ReferenceMixin {
    public String getId();

    public default ProductResourceIdentifier toResourceIdentifier() {
        return ProductResourceIdentifier.builder().id(this.getId()).build();
    }
}
