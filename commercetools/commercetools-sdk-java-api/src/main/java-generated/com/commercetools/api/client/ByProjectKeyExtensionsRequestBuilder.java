
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsRequestBuilder implements ByProjectKeyExtensionsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyExtensionsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyExtensionsGet get() {
        return new ByProjectKeyExtensionsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyExtensionsPost post(com.commercetools.api.models.extension.ExtensionDraft extensionDraft) {
        return new ByProjectKeyExtensionsPost(apiHttpClient, projectKey, extensionDraft);
    }

    public ByProjectKeyExtensionsPost post(
            UnaryOperator<com.commercetools.api.models.extension.ExtensionDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.extension.ExtensionDraftBuilder.of()).build());
    }

    public ByProjectKeyExtensionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyExtensionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyExtensionsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyExtensionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyExtensionsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.extension.Extension> extension,
            java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions) {
        return withId(extension.getId())
                .post(builder -> com.commercetools.api.models.extension.ExtensionUpdate.builder()
                        .version(extension.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyExtensionsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.extension.Extension> extension,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.extension.ExtensionUpdateAction, com.commercetools.api.models.extension.ExtensionUpdateActionBuilder>> op) {
        return withId(extension.getId())
                .post(builder -> com.commercetools.api.models.extension.ExtensionUpdate.builder()
                        .version(extension.getVersion())
                        .actions(op.apply(UpdateActionBuilder
                                .of(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.extension.ExtensionUpdateAction, com.commercetools.api.models.extension.ExtensionUpdateActionBuilder, ByProjectKeyExtensionsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.extension.Extension> extension) {
        return builder -> withId(extension.getId())
                .post(b -> com.commercetools.api.models.extension.ExtensionUpdate.builder()
                        .version(extension.getVersion())
                        .actions(builder.apply(UpdateActionBuilder
                                .of(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyExtensionsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.extension.Extension> extension) {
        return withId(extension.getId()).delete().withVersion(extension.getVersion());
    }

    public ByProjectKeyExtensionsPost create(com.commercetools.api.models.extension.ExtensionDraft extensionDraft) {
        return post(extensionDraft);
    }

    public ByProjectKeyExtensionsPost create(
            UnaryOperator<com.commercetools.api.models.extension.ExtensionDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.extension.ExtensionDraftBuilder.of()).build());
    }

}
