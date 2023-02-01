
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryDraft;
import com.commercetools.api.models.tax_category.TaxCategoryDraftBuilder;
import com.commercetools.api.models.tax_category.TaxCategoryUpdate;
import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder;

public interface ByProjectKeyTaxCategoriesRequestBuilderMixin {
    public ByProjectKeyTaxCategoriesPost post(TaxCategoryDraft taxCategoryDraft);

    public ByProjectKeyTaxCategoriesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyTaxCategoriesByIDPost update(Versioned<TaxCategory> taxCategory,
            List<TaxCategoryUpdateAction> actions) {
        return withId(taxCategory.getId())
                .post(builder -> TaxCategoryUpdate.builder().version(taxCategory.getVersion()).actions(actions));
    }

    public default ByProjectKeyTaxCategoriesByIDPost update(Versioned<TaxCategory> taxCategory,
            UnaryOperator<UpdateActionBuilder<TaxCategoryUpdateAction, TaxCategoryUpdateActionBuilder>> op) {
        return withId(taxCategory.getId()).post(builder -> TaxCategoryUpdate.builder()
                .version(taxCategory.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(TaxCategoryUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<TaxCategoryUpdateAction, TaxCategoryUpdateActionBuilder, ByProjectKeyTaxCategoriesByIDPost> update(
            Versioned<TaxCategory> taxCategory) {
        return builder -> withId(taxCategory.getId()).post(b -> TaxCategoryUpdate.builder()
                .version(taxCategory.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(TaxCategoryUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyTaxCategoriesByIDDelete delete(Versioned<TaxCategory> taxCategory) {
        return withId(taxCategory.getId()).delete().withVersion(taxCategory.getVersion());
    }

    public default ByProjectKeyTaxCategoriesPost create(TaxCategoryDraft taxCategoryDraft) {
        return post(taxCategoryDraft);
    }

    public default ByProjectKeyTaxCategoriesPost create(UnaryOperator<TaxCategoryDraftBuilder> op) {
        return post(op.apply(TaxCategoryDraftBuilder.of()).build());
    }
}
