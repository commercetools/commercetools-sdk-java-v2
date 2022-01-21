
package commercetools.discount_code;

import static commercetools.cart_discount.CartDiscountFixtures.*;
import static commercetools.discount_code.DiscountCodeFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.discount_code.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCodeIntegrationTests {

    @Test
    public void createAndDelete() {
        withCartDiscount(cartDiscount -> {
            DiscountCode discountCode = createDiscountCode(cartDiscount);
            deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
        });
    }

    @Test
    public void getById() {
        withDiscountCode(discountCode -> {
            DiscountCode queriedDiscountCode = CommercetoolsTestUtils.getProjectApiRoot()
                    .discountCodes()
                    .withId(discountCode.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedDiscountCode);
            Assertions.assertEquals(queriedDiscountCode.getId(), discountCode.getId());
        });
    }

    @Test
    public void query() {
        withDiscountCode(discountCode -> {
            DiscountCodePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .discountCodes()
                    .get()
                    .withWhere("id=" + "\"" + discountCode.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), discountCode.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableDiscountCode(discountCode -> {
            List<DiscountCodeUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(DiscountCodeSetMaxApplicationsActionBuilder.of().maxApplications(10L).build());
            DiscountCode updatedDiscountCode = CommercetoolsTestUtils.getProjectApiRoot()
                    .discountCodes()
                    .withId(discountCode.getId())
                    .post(DiscountCodeUpdateBuilder.of()
                            .actions(updateActions)
                            .version(discountCode.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedDiscountCode);
            Assertions.assertEquals(updatedDiscountCode.getMaxApplications(), Long.valueOf(10));

            return updatedDiscountCode;
        });
    }
}
