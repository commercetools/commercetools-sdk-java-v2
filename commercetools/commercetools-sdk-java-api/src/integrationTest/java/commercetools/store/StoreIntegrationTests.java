
package commercetools.store;

import static commercetools.store.StoreFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Store store = createStore();
        Store deletedStore = deleteStore(store.getId(), store.getVersion());

        Assertions.assertEquals(store.getId(), deletedStore.getId());
    }

    @Test
    public void getById() {
        withStore(store -> {
            Store queriedStore = CommercetoolsTestUtils.getProjectApiRoot()
                    .stores()
                    .withId(store.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedStore);
            Assertions.assertEquals(queriedStore.getId(), store.getId());
        });
    }

    @Test
    public void getByKey() {
        withStore(store -> {
            Store queriedStore = CommercetoolsTestUtils.getProjectApiRoot()
                    .stores()
                    .withKey(store.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedStore);
            Assertions.assertEquals(queriedStore.getId(), store.getId());
        });
    }

    @Test
    public void query() {
        withStore(store -> {
            StorePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .stores()
                    .get()
                    .withWhere("id=" + "\"" + store.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), store.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableStore(store -> {
            List<StoreUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(StoreSetNameActionBuilder.of().name(newName).build());

            Store updatedStore = CommercetoolsTestUtils.getProjectApiRoot()
                    .stores()
                    .withId(store.getId())
                    .post(StoreUpdateBuilder.of().actions(updateActions).version(store.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedStore);

            return updatedStore;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableStore(store -> {
            List<StoreUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(StoreSetNameActionBuilder.of().name(newName).build());

            Store updatedStore = CommercetoolsTestUtils.getProjectApiRoot()
                    .stores()
                    .withKey(store.getKey())
                    .post(StoreUpdateBuilder.of().actions(updateActions).version(store.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedStore);

            return updatedStore;
        });
    }

    @Test
    public void deleteByKey() {
        Store store = createStore();
        Store deletedStore = CommercetoolsTestUtils.getProjectApiRoot()
                .stores()
                .withKey(store.getKey())
                .delete()
                .withVersion(store.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedStore);
        Assertions.assertEquals(store.getId(), deletedStore.getId());
    }

}
