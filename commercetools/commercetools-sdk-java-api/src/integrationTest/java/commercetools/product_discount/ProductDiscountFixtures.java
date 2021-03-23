
package commercetools.product_discount;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.product_discount.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class ProductDiscountFixtures {

    public static void withProductDiscount(final Consumer<ProductDiscount> consumer) {
        ProductDiscount productDiscount = createProductDiscount();
        consumer.accept(productDiscount);
        deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
    }

    public static void withUpdateableProductDiscount(final UnaryOperator<ProductDiscount> operator) {
        ProductDiscount productDiscount = createProductDiscount();
        productDiscount = operator.apply(productDiscount);
        deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
    }

    public static ProductDiscount createProductDiscount() {

        ProductDiscountPagedQueryResponse existing = CommercetoolsTestUtils.getProjectRoot()
                .productDiscounts()
                .get()
                .withWhere("sortOrder=\"0.3\"")
                .executeBlocking()
                .getBody();

        if (existing.getCount() != 0) {
            String productDiscountId = existing.getResults().get(0).getId();
            Long productDiscountVersion = existing.getResults().get(0).getVersion();
            CommercetoolsTestUtils.getProjectRoot()
                    .productDiscounts()
                    .withId(productDiscountId)
                    .delete()
                    .withVersion(productDiscountVersion)
                    .executeBlocking();
        }

        ProductDiscountDraft productDiscountDraft = ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .value(ProductDiscountValueRelativeDraftBuilder.of().permyriad(1000L).build())
                .predicate("product.key=\"random-key\"")
                .sortOrder("0.3")
                .isActive(false)
                .validFrom(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                .validUntil(ZonedDateTime.now().plus(3, ChronoUnit.HOURS))
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getProjectRoot()
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(productDiscount);
        Assert.assertEquals(productDiscount.getKey(), productDiscountDraft.getKey());

        return productDiscount;
    }

    public static ProductDiscount deleteProductDiscount(final String id, final Long version) {
        ProductDiscount deletedProductDiscount = CommercetoolsTestUtils.getProjectRoot()
                .productDiscounts()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedProductDiscount);
        Assert.assertEquals(deletedProductDiscount.getId(), id);

        return deletedProductDiscount;
    }

}
