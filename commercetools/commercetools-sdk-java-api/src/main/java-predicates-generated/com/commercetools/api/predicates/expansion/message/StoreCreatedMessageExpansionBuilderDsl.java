
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StoreCreatedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StoreCreatedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StoreCreatedMessageExpansionBuilderDsl of() {
        return new StoreCreatedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static StoreCreatedMessageExpansionBuilderDsl of(final List<String> path) {
        return new StoreCreatedMessageExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl distributionChannels() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "distributionChannels[*]"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl distributionChannels(
            long index) {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "distributionChannels[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl supplyChannels() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "supplyChannels[*]"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl supplyChannels(
            long index) {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "supplyChannels[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl productSelections() {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "productSelections[*]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl productSelections(
            long index) {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "productSelections[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
