
package commercetools.type;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class TypeIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Type type = TypeFixtures.createType();
        Type deletedType = TypeFixtures.deleteType(type.getId(), type.getVersion());

        Assert.assertEquals(type.getId(), deletedType.getId());
    }

    @Test
    public void getById() {
        TypeFixtures.withType(type -> {
            Type queriedType = CommercetoolsTestUtils.getProjectRoot()
                    .types()
                    .withId(type.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedType);
            Assert.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void getByKey() {
        TypeFixtures.withType(type -> {
            Type queriedType = CommercetoolsTestUtils.getProjectRoot()
                    .types()
                    .withKey(type.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedType);
            Assert.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void query() {
        TypeFixtures.withType(type -> {
            TypePagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .types()
                    .get()
                    .withWhere("id=" + "\"" + type.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), type.getId());
        });
    }

    @Test
    public void updateById() {
        TypeFixtures.withUpdateableType(type -> {
            List<TypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TypeChangeKeyActionBuilder.of().key(newKey).build());

            Type updatedType = CommercetoolsTestUtils.getProjectRoot()
                    .types()
                    .withId(type.getId())
                    .post(TypeUpdateBuilder.of().actions(updateActions).version(type.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedType);
            Assert.assertEquals(updatedType.getKey(), newKey);

            return updatedType;
        });
    }

    @Test
    public void updateByKey() {
        TypeFixtures.withUpdateableType(type -> {
            List<TypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TypeChangeKeyActionBuilder.of().key(newKey).build());

            Type updatedType = CommercetoolsTestUtils.getProjectRoot()
                    .types()
                    .withKey(type.getKey())
                    .post(TypeUpdateBuilder.of().actions(updateActions).version(type.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedType);
            Assert.assertEquals(updatedType.getKey(), newKey);

            return updatedType;
        });
    }

    @Test
    public void deleteByKey() {
        Type type = TypeFixtures.createType();
        Type deletedType = CommercetoolsTestUtils.getProjectRoot()
                .types()
                .withKey(type.getKey())
                .delete()
                .withVersion(type.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedType);
        Assert.assertEquals(type.getId(), deletedType.getId());
    }

}
