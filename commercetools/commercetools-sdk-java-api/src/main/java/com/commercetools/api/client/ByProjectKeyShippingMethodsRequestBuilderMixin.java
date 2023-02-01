
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdate;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder;

public interface ByProjectKeyShippingMethodsRequestBuilderMixin {
    public ByProjectKeyShippingMethodsPost post(ShippingMethodDraft shippingMethodDraft);

    public ByProjectKeyShippingMethodsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyShippingMethodsByIDPost update(Versioned<ShippingMethod> shippingMethod,
            List<ShippingMethodUpdateAction> actions) {
        return withId(shippingMethod.getId())
                .post(builder -> ShippingMethodUpdate.builder().version(shippingMethod.getVersion()).actions(actions));
    }

    public default ByProjectKeyShippingMethodsByIDPost update(Versioned<ShippingMethod> shippingMethod,
            UnaryOperator<UpdateActionBuilder<ShippingMethodUpdateAction, ShippingMethodUpdateActionBuilder>> op) {
        return withId(shippingMethod.getId()).post(builder -> ShippingMethodUpdate.builder()
                .version(shippingMethod.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ShippingMethodUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ShippingMethodUpdateAction, ShippingMethodUpdateActionBuilder, ByProjectKeyShippingMethodsByIDPost> update(
            Versioned<ShippingMethod> shippingMethod) {
        return builder -> withId(shippingMethod.getId()).post(b -> ShippingMethodUpdate.builder()
                .version(shippingMethod.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ShippingMethodUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyShippingMethodsByIDDelete delete(Versioned<ShippingMethod> shippingMethod) {
        return withId(shippingMethod.getId()).delete().withVersion(shippingMethod.getVersion());
    }

    public default ByProjectKeyShippingMethodsPost create(ShippingMethodDraft shippingMethodDraft) {
        return post(shippingMethodDraft);
    }

    public default ByProjectKeyShippingMethodsPost create(UnaryOperator<ShippingMethodDraftBuilder> op) {
        return post(op.apply(ShippingMethodDraftBuilder.of()).build());
    }
}
