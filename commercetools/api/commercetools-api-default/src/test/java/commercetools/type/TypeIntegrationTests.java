package commercetools.type;

import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
            Type queriedType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .withId(type.getId())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedType);
            Assert.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void getByKey() {
        TypeFixtures.withType(type -> {
            Type queriedType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .withKey(type.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assert.assertNotNull(queriedType);
            Assert.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void query() {
        TypeFixtures.withType(type -> {
            TypePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .get()
                    .addWhere("id=" + "\"" + type.getId() + "\"")
                    .executeBlocking().getBody();

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

            Type updatedType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .withId(type.getId())
                    .post(TypeUpdateBuilder.of()
                            .actions(updateActions)
                            .version(type.getVersion())
                            .build())
                    .executeBlocking().getBody();

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

            Type updatedType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .withKey(type.getKey())
                    .post(TypeUpdateBuilder.of()
                            .actions(updateActions)
                            .version(type.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedType);
            Assert.assertEquals(updatedType.getKey(), newKey);

            return updatedType;
        });
    }

    @Test
    public void deleteByKey() {
        Type type = TypeFixtures.createType();
        Type deletedType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .types()
                .withKey(type.getKey())
                .delete()
                .addVersion(type.getVersion())
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedType);
        Assert.assertEquals(type.getId(), deletedType.getId());
    }

}
