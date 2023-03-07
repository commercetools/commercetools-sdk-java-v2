
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.product_selection.ProductSelection;
import com.commercetools.api.models.product_selection.ProductSelectionUpdate;
import com.commercetools.api.models.product_selection.ProductSelectionUpdateAction;
import com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder;

public interface ByProjectKeyProductSelectionsRequestMixin {
    ByProjectKeyProductSelectionsPost post(
            com.commercetools.api.models.product_selection.ProductSelectionDraft productSelectionDraft);

    ByProjectKeyProductSelectionsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyProductSelectionsByIDPost update(Versioned<ProductSelection> productSelection,
            java.util.List<ProductSelectionUpdateAction> actions) {
        return withId(productSelection.getId()).post(
            builder -> ProductSelectionUpdate.builder().version(productSelection.getVersion()).actions(actions));
    }

    public default ByProjectKeyProductSelectionsByIDPost update(Versioned<ProductSelection> productSelection,
            UnaryOperator<UpdateActionBuilder<ProductSelectionUpdateAction, ProductSelectionUpdateActionBuilder>> op) {
        return withId(productSelection.getId()).post(builder -> ProductSelectionUpdate.builder()
                .version(productSelection.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ProductSelectionUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ProductSelectionUpdateAction, ProductSelectionUpdateActionBuilder, ByProjectKeyProductSelectionsByIDPost> update(
            Versioned<ProductSelection> productSelection) {
        return builder -> withId(productSelection.getId()).post(b -> ProductSelectionUpdate.builder()
                .version(productSelection.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ProductSelectionUpdateActionBuilder::of)).actions));
    }
}
