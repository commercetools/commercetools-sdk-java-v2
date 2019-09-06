package commercetools.discount_code;

import com.commercetools.models.DiscountCode.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.ArrayList;
import java.util.List;

@Execution(ExecutionMode.CONCURRENT)
public class DiscountCodeIntegrationTests {
    
    @Test
    public void createAndDelete() {
        DiscountCode discountCode = DiscountCodeFixtures.createDiscountCode();
        DiscountCodeFixtures.deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
    }
    
    @Test
    public void getById() {
        DiscountCodeFixtures.withDiscountCode(discountCode -> {
            DiscountCode queriedDiscountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .discountCodes()
                    .withId(discountCode.getId())
                    .get()
                    .executeBlocking();

            Assertions.assertNotNull(queriedDiscountCode);
            Assertions.assertEquals(queriedDiscountCode.getId(), discountCode.getId());
        });
    }
    
    @Test
    public void query() {
        DiscountCodeFixtures.withDiscountCode(discountCode -> {
            DiscountCodePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .discountCodes()
                    .get()
                    .addWhere("id=" + "\"" + discountCode.getId() + "\"")
                    .executeBlocking();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), discountCode.getId());
        });
    }
    
    @Test
    public void updateById() {
        DiscountCodeFixtures.withUpdateableDiscountCode(discountCode -> {
            List<DiscountCodeUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(DiscountCodeSetMaxApplicationsActionBuilder.of().maxApplications(10L).build());
            DiscountCode updatedDiscountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .discountCodes()
                    .withId(discountCode.getId())
                    .post(DiscountCodeUpdateBuilder.of()
                        .actions(updateActions)
                        .version(discountCode.getVersion())
                        .build())
                    .executeBlocking();

            Assertions.assertNotNull(updatedDiscountCode);
            Assertions.assertEquals(updatedDiscountCode.getMaxApplications(), Long.valueOf(10));
            
            return updatedDiscountCode;
        });
    }
    
}