package commercetools.shipping_method;

import com.commercetools.api.generated.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.generated.models.common.HighPrecisionMoneyDraftBuilder;
import com.commercetools.api.generated.models.shipping_method.*;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import com.commercetools.api.generated.models.zone.Zone;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifierBuilder;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.zone.ZoneFixtures;
import org.junit.Assert;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ShippingMethodFixtures {
    
    public static void withShippingMethod(final Consumer<ShippingMethod> consumer) {
        ShippingMethod shippingMethod = createShippingMethod();
        consumer.accept(shippingMethod);
        deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
    }
   
    public static void withUpdateableShippingMethod(final UnaryOperator<ShippingMethod> operator) {
        ShippingMethod shippingMethod = createShippingMethod();
        shippingMethod = operator.apply(shippingMethod);
        deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
    }
    
    public static ShippingMethod createShippingMethod() {
        TaxCategory taxCategory = TaxCategoryFixtures.createTaxCategory();
        Zone zone = ZoneFixtures.createZone();
        HighPrecisionMoneyDraft highPrecisionMoney = HighPrecisionMoneyDraftBuilder.of()
                .centAmount(100L)
                .currencyCode("EUR")
                .preciseAmount(20L)
                .build();
        
        ShippingMethodDraft shippingMethodDraft = ShippingMethodDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomString())
                .taxCategory(TaxCategoryResourceIdentifierBuilder.of()
                    .id(taxCategory.getId())
                    .build())
                .zoneRates(Arrays.asList(ZoneRateDraftBuilder.of()
                        .zone(ZoneResourceIdentifierBuilder.of()
                                .id(zone.getId())
                                .build())
                        .shippingRates(Arrays.asList(ShippingRateDraftBuilder.of()
                                .price(highPrecisionMoney)
                                .build()))
                        .build()))
                .isDefault(false)
                .build();

        ShippingMethod shippingMethod = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .shippingMethods()
                .post(shippingMethodDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(shippingMethod);
        Assert.assertEquals(shippingMethodDraft.getKey(), shippingMethod.getKey());
        
        return shippingMethod;
    }
    
    public static ShippingMethod deleteShippingMethod(final String id, final Long version) {
        ShippingMethod shippingMethod = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .shippingMethods()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(shippingMethod);
        Assert.assertEquals(shippingMethod.getId(), id);
        
        return shippingMethod;
    }
    
}
