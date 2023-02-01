
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.extension.ExtensionDraft;
import com.commercetools.api.models.extension.ExtensionDraftBuilder;
import com.commercetools.api.models.extension.ExtensionUpdate;
import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionUpdateActionBuilder;

public interface ByProjectKeyExtensionsRequestBuilderMixin {
    public ByProjectKeyExtensionsPost post(ExtensionDraft extensionDraft);

    public ByProjectKeyExtensionsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyExtensionsByIDPost update(Versioned<Extension> extension,
            List<ExtensionUpdateAction> actions) {
        return withId(extension.getId())
                .post(builder -> ExtensionUpdate.builder().version(extension.getVersion()).actions(actions));
    }

    public default ByProjectKeyExtensionsByIDPost update(Versioned<Extension> extension,
            UnaryOperator<UpdateActionBuilder<ExtensionUpdateAction, ExtensionUpdateActionBuilder>> op) {
        return withId(extension.getId()).post(builder -> ExtensionUpdate.builder()
                .version(extension.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ExtensionUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ExtensionUpdateAction, ExtensionUpdateActionBuilder, ByProjectKeyExtensionsByIDPost> update(
            Versioned<Extension> extension) {
        return builder -> withId(extension.getId()).post(b -> ExtensionUpdate.builder()
                .version(extension.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ExtensionUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyExtensionsByIDDelete delete(Versioned<Extension> extension) {
        return withId(extension.getId()).delete().withVersion(extension.getVersion());
    }

    public default ByProjectKeyExtensionsPost create(ExtensionDraft extensionDraft) {
        return post(extensionDraft);
    }

    public default ByProjectKeyExtensionsPost create(UnaryOperator<ExtensionDraftBuilder> op) {
        return post(op.apply(ExtensionDraftBuilder.of()).build());
    }

}
