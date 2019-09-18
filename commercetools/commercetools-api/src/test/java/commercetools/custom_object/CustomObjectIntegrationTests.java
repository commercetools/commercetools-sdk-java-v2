package commercetools.custom_object;

import com.commercetools.models.custom_object.CustomObject;
import com.commercetools.models.custom_object.CustomObjectDraft;
import com.commercetools.models.custom_object.CustomObjectDraftBuilder;
import com.commercetools.models.custom_object.CustomObjectPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class CustomObjectIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        CustomObject customObject = CustomObjectFixtures.createCustomObject();
        CustomObject deletedCustomObject = CustomObjectFixtures.deleteCustomObject(customObject.getId(), customObject.getVersion());

        Assert.assertEquals(customObject.getId(), deletedCustomObject.getId());
    }
    
    @Test
    public void getById() {
        CustomObjectFixtures.withCustomObject(customObject -> {
            CustomObject queriedCustomObject = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customObjects()
                    .withId(customObject.getId())
                    .get()
                    .executeBlocking().getBody();
            
            Assert.assertNotNull(queriedCustomObject);
            Assert.assertEquals(customObject.getId(), queriedCustomObject.getId());
        });
    }
    
    @Test
    public void update() {
        CustomObjectFixtures.withUpdateableCustomObject(customObject -> {
            String newValue = CommercetoolsTestUtils.randomString();
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value(newValue)
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedCustomObject);
            Assert.assertEquals(updatedCustomObject.getValue(), newValue);
            
            return updatedCustomObject;
        });
    }
    
    @Test
    public void query() {
        CustomObjectFixtures.withCustomObject(customObject -> {
            CustomObjectPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customObjects()
                    .get()
                    .addWhere("id=" + "\"" + customObject.getId() + "\"")
                    .executeBlocking().getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), customObject.getId());
        });
    }
}
