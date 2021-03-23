
package commercetools.extension;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.extension.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ExtensionIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Extension extension = ExtensionFixtures.createExtension();
        Extension deletedExtension = ExtensionFixtures.deleteExtension(extension.getId(), extension.getVersion());

        Assert.assertEquals(extension.getId(), deletedExtension.getId());
    }

    @Test
    public void getById() {
        ExtensionFixtures.withExtension(extension -> {
            Extension queriedExtension = CommercetoolsTestUtils.getProjectRoot()
                    .extensions()
                    .withId(extension.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedExtension);
            Assert.assertEquals(queriedExtension.getId(), extension.getId());
        });
    }

    @Test
    public void getByKey() {
        ExtensionFixtures.withExtension(extension -> {
            Extension queriedExtension = CommercetoolsTestUtils.getProjectRoot()
                    .extensions()
                    .withKey(extension.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedExtension);
            Assert.assertEquals(queriedExtension.getId(), extension.getId());
        });
    }

    @Test
    public void query() {
        ExtensionFixtures.withExtension(extension -> {
            ExtensionPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .extensions()
                    .get()
                    .withWhere("id=" + "\"" + extension.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), extension.getId());
        });
    }

    @Test
    public void updateById() {
        ExtensionFixtures.withUpdateableExtension(extension -> {
            List<ExtensionUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ExtensionSetKeyActionBuilder.of().key(newKey).build());
            Extension updatedExtension = CommercetoolsTestUtils.getProjectRoot()
                    .extensions()
                    .withId(extension.getId())
                    .post(ExtensionUpdateBuilder.of().actions(updateActions).version(extension.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedExtension);
            Assert.assertEquals(updatedExtension.getKey(), newKey);

            return updatedExtension;
        });
    }

    @Test
    public void updateByKey() {
        ExtensionFixtures.withUpdateableExtension(extension -> {
            List<ExtensionUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ExtensionSetKeyActionBuilder.of().key(newKey).build());
            Extension updatedExtension = CommercetoolsTestUtils.getProjectRoot()
                    .extensions()
                    .withKey(extension.getKey())
                    .post(ExtensionUpdateBuilder.of().actions(updateActions).version(extension.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedExtension);
            Assert.assertEquals(updatedExtension.getKey(), newKey);

            return updatedExtension;
        });
    }

    @Test
    public void deleteByKey() {
        Extension extension = ExtensionFixtures.createExtension();
        Extension deletedExtension = CommercetoolsTestUtils.getProjectRoot()
                .extensions()
                .withId(extension.getId())
                .delete()
                .withVersion(extension.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedExtension);
        Assert.assertEquals(extension.getId(), deletedExtension.getId());
    }

}
