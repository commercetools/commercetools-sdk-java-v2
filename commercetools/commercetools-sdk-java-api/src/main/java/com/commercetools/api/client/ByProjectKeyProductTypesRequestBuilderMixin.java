
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import com.commercetools.api.models.product_type.ProductTypeDraftBuilder;
import com.commercetools.api.models.product_type.ProductTypeUpdate;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder;

public interface ByProjectKeyProductTypesRequestBuilderMixin {
    public ByProjectKeyProductTypesPost post(ProductTypeDraft productTypeDraft);

    public ByProjectKeyProductTypesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyProductTypesByIDPost update(Versioned<ProductType> productType,
            List<ProductTypeUpdateAction> actions) {
        return withId(productType.getId())
                .post(builder -> ProductTypeUpdate.builder().version(productType.getVersion()).actions(actions));
    }

    public default ByProjectKeyProductTypesByIDPost update(Versioned<ProductType> productType,
            UnaryOperator<UpdateActionBuilder<ProductTypeUpdateAction, ProductTypeUpdateActionBuilder>> op) {
        return withId(productType.getId()).post(builder -> ProductTypeUpdate.builder()
                .version(productType.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ProductTypeUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ProductTypeUpdateAction, ProductTypeUpdateActionBuilder, ByProjectKeyProductTypesByIDPost> update(
            Versioned<ProductType> productType) {
        return builder -> withId(productType.getId()).post(b -> ProductTypeUpdate.builder()
                .version(productType.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ProductTypeUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyProductTypesByIDDelete delete(Versioned<ProductType> productType) {
        return withId(productType.getId()).delete().withVersion(productType.getVersion());
    }

    public default ByProjectKeyProductTypesPost create(ProductTypeDraft productTypeDraft) {
        return post(productTypeDraft);
    }

    public default ByProjectKeyProductTypesPost create(UnaryOperator<ProductTypeDraftBuilder> op) {
        return post(op.apply(ProductTypeDraftBuilder.of()).build());
    }
}
