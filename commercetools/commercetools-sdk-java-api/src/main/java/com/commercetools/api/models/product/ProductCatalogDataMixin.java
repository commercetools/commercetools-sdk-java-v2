
package com.commercetools.api.models.product;

public interface ProductCatalogDataMixin {
    ProductData getCurrent();

    ProductData getStaged();

    default ProductData get(ProductProjectionType productProjectionType) {
        if (productProjectionType.isStaged()) {
            return getStaged();
        }
        return getCurrent();
    }
}
