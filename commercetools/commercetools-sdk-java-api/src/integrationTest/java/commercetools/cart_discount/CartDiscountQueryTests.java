
package commercetools.cart_discount;

import static commercetools.cart_discount.CartDiscountFixtures.withCartDiscount;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartDiscountQueryTests {

    @Test
    public void getById() {
        withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCartDiscount);
            Assertions.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void getByKey() {
        withCartDiscount(cartDiscount -> {
            CartDiscount queriedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCartDiscount);
            Assertions.assertEquals(queriedCartDiscount.getId(), cartDiscount.getId());
        });
    }

    @Test
    public void queryById() {
        withCartDiscount(cartDiscount -> {
            CartDiscountPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .get()
                    .withWhere("id=" + "\"" + cartDiscount.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), cartDiscount.getId());
        });
    }

}
