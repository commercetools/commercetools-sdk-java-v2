
package commercetools.shipping_method;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder;
import com.commercetools.api.models.shipping_method.*;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.zone.ZoneFixtures;

import org.junit.jupiter.api.Assertions;

public class ShippingMethodFixtures {

    public static void withShippingMethod(final Consumer<ShippingMethod> consumer) {
        ZoneFixtures.withZone(zone -> {
            TaxCategoryFixtures.withTaxCategory(taxCategory -> {
                ShippingMethod shippingMethod = createShippingMethod(taxCategory, zone);
                consumer.accept(shippingMethod);
                deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
            });
        });
    }

    public static void withUpdateableShippingMethod(final UnaryOperator<ShippingMethod> operator) {
        ZoneFixtures.withZone(zone -> {
            TaxCategoryFixtures.withTaxCategory(taxCategory -> {
                ShippingMethod shippingMethod = createShippingMethod(taxCategory, zone);
                shippingMethod = operator.apply(shippingMethod);
                deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
            });
        });
    }

    public static ShippingMethod createShippingMethod(TaxCategory taxCategory, Zone zone) {
        HighPrecisionMoneyDraft highPrecisionMoney = HighPrecisionMoneyDraftBuilder.of()
                .centAmount(100L)
                .currencyCode("EUR")
                .preciseAmount(20L)
                .build();

        ShippingMethodDraft shippingMethodDraft = ShippingMethodDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomString())
                .taxCategory(TaxCategoryResourceIdentifierBuilder.of().id(taxCategory.getId()).build())
                .zoneRates(Arrays.asList(ZoneRateDraftBuilder.of()
                        .zone(ZoneResourceIdentifierBuilder.of().id(zone.getId()).build())
                        .shippingRates(Arrays.asList(ShippingRateDraftBuilder.of().price(highPrecisionMoney).build()))
                        .build()))
                .isDefault(false)
                .build();

        ShippingMethod shippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                .shippingMethods()
                .post(shippingMethodDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(shippingMethod);
        Assertions.assertEquals(shippingMethodDraft.getKey(), shippingMethod.getKey());

        return shippingMethod;
    }

    public static ShippingMethod deleteShippingMethod(final String id, final Long version) {
        ShippingMethod shippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                .shippingMethods()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(shippingMethod);
        Assertions.assertEquals(shippingMethod.getId(), id);

        return shippingMethod;
    }

}
