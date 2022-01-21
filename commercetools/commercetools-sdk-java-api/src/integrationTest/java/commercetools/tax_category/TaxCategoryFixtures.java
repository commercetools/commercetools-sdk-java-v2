
package commercetools.tax_category;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.tax_category.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class TaxCategoryFixtures {

    public static void withTaxCategory(Consumer<TaxCategory> consumer) {
        TaxCategory taxCategory = createTaxCategory();
        try {
            consumer.accept(taxCategory);
        }
        finally {
            deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
        }
    }

    public static void withUpdateableTaxCategory(UnaryOperator<TaxCategory> operator) {
        TaxCategory taxCategory = createTaxCategory();
        try {
            taxCategory = operator.apply(taxCategory);
        }
        finally {
            deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
        }
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

        TaxCategory taxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(taxCategory);
        Assertions.assertEquals(taxCategoryDraft.getName(), taxCategory.getName());
        Assertions.assertEquals(taxCategoryDraft.getKey(), taxCategory.getKey());

        return taxCategory;
    }

    public static TaxCategory deleteTaxCategory(final String id, final Long version) {
        TaxCategory deletedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .taxCategories()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedTaxCategory);
        Assertions.assertEquals(deletedTaxCategory.getId(), id);

        return deletedTaxCategory;
    }

}
