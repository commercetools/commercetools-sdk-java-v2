
package commercetools.tax_category;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.tax_category.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class TaxCategoryFixtures {

    public static void withTaxCategory(Consumer<TaxCategory> consumer) {
        TaxCategory taxCategory = createTaxCategory();
        consumer.accept(taxCategory);
        deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
    }

    public static void withUpdateableTaxCategory(UnaryOperator<TaxCategory> operator) {
        TaxCategory taxCategory = createTaxCategory();
        taxCategory = operator.apply(taxCategory);
        deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
    }

    public static TaxCategory createTaxCategory() {
        TaxCategoryDraft taxCategoryDraft = TaxCategoryDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomString())
                .rates(TaxRateDraftBuilder.of()
                        .name(CommercetoolsTestUtils.randomString())
                        .amount(0.19)
                        .includedInPrice(true)
                        .country("DE")
                        .state("Berlin")
                        .subRates(Arrays.asList(
                            SubRateBuilder.of().name(CommercetoolsTestUtils.randomString()).amount(0.19).build()))
                        .build())
                .build();

        TaxCategory taxCategory = CommercetoolsTestUtils.getProjectRoot()
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(taxCategory);
        Assert.assertEquals(taxCategoryDraft.getName(), taxCategory.getName());
        Assert.assertEquals(taxCategoryDraft.getKey(), taxCategory.getKey());

        return taxCategory;
    }

    public static TaxCategory deleteTaxCategory(final String id, final Long version) {
        TaxCategory deletedTaxCategory = CommercetoolsTestUtils.getProjectRoot()
                .taxCategories()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedTaxCategory);
        Assert.assertEquals(deletedTaxCategory.getId(), id);

        return deletedTaxCategory;
    }

}
