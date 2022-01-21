
package commercetools.extension;

import static commercetools.extension.ExtensionFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.extension.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Extension extension = createExtension();
        Extension deletedExtension = deleteExtension(extension.getId(), extension.getVersion());

        Assertions.assertEquals(extension.getId(), deletedExtension.getId());
    }

    @Test
    public void getById() {
        withExtension(extension -> {
            Extension queriedExtension = CommercetoolsTestUtils.getProjectApiRoot()
                    .extensions()
                    .withId(extension.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedExtension);
            Assertions.assertEquals(queriedExtension.getId(), extension.getId());
        });
    }

    @Test
    public void getByKey() {
        withExtension(extension -> {
            Extension queriedExtension = CommercetoolsTestUtils.getProjectApiRoot()
                    .extensions()
                    .withKey(extension.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedExtension);
            Assertions.assertEquals(queriedExtension.getId(), extension.getId());
        });
    }

    @Test
    public void query() {
        withExtension(extension -> {
            ExtensionPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .extensions()
                    .get()
                    .withWhere("id=" + "\"" + extension.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), extension.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableExtension(extension -> {
            List<ExtensionUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ExtensionSetKeyActionBuilder.of().key(newKey).build());
            Extension updatedExtension = CommercetoolsTestUtils.getProjectApiRoot()
                    .extensions()
                    .withId(extension.getId())
                    .post(ExtensionUpdateBuilder.of().actions(updateActions).version(extension.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedExtension);
            Assertions.assertEquals(updatedExtension.getKey(), newKey);

            return updatedExtension;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableExtension(extension -> {
            List<ExtensionUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ExtensionSetKeyActionBuilder.of().key(newKey).build());
            Extension updatedExtension = CommercetoolsTestUtils.getProjectApiRoot()
                    .extensions()
                    .withKey(extension.getKey())
                    .post(ExtensionUpdateBuilder.of().actions(updateActions).version(extension.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedExtension);
            Assertions.assertEquals(updatedExtension.getKey(), newKey);

            return updatedExtension;
        });
    }

    @Test
    public void deleteByKey() {
        Extension extension = createExtension();
        Extension deletedExtension = CommercetoolsTestUtils.getProjectApiRoot()
                .extensions()
                .withId(extension.getId())
                .delete()
                .withVersion(extension.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedExtension);
        Assertions.assertEquals(extension.getId(), deletedExtension.getId());
    }

}
