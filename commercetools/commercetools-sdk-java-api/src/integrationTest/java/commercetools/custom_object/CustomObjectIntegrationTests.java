
package commercetools.custom_object;

import static commercetools.custom_object.CustomObjectFixtures.*;

import java.util.Map;

import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectDraft;
import com.commercetools.api.models.custom_object.CustomObjectDraftBuilder;
import com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.ValueObject;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomObjectIntegrationTests {

    @Test
    public void createAndDeleteById() {
        CustomObject customObject = createCustomObject();
        CustomObject deletedCustomObject = deleteCustomObject(customObject.getContainer(), customObject.getKey(),
            customObject.getVersion());

        Assertions.assertEquals(customObject.getId(), deletedCustomObject.getId());
    }

    @Test
    public void getByContainerKey() {
        withCustomObject(customObject -> {
            CustomObject queriedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .withContainerAndKey(customObject.getContainer(), customObject.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomObject);
            Assertions.assertEquals(customObject.getId(), queriedCustomObject.getId());
        });
    }

    @Test
    public void update() {
        withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value((ValueObject) () -> "foo")
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomObject);
            Assertions.assertEquals(((Map<String, Object>) updatedCustomObject.getValue()).get("value"), "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void updateWithJsonNode() {
        withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value(JsonUtils.getConfiguredObjectMapper().createObjectNode().put("value", "foo"))
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomObject);
            Assertions.assertEquals(((Map<String, Object>) updatedCustomObject.getValue()).get("value"), "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void query() {
        withCustomObject(customObject -> {
            CustomObjectPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .get()
                    .withWhere("id=" + "\"" + customObject.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), customObject.getId());
        });
    }
}
