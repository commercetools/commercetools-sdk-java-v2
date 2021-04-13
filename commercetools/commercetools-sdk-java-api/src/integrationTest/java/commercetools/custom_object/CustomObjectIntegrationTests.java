
package commercetools.custom_object;

import java.util.Map;

import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectDraft;
import com.commercetools.api.models.custom_object.CustomObjectDraftBuilder;
import com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.ValueObject;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.Assert;
import org.junit.Test;

public class CustomObjectIntegrationTests {

    @Test
    public void createAndDeleteById() {
        CustomObject customObject = CustomObjectFixtures.createCustomObject();
        CustomObject deletedCustomObject = CustomObjectFixtures.deleteCustomObject(customObject.getContainer(),
            customObject.getKey(), customObject.getVersion());

        Assert.assertEquals(customObject.getId(), deletedCustomObject.getId());
    }

    @Test
    public void getByContainerKey() {
        CustomObjectFixtures.withCustomObject(customObject -> {
            CustomObject queriedCustomObject = CommercetoolsTestUtils.getProjectRoot()
                    .customObjects()
                    .withContainerAndKey(customObject.getContainer(), customObject.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCustomObject);
            Assert.assertEquals(customObject.getId(), queriedCustomObject.getId());
        });
    }

    @Test
    public void update() {
        CustomObjectFixtures.withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value((ValueObject) () -> "foo")
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomObject);
            Assert.assertEquals(((Map<String, Object>) updatedCustomObject.getValue()).get("value"), "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void updateWithJsonNode() {
        CustomObjectFixtures.withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value(JsonUtils.getConfiguredObjectMapper().createObjectNode().put("value", "foo"))
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomObject);
            Assert.assertEquals(((Map<String, Object>) updatedCustomObject.getValue()).get("value"), "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void query() {
        CustomObjectFixtures.withCustomObject(customObject -> {
            CustomObjectPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .customObjects()
                    .get()
                    .withWhere("id=" + "\"" + customObject.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), customObject.getId());
        });
    }
}
