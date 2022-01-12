
package commercetools.shipping_method;

import static commercetools.shipping_method.ShippingMethodFixtures.*;
import static commercetools.tax_category.TaxCategoryFixtures.*;
import static commercetools.zone.ZoneFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.shipping_method.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ShippingMethodIntegrationTests {

    @Test
    public void createAndDeleteById() {
        withZone(zone -> withTaxCategory(taxCategory -> {
            ShippingMethod shippingMethod = createShippingMethod(taxCategory, zone);
            deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
        }));
    }

    @Test
    public void getById() {
        withShippingMethod(shippingMethod -> {
            ShippingMethod queriedShippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .withId(shippingMethod.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedShippingMethod);
            Assert.assertEquals(queriedShippingMethod.getId(), shippingMethod.getId());
        });
    }

    @Test
    public void getByKey() {
        withShippingMethod(shippingMethod -> {
            ShippingMethod queriedShippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .withKey(shippingMethod.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedShippingMethod);
            Assert.assertEquals(queriedShippingMethod.getId(), shippingMethod.getId());
        });
    }

    @Test
    public void query() {
        withShippingMethod(shippingMethod -> {
            ShippingMethodPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .get()
                    .withWhere("id=" + "\"" + shippingMethod.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), shippingMethod.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableShippingMethod(shippingMethod -> {
            List<ShippingMethodUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShippingMethodSetKeyActionBuilder.of().key(newKey).build());

            ShippingMethod updatedShippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .withId(shippingMethod.getId())
                    .post(ShippingMethodUpdateBuilder.of()
                            .actions(updateActions)
                            .version(shippingMethod.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedShippingMethod);
            Assert.assertEquals(updatedShippingMethod.getKey(), newKey);

            return updatedShippingMethod;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableShippingMethod(shippingMethod -> {
            List<ShippingMethodUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ShippingMethodSetKeyActionBuilder.of().key(newKey).build());

            ShippingMethod updatedShippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .withKey(shippingMethod.getKey())
                    .post(ShippingMethodUpdateBuilder.of()
                            .actions(updateActions)
                            .version(shippingMethod.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedShippingMethod);
            Assert.assertEquals(updatedShippingMethod.getKey(), newKey);

            return updatedShippingMethod;
        });
    }

    @Test
    public void deleteByKey() {
        withZone(zone -> withTaxCategory(taxCategory -> {
            ShippingMethod shippingMethod = createShippingMethod(taxCategory, zone);
            ShippingMethod deletedShippingMethod = CommercetoolsTestUtils.getProjectApiRoot()
                    .shippingMethods()
                    .withKey(shippingMethod.getKey())
                    .delete()
                    .withVersion(shippingMethod.getVersion())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(deletedShippingMethod);
            Assert.assertEquals(shippingMethod.getId(), deletedShippingMethod.getId());
        }));

    }
}
