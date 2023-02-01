
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.api.models.product.ProductDraftBuilder;
import com.commercetools.api.models.product.ProductUpdate;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductUpdateActionBuilder;

public interface ByProjectKeyProductsRequestBuilderMixin {
    public ByProjectKeyProductsPost post(ProductDraft productDraft);

    public ByProjectKeyProductsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyProductsByIDPost update(Versioned<Product> product,
            java.util.List<ProductUpdateAction> actions) {
        return withId(product.getId())
                .post(builder -> ProductUpdate.builder().version(product.getVersion()).actions(actions));
    }

    public default ByProjectKeyProductsByIDPost update(Versioned<Product> product,
            UnaryOperator<UpdateActionBuilder<ProductUpdateAction, ProductUpdateActionBuilder>> op) {
        return withId(product.getId()).post(builder -> ProductUpdate.builder()
                .version(product.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ProductUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ProductUpdateAction, ProductUpdateActionBuilder, ByProjectKeyProductsByIDPost> update(
            Versioned<Product> product) {
        return builder -> withId(product.getId()).post(b -> ProductUpdate.builder()
                .version(product.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ProductUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyProductsByIDDelete delete(Versioned<Product> product) {
        return withId(product.getId()).delete().withVersion(product.getVersion());
    }

    public default ByProjectKeyProductsPost create(ProductDraft productDraft) {
        return post(productDraft);
    }

    public default ByProjectKeyProductsPost create(UnaryOperator<ProductDraftBuilder> op) {
        return post(op.apply(ProductDraftBuilder.of()).build());
    }
}
