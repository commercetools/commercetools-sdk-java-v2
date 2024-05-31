
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StoreProductSelectionsChangedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StoreProductSelectionsChangedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StoreProductSelectionsChangedMessageExpansionBuilderDsl of() {
        return new StoreProductSelectionsChangedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static StoreProductSelectionsChangedMessageExpansionBuilderDsl of(final List<String> path) {
        return new StoreProductSelectionsChangedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl addedProductSelections() {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "addedProductSelections[*]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl addedProductSelections(
            long index) {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "addedProductSelections[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl removedProductSelections() {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "removedProductSelections[*]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl removedProductSelections(
            long index) {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "removedProductSelections[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl updatedProductSelections() {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "updatedProductSelections[*]"));
    }

    public com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl updatedProductSelections(
            long index) {
        return com.commercetools.api.predicates.expansion.store.ProductSelectionSettingExpansionBuilderDsl
                .of(appendOne(path, "updatedProductSelections[" + index + "]"));
    }
}
