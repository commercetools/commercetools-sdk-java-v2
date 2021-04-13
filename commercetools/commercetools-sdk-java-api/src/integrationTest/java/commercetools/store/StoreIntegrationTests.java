
package commercetools.store;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class StoreIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Store store = StoreFixtures.createStore();
        Store deletedStore = StoreFixtures.deleteStore(store.getId(), store.getVersion());

        Assert.assertEquals(store.getId(), deletedStore.getId());
    }

    @Test
    public void getById() {
        StoreFixtures.withStore(store -> {
            Store queriedStore = CommercetoolsTestUtils.getProjectRoot()
                    .stores()
                    .withId(store.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedStore);
            Assert.assertEquals(queriedStore.getId(), store.getId());
        });
    }

    @Test
    public void getByKey() {
        StoreFixtures.withStore(store -> {
            Store queriedStore = CommercetoolsTestUtils.getProjectRoot()
                    .stores()
                    .withKey(store.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedStore);
            Assert.assertEquals(queriedStore.getId(), store.getId());
        });
    }

    @Test
    public void query() {
        StoreFixtures.withStore(store -> {
            StorePagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .stores()
                    .get()
                    .withWhere("id=" + "\"" + store.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), store.getId());
        });
    }

    @Test
    public void updateById() {
        StoreFixtures.withUpdateableStore(store -> {
            List<StoreUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(StoreSetNameActionBuilder.of().name(newName).build());

            Store updatedStore = CommercetoolsTestUtils.getProjectRoot()
                    .stores()
                    .withId(store.getId())
                    .post(StoreUpdateBuilder.of().actions(updateActions).version(store.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedStore);

            return updatedStore;
        });
    }

    @Test
    public void updateByKey() {
        StoreFixtures.withUpdateableStore(store -> {
            List<StoreUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(StoreSetNameActionBuilder.of().name(newName).build());

            Store updatedStore = CommercetoolsTestUtils.getProjectRoot()
                    .stores()
                    .withKey(store.getKey())
                    .post(StoreUpdateBuilder.of().actions(updateActions).version(store.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedStore);

            return updatedStore;
        });
    }

    @Test
    public void deleteByKey() {
        Store store = StoreFixtures.createStore();
        Store deletedStore = CommercetoolsTestUtils.getProjectRoot()
                .stores()
                .withKey(store.getKey())
                .delete()
                .withVersion(store.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedStore);
        Assert.assertEquals(store.getId(), deletedStore.getId());
    }

}
